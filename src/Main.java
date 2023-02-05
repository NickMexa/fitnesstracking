import java.util.List;


public class Main {
    public static void main(String[] args) {
        FitnessTracking jogging = new Jog(60, 40, 80, 10);
        FitnessTracking boxing = new Box(75, 30,85);
        FitnessTracking boxing2 = new Box(123, 55,102);
        FitnessTracking crossfitting = new CrossFit(66, 22, 80, 25);

        List<FitnessTracking> listOfTrainings = List.of(boxing, jogging, boxing2, crossfitting);

        for (FitnessTracking training : listOfTrainings) {
            System.out.println(training.results());
        }

    }
}