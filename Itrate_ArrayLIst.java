package ArrayList;

import java.util.ArrayList;

public class Itrate_ArrayLIst {
    public static void main(String[] args) {
        ArrayList<String> data= new ArrayList<>();
        data.add("red");
        data.add("white");
        data.add("blue");
        //Print Arraylist
        System.out.println(data);
        //Itrate by for loop
        System.out.println("Itrate by for loop");
        for (int i=0;i< data.size();i++)
            System.out.println(data.get(i));
        //Itrate by while loop
        System.out.println("Itrate by while loop");

        int i=0;
        while (i< data.size())
        {
            System.out.println(data.get(i));
            i++;
        }
        //Advanced for loop
        System.out.println("Advanced/ enhance for loop");
        for (String obj:data)
            System.out.println(obj);
    }
}
