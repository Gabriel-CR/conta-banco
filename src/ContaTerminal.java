import controller.ContaController;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        ContaController contaController = new ContaController();
        contaController.lerDadosDoTerminal();
        contaController.imprimirDadosDaConta();
    }
}
