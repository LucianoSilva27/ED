import java.util.*;
import java.lang.*;


 class TREEORD {
     //O objetivo deste exercicio � verificar:
    // 1.Se o primeiro n� da primeira �rvore � igual o utlimo n� da segunda �rvore;
    // 2.Se o ultimo n� da primeira �rvore � igual o ultimo da ultima �rvore;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws java.lang.Exception
    {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int no,cont= 0;
        int qtd = entrada.nextInt();
        int[] aux = new int[2];
        for(int i=0;i<3;i++)//Pega cada linha 
        {
        for (int j=0;j<qtd;j++){
            //Esse for vai verificando cada n� da arvore
            no = entrada.nextInt();
            if(i==0 && j==0){ 
                //Preenche o array com o primeiro elemento da arvore
                aux[0] = no;
            }

            if(i==0 && j==qtd-1) {
                //primeira �rvore,ultimo elemento
                aux[1] = no;
            }

            if((i==1 && j==qtd-1) && aux[0]==no) {
                //Segunda �rvore,ultimo elemento,verifica se o primeiro elemento do array aux � igual o n� que esta sendo informado.
                cont++;
            }

            if(i==2 && j==qtd-1 && aux[1]==no) {
                //terceira �rvore,verifica se um ultimo elemento de aux � igual o n� fornecido;
                cont++;
            }
        }
    }
        if(cont==2){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
    
}