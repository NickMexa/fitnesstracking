

public abstract class FitnessTracking {

    protected int mass;
    protected double energy;
    protected int time;
    protected double beatsPerSecond;


    public FitnessTracking(int mass, int time, double beatsPerSecond) {
        this.mass = mass;
        this.time = time;
        this.beatsPerSecond = beatsPerSecond;
        this.countCalories();
    }

    public int getMass() {
        return mass;
    }

    public double getTime() {
        return time;
    }

    public double getBeatsPerSecond() {
        return beatsPerSecond;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    public void setTime(int time) {
        this.time = time;
    }

     public void setBeatsPerSecond(double beatsPerSecond) {
        this.beatsPerSecond = beatsPerSecond;
    }



    public void countCalories() {
        energy = 0.014 * mass * time * (0.12 * beatsPerSecond - 7);
        if (energy < 0)
        {
            throw new IllegalArgumentException("Not correct input parameters");
        }
    }

    public abstract String results();
}
