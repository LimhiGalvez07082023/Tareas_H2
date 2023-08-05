/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_if;

/**
 *
 * @author limhi
 */

import java.util.Scanner;

public class Ejercicio_If_3 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int pnumero = 0;
        int snumero = 0;
        
        System.out.println("Ejercicio No. 3 \n");
        System.out.println("ORDENAR DE MAYOR A MENOS 2 NUMEROS \n");
        
        System.out.println("Ingrese el Primer Numero");
        pnumero = sc.nextInt();
        
        System.out.println("Ingrese el Segundo Numero");
        snumero = sc.nextInt();
        
        if (pnumero > snumero) 
        {
            System.out.println("Numero Mayor = " + pnumero);
            System.out.println("Numero Menor = " + snumero);
           
        }
        
        else
        {
            System.out.println("Numero Mayor = " + snumero);
            System.out.println("Numero Menor = " + pnumero);
        }
    }
}
