
package modeloDao;

import modeloConection.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modeloBeans.BeansMorador;

public class DaoMorador {
    
    ConexaoBD conex=new ConexaoBD();
    BeansMorador mode=new BeansMorador();
    
    
    public void salvar (BeansMorador mod)
    {
    conex.conexao();
        try {
            PreparedStatement pst=conex.con.prepareStatement("insert into morador (nome_morador,numero_casa,data_pagamento,cpf,telefone,valor_aluguel)"
                    + "values(?,?,?,?,?,?)");
            
            pst.setString(1,mod.getNome());
            pst.setString(2,mod.getCasa());
            pst.setString(3,mod.getVencimento());
            pst.setString(4,mod.getCpf());
            pst.setString(5,mod.getTelefone());
            pst.setString(6,mod.getValorAluguel());
            
            pst.execute();
            
            JOptionPane.showMessageDialog(null,"Cadastrado Com Sucesso...");
        
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Não foi Possivel Cadastrar"+ex);
        }
    
    conex.Desconectar();
    }
    
    public void Excluir(BeansMorador mod)
    {
     conex.conexao();
        try 
        {
            PreparedStatement pst =conex.con.prepareStatement("delete from morador where cod_morador=?");
            pst.setInt(1,mod.getCodigo());
            pst.execute();
           JOptionPane.showMessageDialog(null,"Dados Excluidos com sucesso...");
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"erro ao excluir"+ex);
        }
     
    conex.Desconectar();
    
    }
    
    
    
    
    
    public void Editar(BeansMorador mod)
    {
    conex.conexao();
    
        try        {
            PreparedStatement pst = conex.con.prepareStatement("update morador set nome_morador=?,numero_casa=?,data_pagamento=?,cpf=?,telefone=?,valor_aluguel=? where cod_morador=?");
                    
            pst.setString(1,mod.getNome());
            pst.setString(2,mod.getCasa());
            pst.setString(3,mod.getVencimento());
            pst.setString(4,mod.getCpf());
            pst.setString(5,mod.getTelefone());
            pst.setString(6,mod.getValorAluguel());
            pst.setInt(7,mod.getCodigo());
            
            pst.execute();
            
            JOptionPane.showMessageDialog(null,"dados alterados...");
                    } catch (SQLException ex)
                 {
             JOptionPane.showMessageDialog(null,"erro ao alterar..."+ex);
                 }
        
        
             
            
        
    
    conex.Desconectar();
    }
    
    public BeansMorador buscaMorador(BeansMorador mod)
    {
    
      conex.conexao();
       conex.executaSql("select*from morador where nome_morador like'%"+mod.getPesquisar()+"%'");
        try {
            
            conex.rs.first();
            mod.setCodigo(conex.rs.getInt("cod_morador"));
            mod.setNome(conex.rs.getString("nome_morador"));
            mod.setCasa(conex.rs.getString("numero_casa"));
            mod.setVencimento(conex.rs.getString("data_pagamento"));
            mod.setCpf(conex.rs.getString("cpf"));
            mod.setTelefone(conex.rs.getString("telefone"));
            mod.setValorAluguel(conex.rs.getString("valor_aluguel"));
       
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Morador Não Cadastrado");
        }
      
      conex.Desconectar();
        return mod;
    }
    
    
}
