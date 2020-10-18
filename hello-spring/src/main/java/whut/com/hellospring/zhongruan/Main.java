package whut.com.hellospring.zhongruan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] charArray = in.nextLine().toCharArray();
        for (int i =charArray.length-1; i >= 0; i--) {
            System.out.print(charArray[i]);
        }
    }
}
