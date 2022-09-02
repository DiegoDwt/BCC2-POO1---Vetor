import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		final int num = 5;
		int k = 1;
		
		int vetor[] = new int [num];
		
		for (int x = 0; x < num; x++) {
			System.out.print("Escreva o " + k + "º número: ");
			vetor[x] = entrada.nextInt();
			k++;
		}
		
		for (int y = 0; y < num; y++) {
			System.out.print(vetor[y] + " | ");
		}
		
		entrada.close();

	}

}
