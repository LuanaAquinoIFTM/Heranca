import subclasse.Ave;
import subclasse.Cachorro;
import subclasse.Cobra;
import subclasse.Mamifero;
import subclasse.Peixe;
import subclasse.Reptil;
import subclasse.Tartaruga;
// superclasse.Animal;

public class Principal {
    
    public static void main(String[] args) {
        
        //Animal a = new Animal(50.0, 5, 4);
        
        Mamifero m = new Mamifero(55.0, 17, 2, "preto");
        Reptil r = new Reptil(0.500, 4, 0, "neon");
        Peixe p = new Peixe(0.300, 1, 1, "rosa");
        Ave a = new Ave(0.200, 5, 2, "azul rosado");
        m.alimentar();
        r.alimentar();
        p.alimentar();
        a.alimentar();

        System.out.println();
        Veterinario v = new Veterinario();
        v.atendeAnimal(m);
        v.atendeAnimal(r);
        v.atendeAnimal(p);
        v.atendeAnimal(a);

        Tartaruga t = new Tartaruga(100, 50, 4, "verde");

        Cobra c = new Cobra(2, 3, 0, "amarelo");

        //c.locomover();

        //t.locomover();

        v.atendeAnimal(c);
        v.atendeAnimal(t);

        Cachorro toto = new Cachorro(16, 12, 4, "rosa") ;
        v.reagir(c);
        v.reagir(toto);
    }

    //public static Animal fabricaDeAnimais(String tipoAnimal){
        //if(tipoAnimal.equals("cachorro")){
           // Cachorro c = new Cachorro(0.0, 0, 4, "azul bebe");
            //return c;
        //}else if(tipoAnimal.equals("cobra")){
            //Cobra co = new Cobra(0.0, 0 , 0, "cinza");
            //return co;
        }
       
    
