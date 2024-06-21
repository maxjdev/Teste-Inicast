# Case técnico

### O projeto contém as seguintes classes principais:

1. **Classe Pessoa**: Representa uma pessoa com nome e data de nascimento.
2. **Classe Funcionário**: Extende a classe Pessoa, adicionando atributos de salário e função.
3. **Classe Principal (Main)**: Executa diversas operações sobre a lista de funcionários.

## Requisitos

### Classe Pessoa
- Atributos:
  - `nome` (String)
  - `dataNascimento` (LocalDate)

### Classe Funcionário
- Atributos:
  - `salario` (BigDecimal)
  - `funcao` (String)

### Classe Principal (Main)
Executa as seguintes ações:
1. Inserir todos os funcionários.
2. Remover o funcionário "João" da lista.
3. Imprimir todos os funcionários com todas suas informações:
   - Data no formato dd/mm/aaaa.
   - Salário formatado com separador de milhar e vírgula como decimal.
4. Atualizar a lista de funcionários com um aumento de 10% no salário.
5. Agrupar os funcionários por função em um MAP.
6. Imprimir os funcionários, agrupados por função.
7. Imprimir os funcionários que fazem aniversário nos meses 10 e 12.
8. Imprimir o funcionário com a maior idade.
9. Imprimir a lista de funcionários por ordem alfabética.
10. Imprimir o total dos salários dos funcionários.
11. Imprimir quantos salários mínimos ganha cada funcionário (considerando o salário mínimo de R$1212.00).

## Diagramas de Classes

### Diagrama de Classes
```mermaid
classDiagram
    class Pessoa {
        -String nome
        -LocalDate dataNascimento
        +Pessoa(String nome, LocalDate dataNascimento)
        +String getNome()
        +LocalDate getDataNascimento()
        +String toString()
    }

    class Funcionario {
        -BigDecimal salario
        -String funcao
        +Funcionario(String nome, LocalDate dataNascimento, BigDecimal salario, String funcao)
        +BigDecimal getSalario()
        +void setSalario(BigDecimal salario)
        +String getFuncao()
        +String toString()
    }

    Pessoa <|-- Funcionario
