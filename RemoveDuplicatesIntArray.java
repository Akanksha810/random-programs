import java.util.Scanner;

class RemoveDuplicatesIntArray {

    public static void main(String[] args) {

        int size;
        Scanner sc = new Scanner(System.in);

        size = sc.nextInt();
        Integer  array[] = new  Integer[size];
        
        int i;
        for(i=0; i<size; i++){

            array[i] = sc.nextInt();
        }
        
        String distinct = "";
   
        for(i=0;i<size;i++) {
            if(distinct.contains(String.valueOf(array[i]))) {
                array[i] = null;
            }
            else {
                distinct = distinct + array[i];
            }
        }

        System.out.println(distinct);
        for(i=0;i<size; i++) {
            if(array[i]!=null){
                System.out.println(array[i]);
            }
           
        }
    }
}