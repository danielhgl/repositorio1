/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logaritmo;
import java.util.Scanner;
/**
 *
 * @author DANIEL
 */
public class Logaritmo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner d=new Scanner(System.in);
        int num;
        float logaritmoresul;
        System.out.println("Ingrese el Numero: ");
        num=d.nextInt();
        
        logaritmoresul=(float) Math.log10(num);
        
        System.out.println("El logaritmo de " + num + " Es igual " + logaritmoresul);
        // TODO code application logic here
    }
    
}
