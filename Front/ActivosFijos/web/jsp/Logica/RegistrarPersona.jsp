<%-- 
    Document   : RegistrarArea
    Created on : 1/10/2017, 08:45:13 AM
    Author     : Sergio
--%>

<%@page import="java.io.InputStreamReader"%>
<%@page import="java.io.BufferedReader"%>
<%@page import="java.net.HttpURLConnection"%>
<%@page import="java.net.URL"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    String nombre = request.getParameter("nombre");
    
    URL url = new URL("http://localhost:8080/Activos/Persona/Registrar/"+nombre);
    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
    conn.setRequestMethod("GET");
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
