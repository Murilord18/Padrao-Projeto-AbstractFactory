
import banco.factories.FabricaNubank;
import banco.interfaces.Cartao;
import banco.interfaces.Conta;
import banco.interfaces.FabricaBanco;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FabricaNubankTest {

    private FabricaBanco fabrica;
    private Conta conta;
    private Cartao cartao;

    @BeforeEach
    void setUp() {
        fabrica = new FabricaNubank();
        conta   = fabrica.criarConta();
        cartao  = fabrica.criarCartao();
    }

    @Test
    void contaNaoDeveSerNula() {
        assertNotNull(conta);
    }

    @Test
    void contaDigitalNaoCobraTaxa() {
        assertEquals(0.0, conta.getTaxa());
    }

    @Test
    void contaDeveTerNomeCorreto() {
        assertEquals("Conta Digital Nubank", conta.getTipo());
    }

    @Test
    void cartaoNaoDeveSerNulo() {
        assertNotNull(cartao);
    }

    @Test
    void cartaoDeveTerBandeiraMastercard() {
        assertEquals("Mastercard", cartao.getBandeira());
    }

    @Test
    void cartaoDeveTerLimitePositivo() {
        assertTrue(cartao.getLimite() > 0);
    }
}