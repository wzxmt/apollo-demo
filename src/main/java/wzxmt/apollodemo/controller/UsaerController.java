package wzxmt.apollodemo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsaerController {
    @Value("${hello:hello}")
    private String hello;
    @RequestMapping ("/hello")
    public String hello() {
        return hello;
    }
    @Value("${test:默认值}")
    private String test;
    @GetMapping("/test")
    public String test(){
        return "test的值为: " + test;
    }
}
