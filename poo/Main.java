import models.Pessoa;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa("Marta", 25, "marta@gmail.com");

        pessoa.setNome("José");

        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("E-mail: " + pessoa.getEmail());
        
    }
}
