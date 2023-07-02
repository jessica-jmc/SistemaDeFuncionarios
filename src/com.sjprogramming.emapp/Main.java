package com.sjprogramming.emapp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        String nome;
        FuncionarioInter dao=new FuncionarioImpl();
        System.out.println("Bem-vindo(a) ao sistema de gerenciamento de funcionarios");

        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("1. Criar funcionario\n" +
                    "2. Mostrar todos os funcionarios\n" +
                    "3. Mostrar funcionario pelo ID\n" +
                    "4. Atualizar funcionario\n" +
                    "5. Deletar funcionario\n");
            System.out.println("Insira a opção desejada: ");
            int ch=sc.nextInt();
            switch (ch){
                case 1:
                    Funcionario func = new Funcionario();
                    System.out.println("Insira o ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Insira o nome: ");
                    nome = sc.nextLine();
                    System.out.println("Insira a idade: ");
                    int idade = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Insira o telefone: ");
                    String telefone = sc.nextLine();
                    System.out.println("Insira o departamento: ");
                    String departamento = sc.next();
                    sc.nextLine();
                    System.out.println("Insira o cargo: ");
                    String cargo = sc.next();
                    sc.nextLine();
                    System.out.println("Insira o salario: ");
                    double salario = sc.nextDouble();
                    func.setId(id);
                    func.setNome(nome);
                    func.setIdade(idade);
                    func.setTelefone(telefone);
                    func.setDepartamento(departamento);
                    func.setCargo(cargo);
                    func.setSalario(salario);
                    dao.criarFuncionario(func);
                    break;
                case 2:
                    dao.mostrarTodosFuncionario();
                    break;
                case 3:
                    System.out.println("Insira o ID para visualizar as informações");
                    int funcid= sc.nextInt();
                    dao.mostrarFuncionarioPorID(funcid);
                    break;
                case 4:
                    System.out.println("Insira o id para atualizar as informações");
                    int funcid1=sc.nextInt();
                    System.out.println("Insira o novo nome:");
                    nome = sc.next();
                    sc.nextLine();
                    dao.atualizarFuncionario(funcid1, nome);
                    break;
                case 5:
                    System.out.println("Insira o id a ser deletado");
                    id=sc.nextInt();
                    dao.deletarFuncionario(id);
                    break;
                case 6:
                    System.out.println("Obrigado por usar nosso sistema");
                    System.exit(0);

                    break;

                default:
                    System.out.println("Insira uma opção válida\n");
                    break;
            }
        }while (true);

    }
}
