package util;

import java.util.HashSet;
import java.util.Set;

public class Utils {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }
    public int getRandomInt(){
        int randomNumber = (int) (Math.random() * 10) + 1;
        return randomNumber;
    }

    public int getRandomInt(int min, int max) {
        System.out.printf("Get a number between %d, and %d.%n", min, max);
        int randomNumber = (int) (Math.random() * max) + min;
        return randomNumber;
    }
}


