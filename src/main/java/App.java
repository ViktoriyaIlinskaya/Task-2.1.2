import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld beanOne =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld beanTwo =
                (HelloWorld) applicationContext.getBean("helloworld");

        Cat bean1 =
                (Cat) applicationContext.getBean("cat");
        Cat bean2 =
                (Cat) applicationContext.getBean("cat");
        
        System.out.println("Пара Helloworld - " + (beanOne == beanTwo));
        System.out.println("Пара Cat - " + (bean1 == bean2));
    }
}