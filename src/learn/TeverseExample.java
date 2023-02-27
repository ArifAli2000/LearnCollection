package learn;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;
import java.util.function.Consumer;

public class TeverseExample {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("SHYAM");
        names.add("SITA");
        names.add("ROSHNI");
        names.add("SHYAM");
        //for Each loop
        for(String str:names)
        {
            System.out.println(str + "\t"+str.length()+"\t");
            StringBuffer br=new StringBuffer(str);
            System.out.println(br.reverse());

        }
        System.out.println("_________________________");
        //traversing using ITERATOR:Forward traversing
        Iterator<String> itr=names.iterator();
        while (itr.hasNext())
        {
            String next= itr.next();
            System.out.println(next);
        }
        System.out.println("____________________________");
        //backward traversal of collection LISTITERATOR
        ListIterator<String> litr= names.listIterator(names.size());
        while (litr.hasPrevious())
        {
            String previous = litr.previous();
            System.out.println(previous);
        }
        //Enumeration
        System.out.println("______________________");

        //for each method
        names.forEach(e->{
            System.out.println(e);
        });

        System.out.println("SORTING OF ELEMENT");
        TreeSet<String> set=new TreeSet<>();
        set.addAll(names);
        set.forEach(e-> {
            System.out.println(e);
        });

    }
}
