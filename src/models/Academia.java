package models;

import java.util.ArrayList;

 class Academia {
    private String nomeAcademia;
    private ArrayList<Pessoa> pessoas;


     public Academia(ArrayList<Pessoa> pessoas) {
         this.pessoas = pessoas;
         this.pessoas = new ArrayList<>();
     }
     public void adicionarPessoa(Pessoa pessoa){
         pessoas.add(pessoa);
     }
    public void ListarPessoas(){
        System.out.println("Lista de pssoas da academia: ");
        for (Pessoa pessoasDaLista : pessoas){
            System.out.println(pessoasDaLista.getDescricao());
        }
    }
 }
