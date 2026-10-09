package br.com.cotiinformatica.repositories;

import br.com.cotiinformatica.entities.Funcionario;

import java.sql.DriverManager;

public class FuncionarioRepository {


    //Atributos
    private String host = "jdbc:postgresql://localhost:5434/bd-funcionarios";
    private String user = "coti";
    private String pass = "coti";

    /*
    Método para inserir um funcionário no banco de dados
    (INSERT - Função de banco de dados
     */

    public void inserirFuncionario(Funcionario funcionario) {

        try {

            var connection = DriverManager.getConnection(host, user, pass);

            //Escrever o comando SQL para conectar ao banco de dados
            var statement = connection.prepareStatement("insert into funcionarios(id, nome, cpf, matricula, salario, cargo)" +
                    "values(?,?,?,?,?,?)");

            //Preechendo os campos da tabela
            statement.setObject(1, funcionario.getId());
            statement.setString(2, funcionario.getNome());
            statement.setString(3,funcionario.getCpf());
            statement.setString(4,funcionario.getMatricula());
            statement.setDouble(5, funcionario.getSalario());
            statement.setString(6, funcionario.getCargo());

            //Executando e fechando a conexão
            statement.execute();
            connection.close();

            System.out.println("\nFUNCIONÁRIO CADASTRADO COM SUCESSO!");
        }
        catch(Exception e) {
            System.out.println("\nFALHA AO GRAVAR NO BANCO DE DADOS:");
            System.out.println(e.getMessage());
        }
    }
}