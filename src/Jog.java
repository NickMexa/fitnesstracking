public class Jog extends FitnessTracking{

    private double distance;

    public Jog(int mass, int time, double beatsPerSecond, double distance) {
        super(mass, time, beatsPerSecond);
        this.distance = distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    @Override
    public String results(){
        return "Беговая тренировка: " + "Длительность: " + time + " " + "минут " + "Дистанция: " + distance + "км " + "Килокалорий: " + String.format("%.2f", energy);
    }
}
