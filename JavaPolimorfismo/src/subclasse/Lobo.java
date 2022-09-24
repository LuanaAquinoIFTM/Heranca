package subclasse;

public class Lobo extends Mamifero {

    public Lobo(double peso, int idade, int numeroMembro, String corDePelo) {
        super(peso, idade, numeroMembro, corDePelo);
    }
    //polimorfismo por sobreposição
    public void emitirSom() {
        System.out.println("Auuuuuuuuuuuuuu!");
    }
}
