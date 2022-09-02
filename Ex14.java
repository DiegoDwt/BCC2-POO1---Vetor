import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		final int NUM = 5;
		
		int[] idade = new int[NUM];
		float[] altura = new float[NUM];
		int k = 1;
		int somaAlt = 0;
		int cont = 0;
		float mediaAlt = 0;
		
		System.out.println("Informe a idade e altura de " + NUM + " alunos: ");
		
		for (int x = 0; x < NUM; x++) {
			System.out.println(k + "º aluno: ");
			System.out.print("Idade: " );
			idade[x] = entrada.nextInt();
			System.out.println("Altura: ");
			altura[x] = entrada.nextFloat();
			if (idade[x] > 13) {
				somaAlt += altura[x];
				cont++;
			}
			k++;
		}
		
		mediaAlt = somaAlt / cont;
		
		int abaixoMedia = 0;
		
		for (int y = 0; y < NUM; y++) {
			if (altura[y] < mediaAlt) {
				abaixoMedia++;
			}
		}
		
		System.out.println();
		System.out.println("Média de altura: " + mediaAlt);
		System.out.println(abaixoMedia + " alunos com mais de 13 anos possuem altura inferior à média.");
		
		entrada.close();
	}

}
