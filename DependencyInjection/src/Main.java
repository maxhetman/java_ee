import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("resources/springs-beans.xml");
        Programmer eckel = (Programmer) context.getBean("eckel");

        System.out.println("Our programmer Eckel works in " + eckel.getCompanyName());
        System.out.println("Eckel codes in his favourite language");
        eckel.writeCode(eckel.getMainLanguage());

        System.out.printf("Also Eckel writes code using other languages\n");
        for (Language lang: eckel.getUsedLanguages()) {
            eckel.writeCode(lang);
        }
    }
}
