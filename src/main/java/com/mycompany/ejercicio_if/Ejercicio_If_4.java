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

public class Ejercicio_If_4 {
    
    public static void main(String[] args) {
    
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Ejercicio No. 4 \n");
        System.out.println("ORDENAR DE MAYOR A MENOR 3 NUMEROS \n");
        
        int pnumero = 0;
        int snumero = 0;
        int tnumero = 0;
        
        System.out.println("Ingrese el Primer Nunero");
        pnumero = sc.nextInt();
        
        System.out.println("Ingrese el Segundo Numero");
        snumero = sc.nextInt();
        
        System.out.println("Ingrese el Tercer Numero");
        tnumero = sc.nextInt();
        
        if (pnumero > snumero)
            if (pnumero > tnumero)
                if (snumero > tnumero)
        
        {
            System.out.println("El Numero Mayor es = " + pnumero);
            System.out.println("El Numero Medio es = " + snumero);
            System.out.println("El Numero Menor es = " + tnumero);
            
        } else 
            
            {
                
            System.out.println("El Numero Mayor es = " + pnumero);
            System.out.println("El Numero Medio es = " + tnumero);
            System.out.println("El Numero Menor es = " + snumero);
            
            }
        
        if (snumero > tnumero)
            if (snumero > pnumero)
               
            {
            System.out.println("El Numero Mayor es = " + snumero);
            System.out.println("El Numero Medio es = " + tnumero);
            System.out.println("El Numero Menor es = " + pnumero);
            } 
        
            else 
            {
            System.out.println("El Numero Mayor es = " + snumero);
            System.out.println("El Numero Medio es = " + pnumero);
            System.out.println("El Numero Menor es = " + tnumero);
            }
                
        }  
        
        
        
    }
    

