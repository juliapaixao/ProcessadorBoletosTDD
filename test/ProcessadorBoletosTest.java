import static org.junit.Assert.*;

import org.junit.Test;

public class ProcessadorBoletosTest {

	@Test
	public void verificaPagamento1() {
		ProcessadorBoleto p = new ProcessadorBoleto();
		Fatura f = new Fatura();
		
		boolean esperado = true;
		boolean atual = p.processa(true);
		
		assertTrue(atual);
	}

}
