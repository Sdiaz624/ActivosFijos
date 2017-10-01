<%-- 
    Document   : RegistrarPersona
    Created on : 30/09/2017, 07:09:44 PM
    Author     : Sergio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<div>
    <h2 align="center"> Registrar persona </h2>
    <form class="form-horizontal" method="post" action="jsp/Logica/RegistrarPersona.jsp" >
        <div id="tab1" >
                   
            <div class="form-group">
                <label class="col-md-2 control-label">Nombre</label>
                <div class="col-md-10">
                    <input type="Text" class="form-control" name="nombre" placeholder=""   required> 
                </div>
            </div>           
        </div>              
                  
        <center>
            <button type="submit" class="btn btn-default">Registrar</button>
        </center>
            
    </form>

</div>
