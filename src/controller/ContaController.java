package controller;

import java.util.Locale;
import java.util.Scanner;

import models.ContaModel;
import views.ContaView;

public class ContaController {
    private ContaModel contaModel;
    private ContaView contaView;

    public ContaController() {
    }

    public void lerDadosDoTerminal() {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Por favor, digite o número da conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Agora, digite a agência da conta: ");
        String agencia = scanner.nextLine();
        System.out.print("Estamos finalizando, digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();
        System.out.print("Por fim, digite o saldo da conta: ");
        double saldo = scanner.nextDouble();

        this.contaModel = new ContaModel(numero, agencia, nomeCliente, saldo);

        scanner.close();

        System.out.println("Conta criada com sucesso!");
    }

    public void imprimirDadosDaConta() {
        this.contaView = new ContaView(this.contaModel);
        this.contaView.imprimirDadosDaConta();
    }
}
