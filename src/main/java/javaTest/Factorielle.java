package javaTest;

public class Factorielle {

	public static int factorielle (int n){
		int resultat = n;
		n--;
		
		while(n>1){
			resultat *= n;
		}
		
		return resultat;
	}
}
