import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um texto curto (frase): ");
		
		String texto = entrada.nextLine();
		
		String[] textoSeparado = new String[texto.length()];

		for(int i = 0; i < textoSeparado.length; i++){
		    textoSeparado[i] = "" + texto.charAt(i);
		    System.out.print(textoSeparado[i] + " | ");
		}
		
		entrada.close();
	}

}
