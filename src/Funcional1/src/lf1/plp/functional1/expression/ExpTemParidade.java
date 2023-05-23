package lf1.plp.functional1.expression;

import lf1.plp.expressions1.util.Tipo;
import lf1.plp.expressions2.expression.ExpUnaria;
import lf1.plp.expressions2.expression.Expressao;
import lf1.plp.expressions2.expression.Valor;
import lf1.plp.expressions2.expression.ValorLista;
import lf1.plp.expressions2.memory.AmbienteCompilacao;
import lf1.plp.expressions2.memory.AmbienteExecucao;
import lf1.plp.expressions2.memory.VariavelJaDeclaradaException;
import lf1.plp.expressions2.memory.VariavelNaoDeclaradaException;
import lf1.plp.functional1.util.TipoPolimorfico;
import lf1.plp.functional1.util.ListaVaziaException;
import lf1.plp.functional1.util.TipoLista;

public class ExpTemParidade extends ExpUnaria {

	/**
	 * Cria uma inst�ncia de ExpHead
	 * 
	 * @param exp -
	 *            express�o onde ser� aplicada o Head
	 */
	public ExpTemParidade(Expressao exp) {
		super(exp, "head");
	}

	/**
	 * Checa o tipo da express�o head. � necess�rio que a express�o seja uma
	 * Lista.
	 * 
	 * @param amb
	 *            Ambiente de Compila��o
	 * @return "True" se express�o � uma lista e "false" se express�o n�o � uma
	 *         lista
	 */
	@Override
	protected boolean checaTipoElementoTerminal(AmbienteCompilacao amb)
			throws VariavelNaoDeclaradaException, VariavelJaDeclaradaException {
		Tipo tipoExp = getExp().getTipo(amb);
		return tipoExp.eIgual(new TipoLista());
	}

	/**
	 * Avalia a express�o Head at� obter seus valores.
	 * 
	 * @param amb
	 *            Ambiente de Execu��o
	 * @return Retorna o valor(avaliado) do primeiro elemento da lista
	 *         (express�o do Head)
	 */
	public Valor avaliar(AmbienteExecucao amb)
			throws VariavelNaoDeclaradaException, VariavelJaDeclaradaException {

		ValorLista lista = (ValorLista) this.getExp().avaliar(amb);
		if (lista.isEmpty())
			throw new ListaVaziaException();

		return (Valor) lista.getHead();
	}

	/**
	 * Retorna o tipo da Express�o, ou seja, os tipos do elemento da lista, onde
	 * � aplicado o Head
	 * 
	 * @param amb
	 *            Ambiente de Compila��o
	 * @return tipo do elemento da lista
	 */
	public Tipo getTipo(AmbienteCompilacao amb)
			throws VariavelNaoDeclaradaException, VariavelJaDeclaradaException {

		Tipo tipoExp = this.getExp().getTipo(amb);
		if (tipoExp instanceof TipoPolimorfico)
			tipoExp = ((TipoPolimorfico) tipoExp).getTipoInstanciado();

		if (tipoExp instanceof TipoLista)
			return ((TipoLista) tipoExp).getSubTipo();

		return tipoExp;
	}
	
	public ExpTemParidade clone() {
		return new ExpTemParidade(this.exp.clone());
	}
}