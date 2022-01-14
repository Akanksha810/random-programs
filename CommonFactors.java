import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class CommonFactors {

    public static void main(String[] args) {

        int a, b;
        int count = 1;
        int num = 2;
        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();

        List<Integer> factors = new ArrayList<>();
        factors.add(1);

        if (a >= b) {

            while (num <= b - num) {

                if (b % num == 0 && a % num == 0) {

                    count++;
                    factors.add(num);
                    num++;

                }

                else {

                    num++;

                }

            }

            if (a % b == 0) {
                count++;
                factors.add(b);
            }

        }

        else {

            while (num <= a - num) {

                if (a % num == 0 && b % num == 0) {

                    count++;
                    factors.add(num);
                    num++;

                }

                else {

                    num++;

                }

            }

            if (b % a == 0) {
                count++;
                factors.add(a);
            }
        }

        System.out.println("Common Factors : " + count);
        System.out.println("Factors : " + factors);

    }
}