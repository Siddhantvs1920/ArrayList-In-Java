package ArrayList;


import java.util.ArrayList;

public class User {
    public static void main(String[] args) {
        MyArrayList al=new MyArrayList();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
        al.add(40);
        al.add(70);
        // Implementation of Arraylist methods
        //print method
       al.set(3,100);
       String t= al.print();
        System.out.println(t);
        //index method
        int ind=al.index(70);
        System.out.println(ind);
        //get element method
        int ele=al.get(5);
        System.out.println(ele);
        //last index of methd
        int last=al.lastIndex(40);
        System.out.println(last);
        //size of index
        int size=al.size();
        System.out.println(size);
        //remove method
        al.remove(4);
        String d= al.print();
        System.out.println(d);
        //is empty
        boolean isEmpty=al.isEmpty();
        System.out.println(isEmpty);
        // clear
       /* al.clear();
        String k= al.print();
        System.out.println(k);*/
        //Add At
        al.addAt(2,100);
        String pr= al.print();
        System.out.println(pr);
        //clone method meand copy arraylist
        MyArrayList al2=al.clone();
        System.out.println(pr);







    }
}
