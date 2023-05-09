package lf1.plp.functional1.util;

public class ListaVaziaException extends RuntimeException {

	private static final long serialVersionUID = -2863294396766306479L;

	/**
	 * Cria um exception informando que a operacao est� sendo realizada com a
	 * lista vazia e eh invalido.
	 */
	public ListaVaziaException() {
		super("Nao eh possivel realizar a operacao com lista vazia!");
	}
}
