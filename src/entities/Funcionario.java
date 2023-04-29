package entities;

public class Funcionario {
	
	public String name;
	public double salario;
	public double taxa;
	
	public double netSalary() {
		return salario - taxa;
	}
	
	public void increaseSalary(double percentage) {
		this.salario = salario * (percentage / 100 + 1) - taxa;
	}
	
	public String toString() {		
		return name
				+ ", $ "
				+ String.format("%.2f", salario);
	}

}
