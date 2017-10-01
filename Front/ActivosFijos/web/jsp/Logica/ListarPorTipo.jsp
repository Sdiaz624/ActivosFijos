<%-- 
    Document   : ListarPorTipo
    Created on : 1/10/2017, 05:02:42 PM
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
    String tipo = request.getParameter("tipo");
                       
    %><script> alert(<%=tipo%>);</script><%
    
    URL url = new URL("http://localhost:8080/Activos/Activo/ConsultaTipo/"+tipo);    
    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
    conn.setDoOutput(true);
    conn.setDoInput(true);
    conn.setRequestMethod("GET");
    conn.setRequestProperty("Content-Type", "application/json");    
    //conn.setRequestProperty("Accept", "application/xml");
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
                <th>Numero Interno</th>
                <th>Tipo</th>
                <th>Serial</th>
                <th>Peso</th>
                <th>Alto</th>
                <th>Largo</th>
                <th>Valor</th>
                <th>Fecha de compra</th>
                <th>Fecha de baja </th>
                <th>Estado</th>
                <th>color</th>
                <th>Persona</th>
                <th>Area</th>
                <th>Descripción</th>
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
                <th><%=jsonObj.getJSONObject(i).getInt("numeroInt")%></th>
                <th><%=jsonObj.getJSONObject(i).getString("tipo")%></th>
                <th><%=jsonObj.getJSONObject(i).getString("serial")%></th>
                <th><%=jsonObj.getJSONObject(i).getDouble("peso")%></th>
                <th><%=jsonObj.getJSONObject(i).getDouble("alto")%></th>
                <th><%=jsonObj.getJSONObject(i).getDouble("largo")%></th>
                <th><%=jsonObj.getJSONObject(i).getDouble("valor")%></th>
                <th><%=jsonObj.getJSONObject(i).getString("fechaCompra")%></th>
                <th><%=jsonObj.getJSONObject(i).getString("fechaBaja")%></th>
                <th><%=jsonObj.getJSONObject(i).getString("estado")%></th>
                <th><%=jsonObj.getJSONObject(i).getString("color")%></th>
                <th><%=jsonObj.getJSONObject(i).getInt("persona")%></th>
                <th><%=jsonObj.getJSONObject(i).getInt("area")%></th>           
                <th><%=jsonObj.getJSONObject(i).getString("description")%></th>
            </tr>              
            <%
        }
        %>    
        </table>
        </center>
        <br>
        <input type="button" value="volver atrás"  onclick="history.back()" />
        </center>
        
         <%  
        br.close();
    }else{
        %><script> alert("Error, Intente nuevamente");</script>
          <script> location.href = "/index.jsp";</script><%
    }  
    conn.disconnect();
%>