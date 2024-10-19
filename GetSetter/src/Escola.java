
public class Escola {
    public static void main(String[] args) {

        Aluno felipe = new Aluno(); // "NEW" usada para criar novos objetos

        // felipe.nome = "Felipe"; // valores de atributos dos objetos
        // felipe.idade = 8;

        felipe.setNome("Felipe Junior");
        felipe.setIdade(12);
        // felipe.getSexo("Masculino");

        System.out.println("O aluno " + felipe.getNome() + " tem " + felipe.getIdade() + " anos ");

    } // GET E SET -> usados para acessar e modificar os atributos de uma classe de
      // forma controlada
      // GET -> retorna um valor
      // SET -> atribuir um valor
}
