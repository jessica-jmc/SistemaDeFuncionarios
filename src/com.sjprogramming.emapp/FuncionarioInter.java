package com.sjprogramming.emapp;

public interface FuncionarioInter {
    //criar funcionario
    public void criarFuncionario(Funcionario func);
    //mostrar todos os funcionarios
    public void mostrarTodosFuncionario();
    //mostrar funcionario pelo id
    public void mostrarFuncionarioPorID(int id);
    //atualizar funcionario
    public void atualizarFuncionario(int id, String nome);
    //deletar funcionario
    public void deletarFuncionario(int id);


}
