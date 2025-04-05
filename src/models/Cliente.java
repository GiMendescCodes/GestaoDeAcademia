package models;

abstract class Cliente extends Pessoa {

    private String planoCliente;

    public Cliente(String nome, int idade, String planoCliente) {
        super(nome, idade);
        this.planoCliente = planoCliente;
    }

    public String getPlanoCliente() {
        return planoCliente;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "planoCliente='" + planoCliente + '\'' +
                ", nomePessoa='" + nomePessoa + '\'' +
                ", idadePessoa=" + idadePessoa +
                '}';
    }
}
