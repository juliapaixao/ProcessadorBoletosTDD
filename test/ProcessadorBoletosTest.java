import static org.junit.Assert.*;

import org.junit.Test;

public class ProcessadorBoletosTest {

	@Test
	public void verificaPagamento1() {
		ProcessadorBoleto p = new ProcessadorBoleto();
		Fatura f = new Fatura();
		Boleto b = new Boleto();
		
		boolean esperado = true;
		boolean atual = p.processa(true);
		
		assertTrue(atual);
	}

}
