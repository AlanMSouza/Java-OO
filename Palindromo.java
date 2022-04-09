import java.util.Stack;
import java.util.Scanner;

public class Palindromo {
	public static boolean testaPalindromo(String palavra) {

		Stack<Character> pilha = new Stack<Character>();

		for (int i = 0; i < palavra.length(); i++) {
			pilha.push(palavra.charAt(i));
		}

		String palavraInversa = "";
		while (!pilha.isEmpty()) {
			palavraInversa += pilha.pop();
		}

		if (palavraInversa.equalsIgnoreCase(palavra)) {
			System.out.print("É palindromo!!! ");
			return true;
		}
		System.out.print("Não é palindromo!!! ");
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite uma palavra");
		String palavra = sc.nextLine();
		System.out.println(testaPalindromo(palavra));
	}

}
