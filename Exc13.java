package Exc13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Exc13
{
    public static void main(String[] args)
    {
        Map<String, Integer> map = new HashMap<>();
        map.put("Peter", 10);
        map.put("Søren", 5);
        map.put("Henrik", 10);
        System.out.println(isUnique(map));

    }
    private static boolean isUnique (Map<String, Integer> map)
    {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.addAll(map.values());
        Map<Integer, Integer> map1 = new HashMap<>();
        for (Integer i:list1)
        {
            map1.put(i, 0);
        }
        for (Integer i:list1)
        {
            map1.put(i, map1.get(i) +1);
        }
        list1.clear();
        list1.addAll(map1.values());
        for (Integer i:list1)
        {
            if (i >= 2)
            {
                return false;
            }
        }
        return true;
    }
}
