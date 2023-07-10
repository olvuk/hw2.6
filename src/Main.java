import java.util.*;

public class Main {

    public static void printNotEvenArrayList(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 1) {
                System.out.print(list.get(i) + " ");
            }
        }
    }

    public static void printWordsList(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }

    public static void printEvenArrayList(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                System.out.print(list.get(i) + " ");
            }
        }
    }

    public static List<Integer> removeDuplicatesFromArrayList(List<Integer> list) {
        List<Integer> newList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (!newList.contains(list.get(i))) {
                newList.add(list.get(i));
            }
        }
        return newList;
    }

    public static List<String> removeDuplicatesFromWordsList(List<String> list) {
        List<String> newList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (!newList.contains(list.get(i))) {
                newList.add(list.get(i));
            }
        }
        return newList;
    }
    public static List<Integer> sortArrayList(List<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            int minPosition = i;
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j) < list.get(minPosition)) {
                    minPosition = j;
                }
            }
            int temp = list.get(i);
            list.set(i, list.get(minPosition));
            list.set(minPosition, temp);
        }
        return list;
    }


    public static void main(String[] args) {
        System.out.println("Задание 1");
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 8, 4, 4, 5, 5, 6, 7));
        printNotEvenArrayList(nums);
        System.out.println();
        System.out.println("Задание 2");
        List<Integer> newList = removeDuplicatesFromArrayList(nums);
        List<Integer> sortedList = sortArrayList(newList);
        printEvenArrayList(sortedList);
        System.out.println();
        System.out.println("Задание 3");
        List<String> words = new ArrayList<>(List.of("год", "паук", "паук", "паук", "год", "время", "паук"));
        List<String> newWordsList = removeDuplicatesFromWordsList(words);
        printWordsList(newWordsList);
        System.out.println();
        System.out.println("Задание 4");
        Set<String> uniqueWords = new HashSet<>(words);
        System.out.println(uniqueWords);
        for (int i = 0; i < newWordsList.size(); i++) {
            System.out.print(Collections.frequency(words, newWordsList.get(i)) + " ");
        }
    }
}