import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class EvenOddList {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        int size;
        Scanner sc = new Scanner(System.in);

        size = sc.nextInt();
        int i;
        for(i=1; i<=size; i++){

            list.add(sc.nextInt());
        }

        System.out.println(list);
        
        int e = 0;
        int o = 0; 
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        
        for(int a : list) {
            if(a%2==0) {
                even.add(a);
            }
            else {
                odd.add(a);
            }
        }

        if(even.size() > odd.size()) {

            i=0;
            while(i<odd.size()) {

                System.out.println(even.get(e++));
                System.out.println(odd.get(o++));
                i++;
            }

            while(i<even.size()) {
                System.out.println(even.get(e++));
                i++;
            }
        }

        else {

            i=0;
            while(i<even.size()) {

                System.out.println(even.get(e++));
                System.out.println(odd.get(o++));
                i++;
            }

            while(i<odd.size()) {
                System.out.println(odd.get(o++));
                i++;
            }
        }

        // List<Integer> l = new ArrayList<>(2*list.size());
        // l.add(1, 1);
        // l.add(0, 2);
        // l.add(3, 5);
        // l.add(5, 5);
        // l.add(7, 7);
        // l.add(2, 8);
        // System.out.println(l);
    }
}