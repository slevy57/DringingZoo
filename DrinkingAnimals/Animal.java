package DrinkingAnimals;

import ContainerShip.Container;

public abstract class Animal extends Person {

    protected int drunkWater;
    private boolean isSick;
    protected Continent homeContinent;

    public Animal(String name, Continent homeContinent) {
        super(name);
        this.homeContinent = homeContinent;
    }

    public abstract void makeSound();

    public void drinkWater(WaterBucket waterBucket){
        drunkWater += waterBucket.getWaterAmountInLiter();
        waterBucket.setWaterAmountInLiter(0);
        makeSound();
        if(waterBucket.isDirty()){
            isSick = true;
        }
    }

    public boolean isSick() {
        return isSick;
    }

    public void setSick(boolean sick) {
        isSick = sick;
    }
}
