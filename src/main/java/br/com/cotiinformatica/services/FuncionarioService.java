package br.com.cotiinformatica.services;

import br.com.cotiinformatica.entities.Funcionario;

import java.util.Scanner;

public class FuncionarioService {

    /*
    Método para realizar o cadastro de um funcionário
     */

    public void cadastrarFuncionario() {

        System.out.println("\nCADASTRO DE FUNCIONÁRIO: \n");

        var funcionario = new Funcionario();
        var scanner = new Scanner(System.in);

        System.out.print("Informe o nome:  ");
        funcionario.setNome(scanner.nextLine());

        System.out.print("Informe o cpf:   ");
        funcionario.setCpf(scanner.nextLine());

        System.out.print("Informe o salário:  ");
        funcionario.setSalario(Double.parseDouble(scanner.nextLine()));

        System.out.print("Informe o cargo:  ");
        funcionario.setCargo(scanner.nextLine());

        //TODO: cadastrar o funcionário em um banco de dados



    }
}
