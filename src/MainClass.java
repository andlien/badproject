import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {
        Train tog = new Train(100, 1, "Harald Haraldsen");
        tog.stops = Arrays.asList("Oslo S", "Lillestrøm", "Oslo Lufthavn", "Eidsvoll", "Lillehammer", "Oppdal", "Trondheim");
        tog.leggTilVogn(new Vogn(1, "B5", 100));
        tog.leggTilVogn(new Vogn(2, "B7", -100));
        tog.leggTilVogn(new Vogn(3, "B7", 20));

        System.out.print("Train is driven by " + tog.locomotiveDriverName);
        System.out.println(" and stops at " + tog.stops.size() + " stops.");
        System.out.println("The capacity of the train is " + countPassengers(tog));
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
