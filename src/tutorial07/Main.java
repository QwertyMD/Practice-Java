package tutorial07;

public class Main {
    public static void main(String[] args) {
        Account account = new Account();
        Services service = new Services();
        while (true) {
            service.displayOffers();
            int primaryChoice = service.sc.nextInt();
            switch (primaryChoice) {
                case 1:
                    service.winterOffer();
                    int winterChoice = service.sc.nextInt();
                    switch (winterChoice) {
                        case 1:
                            account.balance -= 1000;
                            System.out.println("Remaining balance: " + account.balance);
                            break;
                        case 2:
                            account.balance -= 200;
                            System.out.println("Remaining balance: " + account.balance);
                            break;
                        case 3:
                            account.balance -= 100;
                            System.out.println("Remaining balance: " + account.balance);
                            break;
                        case 0:
                            service.displayOffers();
                            break;
                        default:
                            System.out.println("Invalid");
                            break;
                    }
                    break;
                case 2:
                    service.prepaidPacks();
                    int prepaidChoice = service.sc.nextInt();
                    switch (prepaidChoice) {
                        case 1:
                            account.balance -= 600;
                            System.out.println("Remaining balance: " + account.balance);
                            break;
                        case 2:
                            account.balance -= 400;
                            System.out.println("Remaining balance: " + account.balance);
                            break;
                        case 3:
                            account.balance -= 100;
                            System.out.println("Remaining balance: " + account.balance);
                            break;
                        case 0:
                            service.displayOffers();
                            break;
                        default:
                            System.out.println("Invalid");
                            break;
                    }
                    break;
                case 3:
                    service.unlimitedNightPacks();
                    int unlimitedChoice = service.sc.nextInt();
                    switch (unlimitedChoice) {
                        case 1:
                            account.balance -= 200;
                            System.out.println("Remaining balance: " + account.balance);
                            break;
                        case 0:
                            service.displayOffers();
                            break;
                        default:
                            System.out.println("Invalid");
                            break;
                    }
                    break;
                case 4:
                    service.voice();
                    int voiceChoice = service.sc.nextInt();
                    switch (voiceChoice) {
                        case 1:
                            account.balance -= 150;
                            System.out.println("Remaining balance: " + account.balance);
                            break;
                        case 2:
                            account.balance -= 100;
                            System.out.println("Remaining balance: " + account.balance);
                            break;
                        case 0:
                            service.displayOffers();
                            break;
                        default:
                            System.out.println("Invalid");
                            break;
                    }
                    break;
                case 5:
                    service.data();
                    int data = service.sc.nextInt();
                    switch (data) {
                        case 1:
                            account.balance -= 50;
                            System.out.println("Remaining balance: " + account.balance);
                            break;
                        case 2:
                            account.balance -= 25;
                            System.out.println("Remaining balance: " + account.balance);
                            break;
                        case 3:
                            account.balance -= 30;
                            System.out.println("Remaining balance: " + account.balance);
                            break;
                        case 0:
                            service.displayOffers();
                            break;
                        default:
                            System.out.println("Invalid");
                            break;
                    }
                    break;
                case 0:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid");
                    break;
            }
        }
    }
}
