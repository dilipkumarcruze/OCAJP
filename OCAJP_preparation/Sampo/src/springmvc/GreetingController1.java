package springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetingController1 {
    @GetMapping("/greeting")
    public String greeting(Model model) {
        String message = "Hello, world!";
        model.addAttribute("message", message);
        return "greeting";
    }
}

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("com.example");
        context.refresh();

        GreetingController controller = context.getBean(GreetingController.class);
        String viewName = controller.greeting(model);

        // Process the view and display the result
        System.out.println("View name: " + viewName);

        context.close();
    }
}
