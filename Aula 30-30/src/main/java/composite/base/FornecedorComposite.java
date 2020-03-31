package composite.base;

import java.util.ArrayList;
import java.util.List;

public class FornecedorComposite implements FornecedorDeEnergia {
	private List<FornecedorDeEnergia> fornecedoresDeEnergia;

	public FornecedorComposite() {
		fornecedoresDeEnergia = new ArrayList<>();
	}
	
	@Override
	public double fornecer() {
		
		for (FornecedorDeEnergia fe : fornecedoresDeEnergia) {
			fe.fornecer();
		}
		
		return (Double) null;
	}

	public void adicionarFornecedor(FornecedorDeEnergia fornecedor) {
		this.fornecedoresDeEnergia.add(fornecedor);
	}

}
