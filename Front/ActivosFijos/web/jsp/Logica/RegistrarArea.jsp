<%-- 
    Document   : RegistrarArea
    Created on : 1/10/2017, 10:59:41 AM
    Author     : Sergio
--%>

<%@page import="java.io.OutputStreamWriter"%>
<%@page import="org.json.JSONObject"%>
<%@page import="org.json.JSONArray"%>
<%@page import="java.io.InputStreamReader"%>
<%@page import="java.io.BufferedReader"%>
<%@page import="java.net.HttpURLConnection"%>
<%@page import="java.net.URL"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    String nombre = request.getParameter("nombre");
    String ciudad = request.getParameter("ciudad");
    URL url = new URL("http://localhost:8080/Activos/Area/Registrar");                              
    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
    conn.setDoOutput(true);
    conn.setDoInput(true);
    conn.setRequestMethod("POST");
    conn.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
    //conn.setRequestProperty("Accept", "application/json");
    JSONObject jsonObj = new JSONObject();
    jsonObj.put("id", 0);
    jsonObj.put("ciudad", ciudad);  
    jsonObj.put("nombre", nombre);
    String json =  jsonObj.toString();
 
    OutputStreamWriter wr= new OutputStreamWriter(conn.getOutputStream());
    wr.write(jsonObj.toString());
        %><script> alert(<%=jsonObj.toString()%>);</script><%
    wr.flush();
    if (conn.getResponseCode() > 200 && conn.getResponseCode() < 299) {
        BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));      
        %><script> alert("Registrado Correctamente");</script>
          <script> history.back();</script>
        <%
    }else {
        %><script> alert(<%=conn.getResponseCode()%>);</script>
          <script> history.back();</script>
        <%
    }  
%>
