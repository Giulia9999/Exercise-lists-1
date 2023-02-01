import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<String> unmutableList = appendOne(Arrays.asList("Catania", "Roma", "Bari"), "Milano");
        System.out.println(unmutableList);

    }

    public static List<String> appendOne(List<String> listCity, String newCity){
        List<String> unmutableList = new ArrayList<>(listCity);
        unmutableList.add(newCity);
        return Collections.unmodifiableList(unmutableList);
    }
}
