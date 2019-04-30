package pl.developerpi91.kursAplikacjeWebowe.filters;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Map;


@WebServlet(urlPatterns = "/filter1", name = "simpleServletName")
public class SimpleServlet extends HttpServlet {
    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);
//
//
//    }
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        PrintWriter responseWriter = resp.getWriter();

        responseWriter.write("<html><body>");
        Enumeration<String> attributeNames = req.getAttributeNames();
        while (attributeNames.hasMoreElements()) {
            String attributeName = attributeNames.nextElement();
            Object attributeValue = req.getAttribute(attributeName);
            responseWriter.write("<p>" + attributeName + ": " + attributeValue + "</p>");
        }
        Enumeration<String> parameters = req.getParameterNames();
        while ((parameters.hasMoreElements())){
            String parameter = parameters.nextElement();
            String[] parameterValue = req.getParameterValues(parameter.toString());

            for (Map.Entry<String, String[]> entry : req.getParameterMap().entrySet()) {
                responseWriter.write("<p>" + entry.getKey() + ": " + Arrays.toString(entry.getValue()) +"</p>");
            }
            responseWriter.write("<p>"+parameter + ": " + parameterValue + "<p>" );

        }
        responseWriter.write("</html></body>");
    }

}


