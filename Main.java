package stringParser;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        while (!input.strip().equals("quit")){
            String[] command = input.strip().split(" ");
            String commandName = command[0];

            if(commandName.equals("long")){
                Command longWord = new Long();
                longWord.parse(command);
                longWord.execute();
            }else if(commandName.equals("short")){
                Command shortWord = new Short();
                shortWord.parse(command);
                shortWord.execute();
            }else if(commandName.equals("az")){
                Command az = new Az();
                az.parse(command);
                az.execute();
            }else if(commandName.equals("za")){
                Command za = new Za();
                za.parse(command);
                za.execute();
            }else{
                System.out.println("Unknown Command");
            }
            input = scanner.nextLine();
        }
    }
}
