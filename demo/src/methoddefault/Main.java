package methoddefault;

public class Main {

	public static void main(String[] args) {

		Caminhando caminhando = new Cachorro();

		Double velocidadeMaxima = caminhando.getVelocidadeMaxima();

		System.out.println("Km/s: " + velocidadeMaxima);

	}

}
