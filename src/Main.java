import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<String> cityList = new ArrayList<>(Arrays.asList("Roma", "Bari", "Catania"));
        List<String> unmodifiableList = Collections.unmodifiableList(cityList);
        unmodifiableList.add("Milano");
    }

}
