package subclasse;

public class Cachorro extends Mamifero {

    public Cachorro(double peso, int idade, int numeroMembro, String corDePelo) {
        super(peso, idade, numeroMembro, corDePelo);
        
    }

    public void enterrarOssos(){
        System.out.println("Cachorro está enterrando ossos");
    }

    public void abanarRabo(){
        System.out.println("Cachorro está feliz, e abana o rabo");
    }

    public void emitirSom(){
        System.out.println("au! au! au!");
    }

    public void reagir(String frase){
        if(frase.equals("toma comida") || frase.equals("vamos passear!!")
        || frase.equals("Olá")){
            System.out.println("Abanar rabo e latir");
        }else{
            System.out.println("rosnar");
        }
    }

    public void reagir(int hora, int min){
        if(hora < 12){
            System.out.println("Abanar o rabo");
        }else if(hora >= 12 && hora < 18){
            System.out.println("Abanar o rabo e latir");
        }else{
            System.out.println("Ignorar");
        }
    }

    public void reagir( boolean dono){
        if(dono){
            System.out.println("Abanar o rabo");
        }else{
            System.out.println("Rosnar e latir");
        }
    }

    public void reagir(){
        if(this.idade < 7){
            if(this.peso < 15.0){
                System.out.println("Abanar o rabo");
            }else{
                System.out.println("Latir");
            }
        }else{
            if(this.peso < 15.0){
                System.out.println("Rosnar");
            }else{
                System.out.println("Ignorar");
            }
        }
    }
}
