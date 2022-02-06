package fileParser;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String filename = scanner.nextLine();

        Parser maxSum = new MaxSumParser();
        Parser sum = new SumParser();

        String path = "src/fileParser/" + filename;

        System.out.println(maxSum.parse(path));
        System.out.println(sum.parse(path));
    }
}