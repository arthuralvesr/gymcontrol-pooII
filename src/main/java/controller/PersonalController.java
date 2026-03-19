package controller;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Personal;

public class PersonalController {

    public Personal criarPersonal(String nome, String dataNascimento, String cpf, String telefone,
            String email, String sexo, String cref, String especialidade, String turno,
            String dataContratacao, String status, String observacoes) {
        return new Personal(nome, dataNascimento, cpf, telefone, email, sexo, cref, especialidade,
                turno, dataContratacao, status, observacoes);
    }

    public void salvarPersonal(JTable tabela, Personal personal, int linhaEdicao) {
        DefaultTableModel model = (DefaultTableModel) tabela.getModel();
        int linha = linhaEdicao;

        if (linhaEdicao < 0) {
            model.addRow(new Object[5]);
            linha = tabela.getRowCount() - 1;
        }

        int col = 0;
        tabela.setValueAt(personal.nome(), linha, col++);
        tabela.setValueAt(personal.telefone(), linha, col++);
        tabela.setValueAt(personal.email(), linha, col++);
        tabela.setValueAt(personal.turno(), linha, col++);
        tabela.setValueAt(personal.status(), linha, col);
    }

    public Personal obterPersonal(JTable tabela, int linha) {
        return new Personal(
                tabela.getValueAt(linha, 0).toString(),
                "",
                "",
                tabela.getValueAt(linha, 1).toString(),
                tabela.getValueAt(linha, 2).toString(),
                "",
                "",
                "",
                tabela.getValueAt(linha, 3).toString(),
                "",
                tabela.getValueAt(linha, 4).toString(),
                ""
        );
    }
}
