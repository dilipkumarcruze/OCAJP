package spring;

public class MyApplication5 {
    private GreetingService greetingService;

    public MyApplication(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public void run() {
        greetingService.greet();
    }
}
