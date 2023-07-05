package spring;

public class Main21 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("com.example"); // Specify the package to scan for Spring components
        context.refresh();

        MyApplication application = context.getBean(MyApplication.class);
        application.run();

        context.close();
    }
}
