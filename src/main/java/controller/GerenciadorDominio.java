package controller;

import dao.ConexaoHibernate;
import dao.GenericDAO;
import java.time.LocalDate;
import java.util.List;
import model.Aluno;
import model.DivisaoTreino;
import model.Exercicio;
import model.ExercicioFicha;
import model.FichaTreino;
import model.Personal;
import model.enums.DiaTreino;
import model.enums.Nivel;
import model.enums.Sexo;
import model.enums.Status;
import model.enums.TipoTreino;
import org.hibernate.HibernateException;

public class GerenciadorDominio {

    private final GenericDAO genDAO;

    public GerenciadorDominio() {
        genDAO = new GenericDAO();
    }

    public List listar(Class classe) throws HibernateException {
        return genDAO.listar(classe);
    }

    public Object get(Class classe, int id) throws HibernateException {
        return genDAO.get(classe, id);
    }

    public void excluir(Object obj) throws HibernateException {
        genDAO.excluir(obj);
    }

    public void inserir(Object obj) throws HibernateException {
        genDAO.inserir(obj);
    }

    public void alterar(Object obj) throws HibernateException {
        genDAO.alterar(obj);
    }

    public Aluno inserirAluno(String nome, LocalDate dataNascimento, String telefone, String email,
            Sexo sexo, Double peso, Double altura, List<String> objetivos,
            String observacoes, Status status) throws HibernateException {

        Aluno aluno = new Aluno();
        aluno.setNome(nome);
        aluno.setDataNascimento(dataNascimento);
        aluno.setTelefone(telefone);
        aluno.setEmail(email);
        aluno.setSexo(sexo);
        aluno.setPeso(peso);
        aluno.setAltura(altura);
        aluno.setObjetivos(objetivos);
        aluno.setObservacoes(observacoes);
        aluno.setStatus(status);

        genDAO.inserir(aluno);
        return aluno;
    }

    public Aluno alterarAluno(Aluno aluno, String nome, LocalDate dataNascimento, String telefone,
            String email, Sexo sexo, Double peso, Double altura, List<String> objetivos,
            String observacoes, Status status) throws HibernateException {

        aluno.setNome(nome);
        aluno.setDataNascimento(dataNascimento);
        aluno.setTelefone(telefone);
        aluno.setEmail(email);
        aluno.setSexo(sexo);
        aluno.setPeso(peso);
        aluno.setAltura(altura);
        aluno.setObjetivos(objetivos);
        aluno.setObservacoes(observacoes);
        aluno.setStatus(status);

        genDAO.alterar(aluno);
        return aluno;
    }

    public Personal inserirPersonal(String nome, String telefone, String email, String cref,
            Sexo sexo, String especialidade, String turno, String observacoes,
            Status status) throws HibernateException {

        Personal personal = new Personal();
        personal.setNome(nome);
        personal.setTelefone(telefone);
        personal.setEmail(email);
        personal.setCref(cref);
        personal.setSexo(sexo);
        personal.setEspecialidade(especialidade);
        personal.setTurno(turno);
        personal.setObservacoes(observacoes);
        personal.setStatus(status);

        genDAO.inserir(personal);
        return personal;
    }

    public Personal alterarPersonal(Personal personal, String nome, String telefone, String email,
            String cref, Sexo sexo, String especialidade, String turno,
            String observacoes, Status status) throws HibernateException {

        personal.setNome(nome);
        personal.setTelefone(telefone);
        personal.setEmail(email);
        personal.setCref(cref);
        personal.setSexo(sexo);
        personal.setEspecialidade(especialidade);
        personal.setTurno(turno);
        personal.setObservacoes(observacoes);
        personal.setStatus(status);

        genDAO.alterar(personal);
        return personal;
    }

    public Exercicio inserirExercicio(String nome, String grupoMuscular, String tipoExercicio,
            Nivel nivel, String equipamento, String descricao) throws HibernateException {

        Exercicio exercicio = new Exercicio();
        exercicio.setNome(nome);
        exercicio.setGrupoMuscular(grupoMuscular);
        exercicio.setTipoExercicio(tipoExercicio);
        exercicio.setNivel(nivel);
        exercicio.setEquipamento(equipamento);
        exercicio.setDescricao(descricao);

        genDAO.inserir(exercicio);
        return exercicio;
    }

    public Exercicio alterarExercicio(Exercicio exercicio, String nome, String grupoMuscular,
            String tipoExercicio, Nivel nivel, String equipamento,
            String descricao) throws HibernateException {

        exercicio.setNome(nome);
        exercicio.setGrupoMuscular(grupoMuscular);
        exercicio.setTipoExercicio(tipoExercicio);
        exercicio.setNivel(nivel);
        exercicio.setEquipamento(equipamento);
        exercicio.setDescricao(descricao);

        genDAO.alterar(exercicio);
        return exercicio;
    }

    public DivisaoTreino inserirDivisaoTreino(TipoTreino tipoTreino, Integer quantidadeDias,
            String descricao) throws HibernateException {

        DivisaoTreino divisaoTreino = new DivisaoTreino();
        divisaoTreino.setTipoTreino(tipoTreino);
        divisaoTreino.setQuantidadeDias(quantidadeDias);
        divisaoTreino.setDescricao(descricao);

        genDAO.inserir(divisaoTreino);
        return divisaoTreino;
    }

    public DivisaoTreino alterarDivisaoTreino(DivisaoTreino divisaoTreino, TipoTreino tipoTreino,
            Integer quantidadeDias, String descricao) throws HibernateException {

        divisaoTreino.setTipoTreino(tipoTreino);
        divisaoTreino.setQuantidadeDias(quantidadeDias);
        divisaoTreino.setDescricao(descricao);

        genDAO.alterar(divisaoTreino);
        return divisaoTreino;
    }

    public FichaTreino inserirFichaTreino(String nomeFicha, LocalDate dataCriacao, String objetivoFicha,
            String observacoes, Status status, Aluno aluno, Personal personal,
            DivisaoTreino divisaoTreino) throws HibernateException {

        FichaTreino fichaTreino = new FichaTreino();
        fichaTreino.setNomeFicha(nomeFicha);
        fichaTreino.setDataCriacao(dataCriacao);
        fichaTreino.setObjetivoFicha(objetivoFicha);
        fichaTreino.setObservacoes(observacoes);
        fichaTreino.setStatus(status);
        fichaTreino.setAluno(aluno);
        fichaTreino.setPersonal(personal);
        fichaTreino.setDivisaoTreino(divisaoTreino);

        genDAO.inserir(fichaTreino);
        return fichaTreino;
    }

    public FichaTreino alterarFichaTreino(FichaTreino fichaTreino, String nomeFicha,
            LocalDate dataCriacao, String objetivoFicha, String observacoes, Status status,
            Aluno aluno, Personal personal, DivisaoTreino divisaoTreino) throws HibernateException {

        fichaTreino.setNomeFicha(nomeFicha);
        fichaTreino.setDataCriacao(dataCriacao);
        fichaTreino.setObjetivoFicha(objetivoFicha);
        fichaTreino.setObservacoes(observacoes);
        fichaTreino.setStatus(status);
        fichaTreino.setAluno(aluno);
        fichaTreino.setPersonal(personal);
        fichaTreino.setDivisaoTreino(divisaoTreino);

        genDAO.alterar(fichaTreino);
        return fichaTreino;
    }

    public ExercicioFicha inserirExercicioFicha(DiaTreino diaTreino, Integer series,
            Integer repeticoes, Double carga, Integer descanso, Integer ordemExercicio,
            String observacoes, FichaTreino fichaTreino,
            Exercicio exercicio) throws HibernateException {

        ExercicioFicha exercicioFicha = new ExercicioFicha();
        exercicioFicha.setDiaTreino(diaTreino);
        exercicioFicha.setSeries(series);
        exercicioFicha.setRepeticoes(repeticoes);
        exercicioFicha.setCarga(carga);
        exercicioFicha.setDescanso(descanso);
        exercicioFicha.setOrdemExercicio(ordemExercicio);
        exercicioFicha.setObservacoes(observacoes);
        exercicioFicha.setFichaTreino(fichaTreino);
        exercicioFicha.setExercicio(exercicio);

        genDAO.inserir(exercicioFicha);
        return exercicioFicha;
    }

    public ExercicioFicha alterarExercicioFicha(ExercicioFicha exercicioFicha, DiaTreino diaTreino,
            Integer series, Integer repeticoes, Double carga, Integer descanso,
            Integer ordemExercicio, String observacoes, FichaTreino fichaTreino,
            Exercicio exercicio) throws HibernateException {

        exercicioFicha.setDiaTreino(diaTreino);
        exercicioFicha.setSeries(series);
        exercicioFicha.setRepeticoes(repeticoes);
        exercicioFicha.setCarga(carga);
        exercicioFicha.setDescanso(descanso);
        exercicioFicha.setOrdemExercicio(ordemExercicio);
        exercicioFicha.setObservacoes(observacoes);
        exercicioFicha.setFichaTreino(fichaTreino);
        exercicioFicha.setExercicio(exercicio);

        genDAO.alterar(exercicioFicha);
        return exercicioFicha;
    }
}
