package tutorial07;

import java.util.Scanner;

public class Services {
    Scanner sc = new Scanner(System.in);

    public void displayOffers() {
        System.out.println("==== Mobile Services ====");
        System.out.println("1. Winter Offer");
        System.out.println("2. Prepaid Packs");
        System.out.println("3. Unlimited Night Packs");
        System.out.println("4. Voice");
        System.out.println("5. Data");
        System.out.println("0. Exit");
        System.out.println("Choose an option: ");
    }

    public void winterOffer() {
        System.out.println("==== Winter Offer ====");
        System.out.println("1. All time data - Rs. 1000");
        System.out.println("2. Night Data - Rs. 200");
        System.out.println("3. Night Voice - Rs. 100");
        System.out.println("0. Back");
        System.out.println("Choose an option: ");
    }

    public void prepaidPacks() {
        System.out.println("==== Prepaid Packs ====");
        System.out.println("1. Monthly Package - Rs. 600");
        System.out.println("2. Weekly Package - Rs. 400");
        System.out.println("3. Daily Package - Rs. 100");
        System.out.println("0. Back");
        System.out.println("Choose an option: ");
    }

    public void unlimitedNightPacks() {
        System.out.println("==== Unlimited Night Packs ====");
        System.out.println("1. Unlimited Night Data - Rs. 200");
        System.out.println("0. Back");
        System.out.println("Choose an option: ");
    }

    public void voice() {
        System.out.println("==== Voice ====");
        System.out.println("1. NT Network - Rs. 150");
        System.out.println("2. All Network - Rs. 100");
        System.out.println("0. Back");
        System.out.println("Choose an option: ");
    }

    public void data() {
        System.out.println("==== Data ====");
        System.out.println("1. Unlimited Data - Rs. 50");
        System.out.println("2. Daily Data - Rs. 25");
        System.out.println("3. Nightly Data - Rs. 30");
        System.out.println("0. Back");
        System.out.println("Choose an option: ");
    }
}
