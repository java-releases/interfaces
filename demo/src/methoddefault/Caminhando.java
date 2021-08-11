package methoddefault;

public interface Caminhando {

	boolean podeLatir();

	default double getVelocidadeMaxima() {
		return 29.00;
	}

}
