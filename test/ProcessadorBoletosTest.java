import static org.junit.Assert.*;

import org.junit.Test;

public class ProcessadorBoletosTest {

	@Test
	public void verificaPagamento1() {
		ProcessadorBoleto p = new ProcessadorBoleto();
		boolean esperado = true;
		boolean atual = p.processa(true);
		assertTrue(atual);
	}

}
