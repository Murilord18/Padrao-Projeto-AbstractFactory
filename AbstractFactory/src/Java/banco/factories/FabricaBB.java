package banco.factories;

import banco.interfaces.Cartao;
import banco.interfaces.Conta;
import banco.interfaces.FabricaBanco;
import banco.produtos.CartaoBB;
import banco.produtos.ContaBB;

public class FabricaBB implements FabricaBanco {
    @Override
    public Conta criarConta() { return new ContaBB(); }

    @Override
    public Cartao criarCartao() { return new CartaoBB(); }
}
