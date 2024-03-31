package MidExam;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HeroesOfCodeAndLogic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Integer> hitMap = new HashMap<>();
        Map<String, Integer> manaMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            //"{hero name} {HP} {MP}"
            String[] input = scanner.nextLine().split("\\s+");
            String name = input[0];
            int hitPoints = Integer.parseInt(input[1]);
            int manaPoints = Integer.parseInt(input[2]);
            hitMap.put(name, hitPoints);
            manaMap.put(name, manaPoints);
        }
        String command = scanner.nextLine();
        while(!command.equals("End")){
            String[] parts = command.split(" - ");
            String action = parts[0];
            String name = parts[1];
            if (action.equals("CastSpell")){
                int manaNeeded = Integer.parseInt(parts[2]);
                String spellName = parts[3];
                if (manaMap.get(name) >= manaNeeded){
                    int manaPointsLeft = manaMap.get(name)-manaNeeded;
                    System.out.printf("%s has successfully cast %s and now has %d MP!%n", name, spellName, manaPointsLeft);
                    manaMap.put(name, manaPointsLeft);
                }
                else {
                    System.out.printf("%s does not have enough MP to cast %s%n!", name, spellName);

                }
            }
            else if(action.equals("TakeDamage")){
                int damage = Integer.parseInt(parts[2]);
                int damageAmount = hitMap.get(name) - damage;
                String attacker = parts[3];
                if (damageAmount > 0){
                    hitMap.put(name, damageAmount);
                    System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n", name, damage, attacker, damageAmount);
                }
                else{
                    System.out.printf("%s has been killed by %s%n!", name, attacker);
                    manaMap.remove(name);
                    hitMap.remove(name);
                }
            }
            else if(action.equals("Recharge")){
                int amountRecovered = Integer.parseInt(parts[2]);
                int amount = manaMap.get(name)+amountRecovered;
                if (amount>200){
                    amountRecovered = amount - 200;
                    amount = 200;

                }
                manaMap.put(name, amount);
                System.out.printf("%s recharged for %d MP!%n", name, amountRecovered);
            }
            else if(action.equals("Heal")){
                int amountHealed = Integer.parseInt(parts[2]);
                int amountHitPoint = hitMap.get(name) + amountHealed;
                if (amountHitPoint>100){
                    amountHealed -=amountHitPoint -100;
                    amountHitPoint = 100;

                }
                hitMap.put(name, amountHitPoint);
                System.out.printf("%s healed for %d HP!%n", name, amountHealed);
            }
            command = scanner.nextLine();

            }
        hitMap.entrySet().forEach(entry -> {
            //entry: key(hero name) -> value (hp)
            System.out.println(entry.getKey());
            System.out.println("  HP: " + entry.getValue());
            System.out.println("  MP: " + manaMap.get(entry.getKey()));
        });
        }
    }

