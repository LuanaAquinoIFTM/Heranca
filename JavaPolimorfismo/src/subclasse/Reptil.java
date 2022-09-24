package subclasse;

import superclasse.Animal;

public class Reptil extends Animal {

    private String corEscama;

    public Reptil(double peso, int idade, int numeroMembro, String corEscama) {
        super(peso, idade, numeroMembro);
        this.corEscama = corEscama;
    }

    public void locomover(){
        System.out.println("Reptil está rastejando.");
    }
    public void alimentar(){
        System.out.println("Reptil está comendo.");
    }
    public void emitirSom(){
        System.out.println("Reptil está emitando som.");
    }


    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    
    
    
}
