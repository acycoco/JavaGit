import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello World");
//
//        for (String arg : args) {
//            System.out.println(arg);
//        }

        if (args.length >= 1) { //인자가 하나 이상일 경우
            String command = args[0];

            if (command.equals("add")) { //add인자
                System.out.println("add changes to git: ");
                for (String filename : Arrays.copyOfRange(args, 1, args.length)) {//array복사
                    System.out.println(filename);
                }

            } else if (command.equals("commit")) { //commit인자
                System.out.print("commit with message: ");
                if (args.length == 3) {
                    if (args[1].equals("-m")) {
                        System.out.printf("\"%s\"", args[2]);
                    }
                } else {
                    System.out.println("no message specified");
                }

            } else {
                System.out.println("invalid command");
            }
        }
        else { //인자가 없을 경우 사용법 출력 후 종료
            System.out.println("usage: add, commit");
        }
    }
}
