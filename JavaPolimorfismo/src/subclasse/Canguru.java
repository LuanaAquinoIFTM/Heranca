package subclasse;

public class Canguru extends Mamifero {

    public Canguru(double peso, int idade, int numeroMembro, String corDePelo) {
        super(peso, idade, numeroMembro, corDePelo);
    }

    public void usarBolsa(){
        System.out.println("Canguru está usando bolsa.");
    }
    
    public void locomover(){
        System.out.println("Canguru está pulando.");
    }
    
}
