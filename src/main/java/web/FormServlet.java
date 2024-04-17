package web;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.annotation.WebServlet;
import models.UserModel;


import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/add")
public class FormServlet extends HttpServlet {
    public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException{


        /*get the user data from my frontend form*/
       String name=  request.getParameter("fullName");
       String email = request.getParameter("email");

        PrintWriter write = response.getWriter();


/*UserModel object*/
        UserModel user = new UserModel();

       user.setName(name);

       write.println(user.getName());


    }
}
