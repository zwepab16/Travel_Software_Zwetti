package TableKlassen;

import GUIs.SearchString;
import restMain.RestClient;
import com.mycompany.travel_software_zwetti.weatherClasses.OpenWeatherResponse;
import com.mycompany.travel_software_zwetti.weatherClasses.forecastClasses.ForecastObject;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class WeatherModel extends AbstractTableModel {

    private RestClient restClient = new RestClient();
    private ArrayList<OpenWeatherResponse> destinations = new ArrayList<OpenWeatherResponse>();
    private String[] names = {"Icon", "Name ⮟", "Temperatur ⮟", "Niedrigste Temperatur", "Luftdruck", "Luftfeuchtigkeit"};
    private final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    @Override
    public int getRowCount() {
        return destinations.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return destinations.get(rowIndex);
    }

    public void add(SearchString ss) throws Exception {

        ForecastObject r = restClient.searchDestination(ss);
        destinations.add(r.getList().get(0));
        XMLDestinationsAccess.getInstance().addDestination(r.getCity().getName());
        fireTableDataChanged();
    }

    public void deleteDestination(int row) throws Exception {
        XMLDestinationsAccess.getInstance().deleteDestination(destinations.get(row).getName());
        destinations.remove(row);
        fireTableRowsDeleted(row, row);
    }

    public String getColumnName(int i) {
        return names[i];
    }


    public void loadDestinations(String inputDateString) throws Exception {

        destinations.clear();
        System.out.println("Selected: " + inputDateString);
        LocalDate inputDate = LocalDate.parse(inputDateString, DateTimeFormatter.ISO_LOCAL_DATE);

        for (String destination : XMLDestinationsAccess.getInstance().getAllDestinations()) {
            ForecastObject r = restClient.searchDestination(new SearchString("", "", destination, SEARCHTYP.NAME));

            for (OpenWeatherResponse openWeatherResponse : r.getList()) {
              //  System.out.println("Objekt: " + openWeatherResponse.getDt_txt());
                LocalDateTime date = LocalDateTime.parse(openWeatherResponse.getDt_txt(), dtf);
                if (date.getDayOfYear() == inputDate.getDayOfYear() && date.getHour() == 15) {
                    //       openWeatherResponse.setName(r.getCity().getName());
                    destinations.add(openWeatherResponse);
                }

            }
            fireTableDataChanged();
        }

    }
    public void sort(int column){
        
        switch(column){
            case 0: break;
            case 1: destinations.sort(new SortClasses.SortByName());break;
            case 2: destinations.sort(new SortClasses.SortByTemperature()); break;
            case 3: destinations.sort(new SortClasses.SortByMaxTemperature());break;
            case 4: destinations.sort(new SortClasses.SortByPressure());break;
            case 5: destinations.sort(new SortClasses.SortByHuminity());break;
            default:break;
            
        }
        
        fireTableDataChanged();
    }

}
