package server;

public class WeatherInterfaceImpl implements WeatherInterface {

	@Override
	public String queryWeather(String cityName) {
		String result=null;
		if (cityName.equals("����")) {
			result="����ת��";
		} else {
			result="��";
		}
		return result;
	}

}
