import java.util.Stack;

public class StackCollection {
    /*
                    Stack
       - This is an implementation of the list interface and a subclass of the Vector Class
       - It uses an array internally to store objects and supports the LI-Fo architecture(Las it first out)
                Methods involved in a stack
       - pop() - removes and returns the object on top of the stack
       - peak() - returns the element on top of the stack without removing it.
       - push() - adds an item on op of the stack..
     */

    public static void main(String[] args) {
        String[] names = {"Charles", "Muvaka", "Kata", "James", "Tabitha"};

        Stack<String> allNames = new Stack<>();
        allNames.push(names[0]);

        System.out.println(allNames.peek());


    }
}
