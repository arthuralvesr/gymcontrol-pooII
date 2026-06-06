package view;

import controller.GerenciadorDominio;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import java.util.regex.Pattern;
import javax.swing.RowFilter;
import javax.swing.SwingWorker;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import model.Aluno;
import model.Exercicio;
import model.Personal;
import view.tablemodel.AlunoTableModel;
import view.tablemodel.EntityTableModel;
import view.tablemodel.ExercicioTableModel;
import view.tablemodel.PersonalTableModel;

public class DlgBuscar extends javax.swing.JDialog {

    private Object itemSelecionado;
    private TableRowSorter<TableModel> sorter;
    private GerenciadorDominio gerenciadorDominio;

    public DlgBuscar(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        configurarEventos();
    }

    public Aluno buscarAluno(String filtroInicial) {
        AlunoTableModel model = new AlunoTableModel();
        return abrirBusca("Buscar aluno", model, filtroInicial, Aluno.class);
    }

    public Personal buscarPersonal(String filtroInicial) {
        PersonalTableModel model = new PersonalTableModel();
        return abrirBusca("Buscar personal", model, filtroInicial, Personal.class);
    }

    public Exercicio buscarExercicio(String filtroInicial) {
        ExercicioTableModel model = new ExercicioTableModel();
        return abrirBusca("Buscar exercicio", model, filtroInicial, Exercicio.class);
    }

    @SuppressWarnings("unchecked")
    private <T> T abrirBusca(String titulo, EntityTableModel<T, ?> model, String filtroInicial, Class<T> classe) {
        setTitle(titulo + " | GYMCONTROL");
        lblTitulo.setText(titulo);
        itemSelecionado = null;
        tabelaBusca.setModel(model);
        sorter = new TableRowSorter<>(tabelaBusca.getModel());
        tabelaBusca.setRowSorter(sorter);
        txtFiltro.setText(filtroInicial == null ? "" : filtroInicial.trim());
        atualizarEstadoCarregamento(true, "Carregando...");
        carregarEntidades(model, classe);
        setLocationRelativeTo(getOwner());
        setVisible(true);
        return (T) itemSelecionado;
    }

    private <T> void carregarEntidades(EntityTableModel<T, ?> model, Class<T> classe) {
        new SwingWorker<List<T>, Void>() {
            private Exception erro;

            @Override
            protected List<T> doInBackground() {
                try {
                    @SuppressWarnings("unchecked")
                    List<T> entidades = getGerenciadorDominio().listar(classe);
                    return entidades;
                } catch (Exception ex) {
                    erro = ex;
                    return List.of();
                }
            }

            @Override
            protected void done() {
                if (erro != null) {
                    atualizarEstadoCarregamento(false, "Erro ao carregar.");
                    javax.swing.JOptionPane.showMessageDialog(DlgBuscar.this,
                            "Erro ao buscar registros: " + erro.getMessage(),
                            "Erro",
                            javax.swing.JOptionPane.ERROR_MESSAGE);
                    return;
                }

                try {
                    model.setEntities(get());
                    aplicarFiltro();
                    if (tabelaBusca.getRowCount() > 0) {
                        tabelaBusca.setRowSelectionInterval(0, 0);
                        lblStatus.setText(tabelaBusca.getRowCount() + " registro(s).");
                    } else {
                        lblStatus.setText("Nenhum registro encontrado.");
                    }
                } catch (Exception ex) {
                    lblStatus.setText("Erro ao carregar.");
                } finally {
                    atualizarEstadoCarregamento(false, lblStatus.getText());
                }
            }
        }.execute();
    }

    private void configurarEventos() {
        txtFiltro.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                aplicarFiltro();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                aplicarFiltro();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                aplicarFiltro();
            }
        });

        tabelaBusca.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                if (evt.getClickCount() == 2 && btnSelecionar.isEnabled()) {
                    confirmarSelecao();
                }
            }
        });
    }

    private void aplicarFiltro() {
        if (sorter == null) {
            return;
        }

        String filtro = txtFiltro.getText().trim();
        if (filtro.isBlank()) {
            sorter.setRowFilter(null);
        } else {
            sorter.setRowFilter(RowFilter.regexFilter("(?i)" + Pattern.quote(filtro)));
        }

        if (tabelaBusca.getRowCount() > 0) {
            tabelaBusca.setRowSelectionInterval(0, 0);
            if (!lblStatus.getText().startsWith("Carregando")) {
                lblStatus.setText(tabelaBusca.getRowCount() + " registro(s).");
            }
        } else if (!lblStatus.getText().startsWith("Carregando")) {
            lblStatus.setText("Nenhum registro encontrado.");
        }
    }

    private void confirmarSelecao() {
        int linhaView = tabelaBusca.getSelectedRow();
        if (linhaView < 0 || !(tabelaBusca.getModel() instanceof EntityTableModel<?, ?> model)) {
            itemSelecionado = null;
            dispose();
            return;
        }

        int linhaModel = tabelaBusca.convertRowIndexToModel(linhaView);
        itemSelecionado = model.getEntityAt(linhaModel);
        dispose();
    }

    private void atualizarEstadoCarregamento(boolean carregando, String status) {
        txtFiltro.setEnabled(!carregando);
        tabelaBusca.setEnabled(!carregando);
        btnSelecionar.setEnabled(!carregando);
        lblStatus.setText(status);
    }

    private GerenciadorDominio getGerenciadorDominio() {
        if (gerenciadorDominio == null) {
            gerenciadorDominio = new GerenciadorDominio();
        }
        return gerenciadorDominio;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaBusca = new javax.swing.JTable();
        lblFiltro = new javax.swing.JLabel();
        txtFiltro = new javax.swing.JTextField();
        btnSelecionar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tabelaBusca.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabelaBusca.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tabelaBusca);

        lblFiltro.setText("Filtro");

        btnSelecionar.setText("Selecionar");
        btnSelecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecionarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        lblTitulo.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(10, 132, 255));
        lblTitulo.setText("Buscar");

        lblStatus.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 604, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblFiltro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFiltro))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblStatus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSelecionar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar))
                    .addComponent(lblTitulo))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFiltro)
                    .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSelecionar)
                    .addComponent(btnCancelar)
                    .addComponent(lblStatus))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecionarActionPerformed
        confirmarSelecao();
    }//GEN-LAST:event_btnSelecionarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        itemSelecionado = null;
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DlgBuscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DlgBuscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DlgBuscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DlgBuscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DlgBuscar dialog = new DlgBuscar(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnSelecionar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFiltro;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tabelaBusca;
    private javax.swing.JTextField txtFiltro;
    // End of variables declaration//GEN-END:variables
}
