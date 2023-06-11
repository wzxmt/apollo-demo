package wzxmt.apollodemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsaerController {
    @Value("${hello}")
    private String hello;
    @RequestMapping ("/boot/hello")
    public String hello(){
        return hello;
    }
}
