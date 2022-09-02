import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		final int num = 3;
		
		String[] nome = new String[num];
		float[] altura = new float[num];
		int[] idade = new int[num];
		
		String nomeAlto = "";
		float altAlto = 0;
		int idAlto = 0;
		
		String nomeBaixo = "";
		float altBaixo = 0;
		int idBaixo = 0;
		
		String nomeVelho = "";
		float altVelho = 0;
		int idVelho = 0;
		
		String nomeNovo = "";
		float altNovo = 0;
		int idNovo = 0;
		
		int somaId = 0;
		float somaAlt = 0;
		
		int k = 1;
		int decresc = num;
		float mediaId = 0;
		float mediaAlt = 0;
		
		System.out.println("Informe nome, altura e idade de " + num + " pessoas: ");
		
		for (int i = 0; i < num; i++) {
			System.out.print("Informe o nome da " + k + "ª pessoa: ");
			nome[i] = entrada.nextLine();
			
			System.out.print("Informe a altura: ");
			altura[i] = entrada.nextFloat();
			
			System.out.print("Informe a idade: ");
			idade[i] = entrada.nextInt();	
			
			if (i == 0) {
				altAlto = altura[i];
				nomeAlto = nome[i];
				idAlto = idade[i];
				altBaixo = altura[i];
				nomeBaixo = nome[i];
				idBaixo = idade[i];
			}
			if(altura[i] > altAlto) {
				altAlto = altura[i];
				nomeAlto = nome[i];
				idAlto = idade[i];
			} else if(altura[i] < altBaixo) {
				altBaixo = altura[i];
				nomeBaixo = nome[i];
				idBaixo = idade[i];
			}
			
			if (i == 0) {
				idNovo = idade[i];
				nomeNovo = nome[i];
				altNovo = altura[i];
				idVelho = idade[i];
				nomeVelho = nome[i];
				altVelho = altura[i];
			}
			if(idade[i] > idVelho) {
				idVelho = idade[i];
				nomeVelho = nome[i];
				altVelho = altura[i];
			} else if(idade[i] < idNovo) {
				idNovo = idade[i];
				nomeNovo = nome[i];
				altNovo = altura[i];
			}
			
			entrada.nextLine();
			
			k++;
			somaId += idade[i];
			somaAlt += altura[i];
		}
		
		mediaId = somaId / num;
		mediaAlt = somaAlt / num;
		
		System.out.println();
		
		do {
			System.out.print("Nome: " + nome[decresc - 1] + " | ");
			System.out.print("Altura: " + altura[decresc - 1] + " | ");
			System.out.println("Idade: " + idade[decresc - 1] + " | ");
			decresc = decresc - 1;
		}  while (decresc > 0);
		
		System.out.println();
		System.out.println("Média de idade: " + mediaId);
		System.out.println("Média de altura: " + mediaAlt);
		
		System.out.println();
		System.out.println("Nome do(a) mais velho(a): " + nomeVelho);
		System.out.println("Idade: " + idVelho);
		System.out.println("Altura: " + altVelho);
		
		System.out.println();
		System.out.println("Nome do(a) mais novo(a): " + nomeNovo);
		System.out.println("Idade: " + idNovo);
		System.out.println("Altura: " + altNovo);
		
		System.out.println();
		System.out.println("Nome do(a) mais baixo(a): " + nomeBaixo);
		System.out.println("Idade: " + idBaixo);
		System.out.println("Altura: " + altBaixo);
		
		System.out.println();
		System.out.println("Nome do(a) mais alto(a): " + nomeAlto);
		System.out.println("Idade: " + idAlto);
		System.out.println("Altura: " + altAlto);
		
		System.out.println();
		
		for (int y = 0; y < num; y++) {
			if (y == 0) {
				System.out.println("Acima da média de idade: ");
			}
			if (idade[y] > mediaId) {
				System.out.println("Nome: " + nome[y]);
				System.out.println("Idade: " + idade[y]);
				System.out.println("Altura: " + altura[y]);
				System.out.println();
			}
		}
		
		System.out.println();
		
		for (int j = 0; j < num; j++) {
			if (j == 0) {
				System.out.println("Abaixo da média de idade: ");
			}
			if (idade[j] < mediaId) {
				System.out.println("Nome: " + nome[j]);
				System.out.println("Idade: " + idade[j]);
				System.out.println("Altura: " + altura[j]);
				System.out.println();
			}
		}
		
		System.out.println();
		
		for (int m = 0; m < num; m++) {
			if (m == 0) {
				System.out.println("Acima da média de altura: ");
			}
			if (altura[m] > mediaAlt) {
				System.out.println("Nome: " + nome[m]);
				System.out.println("Idade: " + idade[m]);
				System.out.println("Altura: " + altura[m]);
				System.out.println();
			}
		}
		
		System.out.println();
		
		for (int n = 0; n < num; n++) {
			if (n == 0) {
				System.out.println("Abaixo da média de altura: ");
			}
			if (altura[n] < mediaAlt) {
				System.out.println("Nome: " + nome[n]);
				System.out.println("Idade: " + idade[n]);
				System.out.println("Altura: " + altura[n]);
				System.out.println();
			}
		}
		
		entrada.close();
		
	}

}
