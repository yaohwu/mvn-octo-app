package xyz.yaohwu.app.adviice;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletResponse;

/**
 * @author yaohwu
 * created by yaohwu at 2021/12/6 14:47
 */

@ControllerAdvice
public class ExceptionAdvice {

    @ExceptionHandler(value = {RuntimeException.class})
    public void handleLoginInfoInvalidException(RuntimeException e, HttpServletResponse response) {
        response.setHeader("errorCode", e.getMessage());
        response.setStatus(500);
    }
}
