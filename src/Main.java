import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<String> immutableList = appendOne(Arrays.asList("Catania", "Roma", "Bari"), "Milano");
        try {
            immutableList.set(1, "Tegucigalpa");
        }catch (Exception e){
            System.out.println("Cannot change item of an immutable list");
        }
        System.out.println(immutableList);

        List <String> kingsOfRome = new ArrayList<>();
        kingsOfRome.addAll(Arrays.asList("Romulus", "Numa Pompilius", "Tullus Hostilius", "Ancus Marcius", "Lucius Taquinius", "Servius Tullius", "Lucius Superbus"));
        System.out.println(kingsOfRome);
        String[] kingsOfRomeArray = kingsOfRome.toArray(new String[0]);

    }

    public static List<String> appendOne(List<String> listCity, String newCity){
        List<String> immutableList = new ArrayList<>(listCity);
        immutableList.add(newCity);
        return Collections.unmodifiableList(immutableList);
    }
}
