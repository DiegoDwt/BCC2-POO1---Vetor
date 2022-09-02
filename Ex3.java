import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		 
		final int num = 4;
		float soma = 0;
		
		
	    float vetor[] = new float [num];
		
		for (int x = 0; x < num; x++) {
			System.out.print("Digite a " + (x + 1) + "ª nota: ");
			vetor[x] = entrada.nextFloat();
			soma += vetor[x];
		}
		
		float media = soma /num;
		
		for (int y = 0; y < num; y++) {
			System.out.println((y + 1) + "ª nota: " + vetor[y]);
		}
		
		System.out.println("Média: " + media);
		
		entrada.close();

	}

}
