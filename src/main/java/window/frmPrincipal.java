package window;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FrmPrincipal
     */
    public frmPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuPopTabela = new javax.swing.JPopupMenu();
        Excluir = new javax.swing.JMenuItem();
        Editar = new javax.swing.JMenuItem();
        lblAlunos = new javax.swing.JLabel();
        txtAlunos = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        tblTabelaAlunos = new javax.swing.JScrollPane();
        tblAlunos = new javax.swing.JTable();
        lblPersonal = new javax.swing.JLabel();
        txtPersonal = new javax.swing.JTextField();
        tblTabelaPersonal = new javax.swing.JScrollPane();
        tblPersonal = new javax.swing.JTable();
        mnMenu = new javax.swing.JMenuBar();
        mnCadastro = new javax.swing.JMenu();
        mnNovoAluno = new javax.swing.JMenuItem();
        mnListarAlunos = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnNovoPersonal = new javax.swing.JMenuItem();
        mnListarPersonal = new javax.swing.JMenuItem();
        mnTreinos = new javax.swing.JMenu();
        mnNovoExercicio = new javax.swing.JMenuItem();
        mnListarExercicios = new javax.swing.JMenuItem();
        mnCriarFicha = new javax.swing.JMenuItem();
        mnEditarFicha = new javax.swing.JMenuItem();
        mnHistoricoTreinos = new javax.swing.JMenuItem();
        mnEvolucao = new javax.swing.JMenu();
        mnRelatorios = new javax.swing.JMenu();

        Excluir.setText("Excluir");
        Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcluirActionPerformed(evt);
            }
        });
        menuPopTabela.add(Excluir);

        Editar.setText("Editar");
        Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarActionPerformed(evt);
            }
        });
        menuPopTabela.add(Editar);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GYMCONTROL ");

        lblAlunos.setText("Alunos inscritos");

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/images/search.png"))); // NOI18N
        btnBuscar.setText("Buscar");

        btnCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/images/user-add.png"))); // NOI18N
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnNovoAlunoActionPerformed(evt);
            }
        });

        tblAlunos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Dt. Nascimento", "Telefone", "Objetivo", "Observacoes"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblAlunos.setComponentPopupMenu(menuPopTabela);
        tblTabelaAlunos.setViewportView(tblAlunos);

        lblPersonal.setText("Personal");

        tblPersonal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Telefone", "Email", "Turno", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblTabelaPersonal.setViewportView(tblPersonal);

        mnCadastro.setText("Cadastro");

        mnNovoAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/images/user-add.png"))); // NOI18N
        mnNovoAluno.setText("| Novo Aluno");
        mnNovoAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnNovoAlunoActionPerformed(evt);
            }
        });
        mnCadastro.add(mnNovoAluno);

        mnListarAlunos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/images/table-list.png"))); // NOI18N
        mnListarAlunos.setText("| Listar Alunos");
        mnCadastro.add(mnListarAlunos);
        mnCadastro.add(jSeparator1);

        mnNovoPersonal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/images/dumbbell-fitness.png"))); // NOI18N
        mnNovoPersonal.setText("| Novo Personal");
        mnNovoPersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnNovoPersonalActionPerformed(evt);
            }
        });
        mnCadastro.add(mnNovoPersonal);

        mnListarPersonal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/images/table-list.png"))); // NOI18N
        mnListarPersonal.setText("| Listar Personal");
        mnCadastro.add(mnListarPersonal);

        mnMenu.add(mnCadastro);

        mnTreinos.setText("Treinos");

        mnNovoExercicio.setText("Novo Exercicio");
        mnTreinos.add(mnNovoExercicio);

        mnListarExercicios.setText("Listar Exercicios");
        mnTreinos.add(mnListarExercicios);

        mnCriarFicha.setText("Criar Ficha de Treino");
        mnTreinos.add(mnCriarFicha);

        mnEditarFicha.setText("Editar Ficha");
        mnEditarFicha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnEditarFichaActionPerformed(evt);
            }
        });
        mnTreinos.add(mnEditarFicha);

        mnHistoricoTreinos.setText("Historico de Treinos");
        mnHistoricoTreinos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnHistoricoTreinosActionPerformed(evt);
            }
        });
        mnTreinos.add(mnHistoricoTreinos);

        mnMenu.add(mnTreinos);

        mnEvolucao.setText("Evoluçao");
        mnMenu.add(mnEvolucao);

        mnRelatorios.setText("Relatorios");
        mnMenu.add(mnRelatorios);

        setJMenuBar(mnMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPersonal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAlunos, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(tblTabelaAlunos, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tblTabelaPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblAlunos)
                            .addGap(12, 12, 12)
                            .addComponent(txtPersonal)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnBuscar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnCadastrar))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAlunos)
                    .addComponent(btnCadastrar)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tblTabelaAlunos, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPersonal)
                    .addComponent(txtAlunos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tblTabelaPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnEditarFichaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnEditarFichaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnEditarFichaActionPerformed

    private void mnHistoricoTreinosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnHistoricoTreinosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnHistoricoTreinosActionPerformed

    private void mnNovoAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnNovoAlunoActionPerformed
        dlgCadAluno objCadAluno = new dlgCadAluno((java.awt.Frame)this, true, tblAlunos);
        
        objCadAluno.setVisible(true);
    }//GEN-LAST:event_mnNovoAlunoActionPerformed

    private void mnNovoPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnNovoPersonalActionPerformed
        dlgCadPersonal objCadPersonal = new dlgCadPersonal((java.awt.Frame)this, true, tblPersonal);
        
        objCadPersonal.setVisible(true);
    }//GEN-LAST:event_mnNovoPersonalActionPerformed

    private void ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirActionPerformed
        
        int linha = tblAlunos.getSelectedRow();
        
        if (linha >= 0) {
    
            if (JOptionPane.showConfirmDialog(this, "Deseja realmente excluir?", "Excluir Aluno", 
                    JOptionPane.WARNING_MESSAGE, JOptionPane.WARNING_MESSAGE) == JOptionPane.YES_OPTION){
                
                ((DefaultTableModel) tblAlunos.getModel()).removeRow(linha);
            }
        }
    }//GEN-LAST:event_ExcluirActionPerformed

    private void EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarActionPerformed
        int linha = tblAlunos.getSelectedRow();
        
        if (linha >= 0) {
            dlgCadAluno objCadAluno = new dlgCadAluno((java.awt.Frame)this, true, tblAlunos, linha);
            objCadAluno.setVisible(true);
        }
    }//GEN-LAST:event_EditarActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Editar;
    private javax.swing.JMenuItem Excluir;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JLabel lblAlunos;
    private javax.swing.JLabel lblPersonal;
    private javax.swing.JPopupMenu menuPopTabela;
    private javax.swing.JMenu mnCadastro;
    private javax.swing.JMenuItem mnCriarFicha;
    private javax.swing.JMenuItem mnEditarFicha;
    private javax.swing.JMenu mnEvolucao;
    private javax.swing.JMenuItem mnHistoricoTreinos;
    private javax.swing.JMenuItem mnListarAlunos;
    private javax.swing.JMenuItem mnListarExercicios;
    private javax.swing.JMenuItem mnListarPersonal;
    private javax.swing.JMenuBar mnMenu;
    private javax.swing.JMenuItem mnNovoAluno;
    private javax.swing.JMenuItem mnNovoExercicio;
    private javax.swing.JMenuItem mnNovoPersonal;
    private javax.swing.JMenu mnRelatorios;
    private javax.swing.JMenu mnTreinos;
    private javax.swing.JTable tblAlunos;
    private javax.swing.JTable tblPersonal;
    private javax.swing.JScrollPane tblTabelaAlunos;
    private javax.swing.JScrollPane tblTabelaPersonal;
    private javax.swing.JTextField txtAlunos;
    private javax.swing.JTextField txtPersonal;
    // End of variables declaration//GEN-END:variables
}
