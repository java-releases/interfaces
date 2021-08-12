package methodprivatestatic;

public interface Nadando {

	private static void nadar(final String tipo) {
		System.out.println(">>> Mergulhar ");
		System.out.println(">>> Nadar " + tipo);
		System.out.println(">>> Respirar");
		System.out.println("");
	}

	static void borboleta() {
		nadar("borboleta");
	}

	default void estiloLivre() {
		nadar("estilo livre");
	}

	private void nadoPeito() {
		nadar("nado peito");
	}

}