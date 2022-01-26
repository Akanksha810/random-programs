import java.util.Scanner;

class MenuDrivenProgram {

    private static final double PI = 3.14;
    public static void main(String[] args) {
        
        String reply = "N";

        do {
            System.out.println("*****MENU*****");
            System.out.println("1. Area of Circle");
            System.out.println("2. Area  of Square");
            System.out.println("3. Area of Rectangle");
            System.out.println("4. Exit");
            System.out.print("Enter your choice : ");

            Scanner sc = new Scanner(System.in);
            int choice;
            double area;

            choice = sc.nextInt();

            switch(choice) {
                case 1: double r;
                        System.out.print("Enter radius : ");
                        r = sc.nextDouble();
                        area = PI*r*r;
                        System.out.println("Area of circle : " + area);
                        break;
                case 2: double s;
                        System.out.print("Enter side : ");
                        s = sc.nextDouble();
                        area = s*s;
                        System.out.println("Area of square : " + area);
                        break;
                case 3: double l,b;
                        System.out.print("Enter length : ");
                        l = sc.nextDouble();
                        System.out.print("Enter breadth : ");
                        b = sc.nextDouble();
                        area = l*b;
                        System.out.println("Area of rectangle : " + area);
                        break;
                case 4: System.exit(0);
                default: System.out.println("Invalid choice. Please try again.");
                        reply = "Y";
                        continue;
            }

            System.out.print("Do you widh to continue?(Y/N)");
            reply = sc.next();
        } while(reply.equalsIgnoreCase("Y"));

    }
}