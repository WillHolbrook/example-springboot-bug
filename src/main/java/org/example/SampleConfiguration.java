package org.example;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SpringBootConfiguration
@EnableAutoConfiguration
public class SampleConfiguration {
    @Bean
    public JFrame mainFrame() {
        JFrame frame = new JFrame("Hello World Swing Application") {
            public void close() {
                // fire window event
                this.processEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
            }
        };

        frame.setSize(400, 200);
        JLabel label = new JLabel("Hello, World!", SwingConstants.CENTER);
        frame.add(label);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        SwingUtilities.invokeLater(() -> {
            frame.setVisible(true);
        });
        return frame;
    }
}
