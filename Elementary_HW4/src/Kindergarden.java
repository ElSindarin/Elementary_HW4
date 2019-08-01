public class Kindergarden implements Building {
    String type;
    public Kindergarden() {
        this.type = "детский сад";
    }

    @Override
    public String getType () {
        return type;
    }
}
