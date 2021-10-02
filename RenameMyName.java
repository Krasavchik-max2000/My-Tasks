import java.util.Scanner;

public class RenameMyName {
    public static void main(String[] args) {
        System.out.println("Введите ваше имя");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();


        String rename = renameMyName(name);

        System.out.println("Ваше имя наоборот: " + rename);

    }



    private static String renameMyName(String name) {
        String rename = "";
        char[] arr = new char[name.length()];

        for (int i = 0; i < name.length(); i++) {
            arr[i] = name.charAt(i);
//            System.out.println(arr[i]);
        }

        for (int i = name.length() - 1; i >= 0; i--) {
//            System.out.println(arr[i]);
            rename = rename+ arr[i];
        }
        return rename;
    }

}

