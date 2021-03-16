package DrinkingAnimals;

public class Monkey extends Animal{


    public Monkey(String name) {
        super(name, Continent.AFRICA);
    }

    @Override
    public void makeSound() {
        System.out.printf("%s I drank %d liter of water. Juhééé!" , name, drunkWater);
    }
}
