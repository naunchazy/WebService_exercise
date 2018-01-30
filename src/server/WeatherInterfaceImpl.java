package server;

public class WeatherInterfaceImpl implements WeatherInterface {

	@Override
	public String queryWeather(String cityName) {
		String result=null;
		if (cityName.equals("º¼ÖÝ")) {
			result="¶àÔÆ×ªÒõ";
		} else {
			result="Çç";
		}
		return result;
	}

}
