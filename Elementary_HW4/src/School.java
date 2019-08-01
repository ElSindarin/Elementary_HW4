public class School implements Building {
    String type;
    public School() {
        this.type = "школа";
    }

    @Override
    public String getType () {
        return type;
    }
}
