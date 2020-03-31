package composite.base;

public class PilhaNormal implements FornecedorDeEnergia {
	private double cargaDisponivel = 10;

	@Override
	public double fornecer() {
		System.out.println("PilhaNormal fornecendo energia.... -1");
		
		return cargaDisponivel = cargaDisponivel - 1;
	}
}
