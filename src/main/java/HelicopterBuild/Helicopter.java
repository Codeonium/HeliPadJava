package HelicopterBuild;

public class Helicopter {
    private String name;
    private String type;
    private Body body;
    private Blades blades;
    private Engine engine;
    private Rotor rotor;
    private Double price;
    private String colour;


    public Helicopter(String name, String type, Body body, Blades blades,Engine engine,Rotor rotor,Double price,String colour) {
        this.name = name;
        this.type = type;
        this.body = body;
        this.blades = blades;
        this.engine = engine;
        this.rotor = rotor;
        this.price = price;
        this.colour = colour;


    }

    public String getName() {
            return name;
        }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
