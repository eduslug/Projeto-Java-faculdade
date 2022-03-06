
package visao;
//Desenvolvido Por Eduardo Irineu Dos Santos Nascimento
//projeto 1.2.3 Cadastro
//novo Projeto.jar

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import modeloConection.ConexaoBD;
import modeloDao.DaoMorador;
import modeloBeans.BeansMorador;
import modeloBeans.ModeloTabelaMorador;


public class TelaCadastoMora extends javax.swing.JFrame {

    BeansMorador mod=new BeansMorador();
    DaoMorador contro= new DaoMorador();
    ConexaoBD conex=new ConexaoBD();
    int flag=0;       
           
    public TelaCadastoMora() {
       initComponents();
        preencherTabela("select*from morador order by nome_morador");
       
       
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldNomeMorador = new javax.swing.JTextField();
        jTextFieldNumeroCasa = new javax.swing.JTextField();
        jTextFieldDataDePagamento = new javax.swing.JTextField();
        jButtonAdicionar = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableMorador = new javax.swing.JTable();
        jTextFieldPesquisa = new javax.swing.JTextField();
        jButtonPesquisar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldCpf = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldTelefone = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldValorAluguel = new javax.swing.JTextField();
        jButtonLimpar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldCod = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel2.setText("Nome:");

        jLabel3.setText("Casa:");

        jLabel5.setText("Data Do Vencimento:");

        jTextFieldNomeMorador.setEnabled(false);
        jTextFieldNomeMorador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeMoradorActionPerformed(evt);
            }
        });

        jTextFieldNumeroCasa.setEnabled(false);
        jTextFieldNumeroCasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNumeroCasaActionPerformed(evt);
            }
        });

        jTextFieldDataDePagamento.setEnabled(false);
        jTextFieldDataDePagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDataDePagamentoActionPerformed(evt);
            }
        });

        jButtonAdicionar.setText("Novo");
        jButtonAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdicionarActionPerformed(evt);
            }
        });

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.setEnabled(false);
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonExcluir.setText("Excluir");
        jButtonExcluir.setEnabled(false);
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jButtonEditar.setText("Editar");
        jButtonEditar.setEnabled(false);
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setEnabled(false);
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jTableMorador.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableMorador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMoradorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableMorador);

        jTextFieldPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPesquisaActionPerformed(evt);
            }
        });

        jButtonPesquisar.setText("pesquisar");
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });

        jLabel4.setText("CPF:");

        jTextFieldCpf.setEnabled(false);
        jTextFieldCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCpfActionPerformed(evt);
            }
        });

        jLabel6.setText("TELEFONE:");

        jTextFieldTelefone.setEnabled(false);

        jLabel8.setText("Valor Do Aluguel:");

        jTextFieldValorAluguel.setEnabled(false);
        jTextFieldValorAluguel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldValorAluguelActionPerformed(evt);
            }
        });

        jButtonLimpar.setText("Limpar");
        jButtonLimpar.setEnabled(false);
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });

        jLabel9.setText("ID:");

        jTextFieldCod.setEnabled(false);
        jTextFieldCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCodActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jButtonLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(350, 350, 350))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                                    .addComponent(jTextFieldDataDePagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextFieldNumeroCasa, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextFieldNomeMorador, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE))
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextFieldValorAluguel)
                                        .addComponent(jTextFieldCpf, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                                        .addComponent(jTextFieldTelefone))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldCod, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextFieldPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonPesquisar))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(26, 26, 26)
                                    .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(27, 27, 27)
                                    .addComponent(jButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(12, 12, 12))))))
                .addContainerGap(567, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextFieldNomeMorador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextFieldNumeroCasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextFieldDataDePagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextFieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldValorAluguel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonPesquisar))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(68, 68, 68)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonExcluir)
                    .addComponent(jButtonSalvar)
                    .addComponent(jButtonLimpar)
                    .addComponent(jButtonAdicionar)
                    .addComponent(jButtonEditar)
                    .addComponent(jButtonCancelar))
                .addGap(129, 129, 129))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 57, 1248, 585);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel1.setText("           Cadastro De Moradores");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(150, 20, 283, 37);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/fundo de imagem.jpg"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 0, 930, 530);

        setSize(new java.awt.Dimension(741, 577));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNomeMoradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeMoradorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeMoradorActionPerformed

    private void jTextFieldDataDePagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDataDePagamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDataDePagamentoActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
       
         
        jTextFieldCpf.setEnabled(!true);
        jTextFieldDataDePagamento.setEnabled(!true);
        jTextFieldNomeMorador.setEnabled(!true);
        jTextFieldNumeroCasa.setEnabled(!true);
        jTextFieldTelefone.setEnabled(!true);
        jTextFieldValorAluguel.setEnabled(!true);
        jButtonSalvar.setEnabled(!true);
        jButtonLimpar.setEnabled(!true);
        jButtonCancelar.setEnabled(!true);
        jButtonExcluir.setEnabled(!true);
        jTextFieldNomeMorador.setText("");
        jTextFieldCpf.setText("");
        jTextFieldDataDePagamento.setText("");
        jTextFieldNumeroCasa.setText("");
        jTextFieldTelefone.setText("");
        jTextFieldValorAluguel.setText("");
        
        
        jButtonAdicionar.setEnabled(true);
        jButtonEditar.setEnabled(false);
        jButtonLimpar.setEnabled(false);
        jButtonSalvar.setEnabled(false);
        
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
        
        mod.setPesquisar(jTextFieldPesquisa.getText());
        BeansMorador model= contro.buscaMorador(mod);
        
        jTextFieldNomeMorador.setText(model.getNome());
        jTextFieldNumeroCasa.setText(model.getCasa());
        
        jTextFieldCod.setText(String.valueOf(model.getCodigo()));
        
        jTextFieldDataDePagamento.setText(model.getVencimento());
        jTextFieldTelefone.setText(model.getTelefone());
        jTextFieldValorAluguel.setText(model.getValorAluguel());
        jTextFieldCpf.setText(model.getCpf());
        
       
        
        jButtonEditar.setEnabled(true);
        
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
       

        if(flag==1)
        {
        
        mod.setNome(jTextFieldNomeMorador.getText());
        mod.setCasa(jTextFieldNumeroCasa.getText());
        mod.setCpf(jTextFieldCpf.getText());
        mod.setTelefone(jTextFieldTelefone.getText());
        mod.setVencimento(jTextFieldDataDePagamento.getText());
        mod.setValorAluguel(jTextFieldValorAluguel.getText());
        
        contro.salvar(mod);
              
        jTextFieldNomeMorador.setText("");
        jTextFieldCpf.setText("");
        jTextFieldDataDePagamento.setText("");
        jTextFieldNumeroCasa.setText("");
        jTextFieldTelefone.setText("");
        jTextFieldValorAluguel.setText("");
        
        
        
        
        jTextFieldCpf.setEnabled(false);
        jTextFieldDataDePagamento.setEnabled(false);
        jTextFieldNomeMorador.setEnabled(false);
        jTextFieldNumeroCasa.setEnabled(false);
        jTextFieldTelefone.setEnabled(false);
        jTextFieldValorAluguel.setEnabled(false);
        jButtonSalvar.setEnabled(false);
        
         preencherTabela("select*from morador order by nome_morador");
        }else{  
              //editar Morador
        mod.setCodigo(Integer.parseInt(jTextFieldCod.getText()));
        
        mod.setNome(jTextFieldNomeMorador.getText());
        mod.setCasa(jTextFieldNumeroCasa.getText());
        mod.setCpf(jTextFieldCpf.getText());
        mod.setTelefone(jTextFieldTelefone.getText());
        mod.setValorAluguel(jTextFieldValorAluguel.getText());
        mod.setVencimento(jTextFieldDataDePagamento.getText());
        
        contro.Editar(mod);
        
        jTextFieldCpf.setEnabled(false);
        jTextFieldDataDePagamento.setEnabled(false);
        jTextFieldNomeMorador.setEnabled(false);
        jTextFieldNumeroCasa.setEnabled(false);
        jTextFieldTelefone.setEnabled(false);
        jTextFieldValorAluguel.setEnabled(false);
        
        jButtonExcluir.setEnabled(false);
        jButtonCancelar.setEnabled(false);
        jButtonLimpar.setEnabled(false);
        jButtonEditar.setEnabled(false);
        jButtonAdicionar.setEnabled(true);
        jButtonSalvar.setEnabled(false);
        preencherTabela("select*from morador order by nome_morador");
        }
         
         
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jTextFieldNumeroCasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNumeroCasaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNumeroCasaActionPerformed

    private void jTextFieldValorAluguelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldValorAluguelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldValorAluguelActionPerformed

    private void jTextFieldPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPesquisaActionPerformed

    private void jTextFieldCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCpfActionPerformed

    private void jButtonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarActionPerformed
       
        flag=1;
        
        jTableMorador.setEnabled(true);
        jTextFieldCpf.setEnabled(true);
        jTextFieldDataDePagamento.setEnabled(true);
        jTextFieldNomeMorador.setEnabled(true);
        jTextFieldNumeroCasa.setEnabled(true);
        jTextFieldTelefone.setEnabled(true);
        jTextFieldValorAluguel.setEnabled(true);
        jButtonSalvar.setEnabled(true);
        jButtonLimpar.setEnabled(true);
        jButtonCancelar.setEnabled(true);
        
        jTextFieldCod.setText("");
        jTextFieldNomeMorador.setText("");
        jTextFieldCpf.setText("");
        jTextFieldDataDePagamento.setText("");
        jTextFieldNumeroCasa.setText("");
        jTextFieldTelefone.setText("");
        jTextFieldValorAluguel.setText("");
    }//GEN-LAST:event_jButtonAdicionarActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        flag=2;
        jTextFieldPesquisa.setEnabled(true);
        jTableMorador.setEnabled(true);
        jTextFieldCpf.setEnabled(true);
        jTextFieldDataDePagamento.setEnabled(true);
        jTextFieldNomeMorador.setEnabled(true);
        jTextFieldNumeroCasa.setEnabled(true);
        jTextFieldTelefone.setEnabled(true);
        jTextFieldValorAluguel.setEnabled(true);
        jButtonSalvar.setEnabled(true);
        jButtonLimpar.setEnabled(true);
        jButtonCancelar.setEnabled(true);
        jButtonEditar.setEnabled(false);
        jButtonAdicionar.setEnabled(false);
        jButtonExcluir.setEnabled(true);
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed

        jTextFieldNomeMorador.setText("");
        jTextFieldCpf.setText("");
        jTextFieldDataDePagamento.setText("");
        jTextFieldNumeroCasa.setText("");
        jTextFieldTelefone.setText("");
        jTextFieldValorAluguel.setText("");
        
        
        
        jTextFieldCpf.setEnabled(true);
        jTextFieldDataDePagamento.setEnabled(true);
        jTextFieldNomeMorador.setEnabled(true);
        jTextFieldNumeroCasa.setEnabled(true);
        jTextFieldTelefone.setEnabled(true);
        jTextFieldValorAluguel.setEnabled(true);
        
        //botoes
        jButtonSalvar.setEnabled(false);
        jButtonLimpar.setEnabled(true);
        jButtonCancelar.setEnabled(true);
        jButtonSalvar.setEnabled(true);
    }//GEN-LAST:event_jButtonLimparActionPerformed

    private void jTextFieldCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCodActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        
        //funçao Excluir
        //Desenvolvido Por Eduardo Santos
        int resposta=0;
        resposta=JOptionPane.showConfirmDialog(rootPane,"Deseja Excluir");
        
        
        if(resposta==JOptionPane.YES_OPTION)
        {
            
        mod.setCodigo(Integer.parseInt(jTextFieldCod.getText()));
        contro.Excluir(mod);
        
        jTextFieldCpf.setEnabled(false);
        jTextFieldDataDePagamento.setEnabled(false);
        jTextFieldNomeMorador.setEnabled(false);
        jTextFieldNumeroCasa.setEnabled(false);
        jTextFieldTelefone.setEnabled(false);
        jTextFieldValorAluguel.setEnabled(false);
        jButtonSalvar.setEnabled(false);
        jButtonLimpar.setEnabled(false);
        jButtonCancelar.setEnabled(false);
        
        preencherTabela("select*from morador order by nome_morador");
        }
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jTableMoradorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMoradorMouseClicked
       //Mouse Clicked funçao 
        //usando String
        //modelo Morador
        String nome_morador=""+jTableMorador.getValueAt(jTableMorador.getSelectedRow(),1);
        conex.conexao();
        conex.executaSql("select * from morador where nome_morador='"+nome_morador+"'");
        try {
            conex.rs.first();
           jTextFieldCod.setText(String.valueOf(conex.rs.getInt("cod_morador")));
           jTextFieldNomeMorador.setText(conex.rs.getString("nome_morador"));
           jTextFieldNumeroCasa.setText(conex.rs.getString("numero_casa"));
           jTextFieldDataDePagamento.setText(conex.rs.getString("data_pagamento"));
           jTextFieldCpf.setText(conex.rs.getString("cpf"));
           jTextFieldTelefone.setText(conex.rs.getString("telefone"));
           jTextFieldValorAluguel.setText(conex.rs.getString("valor_aluguel"));
           
           
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao selecionar dados"+ex);
        }
        
        jButtonCancelar.setEnabled(true);
        jButtonEditar.setEnabled(true);
        jButtonAdicionar.setEnabled(false);
        
        jButtonExcluir.setEnabled(true);
    }//GEN-LAST:event_jTableMoradorMouseClicked

    public void preencherTabela(String Sql)
    {
    ArrayList dados=new ArrayList();
    
    String [] colunas=new String[]{"ID","Nome","Casa","Vencimento","CPF","Telefone","Valor Aluguel"};
    
    conex.conexao();
    conex.executaSql(Sql);
    
    try{
    
    conex.rs.first();
    
    do {
    
    dados.add(new Object[]{conex.rs.getInt("cod_morador"),conex.rs.getString("nome_morador"),conex.rs.getString("numero_casa"),conex.rs.getString("data_pagamento"),conex.rs.getString("cpf"),conex.rs.getString("telefone"),conex.rs.getString("valor_aluguel")});
       
    
       }while(conex.rs.next());
    
    }catch(SQLException ex)
       {
        JOptionPane.showMessageDialog(rootPane,"Erro ao preencher ArrayLyst"+ex);
       }
        ModeloTabelaMorador modelo=new ModeloTabelaMorador(dados,colunas);
        
        jTableMorador.setModel(modelo);
        
        jTableMorador.getColumnModel().getColumn(0).setPreferredWidth(34);
        jTableMorador.getColumnModel().getColumn(0).setResizable(false);
        jTableMorador.getColumnModel().getColumn(1).setPreferredWidth(200);
        jTableMorador.getColumnModel().getColumn(1).setResizable(false);
        jTableMorador.getColumnModel().getColumn(2).setPreferredWidth(100);
        jTableMorador.getColumnModel().getColumn(2).setResizable(false);
        jTableMorador.getColumnModel().getColumn(3).setPreferredWidth(120);
        jTableMorador.getColumnModel().getColumn(3).setResizable(false);
        jTableMorador.getColumnModel().getColumn(4).setPreferredWidth(140);
        jTableMorador.getColumnModel().getColumn(4).setResizable(false);
        jTableMorador.getColumnModel().getColumn(5).setPreferredWidth(100);
        jTableMorador.getColumnModel().getColumn(5).setResizable(false);
         jTableMorador.getColumnModel().getColumn(6).setPreferredWidth(100);
        jTableMorador.getColumnModel().getColumn(6).setResizable(false);
        
        
        jTableMorador.getTableHeader().setReorderingAllowed(false);
        jTableMorador.setAutoResizeMode(jTableMorador.AUTO_RESIZE_OFF);
        jTableMorador.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        
    conex.Desconectar();
    }
    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastoMora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdicionar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableMorador;
    private javax.swing.JTextField jTextFieldCod;
    private javax.swing.JTextField jTextFieldCpf;
    private javax.swing.JTextField jTextFieldDataDePagamento;
    private javax.swing.JTextField jTextFieldNomeMorador;
    private javax.swing.JTextField jTextFieldNumeroCasa;
    private javax.swing.JTextField jTextFieldPesquisa;
    private javax.swing.JTextField jTextFieldTelefone;
    private javax.swing.JTextField jTextFieldValorAluguel;
    // End of variables declaration//GEN-END:variables
}
