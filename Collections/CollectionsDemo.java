import java.util.*;

public class CollectionsDemo {

    public static void main(String[] args) {
        // ArrayList. Duplicates allowed.
        List a1 = new ArrayList();
        a1.add("John");
        a1.add("Mary");
        a1.add("Neo");
        System.out.println(" ArrayList Elements");
        System.out.print("\t" + a1);

        // LinkedList. Duplicates allowed.
        List l1 = new LinkedList();
        l1.add("John");
        l1.add("Mary");
        l1.add("Neo");
        System.out.println();
        System.out.println(" LinkedList Elements");
        System.out.print("\t" + l1);

        // HashSet. Cannot contain duplicates.
        Set s1 = new HashSet();
        s1.add("John");
        s1.add("Mary");
        s1.add("Neo");
        s1.add("John");
        System.out.println();
        System.out.println(" Set Elements");
        System.out.println("\t" + s1);
        System.out.println("Contains 'Mary'? " + s1.contains("Mary"));

        // HashMap. Has unique "keys".
        Map m1 = new HashMap();
        m1.put("John", "8");
        m1.put("Mary", "31");
        m1.put("Neo", "12");
        m1.put("Trinity", "14");
        m1.put("John", "28");
        System.out.println();
        System.out.println(" Map Elements");
        System.out.print("\t" + m1);

        // More.
        // Add as 2nd element in ArrayList
        a1.add(1, "Trinity"); // Elements start at 0. So "1" is the 2nd element.
        System.out.println();
        System.out.println(" ArrayList Elements");
        System.out.println("\t" + a1);

        System.out.println("a1[2] = " + a1.get(2));

        SetDemo();

        // Map values.
        System.out.println();
        System.out.println(" Map Elements");
        System.out.println("\t" + m1);
        System.out.println("Map values are...");
        System.out.println(m1.values());

        IteratorDemo();
    }

    public static void SetDemo() {
        System.out.println("The Set Interface...");
        int count[] = { 34, 22, 10, 60, 30, 22 };
        Set<Integer> set = new HashSet<Integer>();
        try {
            for (int i = 0; i < 5; i++) {
                set.add(count[i]);
            }
            System.out.println(set);

            TreeSet sortedSet = new TreeSet<Integer>(set);
            System.out.println("The sorted list is:");
            System.out.println(sortedSet);

            System.out.println("There are " + set.size() + " elements in the Set");
            System.out.println("The First element of the set is: " + (Integer) sortedSet.first());
            System.out.println("The last element of the set is: " + (Integer) sortedSet.last());
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }
    }

    public static void IteratorDemo() {
        System.out.println("Iterator Demo...");
        // Create an array list
        ArrayList al = new ArrayList();

        // add elements to the array list
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");

        // Use iterator to display contents of al
        System.out.print("Original contents of al: ");
        Iterator itr = al.iterator();

        while (itr.hasNext()) {
            Object element = itr.next();
            System.out.print(element + " ");
        }
        System.out.println();

        // Modify objects being iterated
        ListIterator litr = al.listIterator();

        while (litr.hasNext()) {
            Object element = litr.next();
            litr.set(element + "+");
        }
        System.out.print("Modified contents of al: ");
        itr = al.iterator();

        while (itr.hasNext()) {
            Object element = itr.next();
            System.out.print(element + " ");
        }
        System.out.println();

        // Now, display the list backwards
        System.out.print("Modified list backwards: ");

        while (litr.hasPrevious()) {
            Object element = litr.previous();
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
