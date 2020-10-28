package com.emergentes.controlador;

import com.emergentes.modelo.Encuesta;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author facu_
 */
@WebServlet(name = "ServeletControlador", urlPatterns = {"/ServeletControlador"})
public class ServeletControlador extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nombre =request.getParameter("nombre");
        String[] lenguaje=request.getParameterValues("lenguaje");
        //crear objeto 1
        Encuesta obj1=new Encuesta();
        obj1.setNombre(nombre);
        obj1.setLenguaje(lenguaje);
        request.setAttribute("miEncu", obj1);
        request.getRequestDispatcher("salida.jsp").forward(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
