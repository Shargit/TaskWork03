public class TaskWork03 {
    public static void main(String[] args) {
       int[] myArray1 = new int[5];
        myArray1[4] = 5; //поменял элементы местами
        myArray1[1] = 2;
        myArray1[2] = 4;
        myArray1[3] = 100;
        myArray1[0] = 1; //поменял элементы местами
        System.out.println("Sum of first and mid elements= "+ (myArray1[4] + myArray1[2]));

    }
    static {
        int[] myArray = new int[] {1, 2, 3, 4, 5, 6, 7};
        System.out.println("myArray ="+ myArray[3]);
        System.out.println("Mid element is= "+ (myArray.length -3));
        System.out.println("Last element is= "+ (myArray.length -1));

    }

}
