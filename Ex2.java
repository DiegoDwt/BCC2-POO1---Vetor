import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
	Scanner entrada = new Scanner(System.in);
		
		final int num = 10;
		int k = 1;
		int decresc = 10;
		
		float vetor[] = new float [num];
		
		for (int x = 0; x < num; x++) {
			System.out.print("Escreva o " + k + "º número: ");
			vetor[x] = entrada.nextFloat();
			k++;
		}
		
		do {
			System.out.print(vetor[decresc - 1] + " | ");
			decresc = decresc - 1;
		} while (decresc > 0);
		
		
		entrada.close();
	}

}
