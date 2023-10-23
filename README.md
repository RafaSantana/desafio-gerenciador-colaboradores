# Desafio de OO - Gerenciamento de Colaboradores

Este projeto tem como objetivo modelar as entidades de uma aplicação de gerenciamento de colaboradores de uma loja, seguindo algumas regras de negócio para o cálculo de bonificação.

## Entidades

As principais entidades identificadas são:

- Colaborador: classe abstrata genérica representando um colaborador da loja.
- FuncionarioCLT: classe concreta representando um funcionário com vínculo CLT. Herda de Colaborador.
- Vendedor: classe concreta representando um vendedor. Herda de FuncionarioCLT.
- OperadorCaixa: classe concreta representando um operador de caixa. Herda de FuncionarioCLT.
- Gerente: classe concreta representando um gerente. Herda de Colaborador.

## Regras de Negócio

- Vendedor e Gerente possuem o benefício de bonificação
- Operador de Caixa não possui o benefício de bonificação

## Tecnologias

- Java
- Orientação a Objetos
- IDE Visual Studio Code

## Como executar

- Abrir o projeto no VS Code
- Compilar e executar a classe principal para testar as entidades e regras de negócio
