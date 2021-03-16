package DrinkingAnimals;

public class Snake extends Animal{


    public Snake(String name) {
        super(name, Continent.ASIA);
    }

    @Override
    public void makeSound(){
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append(" I drank");
        sb.append(drunkWater);
        sb.append("liters of water! Ssssz");
    }
}
