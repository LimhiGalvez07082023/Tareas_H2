/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_if;

import java.util.Scanner;

public class Ejercicio_if_2 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Ejercicio 2\n");
        System.out.println("====== POSITIVO O NEGATIVO ========\n");
        
        int n1 = 0;
        int n2 = 0;
        
        System.out.println("Ingrese el primer Numero");
        n1 = sc.nextInt();
        System.out.println("Ingrese el Segundo Numero");
        n2 = sc.nextInt();
        
        if (n1 >= 0) 
        {
            System.out.println("El Numero 1 es Positivo");
        } 
        
        else
        {
            System.out.println("El Numero 1 es Negativo");
        }
                
        if (n2 >= 0) 
        {
            System.out.println("el Numero 2 es Positivo");
        } else 
        {
            System.out.println("El Numero 2 es Negativo");
            
        }
            
        
    }
    
}
