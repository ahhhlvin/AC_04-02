package nyc.c4q.ahhhlvin;
import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by alvin2 on 4/2/15.
 * Alvin Kuang
 * C4Q Access Code 2.1
 */
public class cloningAndKeySet
{
    public static void main(String[] args) {
        HashSet<Integer> odd = new HashSet<Integer>();
        odd.add(1);
        odd.add(3);

        HashSet<Integer> newOdd = new HashSet<Integer>(odd);
        System.out.println(odd == newOdd);
        System.out.println(odd.equals(newOdd));


        //KEYSET


        HashMap<String, Integer> fruitCount = new HashMap<String, Integer>();
        fruitCount.put("bananas", 3);
        fruitCount.put("apples", 99);

        for (Integer fruitLine : fruitCount.values()) {
            //  'fruitCount.values()' prints out the value column
            System.out.println(fruitLine);
        }

        for (String fruit : fruitCount.keySet()) {
            //  'fruitCount.values()' prints out the value column
            System.out.println(fruit);
        }

    }




}
