/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TableKlassen;

import com.mycompany.travel_software_zwetti.weatherClasses.OpenWeatherResponse;
import java.time.LocalDate;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import otherClasses.SEARCHTYP;
import otherClasses.SearchString;

/**
 *
 * @author Zwetti Patrick
 */
public class WeatherModelTest {
    


    /**
     * Test of getRowCount method, of class WeatherModel.
     */
    @Test
    public void testGetRowCount() {
        System.out.println("getRowCount");
        WeatherModel instance = new WeatherModel();
        int expResult = 0;
        int result = instance.getRowCount();
        assertEquals(expResult, result);

    
    }

    /**
     * Test of getColumnCount method, of class WeatherModel.
     */
    @Test
    public void testGetColumnCount() {
        System.out.println("getColumnCount");
        WeatherModel instance = new WeatherModel();
        int expResult = 6;
        int result = instance.getColumnCount();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getValueAt method, of class WeatherModel.
     */
    @Test
    public void testGetValueAt() {
        System.out.println("getValueAt");
        int rowIndex = 0;
        int columnIndex = 0;
        WeatherModel instance = new WeatherModel();
        try {
            instance.loadDestinations(LocalDate.now().toString());
        } catch (Exception ex) {
          fail("The test case is a prototype.");
        }
        String expName = "Wien";
        OpenWeatherResponse result = (OpenWeatherResponse)instance.getValueAt(rowIndex, columnIndex);
        assertEquals(expName, result.getName());
     
    }

    /**
     * Test of add method, of class WeatherModel.
     */
    @Test
    public void testAdd() throws Exception {
        System.out.println("add");
        SearchString ss = new SearchString("", "", "Graz", SEARCHTYP.NAME);
        WeatherModel instance = new WeatherModel();
        int expResult =instance.getRowCount();
        instance.add(ss);
       assertEquals(expResult+1, instance.getRowCount());
     
    }


    
}
