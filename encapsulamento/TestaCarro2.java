package encapsulamento;

public class TestaCarro2 {

	public static void main(String[] args) {
		
		carro2 car = new carro2();
		
		car.setMarca("Fusca");
		car.setModelo("Azul");
		car.setNumPassageiros(5);
		
		System.out.println("Marca: " + car.getMarca());
		System.out.println("Modelo: " + car.getModelo());
		System.out.println("Número de passageiros: " +car.getNumPassageiros());

	}

}
