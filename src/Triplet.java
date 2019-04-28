import java.util.ArrayList;
import java.util.List;

public class Triplet {

    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> result = new ArrayList<>();
        int sumA = 0, sumB = 0;
        for(int i = 0; i < a.size(); i++){
            if(a.get(i) > b.get(i)) {
                sumA = sumA + 1;
            }else if (a.get(i) < b.get(i)){
                sumB = sumB + 1;
            }
        }
        result.add(sumA);
        result.add(sumB);

        return result;
    }

    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        a.add(17);
        a.add(28);
        a.add(30);
        b.add(20);
        b.add(10);
        b.add(5);
        compareTriplets(a,b);
    }
}
