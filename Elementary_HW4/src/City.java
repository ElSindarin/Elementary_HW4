import java.util.ArrayList;
import java.util.List;

public class City {
    private String name;
    private List<Street> streets = new ArrayList<>();
    private Builder builders;

    public void setName(String name) {
        this.name = name;
    }

    public Builder getBuilders() {
        return builders;
    }

    public String getName() {
        return name;
    }

    public List<Street> getStreets() {
        return streets;
    }

    public void setStreets(List<Street> streets) {
        this.streets = streets;
    }

    public void initBuilders () {
        builders = new Builder();
    }

    public void createStreet() {
        Street street = new Street();
        streets.add(street);
        streets.get(streets.lastIndexOf(street)).setName("улица №" + (streets.lastIndexOf(street)+ 1));
    }
}
