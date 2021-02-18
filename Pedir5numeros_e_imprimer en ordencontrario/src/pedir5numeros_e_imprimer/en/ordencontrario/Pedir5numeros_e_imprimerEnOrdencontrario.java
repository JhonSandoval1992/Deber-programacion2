
package pedir5numeros_e_imprimer.en.ordencontrario;

import java.util.Scanner;

/**
 *
 * @author ferch
 */
public class Pedir5numeros_e_imprimerEnOrdencontrario {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         int n, res , invertido = 0;
         System.out.println("Ingrese un Valor:");
         n=sc.nextInt();
         
       while(n > 0){
           res=n %10;
           invertido = invertido *10 + res;
           n /=10;           
    }
   System.out.println("Invercion de numeros;"+invertido);
}
}