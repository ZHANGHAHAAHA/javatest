package day_02_04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestDemo {
    public static int firstUniqChar2(String s) {
        //leetcode
        for (int i = 0; i < s.length(); i++) {
            //从头开始 拿到当前字符对应的前序下标和后序下标 如果是重复字符则下标不相等  若下标相等则说明只有这一个字符
            if (s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(firstUniqChar2(s));
    }
    /**
     *给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。 */
    public static int firstUniqChar(String s) {
        //
        Map<Character, Integer> findFirstChar = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); ++i) {
            char ch = s.charAt(i);
            int ret =findFirstChar.getOrDefault(ch, 0);
            findFirstChar.put(ch,ret+1);
        }
        for (int i = 0; i < s.length(); ++i) {
            if (findFirstChar.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main3(String[] args) {
        String s = "hanghaohua";
        System.out.println(s.charAt(1));
        System.out.println(s.lastIndexOf("a"));
        System.out.println(firstUniqChar2(s));
    }
//    public int[] intersection(int[] nums1, int[] nums2) {
//        List<Integer> list = new ArrayList<>();
//        for (int i = 0; i <nums1.length ; i++) {
//            for (int j = 0; j <nums2.length ; j++) {
//                if (nums1[i]==nums2[j]){
//                    list.add(nums2[j]);
//                }
//            }
//            int [] nums3 ;
//            for (int j = 0; j <list.size() ; j++) {
////                nums3[j] = list.get()
//            }
//
//        }
//    }
    public static void main2(String[] args) {
        int[] nums1 = {1,5,3};
        int[] nums2 = {3,3};
    }
    public static  boolean isIsomorphic(String s, String t) {
        char[] chars = s.toCharArray();
        char[] chart = t.toCharArray();
        int[] Ss = new int[256];
        int[] Tt = new int[256];
        for (int i = 0; i < chars.length; i++) {
            if (Ss[chars[i]] != Tt[chart[i]]) {
                return false;
            }
            Ss[chars[i]] = i + 1;
            Tt[chart[i]] = i + 1;
        }
        return true;
    }
    public static void main1(String[] args) {
        String s1 = "add";
        String s2 = "egg";
        System.out.println(isIsomorphic(s1, s2));
    }
}
