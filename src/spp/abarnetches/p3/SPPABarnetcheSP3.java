/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.abarnetches.p3;

import java.util.Scanner;

/**
 *
 * @author albertobarnetche
 */
public class SPPABarnetcheSP3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application l// Programa para calcular la distancia entre dos puntos
        int x1, y1, x2, y2, restax, restay;
        double distancia;
        Scanner entradaDato = new Scanner(System.in);
        System.out.println("Introduce la coordenada X del primer punto:");
        Scanner entradaX1 = new Scanner(System.in);
        x1 = entradaDato.nextInt();
        System.out.println("Introduce la coordenada Y del primer punto:");
        Scanner entradaY1 = new Scanner(System.in);
        y1 = entradaDato.nextInt();
        System.out.println("Introduce la coordenada X del segundo punto:");
        Scanner entradaX2 = new Scanner(System.in);
        x2 = entradaDato.nextInt();
        System.out.println("Introduce la coordenada Y del segundo punto:");
        Scanner entradaY2 = new Scanner(System.in);
        y2 = entradaDato.nextInt();
        restax = (x2-x1);
        restay = (y2-y1);
        distancia = Math.sqrt(Math.pow(restax, 2) + Math.pow(restay, 2));
        System.out.println("La distancia entre los puntos " + "(" + x1 + "," + y1 + " y " + "(" + x2 + "," + y2 + ") es: " + distancia);                        ogic here
    }
    
}
