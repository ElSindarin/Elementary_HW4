public class House implements Building {
    String type;
    public House() {
        this.type = "жилой дом";
    }

    @Override
    public String getType () {
        return type;
    }
}
