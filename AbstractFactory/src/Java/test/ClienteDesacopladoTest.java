package banco;

import banco.factories.FabricaBB;
import banco.factories.FabricaNubank;
import banco.interfaces.Conta;
import banco.interfaces.FabricaBanco;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ClienteDesacopladoTest {

    private Conta criarContaVia(FabricaBanco fabrica) {
        return fabrica.criarConta();
    }

    @Test
    void clienteDeveAceitarQualquerFabrica() {
        Conta contaBB     = criarContaVia(new FabricaBB());
        Conta contaNubank = criarContaVia(new FabricaNubank());

        assertNotNull(contaBB);
        assertNotNull(contaNubank);
    }

    @Test
    void bancosDevemProduziContasDiferentes() {
        Conta contaBB     = new FabricaBB().criarConta();
        Conta contaNubank = new FabricaNubank().criarConta();

        assertNotEquals(contaBB.getTipo(), contaNubank.getTipo());
    }

    @Test
    void nubankDeveSerMaisBaratoQueBB() {
        Conta contaBB     = new FabricaBB().criarConta();
        Conta contaNubank = new FabricaNubank().criarConta();

        assertTrue(contaNubank.getTaxa() < contaBB.getTaxa());
    }
}
