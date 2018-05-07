/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

/**
 *
 * @author renatosalinas
 */
import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoFactory {
    private static final String USUARIO = "root";
    private static final String SENHA = "root";
    private static final String URL = "jdbc:mysql://localhost:3306/rtms";
    
    public static Connection conectar() throws SQLException {
        DriverManager.registerDriver(new com.mysql.jdbc.Driver()); /* <!-- Problema com conexao com o MYSQL Resolvida nessa linha --> */
        Connection conexao = DriverManager.getConnection(URL, USUARIO, SENHA);
        return conexao;
    
    }
    
    /* Testando conexao sem ser WEB */
    public static void main(String[] args){
        try{
        Connection conexao = ConexaoFactory.conectar();
        System.out.println("Conexao realizada com sucesso!");
        } catch (SQLException ex) {
        ex.printStackTrace();
        System.out.println("Não foi possível realizar a Conexao!");
        }
    }
    
    
}
