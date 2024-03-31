package ExamPrep1;

import java.util.*;

public class PlantDiscovery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Integer> plantsRarity = new LinkedHashMap<>();
        Map<String, List<Double>> plantRaitings = new LinkedHashMap<>();
        for (int i = 0; i <n; i++) {
            String input = scanner.nextLine(); //"{plant}<->{rarity}"

            String plantName = input.split("<->")[0];
            int rarity = Integer.parseInt(input.split("<->")[1]);
            plantsRarity.put(plantName, rarity);
            plantRaitings.put(plantName, new ArrayList<>());
        }
        String command = scanner.nextLine();

        while(!command.equals("Exhibition")){
            String[] commandParts = command.split(": ");
            String action = commandParts[0];
            String plantName = commandParts[1].split("\\s\\-\\s")[0];
            List<Integer> plantRaiting = new ArrayList<>();
            if (plantsRarity.containsKey(plantName)) {
                switch (action) {
                    case "Rate":
                        double raiting = Double.parseDouble(commandParts[1].split("\\s\\-\\s")[1]);
                        plantRaitings.get(plantName).add(raiting);
                        break;
                    case "Update": //"Update: {plant} - {new_rarity}" –
                        // update the rarity of the plant with the new one
                        int newRarity = Integer.parseInt(commandParts[1].split("\\s\\-\\s")[1]);
                        plantsRarity.put(plantName, newRarity);
                        break;
                    case "Reset":
                        plantRaitings.get(plantName).clear();
                        break;
                }
            }
            else{
                System.out.println("error");
            }
            command = scanner.nextLine();

        }
        System.out.println("Plants for the exhibition:");
        //- {plant_name1}; Rarity: {rarity}; Rating: {average_rating}
        for (Map.Entry<String, Integer> plantRarityInfo   : plantsRarity.entrySet()) {
            String plantName = plantRarityInfo.getKey();
             int rarity = plantRarityInfo.getValue();
              List<Double> raitings = plantRaitings.get(plantName);
              double averageRaiting;
              if (raitings.isEmpty()){
                  averageRaiting = 0.00;
              }
              else {
                  averageRaiting = raitings.stream().mapToDouble(Double::doubleValue).sum() / raitings.size();
              }
            System.out.printf("- %s; Rarity: %d; Rating: %.2f%n", plantName, rarity, averageRaiting);
        }

    }
}
