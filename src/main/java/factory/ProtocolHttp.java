package factory;

public class ProtocolHttp implements Protocol{
	
	public void init(){
		System.out.println("Initialisation of Http protocol");
	}
	
	public void connect(){
		System.out.println("Connexion done");
	}
	
	public void close(){
		System.out .println("Connection closed");
	}

}
