import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        List<Train> togAvganger = new ArrayList<>();

        Train togTilTrondheim = new Train(100, 1, "Harald Haraldsen");
        togTilTrondheim.stops = Arrays.asList("Oslo S", "Lillestrøm", "Oslo Lufthavn", "Eidsvoll", "Lillehammer", "Oppdal", "Trondheim");
        togTilTrondheim.leggTilVogn(new Vogn(1, "B5", 100));
        togTilTrondheim.leggTilVogn(new Vogn(2, "B7", -100));
        togTilTrondheim.leggTilVogn(new Vogn(3, "B7", 20));

        togAvganger.add(togTilTrondheim);

        System.out.print("Train is driven by " + togTilTrondheim.locomotiveDriverName);
        System.out.println(" and stops at " + togTilTrondheim.stops.size() + " stops.");
        System.out.println("The capacity of the train is " + countPassengers(togTilTrondheim));

        Train togTilBergen = new Train(100, 2, "Anders Andersen");
        togTilBergen.stops = Arrays.asList("Oslo S", "Sandvika", "Hønefoss", "Gol", "Voss", "Bergen");
        togTilBergen.leggTilVogn(new Vogn(1, "B5", 100));
        togTilBergen.leggTilVogn(new Vogn(2, "B7", -100));
        togTilBergen.leggTilVogn(new Vogn(3, "B7", 20));

        togAvganger.add(togTilBergen);

        System.out.print("Train is driven by " + togTilBergen.locomotiveDriverName);
        System.out.println(" and stops at " + togTilBergen.stops.size() + " stops.");
        System.out.println("The capacity of the train is " + countPassengers(togTilBergen));

        Train togTilStavanger = new Train(100, 3, "Hans Hansen");
        togTilStavanger.stops = Arrays.asList("Oslo S", "Sandvika", "Kristiansand", "Egersund", "Stavanger");
        togTilStavanger.leggTilVogn(new Vogn(1, "B5", 100));
        togTilStavanger.leggTilVogn(new Vogn(2, "B7", -100));
        togTilStavanger.leggTilVogn(new Vogn(3, "B7", 20));

        togAvganger.add(togTilStavanger);

        System.out.print("Train is driven by " + togTilStavanger.locomotiveDriverName);
        System.out.println(" and stops at " + togTilStavanger.stops.size() + " stops.");
        System.out.println("The capacity of the train is " + countPassengers(togTilStavanger));
    }

    public static int countPassengers(Train train) {
        int i = 0;
        for (int j = 0; j < train.vogner.size(); j++) {
            Vogn vogn = (Vogn) train.vogner.get(j);
            i += vogn.kapasitet;
        }
        return i;
    }
}
