package controller;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Aluno;

public class AlunoController {

    public Aluno criarAluno(String nome, String dataNascimento, String telefone, String email,
            String sexo, int peso, int altura, java.util.List<String> objetivos, String observacoes) {
        return new Aluno(nome, dataNascimento, telefone, email, sexo, peso, altura, objetivos, observacoes);
    }

    public void salvarAluno(JTable tabela, Aluno aluno, int linhaEdicao) {
        DefaultTableModel model = (DefaultTableModel) tabela.getModel();
        int linha = linhaEdicao;

        if (linhaEdicao < 0) {
            model.addRow(new Object[5]);
            linha = tabela.getRowCount() - 1;
        }

        int col = 0;
        tabela.setValueAt(aluno.nome(), linha, col++);
        tabela.setValueAt(aluno.dataNascimento(), linha, col++);
        tabela.setValueAt(aluno.telefone(), linha, col++);
        tabela.setValueAt(aluno.objetivos(), linha, col++);
        tabela.setValueAt(aluno.observacoes(), linha, col);
    }

    public Aluno obterAluno(JTable tabela, int linha) {
        return new Aluno(
                tabela.getValueAt(linha, 0).toString(),
                tabela.getValueAt(linha, 1).toString(),
                tabela.getValueAt(linha, 2).toString(),
                "",
                "",
                0,
                0,
                java.util.List.of(tabela.getValueAt(linha, 3).toString()),
                tabela.getValueAt(linha, 4).toString()
        );
    }
}
