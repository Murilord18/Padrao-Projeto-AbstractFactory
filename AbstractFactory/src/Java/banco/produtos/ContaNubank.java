package banco.produtos;

import banco.interfaces.Conta;


public class ContaNubank implements Conta {
    @Override
    public String getTipo() {
        return "Conta Digital Nubank";
    }

    @Override
    public double getTaxa() { return 0.0;}
}
