package edu.wgu.d387_sample_code;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping
public class DisplayMessageController {

    @GetMapping("/welcomeEN")
    public String getWelcomeMessageEN() {
        DisplayMessage displayMessage = new DisplayMessage(Locale.US);
        return displayMessage.getWelcomeMessage();
    }

    @GetMapping("/welcomeFR")
    public String getWelcomeMessageFR() {
        DisplayMessage displayMessage = new DisplayMessage(Locale.CANADA_FRENCH);
        return displayMessage.getWelcomeMessage();
    }
}
