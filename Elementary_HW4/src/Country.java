import java.util.ArrayList;
import java.util.List;
public class Country {
    private String name;
    private List<City> cities = new ArrayList<>();

    public List<City> getCities() {
        return cities;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void createCity () {
        City city = new City();
        for (int i = 0; i < 3; i++) {
            city.createStreet();
        }
        city.initBuilders();
        city.setName("Город №" + (cities.size() + 1));
        cities.add(city);
    }
}
