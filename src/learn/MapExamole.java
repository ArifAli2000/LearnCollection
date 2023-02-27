package learn;

import javax.swing.*;
import java.util.HashMap;

public class MapExamole {
    public static void main(String[] args) {
        HashMap<String,Integer> courses=new HashMap<>();
        //adding element
        courses.put("core java",4000);
        courses.put("Basic Python",3500);
        courses.put("Spring",8000);
        courses.put("Android",6000);
        courses.put("Android",4000);

        System.out.println(courses);

        courses.forEach((e1,e2)->{
            System.out.println(e1+"->"+e2);
        });

        System.out.println(courses.get("core java"));
    }
}
