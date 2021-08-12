package exemplo02;

public class Animal {

	private String nome;
	private boolean podePular;
	private boolean podeNadar;

	public Animal(String nome, boolean podePular, boolean podeNadar) {
		super();
		this.nome = nome;
		this.podePular = podePular;
		this.podeNadar = podeNadar;
	}

	public String getNome() {
		return nome;
	}

	public boolean isPodePular() {
		return podePular;
	}

	public boolean isPodeNadar() {
		return podeNadar;
	}

}