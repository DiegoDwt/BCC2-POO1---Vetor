import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		final int num = 10;
		int k = 0;
		String vetor[] = new String [num];
		
		for (int x = 0; x < 10; x++) {
			System.out.println("Digite o " + (k + 1) + "º Caracter: ");
			vetor[x] = entrada.nextLine();
			k++;		
		}
		
		for (int y = 0; y < 10; y++) {
			if (y == 0) {
				System.out.println("Consoantes: ");
			}
			if (!("a".equalsIgnoreCase(vetor[y]) || "e".equalsIgnoreCase(vetor[y]) || "i".equalsIgnoreCase(vetor[y]) || "o".equalsIgnoreCase(vetor[y]) || "u".equalsIgnoreCase(vetor[y]))) {
				System.out.print(vetor[y] + " |");	
			}
			
		}
			
		entrada.close();
		
	}
	
}
	
