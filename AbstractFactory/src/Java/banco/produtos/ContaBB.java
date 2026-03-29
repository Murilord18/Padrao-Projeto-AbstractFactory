package banco.produtos;

import banco.interfaces.Conta;

public class ContaBB implements Conta {
    @Override
    public String getTipo() { return "Conta Corrente BB"; }

    @Override
    public double getTaxa() { return 12.90; }
}
