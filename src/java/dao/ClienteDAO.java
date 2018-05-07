/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import domain.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import factory.ConexaoFactory;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author renatosalinas
 */
public class ClienteDAO {
    public void salvar(Cliente c) throws SQLException {
        StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO cliente ");
        sql.append("(razao_social, nome_fantasia, cpf_cgc, endereco, bairro, cidade, estado, telefone, fax, telefone_2, cep, email, ativo, numero_endereco) ");
        sql.append("VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) ");
        
        Connection conexao = ConexaoFactory.conectar();
        
        PreparedStatement comando = conexao.prepareStatement(sql.toString());      
        
        comando.setString(1, c.getRazao_social());
        comando.setString(2, c.getNome_fantasia());
        comando.setString(3, c.getCpf_cgc() );
        comando.setString(4, c.getEndereco());
        comando.setString(5, c.getBairro());
        comando.setString(6, c.getCidade());
        comando.setString(7, c.getEstado());
        comando.setLong(8, c.getTelefone());
        comando.setLong(9, c.getFax());
        comando.setLong(10, c.getTelefone_2());
        comando.setLong(11, c.getCep());
        comando.setString(12, c.getEmail());
       // comando.setDate(13, (java.sql.Date) c.getData_cadastro());
        comando.setLong(13, c.getAtivo());
        comando.setLong(14, c.getNumero_endereco());
        
        comando.executeUpdate();
    }
    
    public void excluir(Cliente c) throws SQLException {
        StringBuilder sql = new StringBuilder();
        sql.append("DELETE FROM cliente ");
        sql.append("WHERE id_cliente = ? ");
        
        Connection conexao = ConexaoFactory.conectar();
        
        PreparedStatement comando = conexao.prepareStatement(sql.toString());
        comando.setLong(1, c.getId_cliente());
        
        comando.executeUpdate();
    }
    /*
    public void editar(Cliente c) throws SQLException {
        StringBuilder sql = new StringBuilder();
        sql.append("UPDATE cliente ");
        sql.append("SET razao_social = ?, nome_fantasia = ?, cpf_cgc = ?, endereco = ?, bairro = ?, cidade = ?, estado = ?, telefone = ?, fax = ?, telefone_2 = ?, cep = ?, email = ?, data_cadastro = ?, ativo = ?, numero_endereco = ? ");
        sql.append("WHERE id_cliente = ? ");
        
        Connection conexao = ConexaoFactory.conectar();
        
        PreparedStatement comando = conexao.prepareStatement(sql.toString());
        
        comando.setString(1, c.getRazao_social());
        comando.setString(2, c.getNome_fantasia());
        comando.setString(3, c.getCpf_cgc() );
        comando.setString(4, c.getEndereco());
        comando.setString(5, c.getBairro());
        comando.setString(6, c.getCidade());
        comando.setString(7, c.getEstado());
        comando.setLong(8, c.getTelefone());
        comando.setLong(9, c.getFax());
        comando.setLong(10, c.getTelefone_2());
        comando.setLong(11, c.getCep());
        comando.setString(12, c.getEmail());
        comando.setDate(13, (java.sql.Date) c.getData_cadastro());
        comando.setLong(14, c.getAtivo());
        comando.setLong(15, c.getNumero_endereco());
        
        comando.executeUpdate();
    } */
    
     /*
     public Fabricante buscarCodigo(Fabricante f) throws SQLException {
         StringBuilder sql = new StringBuilder();
         sql.append("SELECT codigo, descricao ");
         sql.append("FROM fabricante ");
         sql.append("WHERE codigo = ? ");
         
         Connection conexao = ConexaoFactory.conectar();
        
         PreparedStatement comando = conexao.prepareStatement(sql.toString());
         comando.setLong(1, f.getCodigo());
        
         ResultSet resultado = comando.executeQuery();
         
         Fabricante retorno = null;
         
         if(resultado.next()){
             retorno = new Fabricante();
             retorno.setCodigo(resultado.getLong("codigo"));
             retorno.setDescricao(resultado.getString("descricao"));         
         }
         return retorno;         
     }
     */
    
    /*
    public ArrayList<Produto> listar() throws SQLException {
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT p.codigo, p.descricao, p.quantidade, p.preco, f.codigo, f.descricao ");
        sql.append("FROM produto p ");
        sql.append("INNER JOIN fabricante f ON p.fabricante_codigo = f.codigo ");
        sql.append("ORDER BY p.codigo ASC ");
        
        Connection conexao = ConexaoFactory.conectar();
        
        PreparedStatement comando = conexao.prepareStatement(sql.toString());
        
        ResultSet resultado = comando.executeQuery();
        
        ArrayList<Produto> lista = new ArrayList<Produto>();
        
        while(resultado.next()) {
            Fabricante f = new Fabricante();
            f.setCodigo(resultado.getLong("f.codigo"));
            f.setDescricao(resultado.getString("f.descricao"));
            
            Produto p = new Produto();
            p.setCodigo(resultado.getLong("codigo"));
            p.setDescricao(resultado.getString("descricao"));
            p.setQuantidade(resultado.getLong("quantidade"));
            p.setPreco(resultado.getDouble("preco"));
            p.setFabricante(f);            
            
            lista.add(p);
        
        }
        return lista;
    } */
    /*
    public ArrayList<Fabricante> buscarDescricao(Fabricante f) throws SQLException {
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT codigo, descricao ");
        sql.append("FROM fabricante ");
        sql.append("WHERE descricao LIKE ? ");
        sql.append("ORDER BY descricao ASC ");
        
        Connection conexao = ConexaoFactory.conectar();
        
        PreparedStatement comando = conexao.prepareStatement(sql.toString());
        
        comando.setString(1, "%" + f.getDescricao() + "%");
        
        ResultSet resultado = comando.executeQuery();
        
        ArrayList<Fabricante> lista = new ArrayList<Fabricante>();
        
        while(resultado.next()) {
            Fabricante item = new Fabricante();
            item.setCodigo(resultado.getLong("codigo"));
            item.setDescricao(resultado.getString("descricao"));
            
            lista.add(item);
        
        }
        return lista;
    }
    */
    
    
    
    /* TESTAR SALVAR */
    
    public static void main(String[] args) {
        Cliente c1 = new Cliente();     
        
        c1.setRazao_social("NOME COMPLETO CLIENTE 1");
        c1.setNome_fantasia("CLIENTE 1");
        c1.setCpf_cgc("99999999999999");
        c1.setEndereco("RUA 1");
        c1.setBairro("ARRUDA");
        c1.setCidade("SAO PAULO");
        c1.setEstado("SP");
        c1.setTelefone(33128151L);
        c1.setFax(0L);
        c1.setTelefone_2(0L); 
        c1.setCep(999999999L);
        c1.setEmail("empresa@empresa.com.br");
        c1.setAtivo(1L);
        c1.setNumero_endereco(400L);
                
        ClienteDAO cdao = new ClienteDAO();
        
        try {
            cdao.salvar(c1);
            System.out.println("Cliente cadastrado com sucesso!");
        } catch (SQLException ex) {
            System.out.println("Erro ao cadastrar Cliente!");
            ex.printStackTrace();
        }
        
    }
    
    
    /* TESTAR EXCLUIR */
    /*
    public static void main(String[] args) {
        Cliente c1 = new Cliente();
        c1.setId_cliente(4L);
        
        ClienteDAO cdao = new ClienteDAO();
        
        try {
            cdao.excluir(c1);
            System.out.println("Cliente excluido com sucesso!");
        }catch (SQLException ex) {
            System.out.println("Erro ao excluir Cliente!");
            ex.printStackTrace();
            
        }
    } */
    
    
    /* TESTAR EDITAR */
    /*
    public static void main(String[] args) {
        Produto p1 = new Produto();
        p1.setCodigo(5L);
        p1.setDescricao("PRODUTO 5 NOVO");
        p1.setQuantidade(60L);
        p1.setPreco(11.50);       
        
        Fabricante f1 = new Fabricante();
        f1.setCodigo(5L);
        p1.setFabricante(f1);
        
        ProdutoDAO pdao = new ProdutoDAO();
        
        try {
            pdao.editar(p1);
            System.out.println("Produto editado com sucesso!");
        } catch (SQLException ex) {
            System.out.println("Erro ao editar Produto!");
            ex.printStackTrace();
            
        }
        
    } */
     
     /* TESTAR CONSULTAR */
     /*
     public static void main(String[] args) {
         Fabricante f1 = new Fabricante();
         f1.setCodigo(3L);
         
         Fabricante f2 = new Fabricante();
         f2.setCodigo(7L);
         
         FabricanteDAO fdao = new FabricanteDAO();
         
         try {
            Fabricante f3 = fdao.buscarCodigo(f1);
            Fabricante f4 = fdao.buscarCodigo(f2);
            System.out.println("Resultado 1: " + f3);
            System.out.println("Resultado 2: " + f4);
        } catch (SQLException ex) {
            System.out.println("Erro ao consultar Fabricante!");
            ex.printStackTrace();
            
        }
         
     } */
    
    /* TESTAR LISTAR POR CODIGO */
    /*
    public static void main(String[] args) {
        ProdutoDAO pdao = new ProdutoDAO();
        
        try {
            ArrayList<Produto> lista = pdao.listar();
            for(Produto p : lista) {
                System.out.println("Produto: " + p.getCodigo());
                System.out.println("Descrição: " + p.getDescricao());
                System.out.println("Quantidade: " + p.getQuantidade());
                System.out.println("Preço: " + p.getPreco());
                System.out.println("Fab.: " + p.getFabricante().getCodigo());
                System.out.println("Nome.: " + p.getFabricante().getDescricao());
                System.out.println();
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao Listar Produtos!");
            ex.printStackTrace();
        }
         
    }
    */
    
    /* TESTAR CONSULTAR POR DESCRICAO */
    /*
    public static void main(String[] args) {
        Fabricante f1 = new Fabricante();
        f1.setDescricao("NOVA");
        
        FabricanteDAO fdao = new FabricanteDAO();
        
        try {
            ArrayList<Fabricante> lista = fdao.buscarDescricao(f1);
            for(Fabricante f : lista) {
                System.out.println("Resultado: " + f);            
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao consultar Fabricante!");
            ex.printStackTrace();
        }
        
    } */
    
    
}
