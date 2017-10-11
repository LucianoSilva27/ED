import java.util.*;
import java.lang.*;


class ShuntingYard {
 
   
 
    static String infixToPostfix(String infix) {
        /* To find out the precedence, we take the index of the
           token in the ops string and divide by 2 (rounding down). 
           This will give us: 0, 0, 1, 1, 2 */
        final String ops = "-+/*^";
 
        StringBuilder sb = new StringBuilder();
        Stack<Integer> s = new Stack<>();
 
        for (String token : infix.split("\\s*")) {
            if (token.isEmpty())
                continue;
            char c = token.charAt(0);
            int idx = ops.indexOf(c);
 
            // check for operator
            if (idx != -1) {
                if (s.isEmpty())
                    s.push(idx);
 
                else {
                    while (!s.isEmpty()) {
                        int prec2 = s.peek() / 2;
                        int prec1 = idx / 2;
                        if (prec2 > prec1 || (prec2 == prec1 && c != '^'))
                            sb.append(ops.charAt(s.pop())).append("");
                        else break;
                    }
                    s.push(idx);
                }
            } 
            else if (c == '(') {
                s.push(-2); // -2 stands for '('
            } 
            else if (c == ')') {
                // until '(' on stack, pop operators.
                while (s.peek() != -2)
                     sb.append(ops.charAt(s.pop())).append("");
                s.pop();
            }
            else {
                sb.append(token).append("");
            }
        }
        while (!s.isEmpty())
            sb.append(ops.charAt(s.pop())).append("");
        return sb.toString();
    }
     public static void main(String[] args)throws java.lang.Exception {
        String infix = null;
        
        Scanner sca = new Scanner(System.in);
        Scanner t = new Scanner(System.in);
        int aux = 0;
        String aux2;
        String teste = null;
        aux = t.nextInt();
        if(aux <= 100){
        String armazena[] = new String[aux];
        for(int i = 0; i<aux;i++){
            //infix = sca.nextLine();
           
            aux2 = sca.nextLine();
            if (aux2.length() <= 400){
                armazena[i] = aux2;
            }
            // teste = sca.nextLine();
           // System.out.println("Armazenando...");
            //infix = armazena[i];
            }
         //System.out.println(); //Quebra de linha para separar a resposta
            for(int i = 0; i<aux; i++){
                infix = armazena[i];
                //System.out.println(infixToPostfix(infix))
                System.out.printf("%s%n", infixToPostfix(infix));;
            }
        //String infix; //= "3 + 4 * 2 / ( 1 - 5 ) ^ 2 ^ 3";
        //Scanner sca = new Scanner(System.in);
        //infix = sca.nextLine();
        //System.out.printf("%s%n", infix);
        /*for (int i = 0; i<aux; i++){
            
        infix = armazena[i];
        System.out.println("printando...");
        System.out.printf("%s%n", infixToPostfix(infix));
        }*/
        }
    }
}