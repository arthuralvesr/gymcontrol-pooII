package view;

import controller.GerenciadorDominio;
import java.awt.Color;
import javax.swing.JOptionPane;
import model.enums.Nivel;

public class DlgCadExercicio extends javax.swing.JDialog {

    private GerenciadorDominio gerenciadorDominio;

    public DlgCadExercicio(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grpNivel = new javax.swing.ButtonGroup();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblGrupoMusc = new javax.swing.JLabel();
        scrGrupoMusc = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        lblNivel = new javax.swing.JLabel();
        pnlNivel = new javax.swing.JPanel();
        rdAvancado = new javax.swing.JRadioButton();
        rdIntermediario = new javax.swing.JRadioButton();
        rdIniciante = new javax.swing.JRadioButton();
        lblDescricao = new javax.swing.JLabel();
        txtDescricao = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(350, 430));

        lblNome.setText("Nome");

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        lblGrupoMusc.setText("Grupo Muscular");

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Peito", "Costas", "Pernas", "Ombro", "Biceps", "Triceps", "Core" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        scrGrupoMusc.setViewportView(jList1);

        lblNivel.setText("Nivel");

        pnlNivel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        grpNivel.add(rdAvancado);
        rdAvancado.setText("Avancado");
        rdAvancado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/images/nivel-off.png"))); // NOI18N
        rdAvancado.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/images/nivel-3.png"))); // NOI18N
        rdAvancado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdAvancadoActionPerformed(evt);
            }
        });

        grpNivel.add(rdIntermediario);
        rdIntermediario.setText("Intermediario");
        rdIntermediario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/images/nivel-off.png"))); // NOI18N
        rdIntermediario.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/images/nivel-2.png"))); // NOI18N
        rdIntermediario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdIntermediarioActionPerformed(evt);
            }
        });

        grpNivel.add(rdIniciante);
        rdIniciante.setText("Iniciante");
        rdIniciante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/images/nivel-off.png"))); // NOI18N
        rdIniciante.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/images/nivel-1.png"))); // NOI18N
        rdIniciante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdInicianteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlNivelLayout = new javax.swing.GroupLayout(pnlNivel);
        pnlNivel.setLayout(pnlNivelLayout);
        pnlNivelLayout.setHorizontalGroup(
            pnlNivelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNivelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlNivelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdIntermediario)
                    .addComponent(rdIniciante)
                    .addComponent(rdAvancado))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        pnlNivelLayout.setVerticalGroup(
            pnlNivelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlNivelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rdIniciante)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdIntermediario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdAvancado)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblDescricao.setText("Descricao");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        txtDescricao.setViewportView(jTextArea1);

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(10, 132, 255));
        jLabel1.setText("Cadastro de Exercicio");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblDescricao)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblNome)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtNome))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(scrGrupoMusc, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblGrupoMusc))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblNivel)
                                .addComponent(pnlNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar)
                        .addGap(47, 47, 47)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNivel)
                    .addComponent(lblGrupoMusc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scrGrupoMusc, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblDescricao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnCancelar))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rdInicianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdInicianteActionPerformed
    }//GEN-LAST:event_rdInicianteActionPerformed

    private void rdAvancadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdAvancadoActionPerformed
    }//GEN-LAST:event_rdAvancadoActionPerformed

    private void rdIntermediarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdIntermediarioActionPerformed
    }//GEN-LAST:event_rdIntermediarioActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
    }//GEN-LAST:event_txtNomeActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if (!validarCampos()) {
            return;
        }

        String nome = txtNome.getText().trim();
        String grupoMuscular = jList1.getSelectedValue();
        Nivel nivel = obterNivelSelecionado();
        String descricao = jTextArea1.getText().trim();
        String tipoExercicio = "";
        String equipamento = "";

        try {
            getGerenciadorDominio().inserirExercicio(nome, grupoMuscular, tipoExercicio, nivel, equipamento, descricao);
            JOptionPane.showMessageDialog(this, "Exercicio cadastrado com sucesso.");
            limparCadastro();
            dispose();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(
                    this,
                    "Erro ao cadastrar exercicio: " + ex.getMessage(),
                    "Erro",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private boolean validarCampos() {
        StringBuilder msgErro = new StringBuilder();
        lblNome.setForeground(Color.BLACK);
        lblGrupoMusc.setForeground(Color.BLACK);
        lblNivel.setForeground(Color.BLACK);

        if (txtNome.getText().trim().isEmpty()) {
            msgErro.append("Digite o nome do exercicio.\n");
            lblNome.setForeground(Color.RED);
        }

        if (jList1.getSelectedValue() == null) {
            msgErro.append("Selecione um grupo muscular.\n");
            lblGrupoMusc.setForeground(Color.RED);
        }

        if (obterNivelSelecionado() == null) {
            msgErro.append("Selecione um nivel.\n");
            lblNivel.setForeground(Color.RED);
        }

        if (msgErro.length() > 0) {
            JOptionPane.showMessageDialog(this, msgErro.toString(), "Validacao", JOptionPane.WARNING_MESSAGE);
            return false;
        }

        return true;
    }

    private Nivel obterNivelSelecionado() {
        if (rdIniciante.isSelected()) {
            return Nivel.INICIANTE;
        }
        if (rdIntermediario.isSelected()) {
            return Nivel.INTERMEDIARIO;
        }
        if (rdAvancado.isSelected()) {
            return Nivel.AVANCADO;
        }
        return null;
    }

    private void limparCadastro() {
        txtNome.setText("");
        jList1.clearSelection();
        grpNivel.clearSelection();
        jTextArea1.setText("");
        lblNome.setForeground(Color.BLACK);
        lblGrupoMusc.setForeground(Color.BLACK);
        lblNivel.setForeground(Color.BLACK);
    }

    private GerenciadorDominio getGerenciadorDominio() {
        if (gerenciadorDominio == null) {
            gerenciadorDominio = new GerenciadorDominio();
        }
        return gerenciadorDominio;
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
            java.util.logging.Logger.getLogger(DlgCadExercicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DlgCadExercicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DlgCadExercicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DlgCadExercicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DlgCadExercicio dialog = new DlgCadExercicio(new javax.swing.JFrame(), true);
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
    private javax.swing.ButtonGroup grpNivel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblGrupoMusc;
    private javax.swing.JLabel lblNivel;
    private javax.swing.JLabel lblNome;
    private javax.swing.JPanel pnlNivel;
    private javax.swing.JRadioButton rdAvancado;
    private javax.swing.JRadioButton rdIniciante;
    private javax.swing.JRadioButton rdIntermediario;
    private javax.swing.JScrollPane scrGrupoMusc;
    private javax.swing.JScrollPane txtDescricao;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
