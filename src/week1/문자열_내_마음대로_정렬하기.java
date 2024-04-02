package week1;

import java.util.Arrays;
import java.util.Comparator;

public class 문자열_내_마음대로_정렬하기 {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings, Comparator.comparing((String it) -> it.charAt(n)).thenComparing((String it) -> it));
        return strings;
    }

    public static void main(String[] args) {
        문자열_내_마음대로_정렬하기 p = new 문자열_내_마음대로_정렬하기();
        String[] a = {"abce", "abcd", "cdx"};
        int n = 1;
        p.solution(a,n);
    }

}
