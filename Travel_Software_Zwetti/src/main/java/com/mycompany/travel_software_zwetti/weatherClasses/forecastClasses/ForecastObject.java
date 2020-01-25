
package com.mycompany.travel_software_zwetti.weatherClasses.forecastClasses;

import com.mycompany.travel_software_zwetti.weatherClasses.OpenWeatherResponse;
import java.util.ArrayList;


public class ForecastObject {
    private int cod;
    private int message;
    private int cnt;
    private ArrayList<OpenWeatherResponse> list=new ArrayList<>();
    private City city;

    public int getCod() {
        return cod;
    }

    public int getMessage() {
        return message;
    }

    public int getCnt() {
        return cnt;
    }

    public ArrayList<OpenWeatherResponse> getList() {
        return list;
    }

    public City getCity() {
        return city;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public void setMessage(int message) {
        this.message = message;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }

    public void setList(ArrayList<OpenWeatherResponse> list) {
        this.list = list;
    }

    public void setCity(City city) {
        this.city = city;
    }
    
    
}
