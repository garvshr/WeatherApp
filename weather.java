package weather;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.URI;


public class weather 
{
	static String key = "key";
	static String BASE_URL = "https://api.openweathermap.org/data/2.5/weather?q=";
	
	 public static String getWeather(String city)
	 {
		 try 
		 {
			 String url = BASE_URL + city + "&appid=" + key + "&units=metric";
			 HttpClient client = HttpClient.newHttpClient();
			 HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).GET().build();
			 
		     HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
		     return response.body();
		     
		 }
		 catch(Exception e)
		 {
			 return "Error: Unable to fetch data";
		 }
	 }
}
