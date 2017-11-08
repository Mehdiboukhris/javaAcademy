package factory;

public class ProtocolFactory {
	public Protocol getProtocol(String protocol){
		switch(protocol){
			case "Http" : return new ProtocolHttp();
			case "Https" : return new ProtocolHttps();
			default : return null;
		}
		
	}
}
