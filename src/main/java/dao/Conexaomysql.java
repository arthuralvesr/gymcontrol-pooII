package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexaomysql {
    static Connection conexao;
    
    public static Connection obterConexao() throws ClassNotFoundException, SQLException {
        String login = "root";
        String senha = "";
        String ip = "127.0.0.1:3306";
        String nomeBanco = "gymcontrol";
        String url = "jdbc:mysql://" + ip + "/" + nomeBanco;
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        conexao = DriverManager.getConnection(url, login, senha);
        
        return conexao;
    }
}
