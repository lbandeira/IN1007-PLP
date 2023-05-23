# Projeto de PLP 2023.2
Este projeto tem como objetivo atender à disciplina de Paradigmas de Linguanges de Programação, ofertado pelo CIN na UFPE no semestre 2023.1
***

## Contextualização
Este projeto estende as linguagens **Funcional 2** com operadores para manipulação de listas. As funções são as seguintes:
- Verifica de sequencia: Dado uma lista de inteiro como entrada, a função verifica se a lista está em sequencia ou não.
```
Input: [1,2,3,4,6,9]
Output: true

Input: [1,2,10,4,6,9]
Output: false
```

- Verifica pareamento: Dado uma lista de caracteres como entrada, a função verifica se os caracteres iguais estão lado a lado.
```
Input: [1,1,2,2,3,3,4,4]
Output: true

Input: [1,1,3,4,6,9]
Output: false
```

- Contagem de similares: Dado duas listas como entrada, a função retorna quantas posições são iguais.
```
Input: [1,1,2,2,3,3,4,4] , [1,1,2,2,5,5,4,4]
Output: 6
```

## BNF

Programa ::= Expressao

Expressao ::= Valor | ExpUnaria | ExpBinaria | ExpDeclaracao | Id | Aplicacao | IfThenElse
 
Valor ::= ValorConcreto 

ValorConcreto ::= ValorInteiro | ValorBooleano | ValorString | [ValorLista](src/Funcional1/src/lf1/plp/expressions2/expression/ValorLista.java)

ExpUnaria ::= "-" Expressao | "not" Expressao | "length" Expressao | ["..." Expressao](src/Funcional1/src/lf1/plp/functional1/expression/ExpEmSequencia.java) | ["&&&" Expressao](src/Funcional1/src/lf1/plp/functional1/expression/ExpTemParidade.java)

ExpBinaria ::= Expressao "+" Expressao | Expressao "-" Expressao | Expressao "and" Expressao | Expressao "or" Expressao | Expressao "==" Expressao | Expressao "++" Expressao | Expressao "???" Expressao

 
ExpDeclaracao ::= "let" DeclaracaoFuncional "in" Expressao

DeclaracaoFuncional ::= DecVariavel | DecFuncao | DecComposta

DecVariavel ::= "var" Id "=" Expressao

DecFuncao ::= "fun" ListId "=" Expressao

DecComposta ::= DeclaracaoFuncional "," DeclaracaoFuncional

ListId ::= Id  |  Id ListId

Aplicacao:= Id"(" ListExp ")"

ListExp ::= Expressao  |  Expressao, ListExp

IfThenElse ::= "if" Expressao "then" Expressao "else" Expressao

## Métodos adicionados

### temParidade

```bash
# colocar código
```

### emSequencia

```java
	public boolean ehSequencial() {
		if (this.valor().isEmpty()) {
			return true;
		}
		
		int primeiro = ((ValorInteiro)this.valor().get(0)).valor();
		return ehSequencialAux(this.valor().subList(1, this.valor().size()), primeiro, 1);
		
	}
	
	private boolean ehSequencialAux(List<Expressao> lista, int primeiro, int indice) {
		if (lista.isEmpty()) {
			return true;
		}
		
		int atual = ((ValorInteiro)lista.get(0)).valor();
		if (atual != indice + primeiro) {
			return false;
		}
		
		return ehSequencialAux(lista.subList(1, lista.size()), primeiro, indice + 1);
	}
```
### contagemSimilares

```java
    public boolean contagemSimilares() {
        //pegar os parametros, que sao a lista 1 e lista 2
        if (lista1.size() != lista2.size()) {
            return false;
        }
        
        for (int i = 0; i < lista1.size(); i++) {
            if (!lista1.get(i).equals(lista2.get(i))) {
                return false;
            }
        }
        
        return true;
    }
}

```
## Preparação de ambiente

* Instalar Maven

```bash
sudo apt install maven -y
```

* Instalar JDK

```bash
sudo apt install openjdk-11-jdk
```
## Compilação

* Compilar .jj
```bash
java -cp ../../../../../../../javacc-7.0.10.jar javacc Functional1.jj
```

## Execução

```bash
cd Funcional1
mvn clean generate-sources compile exec:java
```

* Applet

```bash
cd ..
mvn package
# Jar será gerado em ./Applet/target/
```

* Abrir Aplicação

```bash
# Acessar a pasta ./Applet/target/ e executar no terminal:
java -jar Funcional2-0.0.1.jar
```

***
## Equipe

- Laís Bandeira (lbms@cin.ufpe.br)
- Victor Yuri (vysc@cin.ufpe.br)