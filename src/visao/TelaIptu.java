/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import com.sun.org.apache.bcel.internal.generic.AALOAD;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.TableModel;
import modeloConection.ConexaoBD;
import modeloDao.DaoIptu;
import modeloBeans.BeansIptu;
import modeloBeans.ModeloTabelaIptu;

/**
 *
 * @author Pedro
 */
public class TelaIptu extends javax.swing.JFrame {

   BeansIptu mode=new BeansIptu();
    DaoIptu contro= new DaoIptu();
    ConexaoBD conex=new ConexaoBD();
    int flag=0;
    
     
    public TelaIptu() {
        initComponents();
        
        preencherTabela("select*from iptu order by ano desc ");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableIptu = new javax.swing.JTable();
        jTextFieldPesquisar = new javax.swing.JTextField();
        jButtonBuscasr = new javax.swing.JButton();
        jTextFieldAnoIptu = new javax.swing.JTextField();
        jTextFieldValorIptu = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButtonSalvar = new javax.swing.JButton();
        jButtonNovo = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldNumeroCasaIp = new javax.swing.JTextField();
        jButtonLimpar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        codigo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButtonExcluir = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel1.setText("      Relatório Do IPTU:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 17, 307, 38));

        jTableIptu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableIptu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableIptuMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableIptu);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(283, 145, 427, 336));

        jTextFieldPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 103, 147, -1));

        jButtonBuscasr.setText("PESQUISAR:");
        jButtonBuscasr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscasrActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBuscasr, new org.netbeans.lib.awtextra.AbsoluteConstraints(605, 102, -1, -1));

        jTextFieldAnoIptu.setEnabled(false);
        jTextFieldAnoIptu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAnoIptuActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldAnoIptu, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 147, -1));

        jTextFieldValorIptu.setEnabled(false);
        jTextFieldValorIptu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldValorIptuActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldValorIptu, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 147, -1));

        jLabel3.setText("Ano:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 147, 17));

        jLabel4.setText("Valor:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 104, -1));

        jButtonSalvar.setText("Salvar:");
        jButtonSalvar.setEnabled(false);
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 410, 87, -1));

        jButtonNovo.setText("Novo:");
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonNovo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 87, -1));

        jButtonEditar.setText("Editar:");
        jButtonEditar.setEnabled(false);
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, 87, -1));

        jLabel2.setText("Número Casa:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        jTextFieldNumeroCasaIp.setEnabled(false);
        jTextFieldNumeroCasaIp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNumeroCasaIpActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNumeroCasaIp, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 147, -1));

        jButtonLimpar.setText("Limpar:");
        jButtonLimpar.setEnabled(false);
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 87, 26));

        jButtonCancelar.setText("Cancelar:");
        jButtonCancelar.setEnabled(false);
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, -1, -1));

        codigo.setEnabled(false);
        getContentPane().add(codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 60, -1));

        jLabel5.setText("ID:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 30, 24, 13));

        jButtonExcluir.setText("Excluir:");
        jButtonExcluir.setEnabled(false);
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 460, 90, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 760, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/fundo de imagem.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPesquisarActionPerformed
       
        
        
    }//GEN-LAST:event_jTextFieldPesquisarActionPerformed

    private void jTextFieldAnoIptuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAnoIptuActionPerformed
        
        
        
    }//GEN-LAST:event_jTextFieldAnoIptuActionPerformed

    private void jTextFieldValorIptuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldValorIptuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldValorIptuActionPerformed

    private void jTextFieldNumeroCasaIpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNumeroCasaIpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNumeroCasaIpActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed

        if(flag==1){
        mode.setAno(jTextFieldAnoIptu.getText());
        mode.setCasa(jTextFieldNumeroCasaIp.getText());
        mode.setValor(jTextFieldValorIptu.getText());
        
        contro.salva3(mode);
        
        
        jTextFieldAnoIptu.setText("");
        jTextFieldNumeroCasaIp.setText("");
        jTextFieldValorIptu.setText("");
        
        
        jButtonSalvar.setEnabled(false);
        jButtonLimpar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        jButtonEditar.setEnabled(false);
        
        jButtonNovo.setEnabled(true);
        jTableIptu.setEnabled(false);
        jTextFieldAnoIptu.setEnabled(false);
        jTextFieldValorIptu.setEnabled(false);
        jTextFieldNumeroCasaIp.setEnabled(false);
        jButtonSalvar.setEnabled(false);
        //Editar IPTU
        
        preencherTabela("select*from iptu order by ano desc ");
        }else
        {
        mode.setCodigo(Integer.parseInt(codigo.getText()));
        mode.setAno(jTextFieldAnoIptu.getText());
        mode.setCasa(jTextFieldNumeroCasaIp.getText());
        mode.setValor(jTextFieldValorIptu.getText());
        
        contro.Editar(mode);
        
        jTextFieldAnoIptu.setText("");
        jTextFieldNumeroCasaIp.setText("");
        jTextFieldValorIptu.setText("");
        
        jTableIptu.setEnabled(false);
        jTextFieldAnoIptu.setEnabled(false);
        jTextFieldValorIptu.setEnabled(false);
        jTextFieldNumeroCasaIp.setEnabled(false);

        jButtonCancelar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        jButtonSalvar.setEnabled(false);
        jButtonLimpar.setEnabled(false);
        jButtonNovo.setEnabled(true);
        jButtonEditar.setEnabled(false);
        
        preencherTabela("select*from iptu order by ano desc ");
        }
  
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonBuscasrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscasrActionPerformed
  
        
        mode.setPesqiusas(jTextFieldPesquisar.getText());
        BeansIptu model= contro.buscarIptu(mode);
        
        jTextFieldAnoIptu.setText(model.getAno());
        jTextFieldNumeroCasaIp.setText(model.getCasa());
        jTextFieldValorIptu.setText(model.getValor());
        codigo.setText(String.valueOf(model.getCodigo()));
        
        jButtonEditar.setEnabled(true);
        jButtonNovo.setEnabled(true);
    }//GEN-LAST:event_jButtonBuscasrActionPerformed

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        
        flag=1;
        jTextFieldAnoIptu.setEnabled(true);
        jTextFieldNumeroCasaIp.setEnabled(true);
        jTextFieldValorIptu.setEnabled(true);
        
        jButtonLimpar.setEnabled(true);
        jButtonSalvar.setEnabled(true);
        jButtonCancelar.setEnabled(true);
        
        jTextFieldAnoIptu.setText("");
        jTextFieldNumeroCasaIp.setText("");
        jTextFieldValorIptu.setText("");
        codigo.setText("");
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed

        
        jTextFieldAnoIptu.setText("");
        jTextFieldNumeroCasaIp.setText("");
        jTextFieldValorIptu.setText("");
        
        jButtonNovo.setEnabled(true);
        jButtonLimpar.setEnabled(false);
        jButtonCancelar.setEnabled(false);
        jButtonEditar.setEnabled(false);
        jButtonSalvar.setEnabled(false);
        
    }//GEN-LAST:event_jButtonLimparActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed

        flag=2;
        
        jTableIptu.setEnabled(true);
        jTextFieldPesquisar.setEnabled(true);
        jTextFieldAnoIptu.setEnabled(true);
        jTextFieldNumeroCasaIp.setEnabled(true);
        jTextFieldValorIptu.setEnabled(true);
        
        jButtonLimpar.setEnabled(true);
        jButtonSalvar.setEnabled(true);
        jButtonExcluir.setEnabled(true);
        jButtonEditar.setEnabled(false);
        jButtonNovo.setEnabled(false);
        jButtonCancelar.setEnabled(true);
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        
         jTextFieldAnoIptu.setEnabled(!true);
        jTextFieldNumeroCasaIp.setEnabled(!true);
        jTextFieldValorIptu.setEnabled(!true);        
        
        jButtonLimpar.setEnabled(!true);
        jButtonSalvar.setEnabled(!true);
        jButtonEditar.setEnabled(!true);
        jButtonCancelar.setEnabled(!true);
        jButtonNovo.setEnabled(true);
        jButtonExcluir.setEnabled(!true);
        
        jTextFieldAnoIptu.setText("");
        jTextFieldNumeroCasaIp.setText("");
        jTextFieldValorIptu.setText("");
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
      
        int resposta=0;
        resposta=JOptionPane.showConfirmDialog(rootPane,"Deseja Excluir");
        
        if(resposta==JOptionPane.YES_OPTION)
        {
            mode.setCodigo(Integer.parseInt(codigo.getText()));
            contro.Excluir(mode);
            
        jTableIptu.setEnabled(false);
        jTextFieldAnoIptu.setEnabled(false);
        jTextFieldValorIptu.setEnabled(false);
        jTextFieldNumeroCasaIp.setEnabled(false);
        
        
        }
        preencherTabela("select*from iptu order by ano desc ");
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jTableIptuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableIptuMouseClicked
       //molse cliketd
        ///tabela
        //IPTU
        
        String nome_morador=""+jTableIptu.getValueAt(jTableIptu.getSelectedRow(),2);
        conex.conexao();
        conex.executaSql("select * from iptu where numero_casa='"+nome_morador+"'");
         try {
            conex.rs.first();
            
           codigo.setText(String.valueOf(conex.rs.getInt("cod_iptu")));
           jTextFieldAnoIptu.setText(conex.rs.getString("ano"));
           jTextFieldNumeroCasaIp.setText(conex.rs.getString("numero_casa"));
           jTextFieldValorIptu.setText(conex.rs.getString("valor_iptu"));
           
    }//GEN-LAST:event_jTableIptuMouseClicked
     catch (SQLException ex)
     {
        JOptionPane.showMessageDialog(null,"Erro ao selecionar dados"+ex);          
     }
         jButtonCancelar.setEnabled(true);
         jButtonEditar.setEnabled(true);
         jButtonExcluir.setEnabled(true);
         jButtonNovo.setEnabled(false);

          }         
    
    public void preencherTabela(String Sql)
    {
    ArrayList dados=new ArrayList();
    
    String [] colunas=new String[]{"ID","ANO IPTU","NÚMERO DA CASA","VALOR DO IPTU"};
    
    conex.conexao();
    conex.executaSql(Sql);
    
    try{
    
    conex.rs.first();
    
    do {
    
    dados.add(new Object[]{conex.rs.getInt("cod_iptu"),conex.rs.getString("ano"),conex.rs.getString("numero_casa"),conex.rs.getString("valor_iptu")});
       
    
       }while(conex.rs.next());
    
    }catch(SQLException ex)
       {
        JOptionPane.showMessageDialog(rootPane,"Erro ao preencher ArrayLyst"+ex);
       }
        ModeloTabelaIptu modelos=new ModeloTabelaIptu(dados,colunas);
        
        jTableIptu.setModel(modelos);
        
        jTableIptu.getColumnModel().getColumn(0).setPreferredWidth(40);
        jTableIptu.getColumnModel().getColumn(0).setResizable(false);
        jTableIptu.getColumnModel().getColumn(1).setPreferredWidth(150);
        jTableIptu.getColumnModel().getColumn(1).setResizable(false);
        jTableIptu.getColumnModel().getColumn(2).setPreferredWidth(120);
        jTableIptu.getColumnModel().getColumn(2).setResizable(false);
        jTableIptu.getColumnModel().getColumn(3).setPreferredWidth(110);
        jTableIptu.getColumnModel().getColumn(3).setResizable(false);


       
        
        jTableIptu.getTableHeader().setReorderingAllowed(false);
        jTableIptu.setAutoResizeMode(jTableIptu.AUTO_RESIZE_OFF);
        jTableIptu.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        
    conex.Desconectar();
    }
    
    
    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaIptu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaIptu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaIptu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaIptu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaIptu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField codigo;
    private javax.swing.JButton jButtonBuscasr;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTableIptu;
    private javax.swing.JTextField jTextFieldAnoIptu;
    private javax.swing.JTextField jTextFieldNumeroCasaIp;
    private javax.swing.JTextField jTextFieldPesquisar;
    private javax.swing.JTextField jTextFieldValorIptu;
    // End of variables declaration//GEN-END:variables
}