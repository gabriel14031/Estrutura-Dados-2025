package br.sp.gov.fatecipi.bd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Pessoa {
    private int idPessoa;
    private String nome;
    private String cpf;

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }


    public int getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void inserir() {
        String sql_str = "INSERT INTO tb_pessoa(nome_pessoa, cpf_pessoa) VALUES (?,?)";
        ConnectionFactory connectionFactory = new ConnectionFactory();
        try (Connection c = connectionFactory.obtemConnection()){
            PreparedStatement ps = c.prepareStatement(sql_str);
            ps.setString(1,this.getNome());
            ps.setString(2,this.getCpf());
            ps.execute();
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }
    }

    public void atualizar() {
        String sql = "UPDATE tb_pessoa SET nome_pessoa = ?, cpf_pessoa = ? WHERE id_pessoa = ?";
        ConnectionFactory connectionFactory = new ConnectionFactory();
        try (Connection con = connectionFactory.obtemConnection()){
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,this.getNome());
            ps.setString(2,this.getCpf());
            ps.setInt(3,this.getIdPessoa());
        } catch(SQLException se) {
            System.out.println(se.getStackTrace());
        }
    }

    

}
