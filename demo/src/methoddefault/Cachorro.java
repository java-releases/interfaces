package methoddefault;

public class Cachorro implements Caminhando, Correndo {

	@Override
	public boolean podeLatir() {
		return true;
	}

	@Override
	public double getVelocidadeMaxima() {
		return Correndo.super.getVelocidadeMaxima();
	}

}
