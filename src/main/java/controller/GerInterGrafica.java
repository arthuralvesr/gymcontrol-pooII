package controller;

import java.awt.Frame;
import javax.swing.JTable;
import model.Aluno;
import model.Exercicio;
import model.Personal;
import view.DlgCadAluno;
import view.DlgBuscar;
import view.DlgCadExercicio;
import view.DlgCadPersonal;
import view.DlgFicha;
import view.FrmPrincipal;
import view.tablemodel.AlunoTableModel;

public class GerInterGrafica {

    private FrmPrincipal janPrinc = null;
    private DlgFicha janFicha = null;
    private DlgCadAluno janCadAluno = null;

    private static final GerInterGrafica myInstance = new GerInterGrafica();

    private GerInterGrafica() {
    }

    public static GerInterGrafica getMyInstance() {
        return myInstance;
    }

    public void abrirPrincipal() {
        if (janPrinc == null) {
            janPrinc = new FrmPrincipal();
        }
        janPrinc.setVisible(true);
    }

    public void abrirFicha() {
        if (janFicha == null || !janFicha.isDisplayable()) {
            janFicha = new DlgFicha(janPrinc, true);
        }
        janFicha.setLocationRelativeTo(janPrinc);
        janFicha.setVisible(true);
    }

    public void abrirCadPersonal(Frame parent, JTable tabela) {
        DlgCadPersonal janCadPersonal = new DlgCadPersonal(parent, true, tabela);
        janCadPersonal.setLocationRelativeTo(parent);
        janCadPersonal.setVisible(true);
    }

    public void abrirCadExercicio() {
        abrirCadExercicio(janPrinc);
    }

    public void abrirCadExercicio(Frame parent) {
        DlgCadExercicio janCadExercicio = new DlgCadExercicio(parent, true);
        janCadExercicio.setLocationRelativeTo(parent);
        janCadExercicio.setVisible(true);
    }

    public Aluno abrirCadAluno(Frame parent, JTable tabela) {
        JTable tabelaAluno = tabela != null ? tabela : criarTabelaAluno();
        janCadAluno = new DlgCadAluno(parent, true, tabelaAluno);
        janCadAluno.setLocationRelativeTo(parent);
        janCadAluno.setVisible(true);
        return janCadAluno.getAlunoSalvo();
    }

    public void abrirCadAluno(Frame parent, JTable tabela, int linha) {
        JTable tabelaAluno = tabela != null ? tabela : criarTabelaAluno();
        janCadAluno = new DlgCadAluno(parent, true, tabelaAluno, linha);
        janCadAluno.setLocationRelativeTo(parent);
        janCadAluno.setVisible(true);
    }

    public Aluno abrirBuscaAluno(Frame parent, String filtroInicial) {
        DlgBuscar dlgBuscar = new DlgBuscar(parent, true);
        dlgBuscar.setLocationRelativeTo(parent);
        return dlgBuscar.buscarAluno(filtroInicial);
    }

    public Personal abrirBuscaPersonal(Frame parent, String filtroInicial) {
        DlgBuscar dlgBuscar = new DlgBuscar(parent, true);
        dlgBuscar.setLocationRelativeTo(parent);
        return dlgBuscar.buscarPersonal(filtroInicial);
    }

    public Exercicio abrirBuscaExercicio(Frame parent, String filtroInicial) {
        DlgBuscar dlgBuscar = new DlgBuscar(parent, true);
        dlgBuscar.setLocationRelativeTo(parent);
        return dlgBuscar.buscarExercicio(filtroInicial);
    }

    private JTable criarTabelaAluno() {
        return new JTable(new AlunoTableModel());
    }

    public static void main(String[] args) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            // Mantem o look and feel padrao.
        }

        javax.swing.UIManager.put("OptionPane.yesButtonText", "Sim");
        javax.swing.UIManager.put("OptionPane.noButtonText", "Nao");
        javax.swing.UIManager.put("OptionPane.cancelButtonText", "Cancelar");

        GerInterGrafica.getMyInstance().abrirPrincipal();
    }
}
