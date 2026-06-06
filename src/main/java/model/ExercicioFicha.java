package model;

import jakarta.persistence.*;
import java.io.Serializable;
import model.enums.DiaTreino;

@Entity
@Table(name = "exercicio_ficha")
public class ExercicioFicha implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_exercicio_ficha")
    private Integer idExercicioFicha;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private DiaTreino diaTreino;

    @Column(nullable = false)
    private Integer series;

    @Column(nullable = false)
    private Integer repeticoes;

    @Column(nullable = false)
    private Double carga;

    @Column(nullable = false)
    private Integer descanso;

    @Column(nullable = false)
    private Integer ordemExercicio;

    @Column(length = 500)
    private String observacoes;

    @ManyToOne
    @JoinColumn(name = "id_ficha")
    private FichaTreino fichaTreino;

    @ManyToOne
    @JoinColumn(name = "id_exercicio")
    private Exercicio exercicio;

    public ExercicioFicha() {
    }

    public Integer getIdExercicioFicha() {
        return idExercicioFicha;
    }

    public void setIdExercicioFicha(Integer idExercicioFicha) {
        this.idExercicioFicha = idExercicioFicha;
    }

    public DiaTreino getDiaTreino() {
        return diaTreino;
    }

    public void setDiaTreino(DiaTreino diaTreino) {
        this.diaTreino = diaTreino;
    }

    public Integer getSeries() {
        return series;
    }

    public void setSeries(Integer series) {
        this.series = series;
    }

    public Integer getRepeticoes() {
        return repeticoes;
    }

    public void setRepeticoes(Integer repeticoes) {
        this.repeticoes = repeticoes;
    }

    public Double getCarga() {
        return carga;
    }

    public void setCarga(Double carga) {
        this.carga = carga;
    }

    public Integer getDescanso() {
        return descanso;
    }

    public void setDescanso(Integer descanso) {
        this.descanso = descanso;
    }

    public Integer getOrdemExercicio() {
        return ordemExercicio;
    }

    public void setOrdemExercicio(Integer ordemExercicio) {
        this.ordemExercicio = ordemExercicio;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public FichaTreino getFichaTreino() {
        return fichaTreino;
    }

    public void setFichaTreino(FichaTreino fichaTreino) {
        this.fichaTreino = fichaTreino;
    }

    public Exercicio getExercicio() {
        return exercicio;
    }

    public void setExercicio(Exercicio exercicio) {
        this.exercicio = exercicio;
    }
}
