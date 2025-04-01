package edu.wgu.d387_sample_code;

import java.util.Locale;
import java.util.ResourceBundle;

public class DisplayMessage {

    private final Locale locale;

    public DisplayMessage(Locale locale) {
        this.locale = locale;
    }

    public String getWelcomeMessage() {
        ResourceBundle bundle = ResourceBundle.getBundle("welcome", locale);
        return bundle.getString("welcome");
    }
}
