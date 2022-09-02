import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite uma data no formato dd/mm/aaaa: ");
		
		boolean resposta = true;		
		String data = entrada.nextLine();
		
		String [] separado = new String[3];
		
		separado = data.split("/");
		
		int[] datas = new int[3];
		
		for (int i = 0; i < 3; i++) {
			datas[i] = Integer.parseInt(separado[i]);
		}
		
		if (datas[0] > 31 || datas[0] < 0) {
			resposta = false;
			System.out.println("Esse dia não existe!");
		}
		if (datas[1] > 12 || datas[1] < 0) {
			resposta = false;
			System.out.println("Esse mês não existe");
		}
		if (datas[2] > 9999 || datas[2] < 0) {
			resposta = false;
		}
		if (datas[1] == 2) {
			if (datas[2] % 4 == 0) {
				if (datas[0] > 28 || datas[0] < 0) {
					System.out.println("Ano bissexto.");
					resposta = false;
				}
			}
		}
		if (resposta) {
			System.out.println("Data Válida!");
		} else {
			System.out.println("Data Inválida!");
		}
				
		for (int x = 0; x < 3; x++) {
			System.out.print(separado[x] + " | ");
		}
		
		entrada.close();

	}

}