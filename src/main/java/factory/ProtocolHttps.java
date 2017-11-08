package factory;

public class ProtocolHttps implements Protocol{
	
	public void init(){
		System.out.println("Initialisation of Https protocol");
	}
	
	public void connect(){
		System.out.println("Connexion done");
	}
	
	public void close(){
		System.out .println("Connection closed");
	}

}
