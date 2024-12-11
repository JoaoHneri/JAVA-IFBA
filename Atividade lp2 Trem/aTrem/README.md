# Respostas às Questões


**Dupla:** João Henrique e Natália Cunha

## a) O que acontece quando a ação da linha 5 é executada?

Quando a linha 5 é executada, um novo objeto da classe `Funcionario` chamado `f1` é criado. O construtor da classe `Funcionario` é chamado com os parâmetros `"Zé"`, `25` e `44`. Dentro do construtor:
- O atributo `nome` é inicializado como `"Zé"`.
- O atributo `salarioBase` é inicializado como `25`.
- O atributo `horaTrabalhada` é inicializado como `44`.
- O atributo `dataContratacao` é configurado com o valor `"10/12/2024"`.
- O atributo `matricula` é atribuído a partir do incremento do atributo estático `geraMatricula`. Isso garante que cada funcionário criado receba uma matrícula única.

## b) Por que a construção das linhas 7 e 8 é permitida?

As linhas 7 e 8 são permitidas porque os atributos `numRG` e `cpf` foram declarados como `default` na classe `Funcionario`. Quando um atributo é default, ele pode ser acessado e modificado diretamente por qualquer classe que esteja no mesmo pacote. 

## c) Nas linhas 9 e 10, acessamos os atributos salário e matrícula do funcionário. Essa construção implementada nas linhas 9 e 10 é permitida pelo objeto funcionário? Justifique a sua resposta.

Sim, a construção nas linhas 9 e 10 é permitida, mas de formas diferentes:
- **Linha 9 e 10**: O atributo `salario` e O atributo `matricula` é declarado default, o que permite sua modificação direta.
