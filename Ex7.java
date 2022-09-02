import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		final int num = 5;
		int k = 1;
		int soma = 0;
		int produto = 1;
		
		int vetor[] = new int[num];
		
		for (int x = 0; x < num; x++) {
			if (x == 0) {
				System.out.println("Digite " + num + " números inteiros: ");
			}
			System.out.println("Informe o " + k + "º número: ");
			vetor[x] = entrada.nextInt();
			soma += vetor[x];
			produto *= vetor[x];
			k++;
		}
		
		for (int y = 0; y < num; y++) {
			if (y == 0 ) {
				System.out.print("| ");
			}
			System.out.print(vetor[y] + " | ");
		}
		
		System.out.println();
		System.out.println("Soma: " + soma);
		System.out.println("Produto: " + produto);
		
		entrada.close();			

	}

}
