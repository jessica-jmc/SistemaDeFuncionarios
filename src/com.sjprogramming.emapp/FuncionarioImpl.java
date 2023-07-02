package com.sjprogramming.emapp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class FuncionarioImpl implements FuncionarioInter{
    Connection con;

    @Override
    public void criarFuncionario(Funcionario func) {
        con=BDConexao.criarBDConexao();
        String query = "INSERT INTO funcionario (id, nome, idade, telefone, departamento, cargo, salario) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try{
            PreparedStatement pstm=con.prepareStatement(query);
            pstm.setInt(1,func.getId());
            pstm.setString(2,func.getNome());
            pstm.setInt(3,func.getIdade());
            pstm.setString(4,func.getTelefone());
            pstm.setString(5,func.getDepartamento());
            pstm.setString(6,func.getCargo());
            pstm.setDouble(7,func.getsalario());
            int cnt= pstm.executeUpdate();
            if (cnt != 0) {
                System.out.println("Funcionário inserido com sucesso\n\n");
            } else {
                System.out.println("Falha ao inserir o funcionário\n");
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    @Override
    public void mostrarTodosFuncionario() {
        con=BDConexao.criarBDConexao();
        String query="select * from funcionario";
        System.out.println("Detalhes sobre funcionarios: ");
        try{
            Statement stmt=con.createStatement();
            ResultSet result= stmt.executeQuery(query);
            while (result.next()){
                System.out.format("ID: %d\nNome: %s | Idade: %d | Telefone:%s\nDepartamento:%s | Cargo: %s | Salário: %.2f\n",
                        result.getInt(1),
                        result.getString(2),
                        result.getInt(3),
                        result.getString(4),
                        result.getString(5),
                        result.getString(6),
                        result.getDouble(7));
            System.out.println("-----------------------------------------------------------");
            }

        }catch (Exception ex){
            ex.printStackTrace();
        }

    }

    @Override
    public void mostrarFuncionarioPorID(int id) {
        con = BDConexao.criarBDConexao();
        String query = "SELECT * FROM funcionario WHERE id = " + id;
        try {
            Statement stmt = con.createStatement();
            ResultSet result = stmt.executeQuery(query);
            while (result.next()) {
                System.out.format("ID: %d\nNome: %s | Idade: %d | Telefone:%s\nDepartamento:%s | Cargo: %s | Salário: %.2f\n",
                        result.getInt(1),
                        result.getString(2),
                        result.getInt(3),
                        result.getString(4),
                        result.getString(5),
                        result.getString(6),
                        result.getDouble(7));
                System.out.println("-----------------------------------------------------------");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void atualizarFuncionario(int id, String nome) {
        con=BDConexao.criarBDConexao();
        String query="update funcionario set nome=? where id=?";
        try{
            PreparedStatement pstm=con.prepareStatement(query);
            pstm.setString(1,nome);
            pstm.setInt(2,id);
            int cnt=pstm.executeUpdate();
            if(cnt!=0)
                System.out.println("Dado atualizado com sucesso\n");

        }catch (Exception ex){
            ex.printStackTrace();

        }

    }

    @Override
    public void deletarFuncionario(int id) {
        con=BDConexao.criarBDConexao();
        String query="delete from funcionario where id=?";
        try{
            PreparedStatement pstm=con.prepareStatement(query);
            pstm.setInt(1,id);
            int cnt= pstm.executeUpdate();
            if(cnt!=0)
                System.out.println("Funcionário deletado com sucesso "+id);

        }catch (Exception ex){
            ex.printStackTrace();
        }

    }
}
