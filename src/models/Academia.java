package models;

import java.util.ArrayList;

 public class Academia {
    private String nomeAcademia;
    private ArrayList<Pessoa> pessoasAcademia;


     public Academia(String nomeAcademia) {
         this.nomeAcademia = nomeAcademia;
         this.pessoasAcademia = new ArrayList<>();
     }
     public void adicionarPessoa(Pessoa pessoa){
         pessoasAcademia.add(pessoa);
     }
    public void ListarPessoas(){
        System.out.println("Lista de pessoas da academia: ");
        for (Pessoa pessoasDaLista : pessoasAcademia){
            System.out.println(pessoasDaLista.getDescricao());
        }
    }
 }
