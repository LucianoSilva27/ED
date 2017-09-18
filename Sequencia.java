package ed;

import java.util.Scanner;

 class Sequencia {

   
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int tamanhoS = 0;
        tamanhoS = entrada.nextInt();
        int[] S = new int [tamanhoS];
        
        for (int i=0;i<tamanhoS;i++){
            
            S[i] = entrada.nextInt();
        }
        
        int tamanhoQ = 0;
       
        tamanhoQ = entrada.nextInt();
       
        int [] Q = new int[tamanhoQ];
        for (int i=0;i<tamanhoQ;i++){
            Q[i] = entrada.nextInt();
           
            
        }
        for (int i=0;i<tamanhoS;i++){
             if (!procura(S[i],Q)){
                String cout = (i!=(S.length-1))? S[i] + " ": S[i] +"";
                
                System.out.print(cout);
             }
        }
    }
    public static boolean procura(int dado,int ar[]){
        int cont = 0;
        for(int i = 0;i< (ar.length);i++)  {
          
         if(ar[i]== dado)
          return true;   
         
         
    }
    
        return false;
 }
}
    

