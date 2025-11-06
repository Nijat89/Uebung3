package h3;

public class H3_main {
	    public static void main(String[] args) {

	        int max = 8;
	        int fix = 7;
	        int wartend = 1;
	        boolean istVoll;

	int Freieplaetze = max - fix;

	        if ( Freieplaetze > 0 && wartend > 0) {


	        if (wartend == Freieplaetze){
	            fix += Freieplaetze;
	            wartend -= Freieplaetze;

	        } else if (Freieplaetze > wartend ){
	            fix+= wartend;
	            wartend = 0;
	        } else {
	            wartend= wartend - Freieplaetze;
	            fix = max;

	        }

	        }

	        if (fix >= max) {
	            istVoll = true;
	        } else {
	            istVoll = false;
	        }

	        System.out.println("Maximale Fixplätze: " + max);
	        System.out.println("Vergebene Fixplätze: " + fix);
	        System.out.println("Warteliste: " + wartend);
	        System.out.println("Veranstaltung voll? " + istVoll);
	    }
	}