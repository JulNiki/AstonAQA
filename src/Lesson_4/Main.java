import java.util.Arrays;
class MySolution3 {
    public static void main(String[] args) {
        printThreeWords (); //task 1
        checkSumSign ( 6, -7); //task 2
        printColor (101); //task 3
        compareNumbers (2, 1); //task 4
        System.out.println(checkSumInRangeTenToTwenty (3, 7)); //task 5
        isNumberPositiveOrNegative(-1); //task 6
        System.out.println(checkIsNumNegative(0)); //task 7
        printStringHowManyTimes("ASTON", 4); //task 8
        System.out.println(isLeapYear(2000));//task 9
        int[] myArr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        replaceZerosAndOnesInArray(myArr);//task 10
        createArrayLengthHundredFromOneToHundred();//task 11
        int[] arr12 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        multiplyByTwoNumLessSixInArray(arr12);//task 12
        int[][] myArr13 = new int[5][5];
        fillDiagonalElmntsInArrayOnes(myArr13);//task 13
        makeArrayLenValue(4, 3);//task 14
    }

    //task 1
    static void printThreeWords () {
        System.out.println("Orange\nBanana\nApple");
    }
    //task 2
    static void checkSumSign (int a, int b) {
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
    //task 3
    static void printColor (int value) {
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100 ) {
            System.out.println("Желтый");
        } else  {
            System.out.println("Зеленый");
        }
    }

    //task 4
    static void compareNumbers (int a, int b) {
        if (a >= b) {
            System.out.println("a >= b");
        } else  {
            System.out.println("a < b");
        }
    }

    //task 5
    static boolean checkSumInRangeTenToTwenty (int a, int b)  {
        return (a + b) >= 10 && (a + b) <= 20;
    }

    //task 6
    static void isNumberPositiveOrNegative (int a) {
        if (a >= 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
    }

    //task 7
    static boolean checkIsNumNegative (int a) {
        return (a < 0);
    }

    //task 8
    static void printStringHowManyTimes(String str, int times) {
        int x = 0;
        while (x < times) {
            System.out.println(str);
            x++;
        }
    }

    //task 9
    static boolean isLeapYear(int year) {
        return ((year % 4 == 0) && (year % 100 != 0) || (year % 100 == 0 && year % 400 == 0));
    }

    //task 10
    static void replaceZerosAndOnesInArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else if (arr[i] == 1) {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    //task 11
    static void createArrayLengthHundredFromOneToHundred () {
        int[] myArr = new int[100];
        for (int i = 0; i < myArr.length; i++) {
            myArr[i] = i + 1;
        }
        System.out.println(Arrays.toString(myArr));
    }

    // task12
    static void multiplyByTwoNumLessSixInArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    //task 13
    static void fillDiagonalElmntsInArrayOnes(int[][] arr){
        for (int i = 0; i < arr.length; i++) { //arr.length - количество строк
            for (int j = 0; j < arr[i].length; j++) { //arr[i].length - размер i-й строки
                if ((i == j) ||  ((i + j) == (arr[i].length - 1))) {
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    //task 14
    static void makeArrayLenValue(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        System.out.println(Arrays.toString(arr));
    }
}