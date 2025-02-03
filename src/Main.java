import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        lesson_9_1();
        lesson_9_2();
    }
    public static void lesson_9_1() {
        String[] words = new String[]{"создать", "массив", "набором", "слов", "повторяющиеся",
                "создать", "массив", "набором", "слов", "повторяющиеся",
                "создать", "массив", "набором", "слов", "повторяющиеся",
                "создать", "массив", "набором", "слов", "повторяющиеся", "создать", "массив", "набором", "слов", "повторяющиеся",};
        System.out.print("Все слова в массиве :");
        System.out.println(Arrays.toString(words));
        System.out.print("Уникальные слова    :");
        HashSet<String> hashSet = new HashSet<>(Arrays.asList(words));
        System.out.println(hashSet.toString());
        System.out.println("Сколько раз встречается :");
        HashMap<String, Integer> wordToCount = new HashMap<>();
        for (String word : words) {
            if (!wordToCount.containsKey(word))
                wordToCount.put(word, 0);
            wordToCount.put(word, wordToCount.get(word) + 1);
        }
        for (String word : wordToCount.keySet())
            System.out.println(word + " - " + wordToCount.get(word));
    }
    public static void lesson_9_2() {
        PhoneBook phoneBook = new PhoneBook();
        int phone = 910;
        String name = "name_";
        for (int i = 0; i < 20; i++) {
            phoneBook.add("8-" + phone, name + i);
            phone += 20;
        }
        phoneBook.add("8-" + phone + "-30", "name_9");
        phoneBook.add("8-" + phone + "-40", "name_13");
        phoneBook.add("8-" + phone + "-50", "name_5");
        String[] pb0 = phoneBook.get("name_9");
        System.out.println(Arrays.toString(pb0));
        String[] pb1 = phoneBook.get("name_13");
        System.out.println(Arrays.toString(pb1));
        String[] pb2 = phoneBook.get("name_5");
        System.out.println(Arrays.toString(pb2));
        String[] pb3 = phoneBook.get("name_10");
        System.out.println(Arrays.toString(pb3));
    }
}

