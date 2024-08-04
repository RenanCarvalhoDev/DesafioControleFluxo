
import java.io.PrintStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);

		try {
			// chamando o método contendo a lógica de contagem

			System.out.println("Digite o primeiro parâmetro\n");
			int parametroUm = terminal.nextInt();
			System.out.println("Digite o segundo parâmetro\n");
			int parametroDois = terminal.nextInt();

			contar(parametroUm, parametroDois);

		} catch (ParametrosInvalidosException e) {
			// imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
			System.out.println("Segundo Parametro menor que o primeiro!");

		}
	}

	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		// validar se parametroUm é MAIOR que parametroDois e lançar a exceção

		int contagem = parametroDois - parametroUm;

		if (contagem < 0)
			throw new ParametrosInvalidosException();

		// realizar o for para imprimir os números com base na variável contagem
		for (int i = 1; i <= contagem; i++) {

			System.out.println("\nvalor: \n" + i);

		}
	}

}
