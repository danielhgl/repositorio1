/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplicacion.division;
import java.util.Scanner;
/**
 *
 * @author DANIEL
 */
public class MultiplicacionDivision {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner d=new Scanner(System.in);
        int numero1,numero2,multiplicacion;
        double division;
        System.out.println(" Ingrese Numero1 ");
        numero1= d.nextInt();
        System.out.println(" Ingrese Numero2 ");
        numero2= d.nextInt();
        
        multiplicacion= numero1*numero2;
        division= (double)numero1/numero2;
        System.out.println(" La Multiplicacion " + numero1 + "*" + numero2 + " =" + multiplicacion);
        System.out.println(" La Division " + numero1 + "/" + numero2 + " =" + division);
        // TODO code application logic here
    }
    
}
