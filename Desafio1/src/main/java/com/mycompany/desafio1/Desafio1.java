package com.mycompany.desafio1;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author EvelynSantos
 */
public class Desafio1 {

    public static void main(String[] args) {
      Scanner numero = new Scanner (System.in);
      System.out.println("Digite 10 números inteiros não negativos");
      int n1=numero.nextInt();
      int n2=numero.nextInt();
      int n3=numero.nextInt();
      int n4=numero.nextInt();
      int n5=numero.nextInt();
      int n6=numero.nextInt();
      int n7=numero.nextInt();
      int n8=numero.nextInt();
      int n9=numero.nextInt();
      int n10=numero.nextInt();
      
      List<String> lista = new ArrayList<>();
      lista.add(" "+n1);  
      lista.add(" "+n2);
      lista.add(" "+n3);  
      lista.add(" "+n4);  
      lista.add(" "+n5);  
      lista.add(" "+n6);  
      lista.add(" "+n7);  
      lista.add(" "+n8);  
      lista.add(" "+n9);
      lista.add(" "+n10);
      
      Collections.sort(lista);  
	System.out.println("Os Números digitados foram: "+lista);  
 
	Collections.sort(lista, Collator.getInstance());  
	System.out.println("Lista Ordenada: "+lista);  
      }
}
