package banco;

import banco.factories.FabricaBB;
import banco.interfaces.Cartao;
import banco.interfaces.Conta;
import banco.interfaces.FabricaBanco;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FabricaBBTest {

    private FabricaBanco fabrica;
    private Conta conta;
    private Cartao cartao;

    @BeforeEach
    void setUp() {
        fabrica = new FabricaBB();
        conta   = fabrica.criarConta();
        cartao  = fabrica.criarCartao();
    }

    @Test
    void contaNaoDeveSerNula() {
        assertNotNull(conta);
    }

    @Test
    void contaDeveTerTipoCorreto() {
        assertEquals("Conta Corrente BB", conta.getTipo());
    }

    @Test
    void contaDeveTerTaxaPositiva() {
        assertTrue(conta.getTaxa() > 0);
    }

    @Test
    void cartaoNaoDeveSerNulo() {
        assertNotNull(cartao);
    }

    @Test
    void cartaoDeveTerBandeiraVisa() {
        assertEquals("Visa", cartao.getBandeira());
    }

    @Test
    void cartaoDeveTerLimitePositivo() {
        assertTrue(cartao.getLimite() > 0);
    }
}