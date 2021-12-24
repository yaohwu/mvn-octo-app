package xyz.yaohwu.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yaohwu
 */
@RestController
public class HelloController {
    @ResponseBody
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String testMetadata() {

        return "Hello World!\n";
    }
}