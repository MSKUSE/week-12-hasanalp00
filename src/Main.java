import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        StackLinkedList<Number> stack=new StackLinkedList<>();
        stack.push(12);
        stack.push(13);
        stack.push(12.1);
        stack.peek();
        stack.displayStack();


        /*
        StackLinkedList stack=new StackLinkedList();
        try {
            stack.pop();
        }catch(Exception e){
            System.out.println(e);
        }
        ArrayList<Object> stringArrayList=new ArrayList<>();
        stringArrayList.add("123");
        System.out.println(stringArrayList);
        HashMap<String,Double> grades=new HashMap<>();
        grades.put("hasan",90.0);
        System.out.println(grades);
        grades.put("hasan",30.0);
        System.out.println(grades);
        System.out.println(grades.keySet() instanceof Set);
        System.out.println(grades.keySet() instanceof Object);
        System.out.println(grades.getClass());
        */
        /*
        Stack stack = new StackLinkedList();
        stack.push("This is a string");
        stack.push(5);
        stack.peek();
        System.out.println("Is empty "
        +stack.isEmpty() );
        System.out.println("Pop = " +
                stack.pop());
        stack.peek();
         */
    }
}