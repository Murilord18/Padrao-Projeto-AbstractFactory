package banco.factories;

import banco.interfaces.Cartao;
import banco.interfaces.Conta;
import banco.interfaces.FabricaBanco;
import banco.produtos.CartaoNubank;
import banco.produtos.ContaNubank;

public class FabricaNubank implements FabricaBanco {
    @Override
    public Conta criarConta() { return new ContaNubank(); }

    @Override
    public Cartao criarCartao() { return new CartaoNubank(); }
}
