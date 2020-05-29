package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Conta;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o numero da conta: ");
		int numeroConta = sc.nextInt();
		sc.nextLine();
		System.out.println("Informe o nome do cliente: ");
		String nomeCliente = sc.nextLine();

		System.out.println("A conta terá um saldo inicial? ");
		char opcao = sc.nextLine().charAt(0);

		Conta conta;
		
		if (opcao == 's') {
			System.out.println("Informe o valor do depósito: ");
			double valorInicial = sc.nextDouble();
			conta = new Conta(numeroConta, nomeCliente, valorInicial);
		} else {
			conta = new Conta(numeroConta, nomeCliente);
		}

		System.out.println(conta);
		System.out.println();
		
		System.out.println("Informe o valor para depósito: ");
		conta.deposito(sc.nextDouble());
		System.out.println("Saldo da conta atualizada");
		System.out.println(conta);
		System.out.println();
		
		System.out.println("Informe o valor para saque: ");
		conta.saque(sc.nextDouble());
		System.out.println("Saldo da conta atualizada");
		System.out.println(conta);
		sc.close();
	}

}
