public class Fruit {
    private String name;
    private String colour;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Fruit " +
                "name: " + name + '\n' +
                name + " is " + colour + ' ' +
                ' ';
    }
}
