/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilhas_ed;



import java.util.*;
import java.lang.*;


class huas {
    public static int i;
   public static char[]k = new char[1000];
    
    public static void main(String[] args) throws java.lang.Exception
    {
        
        Scanner entrada = new Scanner(System.in);
        int qtde = entrada.nextInt();
        while(qtde>0){
            String palavra = entrada.next();
            k= palavra.toCharArray();
            i=0;
            System.out.println(lenght()-1);
            qtde--;
        }
    }
    
    public static int lenght(){
         if(k[i++]=='l'){
             return 1;
         }
         else{
             return max(lenght(),lenght())+1;
         }
    }
    public static int max(int a,int b){
        if(a>b){
            return a;
        }
        else{
            return b;
        }
    }
}
