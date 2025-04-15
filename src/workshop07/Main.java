package workshop07;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Record record = new Record();
        while (true) {
            menu.displayMenu();
            String choice = menu.sc.next();
            switch (choice) {
                case "1":
                    record.addRecord();
                    break;
                case "2":
                    record.viewRecord();
                    break;
                case "3":
                    record.updateRecord();
                    break;
                case "4":
                    record.deleteRecord();
                    break;
                case "0":
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}
