package exemplo02;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {

	public static void main(String[] args) {

		// Exemplo com classes anônimas
		ValidaTamanhoTexto valida = new ValidaTamanhoTexto() {
			@Override
			public boolean validar(String valor) {
				return valor.length() <= 5 ? true : false;
			}
		};
		System.out.println(valida.validar("12345"));

		// Exemplo com lambda
		ValidaTamanhoTexto validatorLambda = (v) -> v.length() <= 5 ? true : false;
		System.out.println(validatorLambda.validar("123456"));

		// Com Predicate
		var animais = new ArrayList<Animal>();
		animais.add(new Animal("COELHO", true, false));
		animais.add(new Animal("PEIXE", false, true));
		animais.add(new Animal("GATO", true, false));

		print(animais, a -> a.isPodePular());
	}

	static void print(List<Animal> animais, Predicate<Animal> ap) {
		for (Animal animal : animais) {
			if (ap.test(animal)) {
				System.out.println("Animal: " + animal.getNome());
			}
		}
	}

}