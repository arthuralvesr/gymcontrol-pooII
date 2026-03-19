package model;

import java.util.List;

public record Aluno(
        String nome,
        String dataNascimento,
        String telefone,
        String email,
        String sexo,
        int peso,
        int altura,
        List<String> objetivos,
        String observacoes
) {
}
