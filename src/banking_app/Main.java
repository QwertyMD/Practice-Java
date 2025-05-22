package banking_app;

import banking_app.SubClasses.Initializer;

public class Main {
    public static void main(String[] args) {
        Initializer initializer = new Initializer();  // create an instance of Initializer class
        initializer.init();  // call init method to initialize and execute GUI
    }
}
