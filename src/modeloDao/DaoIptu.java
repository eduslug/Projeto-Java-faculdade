
package modeloDao;

import modeloConection.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modeloBeans.BeansIptu;


public class DaoIptu {
    
    ConexaoBD conex=new ConexaoBD();
    BeansIptu mod=new BeansIptu();
    
    int flag=1;
    
    public void salva3(BeansIptu mod)
    {
     conex.conexao();
    
     try {
            PreparedStatement pst=conex.con.prepareStatement("insert into iptu(ano,numero_casa,valor_iptu)"
                    + "values(?,?,?)");
            
            
            pst.setString(1,mod.getAno());
            pst.setString(2,mod.getCasa());
            pst.setString(3,mod.getValor());
            
            pst.execute();
            JOptionPane.showMessageDialog(null,"Cadastrado Com Sucesso...");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Não foi Possivel Cadastrar"+ex);
        }
    
      conex.Desconectar();
    }
    
    
    public void Excluir(BeansIptu mod)
    {
    conex.conexao();
        try 
        {
            PreparedStatement pst =conex.con.prepareStatement("delete from iptu where cod_iptu=?");
            pst.setInt(1,mod.getCodigo());
            pst.execute();
           JOptionPane.showMessageDialog(null,"Dados Excluidos com sucesso...");
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"erro ao excluir"+ex);
        }
     
    conex.Desconectar();

    }
    
    
    
    
    
    
    public void Editar(BeansIptu mod)
    {
    conex.conexao();
    
        try        {
            PreparedStatement pst = conex.con.prepareStatement("update iptu set ano=?,numero_casa=?,valor_iptu=? where cod_iptu=?");
                    
            pst.setString(1,mod.getAno());
            pst.setString(2,mod.getCasa());
            pst.setString(3,mod.getValor());
            pst.setInt(4,mod.getCodigo());
           
            
            pst.execute();
            
            JOptionPane.showMessageDialog(null,"dados alterados...");
                    } catch (SQLException ex)
                 {
             JOptionPane.showMessageDialog(null,"erro ao alterar..."+ex);
                 }
        
        
        
    }
    
    
    
    public BeansIptu buscarIptu(BeansIptu mod)
    {
      
        conex.conexao();
        conex.executaSql("select*from iptu where numero_casa like'%"+mod.getPesqiusas()+"%'");
        try {
            conex.rs.first();
            mod.setAno(conex.rs.getString("ano"));
            mod.setCasa(conex.rs.getString("numero_casa"));
            mod.setValor(conex.rs.getString("valor_iptu"));
            mod.setCodigo(conex.rs.getInt("cod_iptu"));
       
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ano Não Cadastrado");
            
        }
        conex.Desconectar();
        return mod;
    }
    
}
