import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		char alfabeto[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 
				'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x','y','z'};
		
		System.out.print("Qual o tamanho da senha? ");
        int tam = entrada.nextInt();
		
		char senha[] = new char[tam];
				 
		long pos = 0;
		
		for (int x = 0; x < tam; x++) {
			if (x % 2 == 0) {
				do {
					pos = Math.round(Math.random() * 25);
					senha[x] = alfabeto[(int)pos];
				} while (('a' == (senha[x]) || 'e' == (senha[x]) || 'i' == (senha[x]) || 'o' == (senha[x]) || 'u' == (senha[x])));
				System.out.print(senha[x]);
			}	
			
			
			if (x % 2 == 1) {
				do {
					pos = Math.round(Math.random() * 25);
					senha[x] = alfabeto[(int)pos];
				} while (!('a' == (senha[x]) || 'e' == (senha[x]) || 'i' == (senha[x]) || 'o' == (senha[x]) || 'u' == (senha[x])));
				System.out.print(senha[x]);
			}	
	   		  
		}
	
		entrada.close(); 
	}
}