import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ProcessadorBoletosTest {

	@Test
	public void verificaPagamento1() {
		ProcessadorBoleto p = new ProcessadorBoleto();
		Fatura f = new Fatura();
		Boleto b = new Boleto();
		
		List<Boleto> listaBoleto = new ArrayList<>();
		
		boolean atual = p.processa(f, listaBoleto);
		
		assertTrue(atual);
	}

}
