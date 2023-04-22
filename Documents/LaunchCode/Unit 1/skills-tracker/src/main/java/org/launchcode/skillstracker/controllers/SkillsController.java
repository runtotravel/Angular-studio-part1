package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SkillsController {

    @GetMapping
    @ResponseBody
    public String createMessage() {
        return "<html><body>" +
                "<h1>Skills Tracker</h2>" +
                "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "</ol>" +
                "</html></body>";
    }
@GetMapping ("/form")
@ResponseBody
    public String chooseFavorites() {
        return "<html><body>" +
                "<form method='post'>" +
                "<label>Name:<br />" +
                "<input type='text' name='name' /></label><br />" +
                "<label>My favorite language: <br />" +
                "<select name='firstLanguage' id='firstLanguage'>" +
                    "<option value='Java'>Java</option>" +
                    "<option value='JavaScript'>JavaScript</option>" +
                    "<option value='Python'>Python</option>" +
                "</select></label><br />" +
                "<label>My second favorite language: <br />" +
                "<select name='secondLanguage' id='secondLanguage'>" +
                    "<option value='Java'>Java</option>" +
                    "<option value='JavaScript'>JavaScript</option>" +
                    "<option value='Python'>Python</option>" +
                "</select></label><br />" +
                "<label>My third favorite language: <br />" +
                "<select name='thirdLanguage' id='thirdLanguage'>" +
                    "<option value='Java'>Java</option>" +
                    "<option value='JavaScript'>JavaScript</option>" +
                    "<option value='Python'>Python</option>" +
                "</select></label><br />" +
                "<input type = 'submit' value = 'Submit' />" +
                "</form>" +
                "</body></html>";
}
    @PostMapping("/form")
    @ResponseBody
    public String respondToUserInput(@RequestParam String name,
                                     @RequestParam String firstLanguage,
                                     @RequestParam String secondLanguage,
                                     @RequestParam String thirdLanguage) {
        return "<html><body>" +
                "<h2>" + name + "</h2>" +
                "<ol>" +
                "<li>" + firstLanguage + "</li>" +
                "<li>" + secondLanguage + "</li>" +
                "<li>" + thirdLanguage + "</li>" +
                "</ol>" +
                "</html></body>";
    }



}


