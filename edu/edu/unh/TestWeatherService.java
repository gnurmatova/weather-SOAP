package edu.unh;
import java.util.List;

import com.cdyne.ws.weatherws.*;

public class TestWeatherService {
	public static void main(String[] args) {
		Weather weather = new Weather();
		WeatherSoap weatherSoap = weather.getWeatherSoap();
		ForecastReturn fr = weatherSoap.getCityForecastByZIP("06518");
		ArrayOfForecast af = fr.getForecastResult();
		List<Forecast> lf =  af.getForecast();
		for(Forecast forecast:lf){
			System.out.println("_________");
			System.out.println(forecast.getDate());
			System.out.println("High:"+forecast.getTemperatures().getDaytimeHigh());
			System.out.println("Low:"+forecast.getTemperatures().getMorningLow());
			System.out.println(forecast.getDesciption());
		}
	}
}
