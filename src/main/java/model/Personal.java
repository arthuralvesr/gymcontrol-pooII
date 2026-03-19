package model;

public record Personal(
        String nome,
        String dataNascimento,
        String cpf,
        String telefone,
        String email,
        String sexo,
        String cref,
        String especialidade,
        String turno,
        String dataContratacao,
        String status,
        String observacoes
) {
}
