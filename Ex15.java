import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		final int NUM = 10;
		
		int[] vetor = new int[NUM];
		
		int k = 1;
		
		System.out.println("Informe " + NUM + " n?meros inteiros (Entre 0 e 20): ");
		
		for (int x = 0; x < NUM; x++) {
			do {
				System.out.print("Informe o " + k + "? n?mero: ");
				vetor[x] = entrada.nextInt();
				if (vetor[x] < 0 || vetor[x] > 20) {
					System.out.println("Entrada inv?lida!");
				}
			} while (vetor[x] < 0 || vetor[x] > 20);
			k++;
		}
		
		int y = 0;
		
		for (y = 0; y < NUM; y++) {
			System.out.print(vetor[y] + ": ");
			for (int j = 0; j < vetor[y]; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
		
		entrada.close();
	}

}
