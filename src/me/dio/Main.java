package me.dio;

import me.dio.models.Endereco;
import me.dio.models.FuncionarioCLT;
import me.dio.models.Gerente;
import me.dio.models.OperadorCaixa;
import me.dio.models.Vendedor;

public class Main {
    public static void main(String[] args) {
        final String SEPARADOR = "----------------------";
        System.out.println(SEPARADOR);

        Endereco enderecoVendedor = new Endereco("Rua dos Bobos", "Apto 101", "Centro");
        Vendedor vendedor = new Vendedor();
        vendedor.setNome("Rafael Santana");
        vendedor.setDocumento("123.456.789-00");
        vendedor.setValorSalario(1000d);
        vendedor.setEndereco(enderecoVendedor);
        vendedor.calcularBonificacao(2d);

        System.out.println(vendedor);

        Endereco enderecoOperadorCaixa = new Endereco("Rua dos Amendoins", "Apto 321", "Vila dos Elefantes");

        FuncionarioCLT operadorCaixa = new OperadorCaixa("João da Silva", "987.654.321-00", 1500d,
                enderecoOperadorCaixa);
        System.out.println(SEPARADOR);
        System.out.println(operadorCaixa);
        System.out.println(SEPARADOR);

        Endereco enderecoGerente = new Endereco("Rua das Laranjas", "Apto 1001", "Bairro dos Macacos");

        Gerente gerente = new Gerente();
        gerente.setNome("Maria da Silva");
        gerente.setDocumento("123.456.789-00");
        gerente.setHorasTrabalhadas(20);
        gerente.setValorHora(100d);
        gerente.setEndereco(enderecoGerente);
        gerente.calcularRemuneracao();
        gerente.calcularBonificacao(3d);

        System.out.println(gerente);
    }
}
