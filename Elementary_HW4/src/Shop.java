public class Shop implements Building {
    String type;
    public Shop() {
        this.type = "магазин";
    }

    @Override
    public String getType () {
        return type;
    }
}
