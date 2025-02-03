package weather;
import java.util.Scanner;
public class Main 
{
	public static void main(String args[])
	{
		Scanner ob = new Scanner(System.in);
		String city = ob.nextLine();
		
		String getResponse = weather.getWeather(city);
		if(!getResponse.startsWith("Error"))
			weatherParser.weatherParse(getResponse);
		else
			System.out.println(getResponse);
	}
}