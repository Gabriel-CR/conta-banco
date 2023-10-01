package views;

import models.ContaModel;

public class ContaView {
    private ContaModel conta;

    public ContaView(ContaModel conta) {
        this.conta = conta;
    }

    public void imprimirDadosDaConta() {
        System.out.println("Olá " + conta.getNomeCliente() + ", obrigado por criar uma conta em nosso banco, sua agência é " + conta.getAgencia() + ", conta " + conta.getNumero() + " e seu saldo " + conta.getSaldo() + " já está disponível para saque");
    }
}
