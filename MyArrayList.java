package ArrayList;

import java.util.ArrayList;

public class MyArrayList extends Object {
    private int[] a = new int[3];
    int index = 0;

    public void add(int data) {
        if (index >= a.length)
            grow();
        a[index++] = data;

    }
    public void clear()
    {
        index=0;
    }
    public boolean isEmpty()
    {
        if(index<=0)
            return true;
        return false;
    }
    public void remove(int userIndex)
    {
        if (userIndex<0||userIndex>=index)
            throw new ArrayIndexOutOfBoundsException();
        for (int i=userIndex;i<index;i++)
            a[i]=a[i+1];
        index--;
    }
    public MyArrayList clone()
    {
        MyArrayList al=new MyArrayList();
        {
            for (int i=0;i<index;i++)
                al.add(a[i]);
        }
        return al;
    }
    public void set(int userindex,int data)
    {
       // if(userindex<0||userindex>index)
         //   throw ArrayIndexOutOfBoundsException();
        a[userindex]=data;
    }

    private void grow() {
        int[] b = new int[a.length * 2];
        for (int i = 0; i < a.length; i++)
            b[i] = a[i];
        a = b;

    }

    public int index(int num) {
        for (int i = 0; i < index; i++)
            if (a[i] == num)
                return i;
        return -1;

    }
    public int size()
    {
        return index;
    }

    public int lastIndex(int num)
    {
        for(int i=index-1;i>=0;i--)
            if(a[i]==num)
        return i;
        return -1;
    }
    public int get(int i)
    {
        if(i>=index||i<0)
            throw new ArrayIndexOutOfBoundsException();
        else
            return a[i];
    }
    public void addAt(int userIndex,int data)
    {
        if(index>=a.length)
            grow();
        for (int i=index;i>userIndex;i--)
            a[i]=a[i-1];
        a[userIndex]=data;
index++;
    }

    public String print() {
        String s="[";
        for (int i = 0; i < index; i++)
        {
            if (i<index-1)
                s+=a[i]+", ";

            else
                s+=a[i];
        }
        s+="]";
        return s;
    }

}
