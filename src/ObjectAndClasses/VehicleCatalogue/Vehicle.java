package ObjectAndClasses.VehicleCatalogue;

public class Vehicle {
    private String type;
    private String model;
    private String color;
    private int horsePower;

    public Vehicle(String type, String model, String color, int horsePower) {
        this.type = capitalizeFirstLetter(type);
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
    }

    public String getType() {
        return this.type;
    }

    public String getModel() {
        return this.model;
    }

    public String getColor() {
        return this.color;
    }

    public int getHorsePower() {
        return this.horsePower;
    }

    public static String capitalizeFirstLetter(String type) {
        if (type == null || type.isEmpty()) {
            return type; // return the type string if it's null or empty
        }

        // Capitalize the first letter and append the rest of the string
        return Character.toUpperCase(type.charAt(0)) + type.substring(1);
    }
}

