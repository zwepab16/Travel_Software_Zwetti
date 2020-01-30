package TableKlassen;

import XMLAccess.XMLDestinationsAccess;
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
    private ArrayList<ForecastObject> fastDestinations = new ArrayList<ForecastObject>();
    private String[] names = {"  ", "Name ⮟", "Temperatur ⮟", "Niedrigste Temperatur ⮟", "Luftdruck ⮟", "Luftfeuchtigkeit ⮟"};
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

        LocalDate inputDate = LocalDate.parse(inputDateString, DateTimeFormatter.ISO_LOCAL_DATE);

        for (String destination : XMLDestinationsAccess.getInstance().getAllDestinations()) {
            ForecastObject r = restClient.searchDestination(new SearchString("", "", destination, SEARCHTYP.NAME));

            for (OpenWeatherResponse openWeatherResponse : r.getList()) {

                LocalDateTime date = LocalDateTime.parse(openWeatherResponse.getDt_txt(), dtf);
                if (date.getDayOfYear() == inputDate.getDayOfYear() && date.getHour() == 15) {

                    destinations.add(openWeatherResponse);
                }

            }
            fireTableDataChanged();
        }

    }

    public void sort(int column) {

        switch (column) {
            case 0:
                break;
            case 1:
                destinations.sort(new SortClasses.SortByName());
                break;
            case 2:
                destinations.sort(new SortClasses.SortByTemperature());
                break;
            case 3:
                destinations.sort(new SortClasses.SortByMaxTemperature());
                break;
            case 4:
                destinations.sort(new SortClasses.SortByPressure());
                break;
            case 5:
                destinations.sort(new SortClasses.SortByHuminity());
                break;
            default:
                break;

        }

        fireTableDataChanged();
    }

    public void addFastDestination(int row) throws Exception {
        if (fastDestinations.size() + 1 > 2) {
            throw new Exception("To many Destinations for fast compare!");
        } else {
            OpenWeatherResponse r = (OpenWeatherResponse) getValueAt(row, 0);
            fastDestinations.add(restClient.searchDestination(new SearchString("", "", r.getName(), SEARCHTYP.NAME)));
        }
    }

    public OpenWeatherResponse getFastDestination(String inputDateString, int des) {

       
        LocalDate inputDate = LocalDate.parse(inputDateString, DateTimeFormatter.ISO_LOCAL_DATE);

       
           
                for (OpenWeatherResponse openWeatherResponse : fastDestinations.get(des).getList()) {
                  
                    LocalDateTime date = LocalDateTime.parse(openWeatherResponse.getDt_txt(), dtf);
                    if (date.getDayOfYear() == inputDate.getDayOfYear() && date.getHour() == 15) {
                  
                        return openWeatherResponse;
                    }
                }
            
        
        return null;
    }

    public ArrayList<ForecastObject> getFastDestinations() {
        return fastDestinations;
    }

    public void deleteFastCompare() {
        fastDestinations.clear();
    }

}
