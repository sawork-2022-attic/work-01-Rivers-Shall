import asciiPanel.AsciiFont;
import asciiPanel.AsciiPanel;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("anno-config.xml");
        AsciiPanel asciiPanel = applicationContext.getBean(AsciiPanel.class);
        System.out.println(asciiPanel.getAsciiFont().getFontFilename());
        System.out.println(asciiPanel.getCharHeight());
        System.out.println(asciiPanel.getCharWidth());
    }
}
