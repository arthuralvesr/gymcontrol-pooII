package controller;

import java.awt.Frame;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import view.DlgCadAluno;
import view.DlgCadDivisao;
import view.DlgCadExercicio;
import view.DlgCadPersonal;
import view.DlgFicha;
import view.FrmPrincipal;

public class GerInterGrafica {
    
    private FrmPrincipal janPrinc = null;
    private DlgFicha janFicha = null;
    private DlgCadPersonal janCadPersonal = null;
    private DlgCadExercicio janCadExercicio = null;
    private DlgCadAluno janCadAluno = null;
    private DlgCadDivisao janCadDivisao = null;
    
    private GerenciadorDominio gerDominio;
    
    // ## SINGLETON ###
    
    private static GerInterGrafica myInstance = new GerInterGrafica();
    
    private GerInterGrafica() {
        gerDominio = new GerenciadorDominio();
    }           

    public static GerInterGrafica getMyInstance() {
        return myInstance;
    }
    
    // ### FIM do SINGLETON
    
    
    // ABRIR JDIALOG
    private JDialog abrirJanela(Frame parent, JDialog dlg, Class classe) {
        if (dlg == null || !dlg.isDisplayable()){     
            try {
                dlg = (JDialog) classe.getConstructor(Frame.class, boolean.class).newInstance(parent,true);                                
            } catch (NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
                JOptionPane.showMessageDialog(parent, "Erro ao abrir a janela " + classe.getName() + ". " + ex.getMessage() );
            } 
        }               
        dlg.setVisible(true); 
        return dlg;    
    }

    private JDialog abrirJanela(Frame parent, JDialog dlg, Class classe, JTable tabela) {
        if (dlg == null || !dlg.isDisplayable()){
            try {
                dlg = (JDialog) classe.getConstructor(Frame.class, boolean.class, JTable.class).newInstance(parent, true, tabela);
            } catch (NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
                JOptionPane.showMessageDialog(parent, "Erro ao abrir a janela " + classe.getName() + ". " + ex.getMessage() );
            }
        }
        dlg.setVisible(true);
        return dlg;
    }

    private JDialog abrirJanela(Frame parent, Class classe, JTable tabela, int linha) {
        JDialog dlg = null;
        try {
            dlg = (JDialog) classe.getConstructor(Frame.class, boolean.class, JTable.class, int.class).newInstance(parent, true, tabela, linha);
        } catch (NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
            JOptionPane.showMessageDialog(parent, "Erro ao abrir a janela " + classe.getName() + ". " + ex.getMessage() );
        }
        if (dlg != null) {
            dlg.setVisible(true);
        }
        return dlg;
    }
    
    public void abrirPrincipal() {
        if ( janPrinc == null) {
            janPrinc = new FrmPrincipal();
        }
        janPrinc.setVisible(true);
    }
    
    public void abrirFicha() {
        janFicha = (DlgFicha) abrirJanela(janPrinc, janFicha, DlgFicha.class);
    }
    
    public void abrirCadPersonal(Frame parent, JTable tabela) {
        janCadPersonal = (DlgCadPersonal) abrirJanela(parent, janCadPersonal, DlgCadPersonal.class, tabela);
    }
    
    public void abrirCadExercicio() {
        janCadExercicio = (DlgCadExercicio) abrirJanela(janPrinc, janCadExercicio, DlgCadExercicio.class);
    }

    public void abrirCadDivisao() {
        janCadDivisao = (DlgCadDivisao) abrirJanela(janPrinc, janCadDivisao, DlgCadDivisao.class);
    }

    public void abrirCadAluno(Frame parent, JTable tabela) {
        janCadAluno = (DlgCadAluno) abrirJanela(parent, janCadAluno, DlgCadAluno.class, tabela);
    }

    public void abrirCadAluno(Frame parent, JTable tabela, int linha) {
        janCadAluno = (DlgCadAluno) abrirJanela(parent, DlgCadAluno.class, tabela, linha);
    }

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            // Logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        // TRADUÇÃO
        javax.swing.UIManager.put("OptionPane.yesButtonText", "Sim"); 
        javax.swing.UIManager.put("OptionPane.noButtonText", "Não");
        javax.swing.UIManager.put("OptionPane.cancelButtonText", "Cancelar");
        
        
        /* Create and display the form */
        GerInterGrafica.getMyInstance().abrirPrincipal();
    }
}
