package ObjectAndClasses.AdvertisementMessage;

import ObjectsAndClasses.Lab.problem1.RandomTextShuffler;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> phrasesList = new ArrayList<>(List.of("Excellent product.",
                "Such a great product.",
                "I always use that product.",
                "Best product of its category.",
                "Exceptional product.",
                "I can’t live without this product."));
        List<String> eventsList =new ArrayList<>(List.of("Now I feel good.",
                "I have succeeded with this product.",
                "Makes miracles. I am happy of the results!",
                "I cannot believe but now I feel awesome.",
                "Try it yourself, I am very satisfied.",
                "I feel great!"));
        List<String> authorsList = new ArrayList<>(List.of("Diana",
                "Petya",
                "Stella",
                "Elena",
                "Katya",
                "Iva",
                "Annie",
                "Eva"));
        List<String> citiesList = new ArrayList<>(List.of("Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"));
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <n ; i++) {

            String randomPhrase = getRandomString(phrasesList);
            String randomAuthor = getRandomString(authorsList);
            String randomCity = getRandomString(citiesList);
            String randomEvent = getRandomString(eventsList);
            AdvertisementMessage advertisementMessage = new AdvertisementMessage(randomPhrase, randomEvent, randomAuthor, randomCity);
            System.out.printf("%s %s %s – %s%n", advertisementMessage.getPhrase(randomPhrase), advertisementMessage.getEvent(randomEvent), advertisementMessage.getAuthor(randomAuthor), advertisementMessage.getCity(randomCity));
        }
    }
    private static String getRandomString(List<String> strings) {
        if (strings == null || strings.isEmpty()) {
            throw new IllegalArgumentException("The list of strings is empty or null.");
        }

        Random random = new Random();
        int randomIndex = random.nextInt(strings.size());

        return strings.get(randomIndex);
    }
}


