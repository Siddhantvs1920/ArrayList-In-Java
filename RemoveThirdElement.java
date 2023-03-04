package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RemoveThirdElement {
        public static void main(String[] args) {
            ArrayList<String> data = new ArrayList<>();
            data.add("red");
            data.add("white");
            data.add("blue");
            data.add("Black");
            data.add("Maroon");
            data.remove(2);
            System.out.println(data);
            String s=data.get(3);
            System.out.println(s);
            data.set(3,"tejas");
            System.out.println(data);
           // Collections.shuffle(data);
           // System.out.println(data);
            Collections.reverse(data);
            System.out.println(data);
           ArrayList<String> abc=new ArrayList<>(data);
            System.out.println(abc);
            //Extract protion of arraylist
            List<String> pq=data.subList(1,3);
            System.out.println(pq);
            //Compare to Arraylist
            ArrayList<String > te=new ArrayList<>();
            te.add("red");
            te.add("white");
            te.add("blue");
            te.add("Black");
            te.add("Maroon");
            System.out.println(data.equals(te));
            //Join two Arraylist
            data.addAll(te);
            System.out.println(data);




        }

}
