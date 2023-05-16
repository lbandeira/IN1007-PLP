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
```
Programa ::= Expressao

Expressao ::= Valor | ExpUnaria | ExpBinaria | ExpDeclaracao | Id | Aplicacao | IfThenElse
 
Valor ::= ValorConcreto 

ValorConcreto ::= ValorInteiro | ValorBooleano | ValorString | ValorLista

ExpUnaria ::= "-" Expressao | "not" Expressao | "length" Expressao | "estaEmSequencia" Expressao | "temParidade" Expressao

ExpBinaria ::= Expressao "+" Expressao | Expressao "-" Expressao | Expressao "and" Expressao | Expressao "or" Expressao | Expressao "==" Expressao | Expressao "++" Expressao | Expressao "contaSimilares" Expressao

 
ExpDeclaracao ::= "let" DeclaracaoFuncional "in" Expressao

DeclaracaoFuncional ::= DecVariavel | DecFuncao | DecComposta

DecVariavel ::= "var" Id "=" Expressao

DecFuncao ::= "fun" ListId "=" Expressao

DecComposta ::= DeclaracaoFuncional "," DeclaracaoFuncional

ListId ::= Id  |  Id ListId

Aplicacao:= Id"(" ListExp ")"

ListExp ::= Expressao  |  Expressao, ListExp

IfThenElse ::= "if" Expressao "then" Expressao "else" Expressao
```



| < HEAD : "head" >
| < TAIL : "tail" >

| <EM_SEQ: "...">
| <EM_PAR: "&&&">
| <CHECK_SIMILAR: "???">

## Preparação de ambiente

* Instalar Maven

```bash
sudo apt install maven -y
```

* Instalar JDK

```bash
sudo apt install openjdk-11-jdk
```

## Execução

```bash
cd Funcional2
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

java -cp ../../../../../../../javacc-7.0.10.jar javacc Functional1.jj

mvn clean generate-sources compile exec:java
mvn package

***
## Equipe

- Laís Bandeira (lbms@cin.ufpe.br)
- Victor Yuri (vysc@cin.ufpe.br)