
package modeloDao;

import modeloConection.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modeloBeans.BeansDevedor;




public class DaoDevedor {
    
    ConexaoBD conex=new ConexaoBD();
    BeansDevedor mode=new BeansDevedor();
    
    public void salvar0 (BeansDevedor mod)
    {
    conex.conexao();
    
     try {
            PreparedStatement pst=conex.con.prepareStatement("insert into moradores_inadimplentes(nome_devedor,divida,ano_divida)"
                    + "values(?,?,?)");
            
            
            pst.setString(1,mod.getNome());
            pst.setString(2,mod.getValor());
            pst.setString(3,mod.getAno());
            
            pst.execute();
            
            JOptionPane.showMessageDialog(null,"Cadastrado Com Sucesso...");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Não foi Possivel Cadastrar"+ex);
        }
    
      conex.Desconectar();
    
    }
    
    public void Excluir(BeansDevedor mod)
    {
    conex.conexao();
        try 
        {
            PreparedStatement pst =conex.con.prepareStatement("delete from moradores_inadimplentes where cod_devedor=?");
            pst.setInt(1,mod.getCodigo());
            pst.execute();
           JOptionPane.showMessageDialog(null,"Dados Excluidos com sucesso...");
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"erro ao excluir"+ex);
        }
     
    conex.Desconectar();
    
    
    }
    
    public void Editar (BeansDevedor mod)
    {
    
    
    
     conex.conexao();
    
        try        {
            PreparedStatement pst = conex.con.prepareStatement("update moradores_inadimplentes set nome_devedor=?,divida=?,ano_divida=? where cod_devedor=?");
                    
            pst.setString(1,mod.getNome());
            pst.setString(2,mod.getValor());
            pst.setString(3,mod.getAno());
            pst.setInt(4,mod.getCodigo());

            pst.execute();
            
            JOptionPane.showMessageDialog(null,"dados alterados...");
                    } catch (SQLException ex)
                 {
             JOptionPane.showMessageDialog(null,"erro ao alterar..."+ex);
                 }

    conex.Desconectar();

    }
    
  
    
    public BeansDevedor buscarDevdor(BeansDevedor mod)
    {
    conex.conexao();
    conex.executaSql("select*from moradores_inadimplentes where nome_devedor like'%"+mod.getPesquisar()+"%'");
    
    try {
            conex.rs.first();
            mod.setCodigo(conex.rs.getInt("cod_devedor"));
            mod.setNome(conex.rs.getString("nome_devedor"));
            mod.setValor(conex.rs.getString("divida"));
            mod.setAno(conex.rs.getString("ano_divida"));
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Nome Não Cadastrado");
            
        }
        conex.Desconectar();
        return mod;
    
    
    }
    
}
