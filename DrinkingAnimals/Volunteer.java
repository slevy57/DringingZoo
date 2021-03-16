package DrinkingAnimals;

public class Volunteer extends Person {

    public Volunteer(String name){
        super(name);
    }

    public void giveWaterToAnimal(WaterBucketProvider waterBucketProvider, Animal animal){
        System.out.println(name + "I'm bringing water to " + animal.getClass().getSimpleName());
        animal.drinkWater(waterBucketProvider.provideWaterBucket());
    }
}
