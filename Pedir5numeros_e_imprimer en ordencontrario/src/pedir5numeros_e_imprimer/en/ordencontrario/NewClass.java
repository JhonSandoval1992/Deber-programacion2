/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pedir5numeros_e_imprimer.en.ordencontrario;

import java.util.Scanner;

/**
 *
 * @author ferch
 */
public class NewClass {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         int n, res , invertido = 0;
         System.out.println("Ingrese un Valor:");
         n=sc.nextInt();
         System.out.println(n/10000);
        System.out.println(n/1000);
        System.out.println(n/100);
        System.out.println(n/10);
        System.out.println(n);
         
}
}