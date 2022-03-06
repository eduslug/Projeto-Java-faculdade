
package modeloDao;

import modeloConection.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modeloBeans.BeansContas;


public class DaoContas {  
    ConexaoBD conex=new ConexaoBD();
    BeansContas mode= new BeansContas();
            
     public void salvar1 (BeansContas mode)
    {
    conex.conexao();
        try {
            PreparedStatement pst=conex.con.prepareStatement("insert into contas(nome_morador,numero_casa,contas_apagar,contas_pagas)"
                    + "values(?,?,?,?)");
            
            pst.setString(1,mode.getNome());
            pst.setString(2,mode.getNumeroCasa());
            pst.setString(3,mode.getContasApagar());
            pst.setString(4,mode.getContasPagas());
            
            pst.execute();
            
            JOptionPane.showMessageDialog(null,"Cadastrado Com Sucesso...");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Não foi Possivel Cadastrar"+ex);
        }
    
    conex.Desconectar();
    }
     
    public void Excluir(BeansContas mod)
    {
    conex.conexao();
        try {
            //Excluir
            PreparedStatement pst=conex.con.prepareStatement("delete from contas where cod_contas=?");
            pst.setInt(1,mod.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Dados Excluidos com sucesso...");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao excluir"+ex);
        }
    
    
    conex.Desconectar();
    } 
     
      public void Editar(BeansContas mod)
    {
    conex.conexao();
    
        try        {
            PreparedStatement pst = conex.con.prepareStatement("update contas set nome_morador=?,numero_casa=?,contas_apagar=?,contas_pagas=? where cod_contas=?");
                    
            pst.setString(1,mod.getNome());
            pst.setString(2,mod.getNumeroCasa());
            pst.setString(3,mod.getContasApagar());
            pst.setString(4,mod.getContasPagas());
            pst.setInt(5,mod.getCodigo());
            
            pst.execute();
            
            JOptionPane.showMessageDialog(null,"dados alterados...");
                    } catch (SQLException ex)
                 {
             JOptionPane.showMessageDialog(null,"erro ao alterar..."+ex);
                 }
     
     
     
          conex.Desconectar();
    }
     
     
     public BeansContas buscarContas(BeansContas mod)
     {
       conex.conexao();
       conex.executaSql("select*from contas where nome_morador like'%"+mod.getPesquisar()+"%'");
        try {
            conex.rs.first();
            mod.setCodigo(conex.rs.getInt("cod_contas"));
            mod.setNome(conex.rs.getString("nome_morador"));
            mod.setNumeroCasa(conex.rs.getString("numero_casa"));
            mod.setContasApagar(conex.rs.getString("contas_apagar"));
            mod.setContasPagas(conex.rs.getString("contas_pagas"));
            
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Nome Não Cadastrado");
        }
      
      conex.Desconectar();
        return mod;
     }
}
    

