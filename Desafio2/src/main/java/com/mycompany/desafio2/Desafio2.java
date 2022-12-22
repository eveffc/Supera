/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.desafio2;

import java.util.Scanner;



/**
 *
 * @author EvelynSantos
 */
public class Desafio2 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Entre com o valor que deseja pagar:");
        double val = ler.nextDouble();
        int result;
        System.out.println("Notas:");
        result = (int) (val/100);
        System.out.println(result + " de R$100.00");
        
        val = val%100; 
        result = (int)(val/50);
        System.out.println(result + " de R$50.00");
        
        val = val%50; 
        result = (int)(val/20);
        System.out.println(result + " de R$20.00");
        
        val = val%20; 
        result = (int)(val/10);
        System.out.println(result + " de R$10.00");
        
        val = val%10; 
        result = (int)(val/5);
        System.out.println(result + " de R$5.00");
        
        val = val%5; 
        result = (int)(val/2);
        System.out.println(result + " de R$2.00");
        
        System.out.println("Moedas:");
        val = val%2; 
        result = (int)(val/1);
        System.out.println(result + " de R$1.00");
        
        val = val%1; 
        result = (int)(val/0.5);
        System.out.println(result + " de R$0.50");
        
        val = val%0.5; 
        result = (int)(val/0.25);
        System.out.println(result + " de R$0.25");
        
        val = val%0.25; 
        result = (int)(val/0.1);
        System.out.println(result + " de R$0.10");
        
        val = val%0.10; 
        result = (int)(val/0.05);
        System.out.println(result + " de R$0.05");
        
        val = val%0.05; 
        result = (int)(val/0.01);
        System.out.println(result + " de R$0.01");
    }
}
