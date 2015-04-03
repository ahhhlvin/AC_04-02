package nyc.c4q.ahhhlvin;
/**
 * Created by alvin2 on 4/2/15.
 * Alvin Kuang
 * C4Q Access Code 2.1
 */

import java.util.HashSet;


public class FriendNetwork
{
        public static void main(String[] args) {
            HashSet<String> yours = new HashSet();
            yours.add("Yelena");
            yours.add("Jamal");
            yours.add("Eve");
            HashSet<String> mine = new HashSet();
            mine.add("Sebastain");
            mine.add("Mala");
            mine.add("Eve");


            // You should be able to run all of these in a row:
            System.out.println( allFriends(yours, mine) );
            System.out.println( mutualFriends(yours, mine) );
            System.out.println( justYourFriends(yours, mine) );
            System.out.println( justMyFriends(yours, mine) );
            System.out.println( exclusiveFriends(yours, mine) );
            System.out.println( yourFriendsAreMine(yours, mine) );
            System.out.println( youHaveFriends(yours) );
            System.out.println( matchmaker(yours, mine) );
        }


public static HashSet<String> allFriends(HashSet<String> yours, HashSet<String> mine) {
    HashSet<String> all = new HashSet<String>();
    all.addAll(yours);
    all.addAll(mine);

    return all;
    }


public static HashSet<String> mutualFriends(HashSet<String> yours, HashSet<String> mine)
{
    HashSet<String> mutual = new HashSet<String>();

       for (String name : mine) {
        if(yours.contains(name))
        {
            mutual.add(name);
        } else {
            continue;
        }
    }

    return mutual;
}
        // Eve

public static HashSet<String> justYourFriends(HashSet<String> yours, HashSet<String> mine) {

    HashSet<String> justYour = new HashSet<String>();

    justYour.addAll(yours);
    justYour.addAll(mine);

    justYour.removeAll(mine);

    return justYour;
        // Yelena, Jamal
    }

public static HashSet<String> justMyFriends(HashSet<String> yours, HashSet<String> mine) {

    HashSet<String> justMine = new HashSet<String>();

    justMine.addAll(yours);
    justMine.addAll(mine);

    justMine.removeAll(yours);

    return justMine;
        // Sebastian, Mala
    }


public static HashSet<String> exclusiveFriends(HashSet<String> yours, HashSet<String> mine) {

    HashSet<String> exclusive = new HashSet<String>();

    exclusive.addAll(yours);
    exclusive.addAll(mine);

    for (String name : mine) {
        if(yours.contains(name))
        {
            exclusive.remove(name);
        } else {
        continue;
            }
    }


    return exclusive;
        // Yelena, Jamal, Sebastian, Mala
    }


public static boolean yourFriendsAreMine(HashSet<String> yours, HashSet<String> mine)
{


    if(yours.equals(mine))
    {
        return true;
    }
    else
    {
        return false;
    }
    // true if all your friends are also my friends

}



public static boolean youHaveFriends(HashSet<String> yours) {

    if (!yours.isEmpty())
    {
        return true;
    } else {
        return false;
    }

    // true if you have any friends

}



public static HashSet<HashSet<String>> matchmaker(HashSet<String> yours, HashSet<String> mine) {
        // should return these sets:
        // Sebastian, Jamal
        // Jamal, Mala
        // Jamal, Eve
        // Sebastian, Yelena
        // Yelena, Mala
        // Yelena, Eve
        // Sebastian, Eve
        // Mala, Eve

    HashSet<HashSet <String>> pairs = new HashSet<HashSet <String>>();

    for (String name : yours) {
        for (String name2 : mine) {
            HashSet<String> pair = new HashSet<String>();
            pair.add(name);
            pair.add(name2);

            if (pair.size() != 1) {
                pairs.add(pair);
            }


        }
    }


    return pairs;


}
    }


