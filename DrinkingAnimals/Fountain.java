package DrinkingAnimals;

import java.util.Random;

public class Fountain implements WaterBucketProvider{

    @Override
    public WaterBucket provideWaterBucket() {
        Random random = new Random();
        boolean isDirty = (random.nextInt(2) == 0);
        int waterAmountLiter = random.nextInt(3) + 1;
        return new WaterBucket(isDirty, waterAmountLiter);
    }
}
