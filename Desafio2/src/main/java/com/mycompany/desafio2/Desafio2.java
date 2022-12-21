/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.desafio2;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author EvelynSantos
 */
public class Desafio2 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        List<BigDecimal> entradaVal = new ArrayList<>();
        List<Integer> entradaNota = new ArrayList<>();
        List<Integer> entradaMoeda = new ArrayList<>();
        
        System.out.println("Digite um valor a pagar:");
        float valor = 0;
        for(float i=0; valor>1; i++){
            int v = ler.nextInt();
            entradaMoeda.add(v);
        }for(float i=0;valor<1;i++){
            int M = ler.nextInt();
                entradaMoeda.add(M);
                }
        
    }
}
