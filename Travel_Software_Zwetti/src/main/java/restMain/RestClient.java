package restMain;

import com.google.gson.Gson;
import com.mycompany.travel_software_zwetti.weatherClasses.OpenWeatherResponse;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Zwetti Patrick
 */
public class RestClient {

    private Client c;
    private static final String URI = "http://api.openweathermap.org/data/2.5/";
    private static final String PATH = "weather";
    private static final String APPID = "d8f4bf1bc533c53b25d7ddc6f292f398";
    private static final String imageUrl = "https://openweathermap.org/img/wn/";
    private static final String imageEnd="@2x.png";
   
    

    public OpenWeatherResponse searchDestinationByName(String name) {
        Client c = ClientBuilder.newClient();
        Response r = c.target(URI).path(PATH).queryParam("appid", APPID).queryParam("q", name).queryParam("lang", "de").request(MediaType.APPLICATION_JSON).get();
        String jString = r.readEntity(String.class);

        OpenWeatherResponse owo = new Gson().fromJson(jString, OpenWeatherResponse.class);

        System.out.println(jString);

        return owo;
    }

    public OpenWeatherResponse searchDestinationByPLZ(String plz) { 
        Client c = ClientBuilder.newClient();
        Response r = c.target(URI).path(PATH).queryParam("appid", APPID).queryParam("zip", plz).queryParam("lang", "de").request(MediaType.APPLICATION_JSON).get();
        String jString = r.readEntity(String.class);

        OpenWeatherResponse owo = new Gson().fromJson(jString, OpenWeatherResponse.class);

        System.out.println(jString);

        return owo;
    }
    public ImageIcon getImage(String id){
          ImageIcon icon=new ImageIcon();
        try {
            URL url=new URL(imageUrl+id+imageEnd);
             icon=new ImageIcon(ImageIO.read(url));
        } catch (IOException ex) {
            Logger.getLogger(RestClient.class.getName()).log(Level.SEVERE, null, ex);
        }
        return icon;
    }
            
    
    
    
    

}

