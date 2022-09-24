package subclasse;

import superclasse.Animal;
//herança extends
public class Ave extends Animal {
    
    //nn posso ter atributos publicos, se nn for aplicar heranca na classe ave aplicar o private
    protected String corPena;

    public Ave(double peso, int idade, int numeroMembro, String corPena) {
        //super usa alguma coisa da superclasse
        //estrutura já pront, sem precisar passar o this
        super(peso, idade, numeroMembro);
        this.corPena = corPena;
    }

    public void alimentar() {
        System.out.println("Ave está se alimentando.");
        
    }

    public void emitirSom() {
        System.out.println("piu piu piu.");
        
    }

    @Override
    public void locomover() {
        System.out.println("Ave está voando.");
        
    }

    public void fazendoNinho(){
        System.out.println("Ave acaba de comprar sua casa própria pela MRV.");
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

    
}
