package weather;

import org.json.JSONObject;

public class weatherParser 
{
	public static void weatherParse(String jsonResponse)
	{
		JSONObject json = new JSONObject(jsonResponse);
		
		String city = json.getString("name");		
		String weather = json.getJSONArray("weather").getJSONObject(0).getString("description");		
		Double temp = json.getJSONObject("main").getDouble("temp");		
		int humidity = json.getJSONObject("main").getInt("humidity");		
		double wind_speed = json.getJSONObject("wind").getDouble("speed");
		
		System.out.println("City : " + city);
		System.out.println("Weather Description : " + weather);
		System.out.println("Temperature : " + temp + "°C");
		System.out.println("Humidity : " + humidity + "%");
		System.out.println("Wind Speed : " + wind_speed + "m/s");
		
	}
}
