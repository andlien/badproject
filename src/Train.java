import java.util.ArrayList;
import java.util.List;

public class Train {
    public int maxSpeed;
    public List stops;
    public int locomotiveDriverId;
    public String locomotiveDriverName;
    public List vogner;

    public Train(int maxSpeed, int locomotiveDriverId, String locomotiveDriverName) {
        this.maxSpeed = maxSpeed;
        this.stops = new ArrayList();
        this.locomotiveDriverId = locomotiveDriverId;
        this.locomotiveDriverName = locomotiveDriverName;
        this.vogner = new ArrayList();
    }

    public void leggTilVogn(Vogn vogn) {
        this.vogner.add(vogn);
    }
}
