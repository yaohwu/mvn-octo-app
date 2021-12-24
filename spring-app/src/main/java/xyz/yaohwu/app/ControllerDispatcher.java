package xyz.yaohwu.app;

import org.jetbrains.annotations.NotNull;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;
import java.io.IOException;

@ServletComponentScan
@WebServlet(urlPatterns = "/app", description = "controllerDispatcher")
public class ControllerDispatcher extends DispatcherServlet {

    @Override
    protected void doDispatch(@NotNull HttpServletRequest request, @NotNull HttpServletResponse response)
            throws Exception {
        super.doDispatch(request, response);
    }


    @Override
    protected void doOptions(@NotNull HttpServletRequest request, @NotNull HttpServletResponse response)
            throws ServletException, IOException {
        super.doOptions(request, new HttpServletResponseWrapper(response));
    }
}