package tutorial07;

public class Main {
    public static void main(String[] args) {
        Account account = new Account();
        Services service = new Services();
        Transaction transaction = new Transaction();
        while (true) {
            service.displayOffers();
            String primaryChoice = service.sc.next();
            switch (primaryChoice) {
                case "1":
                    service.winterOffer();
                    String winterChoice = service.sc.next();
                    switch (winterChoice) {
                        case "1":
                            transaction.process(account, 1000, "All time data");
                            break;
                        case "2":
                            transaction.process(account, 200, "Night Data");
                            break;
                        case "3":
                            transaction.process(account, 100, "Night Voice");
                            break;
                        case "0":
                            service.displayOffers();
                            break;
                        default:
                            System.out.println("Invalid");
                            break;
                    }
                    break;
                case "2":
                    service.prepaidPacks();
                    String prepaidChoice = service.sc.next();
                    switch (prepaidChoice) {
                        case "1":
                            transaction.process(account, 600, "Monthly Package");
                            break;
                        case "2":
                            transaction.process(account, 400, "Weekly Package");
                            break;
                        case "3":
                            transaction.process(account, 100, "Daily Package");
                            break;
                        case "0":
                            service.displayOffers();
                            break;
                        default:
                            System.out.println("Invalid");
                            break;
                    }
                    break;
                case "3":
                    service.unlimitedNightPacks();
                    String unlimitedChoice = service.sc.next();
                    switch (unlimitedChoice) {
                        case "1":
                            transaction.process(account, 200, "Unlimited Night Data");
                            break;
                        case "0":
                            service.displayOffers();
                            break;
                        default:
                            System.out.println("Invalid");
                            break;
                    }
                    break;
                case "4":
                    service.voice();
                    String voiceChoice = service.sc.next();
                    switch (voiceChoice) {
                        case "1":
                            transaction.process(account, 150, "NT Network");
                            break;
                        case "2":
                            transaction.process(account, 100, "All Network");
                            break;
                        case "0":
                            service.displayOffers();
                            break;
                        default:
                            System.out.println("Invalid");
                            break;
                    }
                    break;
                case "5":
                    service.data();
                    String data = service.sc.next();
                    switch (data) {
                        case "1":
                            transaction.process(account, 50, "Unlimited Data");
                            break;
                        case "2":
                            transaction.process(account, 25, "Daily Data");
                            break;
                        case "3":
                            transaction.process(account, 30, "Nightly Data");
                            break;
                        case "0":
                            service.displayOffers();
                            break;
                        default:
                            System.out.println("Invalid");
                            break;
                    }
                    break;
                case "0":
                    System.out.println("Subscribed Services: ");
                    if (!transaction.subServices.isEmpty()) {
                        for (String subService : transaction.subServices) {
                            System.out.println("- " + subService);
                        }
                    } else {
                        System.out.println("None");
                    }
                    return;
                default:
                    System.out.println("Invalid");
                    break;
            }
        }
    }
}
