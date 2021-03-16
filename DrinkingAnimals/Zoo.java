package DrinkingAnimals;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Zoo implements WaterBucketProvider{

    private Person chief;
    private Doctor doctor;
    private List<Volunteer> volunteer = new ArrayList<>();
    private List<Animal> animals = new ArrayList<>();

    public WaterBucket provideWaterBucket(){

        Random random = new Random();
        boolean isDirty = (random.nextInt(4) == 0 );
        int waterAmountLiter = random.nextInt(5) + 1;
        return new WaterBucket(isDirty, waterAmountLiter);

    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public List<Volunteer> getVolunteer() {
        return volunteer;
    }

    public void hiredChief(Person chief){
        this.chief = chief;
    }
    public void hiredDoctor(Doctor doctor){
        this.doctor = doctor;
    }
    public void hiredVolunteer(Volunteer vol){
        volunteer.add(vol);
    }
    public void addAnimal(Animal ani){
        animals.add(ani);
    }

    public Doctor getDoctor() {
        return doctor;
    }

    private int countSickAnimals(){
        int sickAnimals = 0;
        for(Animal animal : animals){
            if(animal.isSick()){
                sickAnimals++;
            }
        }
        return sickAnimals;
    }
    public void printSickAnimals(){
        System.out.println("Animals: " + countSickAnimals());
    }


    public void printChiefName() {
        System.out.println("Chief: " + chief.name);
    }
}
