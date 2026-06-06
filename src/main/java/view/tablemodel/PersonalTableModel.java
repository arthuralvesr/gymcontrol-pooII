package view.tablemodel;

import model.Personal;
import model.enums.Status;

public class PersonalTableModel extends EntityTableModel<Personal, Integer> {

    private static final String[] COLUNAS = {
        "Nome", "Telefone", "Email", "Turno", "Status"
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
        Personal personal = getEntityAt(rowIndex);
        return switch (columnIndex) {
            case 0 -> personal.getNome();
            case 1 -> personal.getTelefone();
            case 2 -> personal.getEmail();
            case 3 -> personal.getTurno();
            case 4 -> personal.getStatus() == Status.INATIVO ? "Inativo" : "Ativo";
            default -> "";
        };
    }

    @Override
    protected Integer getEntityId(Personal entidade) {
        return entidade.getIdPersonal();
    }
}
