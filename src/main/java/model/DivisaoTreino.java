package model;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import model.enums.TipoTreino;

@Entity
@Table(name = "divisao_treino")
public class DivisaoTreino implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_divisao")
    private Integer idDivisao;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, unique = true)
    private TipoTreino tipoTreino;

    @Column(nullable = false)
    private Integer quantidadeDias;

    @Column(length = 300)
    private String descricao;

    @OneToMany(mappedBy = "divisaoTreino")
    private List<FichaTreino> fichas = new ArrayList<>();

    public DivisaoTreino() {
    }

    public Integer getIdDivisao() {
        return idDivisao;
    }

    public void setIdDivisao(Integer idDivisao) {
        this.idDivisao = idDivisao;
    }

    public TipoTreino getTipoTreino() {
        return tipoTreino;
    }

    public void setTipoTreino(TipoTreino tipoTreino) {
        this.tipoTreino = tipoTreino;
    }

    public Integer getQuantidadeDias() {
        return quantidadeDias;
    }

    public void setQuantidadeDias(Integer quantidadeDias) {
        this.quantidadeDias = quantidadeDias;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<FichaTreino> getFichas() {
        return fichas;
    }

    public void setFichas(List<FichaTreino> fichas) {
        this.fichas = fichas;
    }
}
