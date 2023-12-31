package me.dio.models;

public class Gerente extends FuncionarioPJ implements CalculaBonificacao {
    private Double valorBonificacao;

    @Override
    public void calcularBonificacao(Double porcentagemBonificacao) {
        this.valorBonificacao = (super.getValorRemuneracao() * (porcentagemBonificacao / 100)) + 100d;

    }

    @Override
    public String toString() {
        return "Gerente [nome=" + super.getNome() + ", documento=" + super.getDocumento() + ", endereço="
                + super.getEndereco().getRua() + ", horasTrabalhadas=" + super.getHorasTrabalhadas() + ", valorHora="
                + super.getValorHora() + ", valorRemuneracao=" + getValorRemuneracao() + ", valorBonificacao="
                + this.valorBonificacao + "]";
    }

}
