package io.mikaila;

public class Main {

    public void greet(Greeting greeting){
      greeting.perform();
    }


    public static void main(String[] args) {
        Main greeter = new Main();
        HelloWorldGreeting helloWorldGreeting = new HelloWorldGreeting();
        greeter.greet(helloWorldGreeting);

    }


}
