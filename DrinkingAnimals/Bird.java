package DrinkingAnimals;

public class Bird extends Animal{

    public Bird(String name){

        super(name, Continent.EUROPE);
    }

    @Override
    public void makeSound(){
        System.out.println(name + ": I drank " + drunkWater + " liter of water. Csipcsprip!");

    }
}
