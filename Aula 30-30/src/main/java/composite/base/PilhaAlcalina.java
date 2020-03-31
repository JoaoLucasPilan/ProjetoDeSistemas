package composite.base;

public class PilhaAlcalina implements FornecedorDeEnergia {
private double cargaDisponivel = 20;
	
	@Override
	public double fornecer() {
		System.out.println("PilhaAlcalina fornecendo energia... -1");
		
		return cargaDisponivel = cargaDisponivel - 1;
	}

}
