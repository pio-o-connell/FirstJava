/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

/**
 *
 * @author Pio O'Connell
 */
public class Assignment1 {

    /**
     * @param args no command line arguments
     */
    public static void main(String[] args) {
        int i,nmrBottles=99;
        
	for ( i=nmrBottles;i > 1; i--)
            System.out.println( i + "  Bottles on the wall \n"  + i + "  Bottles of beer \n   Take one down \n   Pass it around \n\n");
	System.out.println( i + "   Bottle on the wall \n" + i + "   Bottle of beer \n    Take one down \n    Pass it around \n\n");
	System.out.println( "No more bottles of beer on the wall");
    }
    
}
