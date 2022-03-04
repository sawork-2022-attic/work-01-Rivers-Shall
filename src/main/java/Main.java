import asciiPanel.AsciiFont;
import asciiPanel.AsciiPanel;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");

        AsciiFont asciiFont = applicationContext.getBean(AsciiFont.class);
        System.out.println(asciiFont.getFontFilename());

        AsciiPanel asciiPanel = (AsciiPanel) applicationContext.getBean("asciiPanel");
        System.out.println(asciiPanel.getAsciiFont().getFontFilename());
    }
}
