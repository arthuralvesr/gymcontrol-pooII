package window;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class dlgCadAluno extends javax.swing.JDialog {

    private final JTable tabela;
    private int linhaEd;

    public dlgCadAluno(java.awt.Frame parent, boolean modal, JTable tabela) {
        super(parent, modal);
        this.tabela = tabela;
        initComponents();
    }
    
    public dlgCadAluno(java.awt.Frame parent, boolean modal, JTable tabela, int linha) {
        super(parent, modal);
        this.tabela = tabela;
        this.linhaEd = linha;
        initComponents();
        carregarLinha(linhaEd);   
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groupSexo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblDataNasc = new javax.swing.JLabel();
        txtDataNasc = new javax.swing.JFormattedTextField();
        rdSexo = new javax.swing.JPanel();
        radioMasc = new javax.swing.JRadioButton();
        radioFem = new javax.swing.JRadioButton();
        lblTelefone = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JFormattedTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        lblPeso = new javax.swing.JLabel();
        txtPeso = new javax.swing.JSpinner();
        lblAltura = new javax.swing.JLabel();
        txtAltura = new javax.swing.JSpinner();
        jPanel4 = new javax.swing.JPanel();
        chkEmagrecimento = new javax.swing.JCheckBox();
        chkCondicionamento = new javax.swing.JCheckBox();
        chkHipertrofia = new javax.swing.JCheckBox();
        chkReabilitacao = new javax.swing.JCheckBox();
        lblObservacao = new javax.swing.JLabel();
        txtObservacao = new javax.swing.JScrollPane();
        txtObs = new javax.swing.JTextArea();
        btSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Aluno | GYMCONTROL");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informacoes Pessoais", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        lblNome.setText("Nome");

        lblDataNasc.setText("Data de Nascimento");

        try {
            txtDataNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDataNasc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataNascActionPerformed(evt);
            }
        });

        rdSexo.setBorder(javax.swing.BorderFactory.createTitledBorder("Sexo"));

        groupSexo.add(radioMasc);
        radioMasc.setMnemonic('M');
        radioMasc.setText("Masculino");
        radioMasc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/images/toggle-off.png"))); // NOI18N
        radioMasc.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/images/toggle-on.png"))); // NOI18N

        groupSexo.add(radioFem);
        radioFem.setMnemonic('F');
        radioFem.setText("Feminino");
        radioFem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/images/toggle-off.png"))); // NOI18N
        radioFem.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/images/toggle-on.png"))); // NOI18N

        javax.swing.GroupLayout rdSexoLayout = new javax.swing.GroupLayout(rdSexo);
        rdSexo.setLayout(rdSexoLayout);
        rdSexoLayout.setHorizontalGroup(
            rdSexoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rdSexoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(rdSexoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radioMasc)
                    .addComponent(radioFem))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        rdSexoLayout.setVerticalGroup(
            rdSexoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rdSexoLayout.createSequentialGroup()
                .addComponent(radioMasc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioFem)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblTelefone.setText("Telefone");

        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefoneActionPerformed(evt);
            }
        });

        lblEmail.setText("Email");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNome)
                    .addComponent(lblDataNasc)
                    .addComponent(lblEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTelefone)
                        .addGap(7, 7, 7)
                        .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtNome, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(rdSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNome)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDataNasc)
                            .addComponent(txtDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTelefone)
                            .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEmail))))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados Fisicos"));

        lblPeso.setText("Peso (kg)");

        lblAltura.setText("Altura (cm)");

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Objetivo"));

        chkEmagrecimento.setText("Emagrecimento");

        chkCondicionamento.setText("Condicionamento");

        chkHipertrofia.setText("Hipertrofia");

        chkReabilitacao.setText("Reabilitacao");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(chkEmagrecimento)
                .addGap(18, 18, 18)
                .addComponent(chkHipertrofia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(chkCondicionamento)
                .addGap(18, 18, 18)
                .addComponent(chkReabilitacao)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkEmagrecimento)
                    .addComponent(chkCondicionamento)
                    .addComponent(chkHipertrofia)
                    .addComponent(chkReabilitacao))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblPeso)
                        .addGap(21, 21, 21)
                        .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblAltura)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPeso)
                    .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAltura)
                    .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblObservacao.setText("Observacoes");

        txtObs.setColumns(20);
        txtObs.setRows(5);
        txtObservacao.setViewportView(txtObs);

        btSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/images/disk.png"))); // NOI18N
        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblObservacao)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtObservacao)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addComponent(btSalvar)))
                .addContainerGap(7, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblObservacao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtObservacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btSalvar)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefoneActionPerformed

    private void txtDataNascActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataNascActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataNascActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        
        String nome = txtNome.getText();
        String dataN = txtDataNasc.getText();
        String telefone = txtTelefone.getText();
        String email = txtEmail.getText();
        String sexo = "";
        
        if (groupSexo.getSelection() != null) {
            if (groupSexo.getSelection().getMnemonic() == 'M') {
                sexo = "Masculino";
            } else {
                sexo = "Feminino";
            }
        }
        
        
        int peso = Integer.parseInt(txtPeso.getValue().toString());
        int altura = Integer.parseInt(txtAltura.getValue().toString());
        List<String> objetivo = new ArrayList<>(); 
        
        if (chkEmagrecimento.isSelected()) objetivo.add(chkEmagrecimento.getText());
        if (chkHipertrofia.isSelected()) objetivo.add(chkHipertrofia.getText());
        if (chkCondicionamento.isSelected()) objetivo.add(chkCondicionamento.getText());
        if (chkReabilitacao.isSelected()) objetivo.add(chkReabilitacao.getText());
        
        String obs = txtObs.getText();
        
        if (validarCampos()){
            inserirTabelaAluno(nome, dataN, telefone, objetivo, obs);
            limparCadastro();
        }
    }//GEN-LAST:event_btSalvarActionPerformed

    private void inserirTabelaAluno(String nome, String dataN, String telefone, List objetivo, String obs){
        
        ((DefaultTableModel) tabela.getModel()).addRow(new Object[5]);
        
        int linha = tabela.getRowCount() - 1;
        int col = 0;
        
        tabela.setValueAt(nome, linha, col++);
        tabela.setValueAt(dataN, linha, col++);
        tabela.setValueAt(telefone, linha, col++);
        tabela.setValueAt(objetivo, linha, col++);
        tabela.setValueAt(obs, linha, col++);
        
    }
    
    private void limparCadastro() {
      
        txtNome.setText("");
        txtDataNasc.setText("");
        txtTelefone.setText("");
        txtEmail.setText("");
        groupSexo.clearSelection();
        
        txtPeso.setValue(0);
        txtAltura.setValue(0);
        
        chkEmagrecimento.setSelected(false);
        chkHipertrofia.setSelected(false);
        chkCondicionamento.setSelected(false);
        chkReabilitacao.setSelected(false);
        
        txtObs.setText("");
        
    }
    
    private void carregarLinha(int linha) {
        
        txtNome.setText(tabela.getValueAt(linha, 0).toString());  
        txtDataNasc.setText(tabela.getValueAt(linha, 1).toString());
        txtTelefone.setText(tabela.getValueAt(linha, 2).toString());
        
        txtObs.setText(tabela.getValueAt(linha, 4).toString());

    }
    
    private boolean validarCampos() {
        
        String msgError = "";
        
        if (txtNome.getText().isEmpty()){
            msgError = msgError + "Digite o nome do Aluno(a)\n";
            lblNome.setForeground(Color.red);
        }
        if (txtTelefone.getText().isEmpty()){
            msgError = msgError + "Digite o telefone do Aluno(a)\n";
            lblTelefone.setForeground(Color.red);
        }
        if (txtEmail.getText().isEmpty()) {
            msgError = msgError + "Digite o email do Aluno(a)\n";
            lblEmail.setForeground(Color.red);
        }
        if (groupSexo.getSelection() == null) {
            msgError = msgError + "Digite o sexo do Aluno(a)\n";
        }
        
        if (msgError.isEmpty()) {
            return true;
        } else {
            JOptionPane.showMessageDialog(this, msgError);
            
            return false;
        }
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
            java.util.logging.Logger.getLogger(dlgCadAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dlgCadAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dlgCadAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dlgCadAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                dlgCadAluno dialog = new dlgCadAluno(new javax.swing.JFrame(), true, null);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSalvar;
    private javax.swing.JCheckBox chkCondicionamento;
    private javax.swing.JCheckBox chkEmagrecimento;
    private javax.swing.JCheckBox chkHipertrofia;
    private javax.swing.JCheckBox chkReabilitacao;
    private javax.swing.ButtonGroup groupSexo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblAltura;
    private javax.swing.JLabel lblDataNasc;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblObservacao;
    private javax.swing.JLabel lblPeso;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JRadioButton radioFem;
    private javax.swing.JRadioButton radioMasc;
    private javax.swing.JPanel rdSexo;
    private javax.swing.JSpinner txtAltura;
    private javax.swing.JFormattedTextField txtDataNasc;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextArea txtObs;
    private javax.swing.JScrollPane txtObservacao;
    private javax.swing.JSpinner txtPeso;
    private javax.swing.JFormattedTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
