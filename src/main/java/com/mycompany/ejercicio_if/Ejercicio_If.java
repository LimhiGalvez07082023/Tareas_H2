package com.mycompany.ejercicio_if;

/**
 *
 * @author limhi
 */
import java.util.Scanner;

public class Ejercicio_If {

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        
        System.out.println("Ejercicio No. 1");
        
        int Numero1 = 0;
        int Numero2 = 0;
        
        System.out.println("ingrese el Primer Numero");
        Numero1 = sc.nextInt();
        System.out.println("ingrese el Primer Numero");
        Numero2 = sc.nextInt();
        
        if (Numero1 == Numero2) {
            
            System.out.println("Numero 1 es igual al Numero 2");
            
        } else
        {
            System.out.println("Los numeros no son iguales");
        }
                
        
        
    }
}
