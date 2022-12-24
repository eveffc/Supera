package com.mycompany.desafio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import tela.TelaInput;
/**
 *
 * @author EvelynSantos
 */
public class Desafio1 {

    public static void main(String[] args) {
      TelaInput telaPrincipal = new TelaInput();
      telaPrincipal.setVisible(true);
      Scanner ler= new Scanner (System.in);
      List<Integer> entradaNum = new ArrayList<>();
      List<Integer> entradaPar = new ArrayList<>();
      List<Integer> entradaImpa = new ArrayList<>();

      System.out.println("Digite números inteiros não negativos");
      int numero = ler.nextInt();
      for(int i=0; numero>i; i++){
          int n=ler.nextInt();
          entradaNum.add(n);
      }
      for(int i=0; i<entradaNum.size(); i++){
          if(entradaNum.get(i)%2==0){
              entradaPar.add(entradaNum.get(i));
          }else{
          entradaImpa.add(entradaNum.get(i));
         }
      }
      System.out.println("Resultado:");
      Collections.sort(entradaPar);
      Collections.sort(entradaImpa,Collections.reverseOrder()); 
      entradaNum.clear();
      entradaNum.addAll(entradaPar);
      entradaNum.addAll(entradaImpa);
      entradaNum.forEach(System.out::println);
      }
}
