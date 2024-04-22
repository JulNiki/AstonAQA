
class Main {
    public static void main(String[] args) {
        printThreeWords (); //task 1
        checkSumSign ( 6, -7); //task 2
        printColor (101); //task 3
        compareNumbers (2, 1); //task 4
        System.out.println(sumBtwn10and20 (3, 7)); //task 5
        positiveOrNegative(-1); //task 6
        System.out.println(numNegative(0)); //task 7
        printStringHowManyTimes("ASTON", 4); //task 8
        System.out.println(isLeapYear(2000));


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
















}