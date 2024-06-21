package inicast.teste.funcionario;

import inicast.teste.pessoa.Pessoa;

import java.math.BigDecimal;
import java.time.LocalDate;

// 2 – Classe Funcionário que estenda a classe Pessoa, com os atributos: salário (BigDecimal) e função (String).
public class Funcionario extends Pessoa {

    private BigDecimal salario;
    private String funcao;

    public Funcionario(String nome, LocalDate dataNascimento, BigDecimal salario, String funcao) {
        super(nome, dataNascimento);
        this.salario = salario;
        this.funcao = funcao;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setSalario(BigDecimal novoSalario) {
        this.salario = novoSalario;
    }

    @Override
    public String toString() {
        return super.toString() + ", salario=" + salario.toPlainString() + ", funcao='" + funcao + '\'';
    }
}