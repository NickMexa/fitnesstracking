public class CrossFit extends FitnessTracking {
    private final int weight;

    public CrossFit(int mass, int time, double beatsPerSecond, int weight) {
        super(mass, time, beatsPerSecond);
        this.weight = weight;
    }

    @Override
    public String results() {
        return "Тренировка по кроссфиту: " + "Длительность: " + time + "минут " + "Вес штанги: " + weight + "км " + "Килокалорий: " + String.format("%.2f", energy);
    }
}
