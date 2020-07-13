import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ProcessadorBoletosTest {

	@Test
	public void verificaPagamento1() {
		ProcessadorBoleto p = new ProcessadorBoleto();
		
		Fatura f = new Fatura();
		f.setCliente("Thiago");
		f.setData("26/01/2020");
		f.setValorTotal(700.00);
		
		Boleto b1 = new Boleto();
		b1.setData("17/02/2020");
		b1.setCodigo("1234");
		b1.setValorPago(400.00);
		
		Boleto b2 = new Boleto();
		b2.setData("10/02/2020");
		b2.setCodigo("4321");
		b2.setValorPago(500.00);
		
		List<Boleto> listaBoleto = new ArrayList<>();
		listaBoleto.add(b1);
		listaBoleto.add(b2);
		
		boolean atual = p.processa(f, listaBoleto);
		
		assertTrue(atual);
	}
	
	
	
	@Test
	public void verificaPagamento2() {
		ProcessadorBoleto p = new ProcessadorBoleto();
		
		Fatura f = new Fatura();
		f.setCliente("Alice");
		f.setData("30/07/2020");
		f.setValorTotal(700.00);
		
		Boleto b1 = new Boleto();
		b1.setData("05/08/2020");
		b1.setCodigo("1234");
		b1.setValorPago(400.00);
		
		Boleto b2 = new Boleto();
		b2.setData("10/08/2021");
		b2.setCodigo("4321");
		b2.setValorPago(100.00);
		
		List<Boleto> listaBoleto = new ArrayList<>();
		listaBoleto.add(b1);
		listaBoleto.add(b2);
		
		boolean atual = p.processa(f, listaBoleto);
		
		assertFalse(atual);
	}

}
