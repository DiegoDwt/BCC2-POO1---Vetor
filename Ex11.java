import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite v�rias palavras separadas por ; (ponto-e-v�rgula): ");
		
		String juntas = entrada.nextLine();
		
		String[] separadas = juntas.split(";");
		
		
		for (int i = 0; i < separadas.length; i++ ) {
			System.out.print(separadas[i] + "| ");
		}
		
		entrada.close();

	}
}