package DrinkingAnimals;

import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Fountain fountain = new Fountain();
        Zoo zoo = new Zoo();
        zoo.hiredChief(new Person("Gordon"));
        zoo.hiredDoctor(new Doctor("Doc"));
        zoo.hiredVolunteer(new Volunteer("Peter"));
        zoo.hiredVolunteer(new Volunteer("Tom"));
        zoo.hiredVolunteer(new Volunteer("Kevin"));
        zoo.addAnimal(new Snake("Kaa"));
        zoo.addAnimal(new Monkey("Ape"));
        zoo.addAnimal(new Bird("Rio"));
        zoo.addAnimal(new Bird("Flyer"));
        zoo.addAnimal(new Monkey("Kong"));


        simulateOneDay(zoo, fountain);

        for (int i = 0; i < 50; i++) {
            simulateOneDay(zoo, fountain);
        }
    }

    private static void simulateOneDay(Zoo zoo, Fountain fountain) {
        Collections.shuffle(zoo.getAnimals());
        Collections.shuffle(zoo.getVolunteer());

        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            if(random.nextInt(2) == 0){
                zoo.getVolunteer().get(i).giveWaterToAnimal(zoo,zoo.getAnimals().get(i));
            }
            else {
                zoo.getVolunteer().get(i).giveWaterToAnimal(fountain,zoo.getAnimals().get(i));
            }
        }
        zoo.getDoctor().treatAnimal(zoo.getAnimals().get(random.nextInt(zoo.getAnimals().size())));
        zoo.printSickAnimals();
        zoo.printChiefName();
    }
}
