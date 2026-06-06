package view.tablemodel;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public abstract class EntityTableModel<T, ID> extends AbstractTableModel {

    private final List<T> dados = new ArrayList<>();

    @Override
    public int getRowCount() {
        return dados.size();
    }

    public T getEntityAt(int rowIndex) {
        return dados.get(rowIndex);
    }

    public void setEntities(List<T> entidades) {
        dados.clear();
        if (entidades != null) {
            dados.addAll(entidades);
        }
        fireTableDataChanged();
    }

    public void addOrUpdate(T entidade) {
        int indice = findRowById(getEntityId(entidade));
        if (indice >= 0) {
            dados.set(indice, entidade);
            fireTableRowsUpdated(indice, indice);
            return;
        }

        dados.add(entidade);
        int ultimaLinha = dados.size() - 1;
        fireTableRowsInserted(ultimaLinha, ultimaLinha);
    }

    public void removeEntity(T entidade) {
        int indice = findRowById(getEntityId(entidade));
        if (indice >= 0) {
            dados.remove(indice);
            fireTableRowsDeleted(indice, indice);
        }
    }

    public int findRowById(ID id) {
        if (id == null) {
            return -1;
        }

        for (int i = 0; i < dados.size(); i++) {
            if (id.equals(getEntityId(dados.get(i)))) {
                return i;
            }
        }
        return -1;
    }

    protected abstract ID getEntityId(T entidade);
}
