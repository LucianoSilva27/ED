import java.util.*;
import java.lang.*;



class ONP {

   
    public static void main (String[] args) throws java.lang.Exception {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
                //Quantidade de expressões
		int qtd = entrada.nextInt();
		while (qtd-- > 0) {
			String exp = entrada.next();
			int strLength = exp.length();
			int cont = -1;
                        //criando uma pilha com Stack
			Stack<Character> st = new Stack<Character>();
			String saida = "";
			while (cont++ < strLength - 1) {

				if (exp.charAt(cont) == '(')
					continue;
                                //varre o array pegando cada elemento
				char test = exp.charAt(cont);

				if (test == '+' || test == '-' || test == '*' || test == '/'
						|| test == '^') {
					st.add(test);
					continue;
				} else if (test == ')') {
					saida += st.pop();
					continue;
				} else {
					saida += String.valueOf(test);
					continue;
				}

			}
			System.out.println(saida.trim());

		}
    }
    
}
