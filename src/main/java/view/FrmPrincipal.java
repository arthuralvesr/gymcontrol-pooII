package view;

import controller.GerInterGrafica;
import controller.GerenciadorDominio;
import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;
import model.Aluno;
import model.Personal;
import view.tablemodel.AlunoTableModel;
import view.tablemodel.PersonalTableModel;

public class FrmPrincipal extends javax.swing.JFrame {

    private GerenciadorDominio gerenciadorDominio;
    private final AlunoTableModel alunoTableModel;
    private final PersonalTableModel personalTableModel;
    private boolean dadosIniciaisCarregados;

    public FrmPrincipal() {
        this.alunoTableModel = new AlunoTableModel();
        this.personalTableModel = new PersonalTableModel();
        initComponents();
        tblAlunos.setModel(alunoTableModel);
        tblPersonal.setModel(personalTableModel);
        atualizarIndicadores();
        configurarCarregamentoInicial();
        setMinimumSize(new Dimension(1120, 820));
        setLocationRelativeTo(null);
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

        tblAlunos.setComponentPopupMenu(menuPopTabela);
        tblTabelaAlunos.setViewportView(tblAlunos);

        lblPersonal.setText("Personais ativos");

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
                .addContainerGap(58, Short.MAX_VALUE))
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
                .addContainerGap(48, Short.MAX_VALUE))
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
                .addContainerGap(41, Short.MAX_VALUE))
        );
        pnlPersonaisAtivosLayout.setVerticalGroup(
            pnlPersonaisAtivosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPersonaisAtivosLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblAlunosInscritos1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(qtdAlunosInscritos1)
                .addContainerGap(19, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(pnlPersonaisAtivos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlFichasFeitas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
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
        mnListarAlunos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnListarAlunosActionPerformed(evt);
            }
        });
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
        mnListarPersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnListarPersonalActionPerformed(evt);
            }
        });
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
        mnListarExercicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnListarExerciciosActionPerformed(evt);
            }
        });
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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblAlunos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPersonal))
                    .addComponent(tblTabelaAlunos)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPersonal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtAlunos))
                    .addComponent(tblTabelaPersonal)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNovoAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnNovoPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnNovaFicha, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAlunos)
                    .addComponent(txtPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tblTabelaAlunos, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPersonal)
                    .addComponent(txtAlunos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tblTabelaPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovoAluno)
                    .addComponent(btnNovaFicha)
                    .addComponent(btnNovoPersonal))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnEditarFichaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnEditarFichaActionPerformed
        GerInterGrafica.getMyInstance().abrirFicha();
    }//GEN-LAST:event_mnEditarFichaActionPerformed

    private void mnHistoricoTreinosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnHistoricoTreinosActionPerformed
    }//GEN-LAST:event_mnHistoricoTreinosActionPerformed

    private void mnNovoAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnNovoAlunoActionPerformed
        GerInterGrafica.getMyInstance().abrirCadAluno((java.awt.Frame) this, tblAlunos);
        carregarAlunos();
        atualizarIndicadores();
    }//GEN-LAST:event_mnNovoAlunoActionPerformed

    private void mnNovoPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnNovoPersonalActionPerformed
        GerInterGrafica.getMyInstance().abrirCadPersonal((java.awt.Frame) this, tblPersonal);
        carregarPersonais();
        atualizarIndicadores();
    }//GEN-LAST:event_mnNovoPersonalActionPerformed

    private void ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirActionPerformed
        int linha = tblAlunos.getSelectedRow();
        if (linha < 0) {
            return;
        }

        if (JOptionPane.showConfirmDialog(this, "Deseja realmente excluir?", "Excluir Aluno",
                JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE) == JOptionPane.YES_OPTION) {
            try {
                Aluno aluno = alunoTableModel.getEntityAt(linha);
                if (aluno != null) {
                    getGerenciadorDominio().excluir(aluno);
                }
                carregarAlunos();
                atualizarIndicadores();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this,
                        "Erro ao excluir aluno: " + ex.getMessage(),
                        "Erro",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_ExcluirActionPerformed

    private void EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarActionPerformed
        int linha = tblAlunos.getSelectedRow();
        if (linha >= 0) {
            GerInterGrafica.getMyInstance().abrirCadAluno((java.awt.Frame) this, tblAlunos, linha);
            carregarAlunos();
            atualizarIndicadores();
        }
    }//GEN-LAST:event_EditarActionPerformed

    private void mnNovoExercicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnNovoExercicioActionPerformed
        GerInterGrafica.getMyInstance().abrirCadExercicio();
    }//GEN-LAST:event_mnNovoExercicioActionPerformed

    private void mnCriarFichaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCriarFichaActionPerformed
        GerInterGrafica.getMyInstance().abrirFicha();
    }//GEN-LAST:event_mnCriarFichaActionPerformed

    private void mnListarExerciciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnListarExerciciosActionPerformed
        GerInterGrafica.getMyInstance().abrirBuscaExercicio(this, "");
    }//GEN-LAST:event_mnListarExerciciosActionPerformed

    private void mnListarAlunosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnListarAlunosActionPerformed
        Aluno aluno = GerInterGrafica.getMyInstance()
                .abrirBuscaAluno(this, txtPersonal.getText().trim());
        if (aluno != null) {
            carregarAlunos();
            atualizarIndicadores();
        }
        selecionarAlunoNaTabela(aluno);
    }//GEN-LAST:event_mnListarAlunosActionPerformed

    private void mnListarPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnListarPersonalActionPerformed
        Personal personal = GerInterGrafica.getMyInstance()
                .abrirBuscaPersonal(this, txtAlunos.getText().trim());
        if (personal != null) {
            carregarPersonais();
            atualizarIndicadores();
        }
        selecionarPersonalNaTabela(personal);
    }//GEN-LAST:event_mnListarPersonalActionPerformed

    private void carregarAlunos() {
        try {
            List alunos = getGerenciadorDominio().listar(Aluno.class);
            alunoTableModel.setEntities((List<Aluno>) alunos);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this,
                    "Erro ao listar alunos: " + ex.getMessage(),
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    private void carregarPersonais() {
        try {
            List personais = getGerenciadorDominio().listar(Personal.class);
            personalTableModel.setEntities((List<Personal>) personais);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this,
                    "Erro ao listar personais: " + ex.getMessage(),
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    private void atualizarIndicadores() {
        qtdAlunosInscritos.setText(String.valueOf(alunoTableModel.getRowCount()));
        qtdAlunosInscritos1.setText(String.valueOf(personalTableModel.getRowCount()));
    }

    private void configurarCarregamentoInicial() {
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent e) {
                carregarDadosIniciais();
            }
        });
    }

    private void carregarDadosIniciais() {
        if (dadosIniciaisCarregados) {
            return;
        }
        dadosIniciaisCarregados = true;

        new SwingWorker<Void, Void>() {
            private List<Aluno> alunos;
            private List<Personal> personais;
            private Exception erro;

            @Override
            protected Void doInBackground() {
                try {
                    @SuppressWarnings("unchecked")
                    List<Aluno> alunosCarregados = getGerenciadorDominio().listar(Aluno.class);
                    @SuppressWarnings("unchecked")
                    List<Personal> personaisCarregados = getGerenciadorDominio().listar(Personal.class);
                    alunos = alunosCarregados;
                    personais = personaisCarregados;
                } catch (Exception ex) {
                    erro = ex;
                }
                return null;
            }

            @Override
            protected void done() {
                if (erro != null) {
                    JOptionPane.showMessageDialog(FrmPrincipal.this,
                            "Erro ao carregar dados iniciais: " + erro.getMessage(),
                            "Erro",
                            JOptionPane.ERROR_MESSAGE);
                    return;
                }

                alunoTableModel.setEntities(alunos);
                personalTableModel.setEntities(personais);
                atualizarIndicadores();
            }
        }.execute();
    }

    private void selecionarAlunoNaTabela(Aluno aluno) {
        if (aluno == null) {
            return;
        }

        int linha = alunoTableModel.findRowById(aluno.getIdAluno());
        if (linha >= 0) {
            tblAlunos.setRowSelectionInterval(linha, linha);
            tblAlunos.scrollRectToVisible(tblAlunos.getCellRect(linha, 0, true));
        }
        txtPersonal.setText(aluno.getNome());
    }

    private void selecionarPersonalNaTabela(Personal personal) {
        if (personal == null) {
            return;
        }

        int linha = personalTableModel.findRowById(personal.getIdPersonal());
        if (linha >= 0) {
            tblPersonal.setRowSelectionInterval(linha, linha);
            tblPersonal.scrollRectToVisible(tblPersonal.getCellRect(linha, 0, true));
        }
        txtAlunos.setText(personal.getNome());
    }

    private GerenciadorDominio getGerenciadorDominio() {
        if (gerenciadorDominio == null) {
            gerenciadorDominio = new GerenciadorDominio();
        }
        return gerenciadorDominio;
    }

    public static void main(String args[]) {
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
        try {
            com.formdev.flatlaf.FlatLaf.registerCustomDefaultsSource("gymcontrol");
            com.formdev.flatlaf.FlatLightLaf.setup();
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName())
                    .log(java.util.logging.Level.SEVERE, "Erro ao carregar o tema IFES", ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                GerInterGrafica.getMyInstance().abrirPrincipal();
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
