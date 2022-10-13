
public class Carro {
	private int ano;
	private String modelo;
	private double preco;
	
	public Carro(String modelo, int ano, double preco) {
		if(ano >= 1850) {
			this.ano = ano;
		}else {
			System.out.println("Ano inválido!");
		}
		if(modelo != null) {
			this.modelo = modelo;
		}else {
			System.out.println("Modelo inválido!");
		}
		if(preco > 0) {
			this.preco = preco;
		}else {
			System.out.println("Preço inválido!");
		}
	}
	
	public Carro(String modelo, double preco) {
		this("Golf", 2022, 40000.0);
	}
	
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
}
