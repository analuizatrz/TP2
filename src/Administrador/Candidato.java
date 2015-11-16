
package Administrador;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public abstract class Candidato implements Cadastro{
    static Scanner in = new Scanner(System.in);
    private String codigo;
    private String nome;
    private String email;
    private Date nascimento;
    private Partido partido;    
    
    public Candidato() {            //para o cadastrador
    }

    public Candidato(String codigo, String nome, String email, Date nascimento, Partido partido) {
        this.codigo = codigo;
        this.nome = nome;
        this.email = email;
        this.nascimento = nascimento;
        this.partido = partido;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public Partido getPartido() {
        return partido;
    }

    public void setPartido(Partido partido) {
        this.partido = partido;
    }

    @Override
    public String toString() {
        return "codigo: " + codigo + " nome: " + nome + " email: " + email + " nascimento: "
                + Data.getString(nascimento) + " partido: " + partido.toString();
    }

    @Override
    public abstract void Cadastrar();

    @Override
    public abstract void excluir();

    @Override
    public abstract void listar();

    @Override
    public abstract void pesquisar();

    @Override
    public abstract void alterar();
    
}
