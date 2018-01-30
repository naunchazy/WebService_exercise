package server1;

import javax.jws.WebService;
import javax.xml.ws.BindingType;
import javax.xml.ws.soap.SOAPBinding;


@WebService
@BindingType(SOAPBinding.SOAP12HTTP_BINDING)
public interface WeatherInterface {

	public String queryWeather(String cityName);
}
