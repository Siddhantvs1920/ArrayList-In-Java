package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class SortArraylist
{
        public static void main(String[] args) {
            ArrayList<String> obj = new ArrayList<>();
            obj.add("red");
            obj.add("white");
            obj.add("blue");
            Collections.sort(obj);
            System.out.println(obj);
        }
}
