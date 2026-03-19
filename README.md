# Projeto Acadêmico - Unidade 3 (POO Java)

Este é um projeto acadêmico simples para praticar orientação a objetos em Java.

## Descrição

O projeto modela um sistema de alunos com herança e polimorfismo:

- `Aluno` é a classe base com atributos `nome`, `matricula` e `nota`.
- `Avaliacao` é uma interface que obriga a implementação de `calcularMedia()`.
- `AlunoGraduacao` estende `Aluno` e implementa `Avaliacao`.
- `AlunoPosGraduacao` estende `Aluno` e implementa `Avaliacao`.
- `Escola` tem o método `main` para criar alunos, exibir dados e calcular médias.

## Arquivos do Projeto

- `Aluno.java`
- `Avaliacao.java`
- `AlunoGraduacao.java`
- `AlunoPosGraduacao.java`
- `Escola.java`

## Como executar

No terminal, na pasta do projeto:

```bash
javac *.java
java Escola
```

## Comportamento principal

- O método `setNota(double)` valida se a nota está entre 0 e 10.
- `calcularMedia()` em `AlunoGraduacao` retorna a nota normal.
- `calcularMedia()` em `AlunoPosGraduacao` retorna a nota multiplicada por 1.2.

## Observações

Este projeto é para aprendizado de POO em Java e serve como base para testes de herança, interfaces e encapsulamento.
