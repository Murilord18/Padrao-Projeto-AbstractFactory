package banco.produtos;

public class CartaoNubank implements banco.interfaces.Cartao {
    @Override
    public String getBandeira() { return "Mastercard"; }

    @Override
    public double getLimite() { return 1500.0; }
}


