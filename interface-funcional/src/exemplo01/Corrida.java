package exemplo01;

/**
 * 
 * É uma interface funcional. Pois possui apenas 1 metodo abstrato, "correr". Os
 * outros metodos nao sao considerados, pois sao implementados por
 * {@link Object}
 *
 */
@FunctionalInterface
public interface Corrida {

	public abstract void correr(int velocidade);

	//
	// subscritos por Object - INICIO
	//
	public abstract String toString();

	public abstract boolean equals(Object o);

	public abstract int hashCode();
	//
	// subscritos por Object - FINAL
	//

}