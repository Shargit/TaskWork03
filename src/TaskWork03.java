public class TaskWork03 {
    public static void main(String[] args) {
       int [] myArray2 = new int[5];
        myArray2[4] = 5; //поменял элементы местами
        myArray2[1] = 2;
        myArray2[2] = 4;
        myArray2[3] = 100;
        myArray2[0] = 1; //поменял элементы местами
        System.out.println("In myArray2 Last element is= "+ myArray2[myArray2.length -1]);
        System.out.println("Sum of first and mid elements in myArray2= "+ (myArray2[4] + myArray2[2]));
    }
        static {
        int[] myArray1 = new int[] {1, 2, 3, 4, 5, 6, 7};
            System.out.println("In myArray1 Last element is= "+ myArray1[myArray1.length -1]);
            System.out.println("In myArray1 Mid element is= "+ myArray1[myArray1.length -3]);
            System.out.println(myArray1[myArray1.length -3]);
            myArray1[6] = 5; //поменял элементы местами
            myArray1[1] = 7;
            myArray1[2] = 5;
            myArray1[3] = 6;
            myArray1[4] = 2;
            myArray1[5] = 1;
            myArray1[0] = 8; //поменял элементы местами
            System.out.println("Sum of first, mid and last elements in myArray1= "+ (myArray1[6] + myArray1[3] + myArray1[0]));

    }

}
