import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		final int num = 20;
		int k = 0;
		int pares = 0;
		int impares = 0;
		
		int vetor[] = new int [num];
		
		int par[] = new int[num];
		
		int impar[] = new int[num];
		
		for (int x = 0; x < 20; x++) {
			System.out.print("Informe o " + (k + 1) + "º número: ");
			vetor[x] = entrada.nextInt();
			k++;
			if (vetor[x] % 2 == 0) {
				par[pares] = vetor[x];
				pares++;
			} else {
				impar[impares] = vetor[x];
				impares++;
			}			
		}
		
		System.out.println("");
		
		for (int a = 0; a < num; a++) {
			if (a == 0) {
				System.out.print("Vetor: ");
			}
			System.out.print(vetor[a] + " | ");
		}
		
		System.out.println("");
		
		for (int b = 0; b < pares; b++) {
			if (b == 0) { 
				System.out.print("Pares: ");
			}
			System.out.print(par[b] + " | ");
		}
		
		System.out.println("");
		
		for (int c = 0; c < impares; c++) {
			if (c == 0) {
				System.out.print("Ímpares: ");
			}
			System.out.print(impar[c] + " | ");
		}
		
		entrada.close();

	}

}
