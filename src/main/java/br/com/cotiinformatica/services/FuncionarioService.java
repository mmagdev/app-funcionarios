package br.com.cotiinformatica.services;

import br.com.cotiinformatica.entities.Funcionario;
import br.com.cotiinformatica.repositories.FuncionarioRepository;

import java.util.Scanner;
import java.util.UUID;

public class FuncionarioService {

    /*
    Método para realizar o cadastro de um funcionário
     */

    public void cadastrarFuncionario() {

        System.out.println("\nCADASTRO DE FUNCIONÁRIO: \n");

        var funcionario = new Funcionario();
        funcionario.setId(UUID.randomUUID());

        var scanner = new Scanner(System.in);

        System.out.print("Informe o nome:  ");
        funcionario.setNome(scanner.nextLine());

        System.out.print("Informe o cpf:   ");
        funcionario.setCpf(scanner.nextLine());

        System.out.print("Informe a matrícula:   ");
        funcionario.setMatricula(scanner.nextLine());

        System.out.print("Informe o salário:  ");
        funcionario.setSalario(Double.parseDouble(scanner.nextLine()));

        System.out.print("Informe o cargo:  ");
        funcionario.setCargo(scanner.nextLine());

        //Cadastrar o funcionário no banco de dados
        var funcionarioRepository = new FuncionarioRepository();
        funcionarioRepository.inserirFuncionario(funcionario);



    }
}
