package methodprivate;

public interface Agendamento {

	default void acordar() {
		this.verificarConsultaMedica(7);
	}

	default void almocar() {
		this.verificarConsultaMedica(12);
	}

	default void jantar() {
		this.verificarConsultaMedica(18);
	}

	private void verificarConsultaMedica(int hora) {
		final int horarioConsulta = 17;
		if (hora > horarioConsulta) {
			printOK();
		} else {
			printNOK(hora);
		}
	}

	private void printOK() {
		System.out.println("Você está atrasado para sua consulta!");
	}

	private void printNOK(int hora) {
		System.out.println("Faltam " + (17 - hora) + " Horas para sua consulta!");
	}

}