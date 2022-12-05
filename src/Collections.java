import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collections {
    /*
     Collection framework provide interfaces and classes used to manipulate a group of objects
     It's a subclass of the Iterator Interface.
                    Iterator
        Used to traverse through a collection. Contains three useful methods that can be applied to these collections
        1. hasNext() - returns true if their exists an element in front of the iterator cursor.
        2. next() - Returns the element after the iterator cursor.
        3. remove() - Removes the element in front of the iterator cursor.
     */

    /*
        The collection interface contains other four interfaces that have classes implementation
            1.List - Can store duplicate ordered values. Contains Four classes implementation
                   1. ArrayList - Uses a dynamic array to store its elements. Maintains the insertion order of the elements and can contain duplicate values
                   2. LinkedList - Uses a double list to store its elements, maintains the insertion order and can contain duplicate values
                   3. Vector - Similar to an arrayList. Uses a dynamic array to store its elements though they are always synchronised.
                   4. Stack - It is a subclass of the vector class. Uses an array to store its elements, and it obeys the LI-FO architecture.The last element to be pushed to the
                   stack is the first t be removed
            2.Queue
            3.Set
            4.Maps
     */

    public static void main(String[] args) {

        String[] names = {"Charles", "Muvaka", "Kata", "James", "Tabitha"};
        List<String> allNames = new ArrayList<>();

        allNames.add(names[0]);
        allNames.add(names[1]);
        allNames.add(names[2]);
        allNames.add(names[3]);
        allNames.add(names[4]);

        Iterator<String> i = allNames.iterator();

        while (i.hasNext()){
            String name = i.next();
            System.out.println(name);
        }

    }
}
