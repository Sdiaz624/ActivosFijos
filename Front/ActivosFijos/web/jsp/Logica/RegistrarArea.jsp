<%-- 
    Document   : RegistrarArea
    Created on : 1/10/2017, 10:59:41 AM
    Author     : Sergio
--%>

<%@page import="net.sf.json.JSONObject"%>
<%@page import="java.io.InputStreamReader"%>
<%@page import="java.io.BufferedReader"%>
<%@page import="java.net.HttpURLConnection"%>
<%@page import="java.net.URL"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    String nombre = request.getParameter("nombre");
    String ciudad = request.getParameter("ciudad");
      
    JSONObject json = new JSONObject();
    json.put("nombre", nombre );
    json.put("ciudad", ciudad );    
    
    
    URL url = new URL("http://localhost:8080/Activos/Area/Registrar");
    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
    conn.setRequestMethod("POST");
    conn.getHeaderField("{nombre:"+nombre+""
                      +"ciudad:"+ciudad+"}");
    conn.setRequestProperty("Accept", "application/xml");
    
    if (conn.getResponseCode() > 200 && conn.getResponseCode() < 299) {
        BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));      
        %><script> alert("Registrado Correctamente");</script>
          <script> location.href = "../../index.jsp";</script>
        <%
    }else {
        %><script> alert("Error, Intente nuevamente");</script>
          <script> location.href = "../../index.jsp";</script>
        <%
    }  
%>
