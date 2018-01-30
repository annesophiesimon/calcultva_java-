import java.util.Scanner;

public class Calcultva {
	
 	public static double tauxTva = 0.196;
	public static double[] montants = new double[3];
	static Scanner sc = new Scanner(System.in);
	

	    public static double[] calculDeTva(double[] montants, double tauxTva) {
    	for(int i=0; i<montants.length;i++) {
    	System.out.println("Entrez un montant");
    	montants[i] = sc.nextDouble();
    	montants[i] = montants[i] * tauxTva;
    	}
    	
    	
    	return montants;
    	}
    
    
	    public static void main(String[] args) {
		// TODO Auto-generated method stub
    	   
    	Calcultva calcultva1 = new Calcultva();
    	calcultva1.calculDeTva(montants,0.196);
		
	    for(int i = 0; i<montants.length; i++)
	    {    	
    	
    	System.out.println("À l'emplacement " + i +" du tableau nous avons = " + montants[i]);

    	}
    	
    
    	
		
		
		
	}
}
