package pl.developerpi91.kursAplikacjeWebowe.filters;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(servletNames = "simpleServletName")
public class SimpleFilter  implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("Before");

        request.setAttribute("simpleServletAttribute", "simpleServlet");
        chain.doFilter(request, response);
        System.out.println("After");
    }

    @Override
    public void destroy() {
    }
}

