import java.util.List;

public class ProcessadorBoleto {
	double somaBoleto;


	public boolean processa(Fatura fatura, List<Boleto> listBoleto) {
		
		for (Boleto boleto : listBoleto) {
			somaBoleto = somaBoleto + boleto.getValorPago();
		}
		
		
		if (fatura.getValorTotal() < somaBoleto) {
			return true;
		}
		else
			return false;
	}
}
