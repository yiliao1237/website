package letscode;

import SQL.SQLproviding;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

@WebServlet(urlPatterns = "/employee/*")
public class Employee extends HttpServlet {
    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);

    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        String productsfromclass=new String();


        try {
            productsfromclass= SQLproviding.createProducts();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }



        String idinupt = "3";
        String serialnuminput = "3388";
        String nameinput = "Pizza";
        String typeinput = "food";
        String primecostinput = "700";
        String priceinput = "780";
        String productscol = "1888";



        String content=new String("<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "\n" +
                "<head>\n" +
                "   <meta charset=\"UTF-8\">\n" +
                "   <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n" +
                "   <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "   <title>Document</title>\n" +
                "   <link rel=\"stylesheet\" href=\"/my-app/static/style/employee.css\">\n" +
                "</head>\n" +
                "\n" +
                "<body>\n" +
                "   <div class=\"wrapper\">\n" +
                "      <div class=\"container\">\n" +
                "         <div class=\"table\">\n" +
                "            <div class=\"table-wrap\">\n" +
                "               <div class=\"table-rows1 rows\"><a href=\"/my-app/indexclient\" target=\"_blank\">????????????</a></div>\n" +
                "               <div class=\"table-rows2 rows\"><a href=\"/my-app/employee/\">????????????</a></div>\n" +
                "               <div class=\"table-rows3 rows\"><a href=\"/my-app/stocks/\">????????????</a></div>\n" +
                "               <div class=\"table-rows4 rows\">4-4</div>\n" +
                "               <div class=\"table-rows5 rows\">5-5</div>\n" +
                "               <div class=\"table-rows6 rows\">6-6</div>\n" +
                "            </div>\n" +
                "         </div>\n" +
                "      </div>\n" +
                "      <div class=\"contain\">\n" +
                "         <div class=\"header\">\n" +
                "            <div class=\"header-wrap\">\n" +
                "               <div class=\"header-menu\">\n" +
                "                  ????????????\n" +
                "               </div>\n" +
                "               <div class=\"header-icon\">\n" +
                "                  <img class=\"icon-image\" src=\"https://cdn-icons-png.flaticon.com/512/56/56745.png\" alt=\"\">\n" +
                "                  <div class=\"icon-text\">admin</div>\n" +
                "               </div>\n" +
                "            </div>\n" +
                "         </div>\n" +
                "         <div class=\"head\">\n" +
                "            <div class=\"head-wrap\">\n" +
                "               <div class=\"head-look\">\n" +
                "                  <span class=\"look-text\">???????????????</span>\n" +
                "                  <input type=\"text\" class=\"look-input\" placeholder=\"????????????\">\n" +
                "               </div>\n" +
                "               <div class=\"head-btn\">??????</div>\n" +
                "            </div>\n" +
                "         </div>\n" +
                "         <div class=\"search\">\n" +
                "            <div class=\"search-wrap\">\n" +
                "               <div class=\"search-one\">\n" +
                "                  <span class=\"one-string string\">???????????????</span>\n" +
                "                  <input type=\"text\" class=\"one-input inpt\">\n" +
                "               </div>\n" +
                "               <div class=\"searach-two\">\n" +
                "                  <span class=\"two-string string\">???????????????</span>\n" +
                "                  <input type=\"text\" class=\"two-input inpt\">\n" +
                "               </div>\n" +
                "               <div class=\"search-three\">\n" +
                "                  <span class=\"three-string string\">???????????????</span>\n" +
                "                  <input type=\"text\" class=\"three-input inpt\">\n" +
                "               </div>\n" +
                "               <div class=\"search-four\">\n" +
                "                  <span class=\"four-string string\">???????????????</span>\n" +
                "                  <input type=\"text\" class=\"four-input inpt\">\n" +
                "               </div>\n" +
                "               <div class=\"search-five\">\n" +
                "                  <span class=\"five-string sting\">???????????????</span>\n" +
                "                  <input type=\"text\" class=\"five-input inpt\">\n" +
                "               </div>\n" +
                "               <div class=\"search-btn\">??????</div>\n" +
                "            </div>\n" +
                "         </div>\n" +
                "         <div class=\"list\">\n" +
                "            <div class=\"list-wrap\">\n" +
                "               <table class=\"list-table\">\n" +
                "                  <thead>\n" +
                "                     <tr class=\"table-cells\">\n" +
                "                        <th>??????</th>\n" +
                "                        <th>????????????</th>\n" +
                "                        <th>????????????</th>\n" +
                "                        <th>????????????</th>\n" +
                "                        <th>????????????</th>\n" +
                "                        <th>????????????</th>\n" +
                "                        <th>??????</th>\n" +
                "                        <th>????????????</th>\n" +
                "                        <th>??????</th>\n" +
                "                     </tr>\n" +
                "                  </thead>\n" +productsfromclass +
                "               </table>\n" +
                "            </div>\n" +
                "         </div>\n" +
                "      </div>\n" +
                "      <div class=\"box\">\n" +
                "         <div class=\"modal\">\n" +
                "\n" +
                "            <div class=\"modal-one\">\n" +
                "               <span class=\"modal-string string\">???????????????</span>\n" +
                "               <input type=\"text\" class=\"one-input inpt\">\n" +
                "            </div>\n" +
                "            <div class=\"modal-one\">\n" +
                "               <span class=\"modal-string string\">???????????????</span>\n" +
                "               <input type=\"text\" class=\"one-input inpt\">\n" +
                "            </div>\n" +
                "            <div class=\"modal-one\">\n" +
                "               <span class=\"modal-string string\">???????????????</span>\n" +
                "               <input type=\"text\" class=\"one-input inpt\">\n" +
                "            </div>\n" +
                "            <div class=\"modal-one\">\n" +
                "               <span class=\"modal-string string\">???????????????</span>\n" +
                "               <input type=\"text\" class=\"one-input inpt\">\n" +
                "            </div>\n" +
                "            <div class=\"modal-one\">\n" +
                "               <span class=\"modal-string string\">???????????????</span>\n" +
                "               <input type=\"text\" class=\"one-input inpt\">\n" +
                "            </div>\n" +
                "\n" +
                "            <div class=\"modal-btn\">??????</div>\n" +
                "         </div>\n" +
                "      </div>\n" +
                "      <script src=\"/my-app/static/source/script.js\"></script>\n" +
                "</body>\n" +
                "\n" +
                "</html>");
        // ????????????????
        String parameter = req.getParameter("parameter");

        // ?????????? HTTP ????????????
        HttpSession session = req.getSession(true);
        session.setAttribute("parameter", parameter);

        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        try {
            out.println(content);
        } finally {
            out.close();
        }
    }

    @Override
    public void destroy() {
        log("Method destroy =)");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    }

}

