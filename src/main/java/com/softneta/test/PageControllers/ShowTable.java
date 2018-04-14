package com.softneta.test.PageControllers;

import com.softneta.test.modal.*;
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
        List<PatientInfo> fullInfo = getInfo(list);
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        StringBuilder builder = buildHTML(fullInfo);
        out.print(builder.toString());
    }//out/artifacts/softneta_war_exploded/WEB-INF/classes/static/images/web1.png

    private StringBuilder buildHTML(List<PatientInfo> list){
        int n = 0;
        StringBuilder builder = new StringBuilder();
        builder.append("<head>");
        builder.append("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">" +
                "  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>" +
                "  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>");
        builder.append("</head>");
        builder.append("<body>");
        builder.append("<h1>Duomenu bazes nuotraukos</h1>");
        builder.append("<div class=\"panel-group\" id=\"accordion\">");
        for(PatientInfo pic : list){
            n++;
            builder.append("<div class=\"panel panel-default\">" +
                    "      <div class=\"panel-heading\">" +
                    "        <h4 class=\"panel-title\">" +
                    "          <a data-toggle=\"collapse\" data-parent=\"#accordion\" href=\"#collapse"+n+"\">"+pic.getPatient().getOrigid()+"</a>" +
                    "        </h4>" +
                    "      </div>");
            builder.append("<div id=\"collapse"+n+"\" class=\"panel-collapse collapse in\"><div class=\"panel-body\">");

            builder.append("<img src=\""+ "file:///" +pic.getImage().getPath()+"\" />");
            builder.append("<table>");
            builder.append("<tr>"+ "<td>"+"UUid"+"</td><td colspan=\"3\">"+pic.getImage().getUuid()+"</td>" +"<tr>");
            builder.append("<tr>"+ "<td>"+"Address"+"</td><td colspan=\"3\">"+pic.getPatient().getAddress()+"</td>" +"<tr>");
            builder.append("<tr>"+ "<td>"+"Age"+"</td><td colspan=\"3\">"+pic.getPatient().getAge()+"</td>" +"<tr>");
            builder.append("<tr>"+ "<td>"+"First Name"+"</td><td colspan=\"3\">"+pic.getPatient().getFirstname()+"</td>" +"<tr>");
            builder.append("<tr>"+ "<td>"+"Last Name"+"</td><td colspan=\"3\">"+pic.getPatient().getLastname()+"</td>" +"<tr>");
            builder.append("</table>");
            builder.append("</div>" +"</div>");
        }
        builder.append("</div>");
        builder.append("</body>");
        return builder;
    }

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

    private List<PatientInfo> getInfo(List<ImageEntity> list){
        List<SeriesEntity> seriesList = new SQLiteCommands().getSeriesList();
        List<StudyEntity> studiesList = new SQLiteCommands().getStudyList();
        List<PatientEntity> patientList = new SQLiteCommands().getPatientList();

        List<PatientInfo> fullInfo = new ArrayList<PatientInfo>();
        PatientInfo patient;
        for(ImageEntity img: list){
            patient = new PatientInfo();
            patient.setImage(img);

            for(SeriesEntity series : seriesList){
                if(series.getUuid().equals(img.getSeriesuid())){
                    for(StudyEntity study : studiesList){
                        if(study.getUuid().equals(series.getStudyuid())){
                            for(PatientEntity pat : patientList){
                                if(pat.getOrigid().equals(study.getPatientid())){
                                    patient.setPatient(pat);
                                    fullInfo.add(patient);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        return fullInfo;
    }
}
