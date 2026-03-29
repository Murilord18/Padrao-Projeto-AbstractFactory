package banco.produtos;

import banco.interfaces.Cartao;


public class CartaoBB implements Cartao {
    @Override
    public String getBandeira() {
        return "Visa";}

    @Override
    public double getLimite() {
        return 2000.0;
    }
}
