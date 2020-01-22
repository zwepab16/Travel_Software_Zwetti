package TableKlassen;


import com.mycompany.travel_software_zwetti.weatherClasses.OpenWeatherResponse;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;


public class WeatherRenderer implements TableCellRenderer{

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
          JLabel l=new JLabel();
        OpenWeatherResponse r=(OpenWeatherResponse)value;
        switch(column){
            case 0: l.setText(r.getName());break;
            case 1: l.setText(r.getName());break;
            case 2: l.setText(r.getMain().getTemp()+" °C");break;
             case 3: l.setText(r.getMain().getTemp_max()+" °C");break;
              case 4: l.setText(r.getMain().getTemp_min()+" °C");break;
               case 5: l.setText(r.getMain().getHumidity()+" %");break;
        }
        l.setFont(new Font("Tahoma", 0, 18));
        l.setOpaque(true);
       
        return l;
    }
    }
    
    
    

