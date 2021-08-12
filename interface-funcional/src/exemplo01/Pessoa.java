package exemplo01;

public class Pessoa implements Corrida {

	@Override
	public void correr(int velocidade) {
		System.out.println("Correndo na velocidade de " + velocidade);
	}

}