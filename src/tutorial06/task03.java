package tutorial06;

import java.util.ArrayList;

public class task03 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList1.add("Almighty");
        arrayList2.add("Push");
        arrayList1.addAll(arrayList2);
        System.out.println(arrayList1);
    }
}
