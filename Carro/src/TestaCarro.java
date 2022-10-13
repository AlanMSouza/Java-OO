
public class TestaCarro {
	public static void main(String[] args) {
		Carro carro = new Carro("Gol", 2014, 20000.0);
		System.out.println(carro.getAno());
		System.out.println(carro.getModelo());
		System.out.println(carro.getPreco());
		
		Carro carro2 = new Carro("Jetta", 30000.0);
		System.out.println(carro2.getModelo());
		System.out.println(carro2.getPreco());
		
	}
}
