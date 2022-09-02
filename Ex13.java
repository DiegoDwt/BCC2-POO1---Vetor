import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		final int NUM = 10;
		String[] carros = new String[NUM];
		String [] cores = new String[NUM];
		String[] juncao = new String[(NUM * 2)];
		
		System.out.println("Escreva " + NUM + " nomes de carros: ");
		
		for (int i = 0; i < NUM; i++) {
			carros[i] = entrada.nextLine();
		}
		
		System.out.println("Escreva " + NUM + " nomes de cores: ");
		
		
		for (int j = 0; j < NUM; j++) {
			cores[j] = entrada.nextLine();
		}
		
		int k = 0;
		int m = 1;
		
		
		for (int x = 0; x < NUM; x++) {
			juncao[k] = carros[x];
			k += 2;
		}
		
		for (int y = 0; y < NUM; y++ ) {
			juncao[m] = cores[y];
			m += 2;
		}
		
		
		for (int p = 0; p < (2 * NUM); p++) {
			System.out.print(juncao[p] + " | ");
		}
		
		entrada.close();

	}

}
