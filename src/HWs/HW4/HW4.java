package HWs.HW4;

import java.util.*;

public class HW4 {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>(Arrays.asList(
                "Январь", "Февраль", "Март", "Апрель", "Май", "Июнь", "Июль", "Август", "Сентябрь", "Октябрь",
                "Ноябрь", "Декабрь", "Март", "Март", "Январь", "Июнь", "Август"
        ));
        printWithoutDuplicates(stringList);
        countDuplicates(stringList);
        phonebook();
    }

    public static void printWithoutDuplicates(List<String> input) {
        Set<String> inputSet = new HashSet<>(input);
        System.out.println(inputSet);
     }

     public static void countDuplicates(List<String> input) {
        Set<String> inputSet = new HashSet<>(input);
        for (String word: inputSet) {
            int count = 0;
            for (String inner : input) {
                if (word.equals(inner)) {
                    count++;
                }
            }
            System.out.printf("%s: %d\n", word, count);
        }
     }

     public static void phonebook() {
        PhoneNo.add("Vasya", "+1234567890");
        PhoneNo.add("Vanya", "+1234567891");
        PhoneNo.add("Venya", "+1234567892");
        PhoneNo.add("Vanya", "+1234567893");
        PhoneNo.add("Varya", "+1234567894");
        PhoneNo.add("Valya", "+1234567895");

        PhoneNo.get("Vanya");
        PhoneNo.get("Vasya");


     }
}
