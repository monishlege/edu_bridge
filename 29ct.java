package mentallll;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class sep06 {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        fruits.add("Elderberry");

        System.out.println("Original List: " + fruits);

        fruits.remove("Banana");
        System.out.println("After removing 'Banana': " + fruits);

        fruits.remove(0);
        System.out.println("After removing index 0: " + fruits);

        fruits.removeIf(fruit -> fruit.startsWith("D"));
        System.out.println("After removeIf (starts with 'D'): " + fruits);

        fruits.clear();
        fruits.add("Apple");
        fruits.add("Apricot");
        fruits.add("Cherry");

        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            if (fruit.startsWith("A")) {
                iterator.remove();
            }
        }

        System.out.println("Final List after Iterator removal: " + fruits);
    }
}
