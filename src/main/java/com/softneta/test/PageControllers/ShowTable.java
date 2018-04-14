package com.softneta.test.PageControllers;

import com.softneta.test.modal.ImageEntity;
import com.softneta.test.modal.sqlite.SQLiteCommands;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/ShowTable")
public class ShowTable extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public ShowTable() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        SQLiteCommands comm = new SQLiteCommands();
        List<ImageEntity> list = comm.getList();
        list = picsOnly(list);
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.print("<h1>Duomenu bazes nuotraukos</h1>");
        StringBuilder builder = new StringBuilder();
        builder.append("<table>");
        for(ImageEntity pic : list){
            builder.append("<tr><td><img src=\""+ "file:///" +pic.getPath()+"\" /></td></tr>");
        }
        builder.append("</table>");
        out.print(builder.toString());
    }//out/artifacts/softneta_war_exploded/WEB-INF/classes/static/images/web1.png

    private List<ImageEntity> picsOnly(List<ImageEntity> list){
        List<ImageEntity> edited = new ArrayList<ImageEntity>();
        String path;
        File temp = new File("");
        for(ImageEntity pic : list) {
            File f = new File(pic.getPath());
            path = f.getPath();
            if(path.contains("_sfntI")){
                path = path.replace("_sfntI", "jpeg");
                temp = new File(path);
                f.renameTo(temp);
            }
            if(path.contains("jpeg") && temp.exists()) {
                pic.setPath(pic.getPath().replace("_sfntI", "jpeg"));
                edited.add(pic);
            }
        }
        return edited;
    }
}
