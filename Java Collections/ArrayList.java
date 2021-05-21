/*
 -> Java ArrayList class can contain duplicate elements.
 -> Java ArrayList class maintains insertion order.
 -> Java ArrayList class is non synchronized.
 -> Java ArrayList allows random access because array works at the index basis.
 -> In ArrayList, manipulation is little bit slower than the LinkedList in Java because 
    a lot of shifting needs to occur if any element is removed from the array list.
*/

import java.util.*;

// User-defined class objects in Java ArrayList 
class Student implements Comparable<Student> {                     
    int rollno,age;
    String name;
    Student(int rollno, String name, int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return "Students [rollno = " + rollno + ", name = " + name + ", age = " +age + " ]";
    }
    // Used to compare the elements in class object
    @Override
    public int compareTo(Student o) {
        return rollno<o.rollno?1:-1;
    }
}


public class array_list {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        // Adding elements to the ArrayList using add() method
        // ArrayList can have duplicate elements
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("c");
        list.add("b");

        // get() method returns the element at the specified index

        String element = list.get(1);     // returns the 1st index element i.e, b

        // set() method changes the element, delete the existing elements

        list.set(3, "e");                 // set the element 'e' at the specified index 3

        // Using the Collections.sort() method, we can easily sort the ArrayList

        Collections.sort(list);           // Collections.sort() is used to sort the elements in the array list

        // Creation of Comparator interface's object and declaring the sort definition like decending order
        ArrayList<Integer> listint = new ArrayList<>();
        listint.add(6);
        listint.add(9);
        listint.add(20);
        listint.add(1);
        // Comparator is the Functional interface so we can implements Anonymous class
        Comparator<Integer> comp = new Comparator<Integer>(){      // Anonymous class implementation
            public int compare(Integer i, Integer j) {             // return i<j?1:-1;
                if(i<j)
                    return 1;
                else
                    return -1;    
            }
        };

        // We can reduce the above declaration by Lambda expression
        /*
        -> Firstly, we can reduce the compare() function by reducing the if..else.. by i<j?1:-1;
        -> Secondly, since we use single function so we can reduce like this

            --> Comparator<Integer> comp = new Comparator<Integer>(){
                public int compare(Integer i, Integer j) {
                    return i<j?1:-1;    
                }
            };
            --> Comparator<Integer> comp = (Integer i, Integer j) {
                return i<j?1:-1;
            };

        -> Since we use single statement in output so we reduce to

            --> Comparator<Integer> comp = (Integer i, Integer j) -> i<j?1:-1;

        -> Lastly we can remove the Integer from arguments
        
            --> Comparator<Integer> comp = (i,j) -> i<j?1:-1;

        */
        Collections.sort(listint, (i,j) -> i<j?1:-1); // By this we can directly substitute directly

        /* There are various ways to traverse the collection elements:
            1. By Iterator interface and iterator class.
            2. By for-each loop.
            3. By ListIterator interface.
            4. By for loop.
            5. By forEach() method.
            6. By forEachRemaining() method.
        */

        // 1. By Iterator interface and iterator class.
        Iterator itr = listint.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next() + " ");
        }
        System.out.println();

        // 2. By for-each loop.
        for(String str : list) {
            System.out.print(str + " ");
        }
        System.out.println();

        // 3. By ListIterator interface. 
        // This method is used to iterate in reverse order
        // ListIterator<String> litr = list.listIterator(list.size());  // size() -> length of list
        // while(list.hasPrevious()){
        //     String s = list.previous();
        //     System.out.println(s);
        // }

        // 4. By for loop.
        for(int i=0; i<list.size(); ++i){
            System.out.print(list.get(i)+ " ");
        }
        System.out.println();

        // 5. By forEach() method.
        listint.forEach(a -> {System.out.print(a + " ");});
        System.out.println();

        // 6. By forEachRemaining() method.
        Iterator<Integer> litr = listint.iterator();
        litr.forEachRemaining(a -> {System.out.print(a + " ");});
        System.out.println();


        Collections.sort(listint);
        Collections.sort(list);

        // User-defined class objects in Java ArrayList
        ArrayList<Student> stud = new ArrayList<>();
        // Method 1 : By creating objects to Student class 
        Student s1 = new Student(201, "Aakash", 21);
        Student s2 = new Student(202, "Aravind", 21);
        stud.add(s1);
        stud.add(s2);
        // Method 2 : By creating objects directly to ArrayList
        stud.add(new Student(203, "Arjun", 21));
        stud.add(new Student(204, "Ashwin", 21));
        // Sort the elements based on the rollno in decending order
        Collections.sort(stud);

        // Printing the elements of the array
        // Using toString() method in Student class
        for(Student s : stud) {
            System.out.println(s);
        }
        // Using iterator
        Iterator citr = stud.iterator();
        while(citr.hasNext()) {
            Student s = (Student)citr.next();
            System.out.println(s.rollno + " " + s.name + " " + s.age);
        }
        // Using for loop
        for(Student s :stud) {
            System.out.println(s.rollno + " " + s.age + " " + s.name);
        }

        // add() method is used to add the elements at a particular position by using index number
        list.add(3, "added new elements 1st");  
        list.add(3, "added new elements 2nd");
        for(String s : list) {
            System.out.println(s);
        }

        // addAll() method is used to all the elements in one ArrayList to another ArrayList
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("A");
        list1.add("A");
        list1.add("A");
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("B");
        list2.add("B");
        list2.add("B");

        list1.addAll(list2);            // This is used to add list2 elements to list1 at the end
        
        list1.addAll(0, list2);         // This is used to add list2 elements to list1 at the specified index
        
        for(String s : list1) {
            System.out.print(s + " ");
        }

        System.out.println();
        // remove() method is used to removing specific element from ArrayList
        // 1. By using values
        // 2. By using index

        // 1. By using values
        list1.remove("B");              // This will remove first occurrence "B" values from list1 
        // 2. By using index
        list1.remove(1);                // This will remove the value at the specified index value
        
        for(String s : list1) {
            System.out.print(s + " ");
        }
        System.out.println();

        // removeAll() method is used to remove all the elements in one list by using another list
        list1.removeAll(list2);
        
        for(String s : list1) {
            System.out.print(s + " ");
        }
        System.out.println();

        // removeIf() method is used to remove based on the condition
        list1.addAll(list2);
        list1.removeIf(str -> str.contains("A"));     // Here we use lambda expression
        
        for(String s : list1) {
            System.out.print(s + " ");
        }
        System.out.println();

        // clear() method is used to clear all the elements in a list
        // list1.clear();
        // for(String s : list1) {
        //     System.out.print(s + " ");
        // }
        // System.out.println();

        // retainAll() method is used to retain all the elements in both the list in one list
        System.out.println("retainAll() method: ");
        list1.retainAll(list2);
        for(String s : list1) {
            System.out.print(s + " ");
        }
        System.out.println();

        // isEmpty() method is used to check if the list is empty or not ti gives boolean output
        ArrayList lists = new ArrayList<>();
        System.out.println(lists.isEmpty());
        lists.add("Hai");
        System.out.println(lists.isEmpty());
    }
}
