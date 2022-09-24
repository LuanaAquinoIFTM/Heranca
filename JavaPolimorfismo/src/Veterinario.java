import subclasse.Cachorro;
import superclasse.Animal;

public class Veterinario {
    
    public void atendeAnimal(Animal a){
        System.out.println("Veterinario está atendendo.");
        a.locomover();
        a.emitirSom();
    }

    public void reagir(Animal a){
        if(a instanceof Cachorro){
            Cachorro c = (Cachorro) a;
            c.reagir();
        }else{
            a.emitirSom();
        }
    }
}
