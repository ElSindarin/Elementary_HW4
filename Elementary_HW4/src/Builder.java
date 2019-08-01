import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;

public class Builder {

    public void build (City city, Street street, Building building) {
        if (city.getBuilders() == null) {
            System.out.println("Невозможно построить здание, т.к. в городе отсутствуют строители");
        }
        else {
            System.out.println("Построено новое здание, тип здания - " + building.getType());
            street.getBuildings().add(building);
        }
    }
}
