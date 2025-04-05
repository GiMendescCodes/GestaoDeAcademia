package models;

abstract class instrutor extends Pessoa {
    private String especialidadeIntrut;

    public instrutor(String nome, int idade, String especialidadeIntrut) {
        super(nome, idade);
        this.especialidadeIntrut = especialidadeIntrut;
    }

    public String getEspecialidadeIntrut() {
        return especialidadeIntrut;
    }

    @Override
    public String toString() {
        return "instrutor{" +
                "especialidadeIntrut='" + especialidadeIntrut + '\'' +
                ", nomePessoa='" + nomePessoa + '\'' +
                ", idadePessoa=" + idadePessoa +
                '}';
    }

}
