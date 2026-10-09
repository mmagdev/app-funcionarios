package br.com.cotiinformatica;

import br.com.cotiinformatica.services.FuncionarioService;

import java.util.Scanner;

public class Main {

    static void main() {

        var funcionarioService = new FuncionarioService();
        var scanner = new Scanner(System.in);

        System.out.println("\nMENU DE OPÇÕES:\n");

        System.out.println("\t(1) Cadastrar um funcionário");
        System.out.println("\t(2) Listar todos os funcionários");

        System.out.print("\nINFORME A OPÇÃO DESEJADA: ");
        var opcao = Integer.parseInt(scanner.nextLine());

        switch (opcao)
        {
            case 1:
                funcionarioService.cadastrarFuncionario();
                break;
            case 2:
                // TODO: Implement listagem de funcionários
                break;
            default:
                System.out.println("\nOPÇÃO INVÁLIDA!");
                break;
        }
    }
}
