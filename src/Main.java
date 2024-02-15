import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> strings = new ArrayList<>();

        System.out.println("Введите строки (для завершения введите 'end'):");

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            strings.add(input);
        }

        System.out.println("Список строк:");
        for (String str : strings) {
            System.out.println(str);
        }
    }
}
