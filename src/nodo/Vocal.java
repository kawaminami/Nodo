/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nodo;
import java.util.Scanner;
/*@author KAWAMINAMI*/

public class Vocal
{ 
    
    public static void main(String[]args)
{  
  
   Nodo cabeza = null,P=null;
       String res="Y";
       //boolean salir=falso;
       Scanner in = new Scanner(System.in);
       
       while(res.equals("Y"))
       {
       System.out.println("Introduzca vocal: ");
       Nodo nodo = new Nodo();
       nodo.vocal=in.next();
       if(cabeza==null)
       {cabeza= nodo;
       P=nodo;}
       else
       {P.sig=nodo;
       P=nodo;}
       System.out.println("Desea seguir introduciendo vocales? Y/N ");
       res=in.next();
       }
       P=cabeza;
       while(P!=null)
       {System.out.println(P.vocal);
       P=P.sig;}
   }
}
