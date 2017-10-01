<%-- 
    Document   : ListarArea
    Created on : 30/09/2017, 07:09:28 PM
    Author     : Sergio
--%>


<%@page import="org.json.JSONArray"%>
<%@page import="org.json.JSONObject"%>
<%@page import="java.io.InputStream"%>
<%@page import="java.io.BufferedInputStream"%>
<%@page import="java.io.OutputStream"%>
<%@page import="java.io.InputStreamReader"%>
<%@page import="java.io.BufferedReader"%>
<%@page import="java.net.HttpURLConnection"%>
<%@page import="java.net.URL"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>


<%
    
    URL url = new URL("http://localhost:8080/Activos/Area/Consulta");
    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
    conn.setDoOutput(true);
    conn.setDoInput(true);
    conn.setRequestMethod("GET");
    conn.setRequestProperty("Content-Type", "application/json");    
    conn.setRequestProperty("Accept", "application/json");
    JSONArray jsonObj = null;
          
    
    if (conn.getResponseCode()== HttpURLConnection.HTTP_OK) {
            
        BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream()),"UTF-8"));      
        String line;
        StringBuilder jsonString = new StringBuilder();
        %>
        <table class="table">
            <tr>
                <th>Id</th>
                <th>Nombre</th>
                <th>Ciudad</th>
            </tr>    
        <%
        String output = null;
        while ((line = br.readLine()) != null) {
            int i = line.indexOf("[");
            line = line.substring(i);
            jsonObj = new JSONArray(line);    
        }
        for (int i = 0; i<jsonObj.length();i++){
            %>
            <tr>
                <th><%=jsonObj.getJSONObject(i).getInt("id")%></th>
                <th><%=jsonObj.getJSONObject(i).getString("nombre")%></th>
                <th><%=jsonObj.getJSONObject(i).getString("ciudad")%></th>
            </tr>              
            <%
        }
        %>    
        </table>
         <%  
        br.close();
    }else{
        %><script> alert("Error, Intente nuevamente");</script>
          <script> location.href = "/index.jsp";</script><%
    }  
    conn.disconnect();
%>