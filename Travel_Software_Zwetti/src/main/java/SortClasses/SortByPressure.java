package SortClasses;

import com.mycompany.travel_software_zwetti.weatherClasses.OpenWeatherResponse;
import java.util.Comparator;

public class SortByPressure implements Comparator<OpenWeatherResponse>{

    @Override
    public int compare(OpenWeatherResponse o1, OpenWeatherResponse o2) {
      if(o1.getMain().getPressure()>o2.getMain().getPressure()){
          return -1;
      }
      else if(o1.getMain().getPressure()<o2.getMain().getPressure()){
          return +1;
      }
      else{
          return 0;
      }
    }
    
}
