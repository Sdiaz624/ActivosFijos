<%-- 
    Document   : RegistrarArea
    Created on : 30/09/2017, 07:09:13 PM
    Author     : Sergio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<div>
    <h2 align="center"> Registrar area </h2>
    <form class="form-horizontal" method="post" action="jsp/Logica/RegistrarArea.jsp" >
        <div id="tab1" >
                   
            <div class="form-group">
                <label class="col-md-2 control-label">Nombre</label>
                <div class="col-md-10">
                    <input type="Text" class="form-control" name="nombre" placeholder=""   required> 
                </div>
                <br><br>
                <label class="col-md-2 control-label">Ciudad</label>
                <div class="col-md-10">
                    <input type="Text" class="form-control" name="ciudad" placeholder=""   required> 
                </div>
            </div>           
        </div>              
                  
        <center>
            <button type="submit" class="btn btn-default">Registrar</button>
        </center>
            
    </form>

</div>

