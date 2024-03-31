package ObjectAndClasses.VehicleCatalogue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        List<Vehicle> vehicleList = new ArrayList<>();
        while (!command.equals("End")) {
            String type = command.split(" ")[0];
            String model = command.split(" ")[1];
            String color = command.split(" ")[2];
            int horsePower = Integer.parseInt(command.split(" ")[3]);
            Vehicle vehicle = new Vehicle(type, model, color, horsePower);
            vehicleList.add(vehicle);
            command = scanner.nextLine();
        }

        command = scanner.nextLine();
        while (!command.equals("Close the Catalogue")){
            for (Vehicle vehicle : vehicleList) {
                if(vehicle.getModel().equals(command)){
                    System.out.printf("Type: %s%nModel: %s%nColor: %s%nHorsepower: %s%n", vehicle.getType(),
                            vehicle.getModel(), vehicle.getColor(), vehicle.getHorsePower());
                }
            }
            command = scanner.nextLine();

        }
        int carsHorsePowerSum = 0;
        int trucksHorsePowerSum = 0;
        int carsCount = 0;
        int trucksCount = 0;

        for (Vehicle vehicle : vehicleList) {
            if (vehicle.getType().equals("Car")) {
                carsHorsePowerSum += vehicle.getHorsePower();
                carsCount++;
            } else if (vehicle.getType().equals("Truck")) {
                trucksHorsePowerSum += vehicle.getHorsePower();
                trucksCount++;
            }
        }

        double averageHorsePowerCars = (carsCount > 0) ? (double) carsHorsePowerSum / carsCount : 0;
        double averageHorsePowerTrucks = (trucksCount > 0) ? (double) trucksHorsePowerSum / trucksCount : 0;

        System.out.printf("Cars have average horsepower of: %.2f.%n", averageHorsePowerCars);
        System.out.printf("Trucks have average horsepower of: %.2f.%n", averageHorsePowerTrucks);
    }
}

