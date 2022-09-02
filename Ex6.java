import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		final int LINHA = 10;
		final int COL = 4;
		int y = 0;
		int aprovados = 0;
		
		float notas[][] = new float[LINHA][COL];
		float soma[] = new float[LINHA];
		float media[] = new float[LINHA];
		
		for (int x = 0; x < LINHA; x++) {
			for (y = 0; y < COL; y++) {
				System.out.print("Informe a " + (y + 1) + "ª nota do " + (x + 1) + "º aluno: ");
				notas[x][y] = entrada.nextFloat(); 
				soma[x] += notas[x][y];
			}
			media[x] = (soma[x] / COL);
			if (media[x] >= 7) {
				aprovados++;
			}
			
		}
		
		for (int a = 0; a < LINHA; a++) {
			if (a == 0) {
				System.out.println("***MÉDIAS***");
			}
			System.out.println("A média do " + (a + 1) + "º aluno é: " + media[a]);
		}
		
		System.out.println("Número de alunos aprovados (Média >= 7): " + aprovados);
		
		entrada.close();

	}

}
