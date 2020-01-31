package TableKlassen;

import restMain.RestClient;
import com.mycompany.travel_software_zwetti.weatherClasses.OpenWeatherResponse;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.TableCellRenderer;

public class WeatherRenderer implements TableCellRenderer {

    /**
     * 
     * @param table
     * @param value
     * @param isSelected
     * @param hasFocus
     * @param row
     * @param column
     * @return formatted Label
     */
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        JLabel l = new JLabel();
        OpenWeatherResponse r = (OpenWeatherResponse) value;
        l.setBackground(Color.white);
        switch (column) {
            case 0:
                ImageIcon icon = new RestClient().getImage(r.getWeather().get(0).getIcon());
                l.setIcon(icon);
                l.setHorizontalAlignment(SwingConstants.CENTER);
                break;
            case 1:
                l.setText(r.getName());
                break;
            case 2:
                l.setText(String.format("%.2f °C", r.getMain().getTemp() - 273.15));
                if (r.getMain().getTemp() - 273.15 < 0) {
                    l.setBackground(new Color(102, 178, 255));
                } else if (r.getMain().getTemp() - 273.15 >= 28) {
                    l.setBackground(Color.red);
                }

                break;
            case 3:
                l.setText(String.format("%.2f °C", r.getMain().getTemp_min() - 273.15));
                if (r.getMain().getTemp_min() - 273.15 < 0) {
                    l.setBackground(new Color(102, 178, 255));
                } else if (r.getMain().getTemp_min() - 273.15 >= 28) {
                    l.setBackground(Color.red);
                }

                break;
            case 4:

                l.setText(String.format("%d mbar", r.getMain().getPressure()));

                break;
            case 5:
                l.setText(r.getMain().getHumidity() + " %");
                break;
        }

        // l.setFont(new Font("Tahoma", 0, 18));
        l.setOpaque(true);

        if (isSelected) {
            l.setBackground(Color.yellow);
        }

        return l;
    }

}
