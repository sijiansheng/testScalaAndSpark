package simpleTest;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println(addNumber());
    }

    public static int addNumber() {

//        System.out.println("请输入数据");
        Scanner scan = new Scanner(System.in);
        String readData = scan.nextLine();
        String[] readNumbers = readData.split("\\s+");
//        System.out.println(readNumbers.length);
//        System.out.print("@@@@@@@@@@@@@@@@@@@@@@@@@");
        if (readNumbers.length == 3) {

            int numberOne = changeToInt(readNumbers[0]);
//            System.out.println(numberOne);
            int numberTwo = changeToInt(readNumbers[1]);
            int numberThree = changeToInt(readNumbers[2]);

            if (judgeNumber(numberOne) && judgeNumber(numberTwo) && judgeNumber(numberThree)) {
                return sys(changeToInt(readNumbers[0]), changeToInt(readNumbers[1]), changeToInt(readNumbers[2]));
            } else {
//                System.out.println("输入的值错误，从重新输入");
                return addNumber();
            }
        } else {
//            System.out.println("请重新输入");
            return addNumber();
        }
    }

    public static int sys(int a, int b, int c) {
        int d = a + b + c;
        return d;
    }

    public static int changeToInt(String number) {
        return Integer.valueOf(number);
    }

    public static Boolean judgeNumber(int data) {

       /* if ((data <= -40) || (data >= 40)) {
            return false;
        } else {
            return true;
        }*/

        return true;
    }
}
