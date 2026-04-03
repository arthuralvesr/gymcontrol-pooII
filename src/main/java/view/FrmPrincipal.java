package view;

import controller.AlunoController;
import controller.GerInterGrafica;
import controller.PersonalController;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrmPrincipal extends javax.swing.JFrame {

    private final AlunoController alunoController;
    private final PersonalController personalController;

    public FrmPrincipal() {
        this.alunoController = new AlunoController();
        this.personalController = new PersonalController();
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
        tblTabelaAlunos = new javax.swing.JScrollPane();
        tblAlunos = new javax.swing.JTable();
        lblPersonal = new javax.swing.JLabel();
        txtPersonal = new javax.swing.JTextField();
        tblTabelaPersonal = new javax.swing.JScrollPane();
        tblPersonal = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblSubTitulo = new javax.swing.JLabel();
        pnlFichasFeitas = new javax.swing.JPanel();
        qtdAlunosInscritos2 = new javax.swing.JLabel();
        lblAlunosInscritos2 = new javax.swing.JLabel();
        pnlAlunosInscritos = new javax.swing.JPanel();
        lblAlunosInscritos = new javax.swing.JLabel();
        qtdAlunosInscritos = new javax.swing.JLabel();
        pnlPersonaisAtivos = new javax.swing.JPanel();
        qtdAlunosInscritos1 = new javax.swing.JLabel();
        lblAlunosInscritos1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnNovoAluno = new javax.swing.JButton();
        btnNovaFicha = new javax.swing.JButton();
        btnNovoPersonal = new javax.swing.JButton();
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
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mnCriarFicha = new javax.swing.JMenuItem();
        mnEditarFicha = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        mnHistoricoTreinos = new javax.swing.JMenuItem();
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
        setBackground(new java.awt.Color(104, 104, 78));

        lblAlunos.setText("Alunos inscritos");

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

        lblPersonal.setText("Personais ativos");

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

        lblTitulo.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(10, 132, 255));
        lblTitulo.setText("GymControl");

        lblSubTitulo.setFont(new java.awt.Font("Liberation Sans", 0, 12)); // NOI18N
        lblSubTitulo.setForeground(new java.awt.Color(6, 25, 45));
        lblSubTitulo.setText("Painel de controle da academia ");

        pnlFichasFeitas.setBackground(new java.awt.Color(10, 132, 255));
        pnlFichasFeitas.setPreferredSize(new java.awt.Dimension(200, 120));

        qtdAlunosInscritos2.setFont(new java.awt.Font("Liberation Sans", 1, 60)); // NOI18N
        qtdAlunosInscritos2.setForeground(new java.awt.Color(255, 255, 255));
        qtdAlunosInscritos2.setText("19");

        lblAlunosInscritos2.setFont(new java.awt.Font("Liberation Sans", 0, 15)); // NOI18N
        lblAlunosInscritos2.setForeground(new java.awt.Color(255, 255, 255));
        lblAlunosInscritos2.setText("Fichas feitas");

        javax.swing.GroupLayout pnlFichasFeitasLayout = new javax.swing.GroupLayout(pnlFichasFeitas);
        pnlFichasFeitas.setLayout(pnlFichasFeitasLayout);
        pnlFichasFeitasLayout.setHorizontalGroup(
            pnlFichasFeitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFichasFeitasLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(pnlFichasFeitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFichasFeitasLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(qtdAlunosInscritos2))
                    .addComponent(lblAlunosInscritos2))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        pnlFichasFeitasLayout.setVerticalGroup(
            pnlFichasFeitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFichasFeitasLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblAlunosInscritos2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(qtdAlunosInscritos2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlAlunosInscritos.setBackground(new java.awt.Color(10, 132, 255));
        pnlAlunosInscritos.setPreferredSize(new java.awt.Dimension(200, 0));

        lblAlunosInscritos.setFont(new java.awt.Font("Liberation Sans", 0, 15)); // NOI18N
        lblAlunosInscritos.setForeground(new java.awt.Color(255, 255, 255));
        lblAlunosInscritos.setText("Alunos inscritos");

        qtdAlunosInscritos.setFont(new java.awt.Font("Liberation Sans", 1, 60)); // NOI18N
        qtdAlunosInscritos.setForeground(new java.awt.Color(255, 255, 255));
        qtdAlunosInscritos.setText("3");

        javax.swing.GroupLayout pnlAlunosInscritosLayout = new javax.swing.GroupLayout(pnlAlunosInscritos);
        pnlAlunosInscritos.setLayout(pnlAlunosInscritosLayout);
        pnlAlunosInscritosLayout.setHorizontalGroup(
            pnlAlunosInscritosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAlunosInscritosLayout.createSequentialGroup()
                .addGroup(pnlAlunosInscritosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAlunosInscritosLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(lblAlunosInscritos))
                    .addGroup(pnlAlunosInscritosLayout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(qtdAlunosInscritos)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        pnlAlunosInscritosLayout.setVerticalGroup(
            pnlAlunosInscritosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAlunosInscritosLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblAlunosInscritos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(qtdAlunosInscritos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlPersonaisAtivos.setBackground(new java.awt.Color(10, 132, 255));
        pnlPersonaisAtivos.setPreferredSize(new java.awt.Dimension(200, 120));

        qtdAlunosInscritos1.setFont(new java.awt.Font("Liberation Sans", 1, 60)); // NOI18N
        qtdAlunosInscritos1.setForeground(new java.awt.Color(255, 255, 255));
        qtdAlunosInscritos1.setText("2");

        lblAlunosInscritos1.setFont(new java.awt.Font("Liberation Sans", 0, 15)); // NOI18N
        lblAlunosInscritos1.setForeground(new java.awt.Color(255, 255, 255));
        lblAlunosInscritos1.setText("Personais ativos");

        javax.swing.GroupLayout pnlPersonaisAtivosLayout = new javax.swing.GroupLayout(pnlPersonaisAtivos);
        pnlPersonaisAtivos.setLayout(pnlPersonaisAtivosLayout);
        pnlPersonaisAtivosLayout.setHorizontalGroup(
            pnlPersonaisAtivosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPersonaisAtivosLayout.createSequentialGroup()
                .addGroup(pnlPersonaisAtivosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPersonaisAtivosLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(lblAlunosInscritos1))
                    .addGroup(pnlPersonaisAtivosLayout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(qtdAlunosInscritos1)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        pnlPersonaisAtivosLayout.setVerticalGroup(
            pnlPersonaisAtivosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPersonaisAtivosLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblAlunosInscritos1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(qtdAlunosInscritos1)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/images/gymcontrol.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitulo)
                    .addComponent(lblSubTitulo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(22, 22, 22))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(pnlAlunosInscritos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlPersonaisAtivos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(pnlFichasFeitas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lblTitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSubTitulo))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(8, 8, 8)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(pnlPersonaisAtivos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                    .addComponent(pnlFichasFeitas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                    .addComponent(pnlAlunosInscritos, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnNovoAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/images/user-add.png"))); // NOI18N
        btnNovoAluno.setText("Novo aluno");
        btnNovoAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnNovoAlunoActionPerformed(evt);
            }
        });

        btnNovaFicha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/images/ficha-add.png"))); // NOI18N
        btnNovaFicha.setText("Nova ficha");
        btnNovaFicha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnCriarFichaActionPerformed(evt);
            }
        });

        btnNovoPersonal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/images/arm-muscle.png"))); // NOI18N
        btnNovoPersonal.setText("Novo personal");
        btnNovoPersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnNovoPersonalActionPerformed(evt);
            }
        });

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

        mnNovoPersonal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/images/arm-muscle.png"))); // NOI18N
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

        mnNovoExercicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/images/halteres-add.png"))); // NOI18N
        mnNovoExercicio.setText("| Novo Exercicio");
        mnNovoExercicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnNovoExercicioActionPerformed(evt);
            }
        });
        mnTreinos.add(mnNovoExercicio);

        mnListarExercicios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/images/halteres-list.png"))); // NOI18N
        mnListarExercicios.setText("| Listar Exercicios");
        mnTreinos.add(mnListarExercicios);
        mnTreinos.add(jSeparator2);

        mnCriarFicha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/images/ficha-add.png"))); // NOI18N
        mnCriarFicha.setText("| Criar Ficha de Treino");
        mnCriarFicha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnCriarFichaActionPerformed(evt);
            }
        });
        mnTreinos.add(mnCriarFicha);

        mnEditarFicha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/images/ficha-edit.png"))); // NOI18N
        mnEditarFicha.setText("| Editar Ficha");
        mnEditarFicha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnEditarFichaActionPerformed(evt);
            }
        });
        mnTreinos.add(mnEditarFicha);
        mnTreinos.add(jSeparator3);

        mnHistoricoTreinos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/images/tempo.png"))); // NOI18N
        mnHistoricoTreinos.setText("| Historico de Treinos");
        mnHistoricoTreinos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnHistoricoTreinosActionPerformed(evt);
            }
        });
        mnTreinos.add(mnHistoricoTreinos);

        mnMenu.add(mnTreinos);

        mnRelatorios.setText("Relatorios");
        mnMenu.add(mnRelatorios);

        setJMenuBar(mnMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(289, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblAlunos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPersonal))
                    .addComponent(tblTabelaAlunos, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPersonal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtAlunos, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNovoAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNovoPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btnNovaFicha, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tblTabelaPersonal))
                .addGap(230, 230, 230))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAlunos)
                    .addComponent(txtPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tblTabelaAlunos, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPersonal)
                    .addComponent(txtAlunos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tblTabelaPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovoAluno)
                    .addComponent(btnNovaFicha)
                    .addComponent(btnNovoPersonal))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnEditarFichaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnEditarFichaActionPerformed
        GerInterGrafica.getMyInstance().abrirFicha();
    }//GEN-LAST:event_mnEditarFichaActionPerformed

    private void mnHistoricoTreinosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnHistoricoTreinosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnHistoricoTreinosActionPerformed

    private void mnNovoAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnNovoAlunoActionPerformed
        GerInterGrafica.getMyInstance().abrirCadAluno((java.awt.Frame) this, tblAlunos);
    }//GEN-LAST:event_mnNovoAlunoActionPerformed

    private void mnNovoPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnNovoPersonalActionPerformed
        GerInterGrafica.getMyInstance().abrirCadPersonal((java.awt.Frame) this, tblPersonal);
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
            GerInterGrafica.getMyInstance().abrirCadAluno((java.awt.Frame) this, tblAlunos, linha);
        }
    }//GEN-LAST:event_EditarActionPerformed

    private void mnNovoExercicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnNovoExercicioActionPerformed
        GerInterGrafica.getMyInstance().abrirCadExercicio();
    }//GEN-LAST:event_mnNovoExercicioActionPerformed

    private void mnCriarFichaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCriarFichaActionPerformed
        GerInterGrafica.getMyInstance().abrirFicha();
    }//GEN-LAST:event_mnCriarFichaActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        try {
            com.formdev.flatlaf.FlatLaf.registerCustomDefaultsSource("gymcontrol");

            com.formdev.flatlaf.FlatLightLaf.setup();

        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName())
                    .log(java.util.logging.Level.SEVERE, "Erro ao carregar o tema IFES", ex);
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Editar;
    private javax.swing.JMenuItem Excluir;
    private javax.swing.JButton btnNovaFicha;
    private javax.swing.JButton btnNovoAluno;
    private javax.swing.JButton btnNovoPersonal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JLabel lblAlunos;
    private javax.swing.JLabel lblAlunosInscritos;
    private javax.swing.JLabel lblAlunosInscritos1;
    private javax.swing.JLabel lblAlunosInscritos2;
    private javax.swing.JLabel lblPersonal;
    private javax.swing.JLabel lblSubTitulo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPopupMenu menuPopTabela;
    private javax.swing.JMenu mnCadastro;
    private javax.swing.JMenuItem mnCriarFicha;
    private javax.swing.JMenuItem mnEditarFicha;
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
    private javax.swing.JPanel pnlAlunosInscritos;
    private javax.swing.JPanel pnlFichasFeitas;
    private javax.swing.JPanel pnlPersonaisAtivos;
    private javax.swing.JLabel qtdAlunosInscritos;
    private javax.swing.JLabel qtdAlunosInscritos1;
    private javax.swing.JLabel qtdAlunosInscritos2;
    private javax.swing.JTable tblAlunos;
    private javax.swing.JTable tblPersonal;
    private javax.swing.JScrollPane tblTabelaAlunos;
    private javax.swing.JScrollPane tblTabelaPersonal;
    private javax.swing.JTextField txtAlunos;
    private javax.swing.JTextField txtPersonal;
    // End of variables declaration//GEN-END:variables
}
