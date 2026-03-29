package banco;

import banco.factories.FabricaBB;
import banco.factories.FabricaNubank;
import banco.interfaces.Cartao;
import banco.interfaces.Conta;
import banco.interfaces.FabricaBanco;

public class Main {

    static void abrirConta(FabricaBanco fabrica) {
        Conta  conta  = fabrica.criarConta();
        Cartao cartao = fabrica.criarCartao();

        System.out.println("Conta  : " + conta.getTipo()      + " | Taxa: R$ " + conta.getTaxa());
        System.out.println("Cartao : " + cartao.getBandeira() + " | Limite: R$ " + cartao.getLimite());
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("=== Banco do Brasil ===");
        abrirConta(new FabricaBB());

        System.out.println("=== Nubank ===");
        abrirConta(new FabricaNubank());
    }
}
