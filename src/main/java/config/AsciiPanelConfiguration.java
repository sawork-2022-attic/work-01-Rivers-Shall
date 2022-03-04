package config;

import asciiPanel.AsciiFont;
import asciiPanel.AsciiPanel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AsciiPanelConfiguration {
    @Bean
    public AsciiPanel asciiPanel() {
        AsciiPanel asciiPanel = new AsciiPanel();
        asciiPanel.setAsciiFont(asciiFont());
        return asciiPanel;
    }

    @Bean
    public AsciiFont asciiFont() {
        return new AsciiFont("cp437_12x12.png", 12, 12);
    }
}
