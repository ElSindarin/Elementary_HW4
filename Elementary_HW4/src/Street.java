import java.util.ArrayList;
import java.util.List;
public class Street {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private List<Building> buildings = new ArrayList<>();

    public List<Building> getBuildings() {
        return buildings;
    }
}
