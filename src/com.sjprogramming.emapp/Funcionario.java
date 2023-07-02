package com.sjprogramming.emapp;

public class Funcionario {
    private int id;
    private String nome;
    private int idade;
    private String telefone;
    private String departamento;
    private String cargo;
    private double salario;

    public Funcionario(){

    }
    public Funcionario(int id, String nome, int idade, String telefone, String departamento, String cargo, double salario) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.telefone = telefone;
        this.departamento = departamento;
        this.cargo = cargo;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getsalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", telefone=" + telefone +
                ", departamento='" + departamento + '\'' +
                ", cargo='" + cargo + '\'' +
                ", salario=" + salario +
                '}';
    }
}
