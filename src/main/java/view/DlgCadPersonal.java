package view;

import controller.PersonalController;
import javax.swing.JTable;
import model.Personal;

public class DlgCadPersonal extends javax.swing.JDialog {
    
    private final JTable tabela;
    private final PersonalController controller;
    private int linhaEd = -1;
    
    public DlgCadPersonal(java.awt.Frame parent, boolean modal, JTable tabela) {
        super(parent, modal);
        this.tabela = tabela;
        this.controller = new PersonalController();
        initComponents();
    }
    
    public DlgCadPersonal(java.awt.Frame parent, boolean modal, JTable tabela, int linha) {
        super(parent, modal);
        this.tabela = tabela;
        this.controller = new PersonalController();
        this.linhaEd = linha;
        initComponents();
        carregarLinha(linhaEd);   
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groupStatus = new javax.swing.ButtonGroup();
        groupSexo = new javax.swing.ButtonGroup();
        pnlInfosPessoais = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblDataNasc = new javax.swing.JLabel();
        txtDataNasc = new javax.swing.JTextField();
        pnlSexo = new javax.swing.JPanel();
        radioMasc = new javax.swing.JRadioButton();
        radioFem = new javax.swing.JRadioButton();
        lblTelefone = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JFormattedTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblCPF = new javax.swing.JLabel();
        txtCpf = new javax.swing.JTextField();
        pnlDadosProfissionais = new javax.swing.JPanel();
        lblCref = new javax.swing.JLabel();
        txtCref = new javax.swing.JTextField();
        lblEspecialidade = new javax.swing.JLabel();
        cmbEspecialidade = new javax.swing.JComboBox<>();
        lblTurno = new javax.swing.JLabel();
        cmbTurno = new javax.swing.JComboBox<>();
        pnlDadosProfissionais1 = new javax.swing.JPanel();
        lblDataContratacao = new javax.swing.JLabel();
        txtDataContratacao = new javax.swing.JTextField();
        lblStatus = new javax.swing.JLabel();
        rdioAtivo = new javax.swing.JRadioButton();
        rdioInativo = new javax.swing.JRadioButton();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lblObs = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtObs = new javax.swing.JTextArea();
        lblTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Personal | GYMCONTROL");
        setMaximumSize(new java.awt.Dimension(595, 588));

        pnlInfosPessoais.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informacoes Pessoais", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        lblNome.setText("Nome");

        lblDataNasc.setText("Data Nascimento");

        pnlSexo.setBorder(javax.swing.BorderFactory.createTitledBorder("Sexo"));

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

        javax.swing.GroupLayout pnlSexoLayout = new javax.swing.GroupLayout(pnlSexo);
        pnlSexo.setLayout(pnlSexoLayout);
        pnlSexoLayout.setHorizontalGroup(
            pnlSexoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSexoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSexoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radioMasc)
                    .addComponent(radioFem))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlSexoLayout.setVerticalGroup(
            pnlSexoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSexoLayout.createSequentialGroup()
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

        lblCPF.setText("CPF");

        javax.swing.GroupLayout pnlInfosPessoaisLayout = new javax.swing.GroupLayout(pnlInfosPessoais);
        pnlInfosPessoais.setLayout(pnlInfosPessoaisLayout);
        pnlInfosPessoaisLayout.setHorizontalGroup(
            pnlInfosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInfosPessoaisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlInfosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNome)
                    .addComponent(lblDataNasc)
                    .addComponent(lblEmail)
                    .addComponent(lblTelefone))
                .addGap(7, 7, 7)
                .addGroup(pnlInfosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNome)
                    .addComponent(txtEmail)
                    .addGroup(pnlInfosPessoaisLayout.createSequentialGroup()
                        .addGroup(pnlInfosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtTelefone, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDataNasc))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblCPF)
                        .addGap(8, 8, 8)
                        .addComponent(txtCpf)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        pnlInfosPessoaisLayout.setVerticalGroup(
            pnlInfosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInfosPessoaisLayout.createSequentialGroup()
                .addGroup(pnlInfosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlInfosPessoaisLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pnlSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlInfosPessoaisLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(pnlInfosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNome)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlInfosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDataNasc)
                            .addComponent(txtDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCPF)
                            .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlInfosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTelefone)
                            .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlInfosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmail))
                .addGap(22, 22, 22))
        );

        pnlDadosProfissionais.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados Profissionais", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        lblCref.setText("CREF");

        lblEspecialidade.setText("Especialidade");

        cmbEspecialidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Musculação", "Hipertrofia", "Emagrecimento", "Funcional", "Reabilitação" }));

        lblTurno.setText("Turno trabalho");

        cmbTurno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5h - 12h", "12h - 19h", "19h - 23h" }));

        javax.swing.GroupLayout pnlDadosProfissionaisLayout = new javax.swing.GroupLayout(pnlDadosProfissionais);
        pnlDadosProfissionais.setLayout(pnlDadosProfissionaisLayout);
        pnlDadosProfissionaisLayout.setHorizontalGroup(
            pnlDadosProfissionaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosProfissionaisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDadosProfissionaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDadosProfissionaisLayout.createSequentialGroup()
                        .addComponent(lblCref)
                        .addGap(59, 59, 59)
                        .addComponent(txtCref, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnlDadosProfissionaisLayout.createSequentialGroup()
                        .addComponent(lblEspecialidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmbEspecialidade, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDadosProfissionaisLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblTurno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnlDadosProfissionaisLayout.setVerticalGroup(
            pnlDadosProfissionaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosProfissionaisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDadosProfissionaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCref, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCref))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDadosProfissionaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEspecialidade)
                    .addComponent(cmbEspecialidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDadosProfissionaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbTurno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTurno))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlDadosProfissionais1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados Profissionais", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        lblDataContratacao.setText("Data Contratacao");

        lblStatus.setText("Status");

        groupStatus.add(rdioAtivo);
        rdioAtivo.setMnemonic('A');
        rdioAtivo.setText("Ativo");
        rdioAtivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/images/toggle-off.png"))); // NOI18N
        rdioAtivo.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/images/toggle-on.png"))); // NOI18N

        groupStatus.add(rdioInativo);
        rdioInativo.setMnemonic('I');
        rdioInativo.setText("Inativo");
        rdioInativo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/images/toggle-off.png"))); // NOI18N
        rdioInativo.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/images/toggle-on.png"))); // NOI18N

        javax.swing.GroupLayout pnlDadosProfissionais1Layout = new javax.swing.GroupLayout(pnlDadosProfissionais1);
        pnlDadosProfissionais1.setLayout(pnlDadosProfissionais1Layout);
        pnlDadosProfissionais1Layout.setHorizontalGroup(
            pnlDadosProfissionais1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosProfissionais1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDadosProfissionais1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDadosProfissionais1Layout.createSequentialGroup()
                        .addComponent(lblDataContratacao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDataContratacao))
                    .addGroup(pnlDadosProfissionais1Layout.createSequentialGroup()
                        .addGroup(pnlDadosProfissionais1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblStatus)
                            .addGroup(pnlDadosProfissionais1Layout.createSequentialGroup()
                                .addComponent(rdioAtivo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rdioInativo)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(15, 15, 15))
        );
        pnlDadosProfissionais1Layout.setVerticalGroup(
            pnlDadosProfissionais1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosProfissionais1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDadosProfissionais1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDataContratacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDataContratacao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblStatus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDadosProfissionais1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdioAtivo)
                    .addComponent(rdioInativo))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/images/disk (1).png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/images/cross-circle (2).png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        lblObs.setText("Observacoes");

        txtObs.setColumns(20);
        txtObs.setRows(5);
        jScrollPane1.setViewportView(txtObs);

        lblTitulo.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(10, 132, 255));
        lblTitulo.setText("Cadastro de Personal");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitulo)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(pnlInfosPessoais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(pnlDadosProfissionais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(pnlDadosProfissionais1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(lblObs)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelar)
                .addGap(190, 190, 190))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlInfosPessoais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlDadosProfissionais1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlDadosProfissionais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblObs)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnCancelar))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefoneActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        
        String nome = txtNome.getText();
        String dataN = txtDataNasc.getText();
        String cpf = txtCpf.getText();
        String telefone = txtTelefone.getText();
        String email = txtEmail.getText();
        if (groupSexo.getSelection().getMnemonic() == 'M') {
            String sexo = "Masculino";
        } else {
            String sexo = "Feminino";
        }
        
        
        String cref = txtCref.getText();
        String especialidade = cmbEspecialidade.getSelectedItem().toString();
        String turno = cmbTurno.getSelectedItem().toString();
        
        
        String dataContratacao = txtDataContratacao.getText();
        String status = "";
        if (groupStatus.getSelection().getMnemonic() == 'A') {
            status = "Ativo";
        } else {
            status = "Inativo";
        }
        
        String obs = txtObs.getText();
        
        Personal personal = controller.criarPersonal(nome, dataN, cpf, telefone, email, "",
                cref, especialidade, turno, dataContratacao, status, obs);
        controller.salvarPersonal(tabela, personal, linhaEd);
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void carregarLinha(int linha) {
        Personal personal = controller.obterPersonal(tabela, linha);

        txtNome.setText(personal.nome());
        txtTelefone.setText(personal.telefone());
        txtEmail.setText(personal.email());
        cmbTurno.setSelectedItem(personal.turno());
 
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
            java.util.logging.Logger.getLogger(DlgCadPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DlgCadPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DlgCadPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DlgCadPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DlgCadPersonal dialog = new DlgCadPersonal(new javax.swing.JFrame(), true, null, -1);
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
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cmbEspecialidade;
    private javax.swing.JComboBox<String> cmbTurno;
    private javax.swing.ButtonGroup groupSexo;
    private javax.swing.ButtonGroup groupStatus;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblCref;
    private javax.swing.JLabel lblDataContratacao;
    private javax.swing.JLabel lblDataNasc;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEspecialidade;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblObs;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTurno;
    private javax.swing.JPanel pnlDadosProfissionais;
    private javax.swing.JPanel pnlDadosProfissionais1;
    private javax.swing.JPanel pnlInfosPessoais;
    private javax.swing.JPanel pnlSexo;
    private javax.swing.JRadioButton radioFem;
    private javax.swing.JRadioButton radioMasc;
    private javax.swing.JRadioButton rdioAtivo;
    private javax.swing.JRadioButton rdioInativo;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtCref;
    private javax.swing.JTextField txtDataContratacao;
    private javax.swing.JTextField txtDataNasc;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextArea txtObs;
    private javax.swing.JFormattedTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
