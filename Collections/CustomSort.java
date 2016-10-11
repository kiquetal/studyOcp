import java.util.Comparator;
import java.util.List;
import java.util.Collections;
import java.util.Arrays;
import java.util.ArrayList;
class CustomSort implements Comparator<Double> {
     public int compare(Double d1, Double d2) {
     return d1.intValue() == d2.intValue() ?
       d2.compareTo(d1) : d1.compareTo(d2);
     }
     public static void main(String[] args) {
          List<Double> grades = new ArrayList<>();
          grades.addAll(Arrays.asList(new Double[] {1.8, 2.1, 3.8, 4.7, 2.2, 1.1}));
          Collections.sort(grades, new CustomSort());
		  System.out.println(grades);
          //insert code here


List<String> gradesm = new ArrayList<>();
gradesm.addAll(Arrays.asList(new String[]{"C", "A", "B", "A", "D"}));

System.out.println(gradesm);
Collections.rotate(gradesm,1);
System.out.println(gradesm);

     }
}

