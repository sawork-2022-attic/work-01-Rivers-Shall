import asciiPanel.AsciiPanel;
import config.AsciiPanelConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AsciiPanelConfiguration.class);

        AsciiPanel asciiPanel = applicationContext.getBean(AsciiPanel.class);
        System.out.println(asciiPanel.getAsciiFont().getFontFilename());
        System.out.println(asciiPanel.getCharHeight());
        System.out.println(asciiPanel.getCharWidth());
    }
}
