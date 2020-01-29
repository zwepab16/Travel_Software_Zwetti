
package SortClasses;

import com.mycompany.travel_software_zwetti.weatherClasses.OpenWeatherResponse;
import java.util.Comparator;

public class SortByHuminity implements Comparator<OpenWeatherResponse>{

    @Override
    public int compare(OpenWeatherResponse o1, OpenWeatherResponse o2) {
      if(o1.getMain().getHumidity()>o2.getMain().getHumidity()){
          return -1;
      }
      else if(o1.getMain().getHumidity()<o2.getMain().getHumidity()){
          return +1;
      }
      else{
          return 0;
      }
    }
    
}
