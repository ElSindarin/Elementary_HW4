public class Main {

    public static void main(String[] args) {
        Country country = initCountry("Океания");
        describeCountry(country);
        declareBuildings();
        performBuilding(country, 1, 2,1);
        performBuilding(country, 1, 3,4);
        performBuilding(country, 5, 1,2);
        performBuilding(country, 5, 2,1);
        performBuilding(country, 5, 2,2);
        performBuilding(country, 5, 2,3);
        performBuilding(country, 5, 2,4);
        describeCountry(country);
    }

    public static Country initCountry(String name) {
        Country country = new Country();
        country.setName(name);
        for (int i = 0; i < 5; i++) {
            country.createCity();
        }
        return country;
    }

    public static void describeCountry(Country country) {
        System.out.println("Описание страны " + country.getName());
        for (int i = 0; i < country.getCities().size(); i++) {
            City city = country.getCities().get(i);
            System.out.println((i + 1) + ". " + city.getName());
            for (int j = 0; j < city.getStreets().size(); j++) {
                Street street = city.getStreets().get(j);
                System.out.println((i + 1) + "." + (j + 1) + ". " + street.getName());
                if (street.getBuildings().size() == 0) {
                    System.out.println("На данной улице строений не обнаружено");
                } else {
                    System.out.print("Найдены следующие строения: ");
                    for (int k = 0; k < street.getBuildings().size(); k++) {
                        Building building = street.getBuildings().get(k);
                        System.out.print((k + 1) + ". " + building.getType() + " ");
                    }
                }
                System.out.println();
            }
        }
        System.out.println();
    }

    public static void performBuilding (Country country, int cityNumber, int streetNumber, int buildingIndex ) {
        City city = country.getCities().get(cityNumber - 1);
        Street street = city.getStreets().get(streetNumber - 1);
        Builder builders = country.getCities().get(cityNumber - 1).getBuilders();
        Building building = null; // полиморфизм
        selectBuildingIndex: while (building == null ) {
            switch (buildingIndex) {
                case 1: {
                    building = new House();
                    break;
                }
                case 2: {
                    building = new School();
                    break;
                }
                case 3: {
                    building = new Kindergarden();
                    break;
                }
                case 4: {
                    building = new Shop();
                    break;
                }
                default: {
                    System.out.println("Указанного индекса не существует. Введите правильный");
                    continue selectBuildingIndex;
                }
            }
        }
        builders.build(city, street, building);
    }

    public static void declareBuildings () {
        System.out.println("Для строительства различных типов зданий придерживайтесь следующей системы индексов");
        System.out.println("1 - Жилой дом");
        System.out.println("2 - Школа");
        System.out.println("3 - Детский сад");
        System.out.println("4 - Магазин");
    }
}
