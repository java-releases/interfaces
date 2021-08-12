package methoddefault;

public class Cachorro implements Caminhando, Correndo {

	@Override
	public double getVelocidadeMaxima() {
		return Correndo.super.getVelocidadeMaxima();
	}

}
