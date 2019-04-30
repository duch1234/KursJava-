package pl.developerpi91.kursAplikacjeWebowe.filters.chainng;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(urlPatterns = "/chain", servletNames = "ChainingServlet")
public class Filter2  implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("Second filter start");
        request.setAttribute("nowyAtrybutFiltr2",1);
        chain.doFilter(request, response);
        System.out.println("Second filter ends");

    }

    @Override
    public void destroy() {

    }
}
