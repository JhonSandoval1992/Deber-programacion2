
package ordenar_menor_mayor;

import java.util.Scanner;

public class Ordenar_menor_mayor {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
         System.out.println("Ingrese Primer numero");
         int n1=scn.nextInt();
          System.out.println("Ingrese Segundo numero");
          int n2=scn.nextInt();
         System.out.println("Ingrese Tercer numero");
         int n3=scn.nextInt();
        
       if (n1<n2 &&  n2<n3){
           System.out.println("Menor a Mayor: "+n1+","+n2+","+n3); 
       }else if (n1<n3 &&  n3<n2){
         System.out.println("Menor a Mayor: "+n1+","+n3+","+n2);    
       }else if (n2<n1 &&  n1<n3){
         System.out.println("Menor a Mayor: "+n2+","+n1+","+n3);    
       }else if (n2<n3 &&  n3<n1){
         System.out.println("Menor a Mayor: "+n2+","+n3+","+n1);    
       }else if (n3<n1 &&  n1<n2){
         System.out.println("Menor a Mayor: "+n3+","+n1+","+n2);    
       } else if (n3<n2 &&  n2<n1){
         System.out.println("Menor a Mayor: "+n3+","+n2+","+n1);    
       }
    }
    
}
