
public class Aluno { // Classe

    private String nome; // Atributos privados
    private int idade;

    private String sexo;

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getSexo() {
        return sexo;
    }

    public String getNome() {
        return nome; // retorna o nome
    }

    public void setNome(String newNome) { // vai receber como parametro
        nome = newNome; // Novo nome que eu definir
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int newIdade) {
        this.idade = newIdade; // THIS -> chamar o construtor dentro de outro construtor
                               // Referir ao objeto em memória, sem a necessidade de chama-lo pelo seu nome
    }
}
