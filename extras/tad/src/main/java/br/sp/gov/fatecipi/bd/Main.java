package br.sp.gov.fatecipi.bd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String menu = "0-Sair\n1-Cadastrar\n2-Atualizar\n3-Apagar\n4-Listar";
        int op;
        do {
            op=Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch (op){
                case 1:
                    String nome = JOptionPane.showInputDialog("Nome");
                    String cpf = JOptionPane.showInputDialog("CPF");
                    Pessoa pes = new Pessoa(nome, cpf);
                    pes.inserir();
                    break; 
                case 4:
                    listar();
                    break;   
            }
        } while (op!=0);
    }


    public static void listar() {
        String sql = "SELECT id_pessoa,nome_pessoa,cpf_pessoa FROM tb_pessoa";
        ConnectionFactory connectionFactory = new ConnectionFactory();
                try (Connection con = connectionFactory.obtemConnection()){
                    PreparedStatement ps = con.prepareStatement(sql);
                    ResultSet rs = ps.executeQuery();
                    while (rs.next()){
                        System.out.println(rs.getInt(1));
                        System.out.println(rs.getString(2));
                        System.out.println(rs.getString(3));

                    }
                } catch (Exception e) {

                }
    }
}