
package modeloConection;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class ConexaoBD {
    
    public Statement pesqui;//pesquisa
    public ResultSet rs ;//metodo de resultado da pesqisa
    private String driver="org.postgresql.Driver";//drive do caminho
    private String caminho ="jdbc:postgresql://localhost:5432/locador_imovel";//host e caminho
    private String usuario="postgres";//usuario banco   
    private String senha="saopaulofc";//senha banco
    public Connection con;//realiza conexao com banco de dados
    
    
    public void conexao()
    {
        
        try {
            System.setProperty("jdbc.Drivers", driver);
            con=DriverManager.getConnection(caminho, usuario,senha);
            //JOptionPane.showMessageDialog(null,"Conexão Bem Sucedida...");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro Ao se Conectar...\n\n"+ex);
        }
    }
    
    
    public void executaSql(String sql)
    {
        try {
            
            pesqui=con.createStatement(rs.TYPE_SCROLL_INSENSITIVE,rs.CONCUR_READ_ONLY);
            rs=pesqui.executeQuery(sql);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro Ao Pesquisar.\n\n"+ex);
        }
    
    
    }
    
    public void Desconectar()
    {
    
        try {
            con.close();
           // JOptionPane.showMessageDialog(null,"Desconexão Bem Sucedida...");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"erro ao se desconectar...\n"+ex.getMessage());
        }
    }

    public void conex() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
