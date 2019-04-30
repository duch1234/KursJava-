package pl.developerpi91.kursAplikacjeWebowe.filters.chainng;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(servletNames = "ChainingServlet", urlPatterns = "/chain")
public class Filter1 implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("First filter start");
        request.setAttribute("nowyAtrybut",1);
        chain.doFilter(request, response);
        System.out.println("First filter ends");

    }

    @Override
    public void destroy() {
    }
}
