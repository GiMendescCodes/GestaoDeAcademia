import models.Academia;
import models.Cliente;
import models.instrutor;

public class main {
     public static void main(String[] args){

         Academia academia = new Academia ("Gym");
         Cliente cliente1 = new Cliente("Paulo", 45, "Plus++");
         Cliente cliente2 = new Cliente("Luiz", 30, "Comum");

         instrutor instrutor1 = new instrutor("Giovanna",25, "musculação" );
         instrutor instrutor2 = new instrutor("Antonio",55, "fisoterapia" );

         academia.adicionarPessoa(cliente1);
         academia.adicionarPessoa(cliente2);
         academia.adicionarPessoa(instrutor1);
         academia.adicionarPessoa(instrutor2);

         academia.ListarPessoas();

    }
}
