package learn;

import java.util.*;
public class StartCode {
    public static void main(String[] args) {
        System.out.println("Welcome to code java collection framework");
    /*
    creating Collection
    1) Type Safe - same types of elements(objects) are addeed to collection

    2)Un type Safe - different types elements can be added to collection

     */

    // Type Safe Collection
       ArrayList<String> names=new ArrayList<>();
        names.add("SHYAM");
        names.add("SITA");
        names.add("ROSHNI");
        names.add("SHYAM");
        System.out.println(names);
        //System.out.println(names.get(0));
        //System.out.println(names.get(1));
    //untype safe
    /*
    LinkedList list=new LinkedList();
    list.add("Sachin");
    list.add(101);
    list.add(54622.455);
    list.add(true);
    System.out.println(list);
    */
        names.remove(3);
        System.out.println(names);
        System.out.println("Size= "+names.size());
        System.out.println(names.contains("SHYAM"));

         Vector<String> vector=new Vector<>();
         vector.addAll(names);
        System.out.println("VECTOR"+vector);

        System.out.println("______________");

        HashSet<Double> nms=new HashSet<>();
        nms.add(14.14);
        nms.add(34.45554);
        nms.add(4754.254);
        nms.add(99.3);
        nms.add(99.3);
     System.out.println(nms);

     TreeSet<Double> treeSet=new TreeSet<>();
     treeSet.addAll(nms);
     System.out.println(treeSet);
    }
}
