package restMain;

import otherClasses.SEARCHTYP;
import otherClasses.SearchString;
import com.google.gson.Gson;
import com.mycompany.travel_software_zwetti.weatherClasses.OpenWeatherResponse;
import com.mycompany.travel_software_zwetti.weatherClasses.forecastClasses.ForecastObject;

import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class RestClient {

    private Client c;
    private static final String URI = "http://api.openweathermap.org/data/2.5/";
    private static final String PATH = "forecast";
    private static final String APPID = "d8f4bf1bc533c53b25d7ddc6f292f398";
    private static final String imageUrl = "https://openweathermap.org/img/wn/";
    private static final String imageEnd = "@2x.png";

    /**
     * 
     * @param args 
     * Main to test the RestClient Connection
     */
//    public static void main(String[] args) {
//        try {
//            RestClient r = new RestClient();
//            SearchString ss = new SearchString("8553", "AT", "", SEARCHTYP.ZIP);
//            r.searchDestination(ss);
//
//            ss = new SearchString("", "", "Graz", SEARCHTYP.NAME);
//            r.searchDestination(ss);
//        } catch (Exception ex) {
//            Logger.getLogger(RestClient.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//    }

    /**
     * 
     * @param ss
     * @return ForecastObject
     * @throws Exception 
     */
    public ForecastObject searchDestination(SearchString ss) throws Exception {
        Client c = ClientBuilder.newClient();
        Response r;
        try {
            int i = c.target(URI).path(PATH).request(MediaType.APPLICATION_JSON).get().getStatus();

        } catch (Exception ex) {
            throw new Exception("Fehler bei der Internetverbindung!");
        }

        if (ss.getSearchType().equals(SEARCHTYP.ZIP)) {

            r = c.target(URI).path(PATH).queryParam("appid", APPID).queryParam(ss.getSearchType().getAction(), ss.getPlz() + "," + ss.getCountryCode()).
                    queryParam("lang", "de").request(MediaType.APPLICATION_JSON).get();
        } else {
            r = c.target(URI).path(PATH).queryParam("appid", APPID).queryParam(ss.getSearchType().getAction(), ss.getCountryName()).
                    queryParam("lang", "de").request(MediaType.APPLICATION_JSON).get();
        }

        String jString = r.readEntity(String.class);
        ForecastObject o = new Gson().fromJson(jString, ForecastObject.class);

        for (OpenWeatherResponse openWeatherResponse : o.getList()) {
            openWeatherResponse.setName(o.getCity().getName());
        }

        return o;
    }

    /**
     * 
     * @param id
     * @return icon
     * returns the right icon for the id
     */
    public ImageIcon getImage(String id) {
        ImageIcon icon = new ImageIcon();
        try {
            URL url = new URL(imageUrl + id + imageEnd);
            icon = new ImageIcon(ImageIO.read(url));
        } catch (IOException ex) {
            Logger.getLogger(RestClient.class.getName()).log(Level.SEVERE, null, ex);
        }
        return icon;
    }

}
