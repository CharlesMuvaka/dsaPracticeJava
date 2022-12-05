import java.util.*;

public class Collections {
    /*
     Collection framework provide interfaces and classes used to manipulate a group of objects
     It's a subclass of the Iterator Interface.
                    Iterator
        Used to traverse through a collection. Contains three useful methods that can be applied to these collections
        1. hasNext() - returns true if their exists an element in front of the iterator cursor.
        2. next() - Returns the element after the iterator cursor.
        3. remove() - Removes the element in front of the iterator cursor.
                    ListIterator
         List iterator has the ability to traverse in both directions while an iterator only traverses in the forward direction.
         Note the iterator interface can traverse through the entire java collections since the collection interface inherits from it.
         A list iterator on the other hand can only traverse through the list interface. It contains additional methods such as
            1. hasPrevious() - returns true if there is an element before the cursor of the iterator.
            2. previous() - returns the last element before the cursor of the iterator.
            3.nextIndex() - returns the index of the element after the iterator cursor.
            4. previousIndex() -returns the index of the element before the cursor while traversing
            5. set() - Used to replace the last element of the list. Depends on the usage though..

            NOTE: iterator interface can only remove an element while the listIterator can both remove and add an element.
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
        List<String> linkedNames = new LinkedList<>(); //Doesn't require a capacity initializer.

        /*
            Note linked list are fast in data manipulation, addition and deletion since they use double lists in storing elements.
            The arrayList uses a dynamic array to store elements therefore shifting of elements occurs as you try to remove or add an element
         */

        linkedNames.add(names[0]);
        linkedNames.add(names[1]);
        linkedNames.add(names[2]);
        linkedNames.add(names[3]);
        linkedNames.add(names[4]);

        ListIterator<String> l = linkedNames.listIterator();
        if (l.hasNext()){
            String name  = l.next();
            System.out.println(l.nextIndex());
            System.out.println(name);
        }
        l.set("Kalekye");

        for (int i = 0; i < linkedNames.size(); i++) {
            System.out.println(linkedNames.get(i));

        }

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

        Stack<String> myNames = new Stack<>();
        myNames.add(names[0]);
        myNames.add(names[1]);

        ListIterator<String> stackIterator = myNames.listIterator();
        if (stackIterator.hasNext()){
            myNames.push(names[2]);// push methods adds an element on top of the stack
        }

        for (String name: myNames) {
            System.out.println(name);
        }

        String lastName = myNames.pop(); //pop method removes the last item in the stack
        System.out.println(lastName);
    }
}
