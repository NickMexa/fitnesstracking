public class Box extends FitnessTracking {


    public Box(int mass, int time, double beatsPerSecond)
    {
        super(mass,time,beatsPerSecond);
    }

    @Override
    public String results() {
        return "Тренировка по боксу: " + "Длительность: " + time + " " + "минут " + "Килокалорий: " + String.format("%.2f", energy);
    }
}
