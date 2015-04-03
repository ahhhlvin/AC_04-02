package nyc.c4q.ahhhlvin;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        HashSet<Integer> odd = new HashSet<Integer>();
        odd.add(1);
        odd.add(3);
        odd.add(3); // add '3' again, however, it only shows up ONCE in the HashSet
        odd.add(5);
        odd.remove(5);

        for (Integer num : odd) {
            System.out.println(num);
        }


        HashSet<Integer> even = new HashSet<Integer>();
        even.add(2);
        even.add(4);
        even.add(4);
        even.add(6);


        // for each number within 'odd' HashSet, I add it to the 'even' HashSet!
        for (Integer number : odd) {
            even.add(number);
        }


        even.addAll(odd); // combines HashSets together [does same as above!]
        even.removeAll(odd);
        // even - odd

        System.out.println(even);


    }
}
