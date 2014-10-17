/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seno.coseno;

import java.util.Scanner;

/**
 *
 * @author DANIEL
 */
public class SenoCoseno {
public static void main(String[] args) {
        Scanner d= new Scanner(System.in);
        double cateto_opuesto, catetoadyacente, hipotenusa, seno, coseno;
        System.out.println(" Ingrese el CatetoOpuesto: ");
        cateto_opuesto= d.nextDouble();
        System.out.println(" Ingrese CatetoAdyacente: ");
        catetoadyacente= d.nextDouble();
        System.out.println(" Ingrese la Hipotenusa: ");
        hipotenusa= d.nextDouble();
        
        seno=(double) Math.sin(cateto_opuesto/hipotenusa);
        coseno=(double) Math.cos(catetoadyacente/hipotenusa);
        System.out.println("seno =" + seno);
        System.out.println("coseno =" + coseno);
        
        // TODO code application logic here
    }
    
}
    