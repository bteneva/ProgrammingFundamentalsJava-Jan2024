package ExamPrep1;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Pirates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, Integer> cityPopulation = new LinkedHashMap<>();
        Map<String, Integer> cityGold = new LinkedHashMap<>();

        while (!input.equals("Sail")){
            String[] inputArray = input.split("\\|\\|");
            String cityName = inputArray[0];
            int cityPop = Integer.parseInt(inputArray[1]);
            int cityKgGold = Integer.parseInt(inputArray[2]);
            if (cityPopulation.containsKey(cityName)){
                cityPop = cityPopulation.get(cityName) + cityPop;
                cityKgGold = cityGold.get(cityName) + cityKgGold;
            }
            cityPopulation.put(cityName, cityPop);
            cityGold.put(cityName, cityKgGold);

            input = scanner.nextLine();
        }
        String actionString = scanner.nextLine();
        while (!actionString.equals("End")){
            String[] actionArray = actionString.split("=>");
            String action = actionArray[0];
            String town = actionArray[1];

            if (action.equals("Plunder")){
                int goldStolen = Integer.parseInt(actionArray[3]);
                int peopleKilled = Integer.parseInt(actionArray[2]);
                System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n", town, goldStolen, peopleKilled);
                int peopleLeft = cityPopulation.get(town) - peopleKilled;
                int goldLeft = cityGold.get(town) - goldStolen;
                if (peopleLeft <= 0 || goldLeft <= 0) {
                    System.out.printf("%s has been wiped off the map!%n", town);
                    cityGold.remove(town);
                    cityPopulation.remove(town);
                }
                else {
                    cityPopulation.put(town, peopleLeft);
                    cityGold.put(town, goldLeft);
                }

            }
            else if(action.equals("Prosper")){
                int goldAdded = Integer.parseInt(actionArray[2]);
                if (goldAdded > 0){
                    int totalGold = cityGold.get(town) + goldAdded;
                    cityGold.put(town, totalGold);
                    System.out.printf("%d gold added to the city treasury. %s now has %d gold.%n", goldAdded, town, totalGold);

                }
                else{
                    System.out.printf("Gold added cannot be a negative number!%n");
                }

            }

            actionString = scanner.nextLine();
        }
        System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:%n", cityGold.size());
        cityPopulation.entrySet().forEach(entry ->{
            System.out.printf("%s -> Population: %d citizens, Gold: %d kg%n", entry.getKey(), entry.getValue(), cityGold.get(entry.getKey()));

        });

    }
}
