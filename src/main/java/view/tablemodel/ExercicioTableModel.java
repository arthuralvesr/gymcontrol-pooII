package view.tablemodel;

import model.Exercicio;

public class ExercicioTableModel extends EntityTableModel<Exercicio, Integer> {

    private static final String[] COLUNAS = {
        "Nome", "Grupo Muscular", "Nivel", "Equipamento"
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
        Exercicio exercicio = getEntityAt(rowIndex);
        return switch (columnIndex) {
            case 0 -> exercicio.getNome();
            case 1 -> exercicio.getGrupoMuscular();
            case 2 -> exercicio.getNivel();
            case 3 -> exercicio.getEquipamento();
            default -> "";
        };
    }

    @Override
    protected Integer getEntityId(Exercicio entidade) {
        return entidade.getIdExercicio();
    }
}
