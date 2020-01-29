
package SortClasses;

import com.mycompany.travel_software_zwetti.weatherClasses.OpenWeatherResponse;
import java.util.Comparator;

public class SortByName implements Comparator<OpenWeatherResponse>{

    @Override
    public int compare(OpenWeatherResponse o1, OpenWeatherResponse o2) {
     
          return o1.getName().compareTo(o2.getName());
    
    }
    
}
