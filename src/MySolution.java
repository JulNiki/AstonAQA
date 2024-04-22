
class MySolution {
    public static void main(String[] args) {
        printThreeWords (); //task 1
        checkSumSign ( 6, -7); //task 2
        printColor (101); //task 3
        compareNumbers (2, 1); //task 4
        System.out.println(sumBtwn10and20 (3, 7)); //task 5
        positiveOrNegative(-1); //task 6
        System.out.println(numNegative(0)); //task 7
        printStringHowManyTimes("ASTON", 4); //task 8
        System.out.println(isLeapYear(2000));//task 9
        int[] myArr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        replace0And1InArray(myArr);//task 10
        createArrayLength100from1to100();//task 11
        int[] Arr12 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        multiplyBy2NumLess6InArray(Arr12);//task 12
        int[][] myArr13 = new int[5][5];
        fillDiagonalElmntsInAarrayOnes(myArr13);//task 13
        int[] myArr14 = makeArrayLenValue(4, 3);//task 14
        for (int j : myArr14) System.out.print(j + " ");
    }

    //task 1
    static void printThreeWords () {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
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
        } else if ( value <= 100 ) {
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
    static boolean sumBtwn10and20 (int a, int b) {
        boolean result;
        result = ((a + b) >= 10) && ((a + b) <= 20);
        return result;
    }

    //task 6
    static void positiveOrNegative (int a) {
        if (a >= 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
    }

    //task 7
    static boolean numNegative (int a) {
        boolean result;
        result = (a < 0);
        return result;
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
        boolean result;
        result = ((year % 4 == 0) && (year % 100 != 0) || (year % 100 == 0 && year % 400 == 0));
        return result;
    }

    //task 10
    static void replace0And1InArray(int[] Arr) {
        for (int i = 0; i < Arr.length; i++) {
            if (Arr[i] == 0) {
                Arr[i] = 1;
            } else if (Arr[i] == 1) {
                Arr[i] = 0;
            }
        }
        for (int j : Arr) System.out.print(j + " ");
        System.out.println();
    }

    //task 11
    static void createArrayLength100from1to100() {
        int[] myArr = new int[100];
        for (int i = 0; i < myArr.length; i++) {
            myArr[i] = i + 1;
        }
        for (int j : myArr) System.out.print(j + " ");
        System.out.println();
    }

    // task12
    static void multiplyBy2NumLess6InArray(int[] Arr) {
        for (int i = 0; i < Arr.length; i++) {
            if (Arr[i] < 6) {
                Arr[i] = Arr[i] * 2;
            }
        }
        for (int j : Arr) System.out.print(j + " ");
        System.out.println();
    }

    //task 13
    static void fillDiagonalElmntsInAarrayOnes (int[][] Arr){
        for (int i = 0; i < Arr.length; i++) { //myArr.length - количество строк
            for (int j = 0; j < Arr[i].length; j++) { //myArr[i].length - размер i-й строки
                if (i == j) {
                    Arr[i][j] = 1;
                }
                if ((i + j) == (Arr[i].length - 1)) {
                    Arr[i][j] = 1;
                }

                System.out.print(Arr[i][j] + "\t");
            }
            System.out.println();

        }
    }

    //task 14
    static int[] makeArrayLenValue(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        return arr;

    }
}