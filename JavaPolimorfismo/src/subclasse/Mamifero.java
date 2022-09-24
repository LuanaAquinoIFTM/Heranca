package subclasse;

import superclasse.Animal;

public class Mamifero extends Animal{

    protected String corDePelo;

    public Mamifero(double peso, int idade, int numeroMembro, String corDePelo) {
        super(peso, idade, numeroMembro); 
        this.corDePelo = corDePelo;       
    }

    public void alimentar(){
        System.out.println("Mamífero está mamando.");
    }

    public void locomover(){
        System.out.println("Mamífero está correndo.");
    }

    public void emitirSom(){
        System.out.println("Som padrão do mamífero.");
    }

    //get pega
    public String getCorDePelo() {
        return corDePelo;
    }

    //set recebe
    public void setCorDePelo(String corDePelo) {
        this.corDePelo = corDePelo;
    }

    
    
}