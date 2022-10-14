
public class Teste {
	public static void main(String[] args) {
		ContaCorrente corrente = new ContaCorrente();
		corrente.setSaldo(2000.0);
		System.out.println(corrente.getCalculaTaxaJuros());
		
		ContaSalario salario = new ContaSalario();
		salario.setSaldo(2000.0);
		System.out.println(salario.getCalculaTaxaJuros());
		
		ContaConjunta conjunta = new ContaConjunta();
		conjunta.setSaldo(2000.0);
		System.out.println(conjunta.getCalculaTaxaJuros());
	}
}
