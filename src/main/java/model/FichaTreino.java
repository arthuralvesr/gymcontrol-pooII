package model;

import jakarta.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import model.enums.Status;

@Entity
@Table(name = "ficha_treino")
public class FichaTreino implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ficha")
    private Integer idFicha;

    @Column(nullable = false, length = 100)
    private String nomeFicha;

    @Column(nullable = false)
    private LocalDate dataCriacao;

    @Column(length = 200)
    private String objetivoFicha;

    @Column(length = 500)
    private String observacoes;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Status status;

    @ManyToOne
    @JoinColumn(name = "id_aluno")
    private Aluno aluno;

    @ManyToOne
    @JoinColumn(name = "id_personal")
    private Personal personal;

    @ManyToOne
    @JoinColumn(name = "id_divisao")
    private DivisaoTreino divisaoTreino;

    @OneToMany(mappedBy = "fichaTreino")
    private List<ExercicioFicha> exerciciosFicha = new ArrayList<>();

    public FichaTreino() {
    }

    public Integer getIdFicha() {
        return idFicha;
    }

    public void setIdFicha(Integer idFicha) {
        this.idFicha = idFicha;
    }

    public String getNomeFicha() {
        return nomeFicha;
    }

    public void setNomeFicha(String nomeFicha) {
        this.nomeFicha = nomeFicha;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public String getObjetivoFicha() {
        return objetivoFicha;
    }

    public void setObjetivoFicha(String objetivoFicha) {
        this.objetivoFicha = objetivoFicha;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Personal getPersonal() {
        return personal;
    }

    public void setPersonal(Personal personal) {
        this.personal = personal;
    }

    public DivisaoTreino getDivisaoTreino() {
        return divisaoTreino;
    }

    public void setDivisaoTreino(DivisaoTreino divisaoTreino) {
        this.divisaoTreino = divisaoTreino;
    }

    public List<ExercicioFicha> getExerciciosFicha() {
        return exerciciosFicha;
    }

    public void setExerciciosFicha(List<ExercicioFicha> exerciciosFicha) {
        this.exerciciosFicha = exerciciosFicha;
    }
}
