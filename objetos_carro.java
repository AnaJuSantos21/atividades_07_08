package curso07_08;

public class objetos_carro {

	public static void main(String[] args) {
		Carro carro = new Carro();
		
		carro.setMarca("Camaro");
		carro.setTamanho("4 lugares");
		carro.setCor("Amarelo");
		carro.setValor(80.000);
		
		System.out.println(carro.getMarca());
		System.out.println(carro.getTamanho());
		System.out.println(carro.getCor());
		System.out.println(carro.getValor());
		
		

	}

}
