package view.tablemodel;

import java.time.format.DateTimeFormatter;
import model.Aluno;

public class AlunoTableModel extends EntityTableModel<Aluno, Integer> {

    private static final DateTimeFormatter FORMATO_DATA = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private static final String[] COLUNAS = {
        "Nome", "Dt. Nascimento", "Telefone", "Objetivo", "Observacoes"
    };

    @Override
    public int getColumnCount() {
        return COLUNAS.length;
    }

    @Override
    public String getColumnName(int column) {
        return COLUNAS[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Aluno aluno = getEntityAt(rowIndex);
        return switch (columnIndex) {
            case 0 -> aluno.getNome();
            case 1 -> aluno.getDataNascimento() == null ? "" : aluno.getDataNascimento().format(FORMATO_DATA);
            case 2 -> aluno.getTelefone();
            case 3 -> aluno.getObjetivos() == null ? "" : String.join(", ", aluno.getObjetivos());
            case 4 -> aluno.getObservacoes();
            default -> "";
        };
    }

    @Override
    protected Integer getEntityId(Aluno entidade) {
        return entidade.getIdAluno();
    }
}
