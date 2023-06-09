// package lf2.plp.functional1.expression;

// import lf1.plp.expressions2.expression.ValorBooleano;
// import lf1.plp.expressions2.expression.ValorInteiro;
// import lf1.plp.expressions1.util.Tipo;
// import lf1.plp.expressions2.expression.ExpBinaria;
// import lf1.plp.expressions2.expression.Expressao;
// import lf1.plp.expressions2.expression.Valor;
// import lf1.plp.expressions2.expression.ValorLista;
// import lf1.plp.expressions2.memory.AmbienteCompilacao;
// import lf1.plp.expressions2.memory.AmbienteExecucao;
// import lf1.plp.expressions2.memory.VariavelJaDeclaradaException;
// import lf1.plp.expressions2.memory.VariavelNaoDeclaradaException;
// import lf1.plp.functional1.util.TipoPolimorfico;
// import lf1.plp.functional1.util.ListaVaziaException;
// import lf1.plp.functional1.util.TipoLista;

// public class ExpContagemSimilares extends ExpBinaria {

// 	public ExpContagemSimilares(Expressao esq, Expressao dir) {
// 		super(esq, dir, "???");
// 	}

// 	// /**
// 	//  * Retorna o valor da Expressao de MaiorQue
// 	//  */
// 	// public Valor avaliar(AmbienteExecucao amb) throws VariavelNaoDeclaradaException, VariavelJaDeclaradaException {
// 	// 	return new ValorBooleano(
// 	// 		((ValorInteiro) getEsq().avaliar(amb)).valor() >
// 	// 		((ValorInteiro) getDir().avaliar(amb)).valor() );
// 	// }
	
// 	// /**
// 	//  * Realiza a verificacao de tipos desta expressao.
// 	//  *
// 	//  * @param ambiente o ambiente de compila��o.
// 	//  * @return <code>true</code> se os tipos da expressao sao validos;
// 	//  *          <code>false</code> caso contrario.
// 	//  * @exception VariavelNaoDeclaradaException se existir um identificador
// 	//  *          nao declarado no ambiente.
// 	//  * @exception VariavelNaoDeclaradaException se existir um identificador
// 	//  *          declarado mais de uma vez no mesmo bloco do ambiente.
// 	//  */
// 	// protected boolean checaTipoElementoTerminal(AmbienteCompilacao ambiente)
// 	// 		throws VariavelNaoDeclaradaException, VariavelJaDeclaradaException {
// 	// 	return (getEsq().getTipo(ambiente).eInteiro() && getDir().getTipo(ambiente).eInteiro());
// 	// }

// 	// /**
// 	//  * Retorna os tipos possiveis desta expressao.
// 	//  *
// 	//  * @param ambiente o ambiente de compila��o.
// 	//  * @return os tipos possiveis desta expressao.
// 	//  */
// 	// public Tipo getTipo(AmbienteCompilacao ambiente) {
// 	// 	return TipoPrimitivo.BOOLEANO;
// 	// }
	
// 	public ExpContagemSimilares clone() {
// 		return new ExpContagemSimilares(this.esq.clone(), this.dir.clone());
// 	}
// }
