package com.mycompany.desafio1;

import java.util.Scanner;
/**
 *
 * @author EvelynSantos
 */
public class Desafio1 {

    public static void main(String[] args) {
      Scanner teclado = new Scanner (System.in);
      System.out.println("Digite cinco números inteiros NÃO negativos:");
      int n = teclado.nextInt();
      int n1 = teclado.nextInt();
      int n2 = teclado.nextInt();
      int n3 = teclado.nextInt();
      int n4 = teclado.nextInt();
      System.out.printf("você digitou: %d, %d, %d, %d, %d",n,n1,n2,n3,n4);
      
    }
}
