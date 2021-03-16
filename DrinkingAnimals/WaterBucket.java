package DrinkingAnimals;

public class WaterBucket {

    private boolean isDirty;
    private int waterAmountInLiter;

    public WaterBucket(boolean isDirty, int waterAmountInLiter){
        this.isDirty = isDirty;
        this.waterAmountInLiter = waterAmountInLiter;
    }


    public boolean isDirty() {
        return isDirty;
    }

    public int getWaterAmountInLiter() {
        return waterAmountInLiter;
    }

    public void setWaterAmountInLiter(int waterAmountInLiter) {
        this.waterAmountInLiter = waterAmountInLiter;
    }
}
