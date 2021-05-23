/*
 -> Java LinkedList class uses a doubly linked list to store the elements. 
 -> It provides a linked-list data structure.
 -> Java LinkedList class can contain duplicate elements.
 -> Java LinkedList class maintains insertion order.
 -> Java LinkedList class is non synchronized.
 -> In Java LinkedList class, manipulation is fast because no shifting needs to occur.
 -> Java LinkedList class can be used as a list, stack or queue.
*/

import java.util.*;

class students {
    int id,age;
    String name;
    public students(int id,String name,int age) {
        this.id=id;
        this.name=name;
        this.age=age;
    }
}

public class LinkedListClass {
    public static void main(String[] args) {

        // Declaration of LinkedList
        LinkedList<String> list = new LinkedList<>();

        // Adding a new element to the linked list
        // LinkedList can have duplicate elements
        list.add("Hari");
        list.add("Charan");
        list.add("Anuj");
        list.add("Hari");

        // Adding an element at the specific position  
        list.add(1, "Gaurav"); 

        // Adding a one list element to another list at last
        LinkedList<String> li = new LinkedList<>();
        li.add("Ashwin");
        li.add("Balaji");

        // Adding second list elements to the first list
        list.addAll(li);                            // addAll() 

        // Adding second list elements to the first list at specific position
        list.addAll(2,li);

        // Adding an element at the first position  
        list.addFirst("Lokesh");                    // addFirst() is used to add element in first

        // Adding an element at the last position  
        list.addLast("Harsh");                      // addLast() is used to add element in last

        // Removing specific element from list  
        list.remove("Hari");                        // remove() the passed element in first occurrence

        // Removing element on the basis of specific position
        list.remove(5);                     
        
        // Removing all the new elements from list
        list.removeAll(li);                         // removeAll() remove the elements of one list using another list

        // Removing first element from list
        list.removeFirst();

        // Removing last element from list
        list.removeLast();

        // Removing first occurrence of element from the list  
        list.add("Gaurav");
        list.removeFirstOccurrence("Gaurav"); 

        // Removing last occurrence of element from the list
        list.add("Gaurav");
        list.add("Ashwin");
        list.add("Gaurav");
        list.add("Gaurav");
        list.add("Balaji");
        list.add("Gaurav");
        list.removeLastOccurrence("Gaurav");

        // Removing all the elements available in the list       
        // list.clear();

        // Reversing the elements in the list
        // Iterator itr = list.descendingIterator();
        // while(itr.hasNext()) {
        //     System.out.println(itr.next());
        // }

        // Sorting the elements in the list
        Collections.sort(list);

        // Sorting in the elements in descending order
        // For this first we want sort using Collections.sort() 
        // Then use decendingIterator()
        Iterator itr = list.descendingIterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println();

        //  Getting size of the LinkedList
        int length = list.size();
        System.out.println();

        // Converting list to array
        String[] arr = list.toArray(new String[list.size()]);    // String[] arr = list.toArray(new String[list.size()]);
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        LinkedList<String> arrlist = new LinkedList<>();
        for(String s:arr) {
            arrlist.add(s);
        }

        // Iterator<String> itr = list.iterator();
        // while (itr.hasNext()) {
        //     System.out.println(itr.next());
        // }
        // System.out.println();
        // for(String s : list) {
        //     System.out.println(s);
        // }
        System.out.println();
    
        students stu = new students(25,"Hari",21);
        LinkedList<students> liststu = new LinkedList<students>();
        liststu.add(stu);
        liststu.add(new students(21,"Keethi",21));
        for(students s : liststu) {
            System.out.println(s.age + " "+ s.name + " " + s.age);
        }
    }
}