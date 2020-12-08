
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private TodoList list;

    public UserInterface(TodoList list, Scanner scanner) {
        this.list = list;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.print("Comd: ");
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                break;

            } else if (command.equals("add")) {
                System.out.print("To add: ");
                String task = scanner.nextLine();
                list.add(task);

            } else if (command.equals("list")) {
                list.print();

            } else if (command.equals("remove")){
                System.out.print("Which one is removed? ");
                int removed = scanner.nextInt();
                list.remove(removed);
                
            } else {
                System.out.println("");
            }
        }
    }
}
