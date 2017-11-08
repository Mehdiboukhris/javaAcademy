package javaTest;

public class Singleton {
	
	private static Object instance;
	
	private Singleton(){	
	}
	
	public static Object getInstance(){
		if(instance == null)
			instance = new Object();
		return instance;
	}

}
