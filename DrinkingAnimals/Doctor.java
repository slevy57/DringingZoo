package DrinkingAnimals;

public class Doctor extends Person {

    public Doctor(String name){
        super(name);
    }

    public void treatAnimal(Animal animal){
        if(animal.isSick()){
            System.out.println("healthy");
        }
        else {
            System.out.println("Not healthy");
            animal.setSick(!animal.isSick());
        }
    }
}
