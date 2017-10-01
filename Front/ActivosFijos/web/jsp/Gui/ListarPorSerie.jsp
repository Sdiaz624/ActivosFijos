<%-- 
    Document   : ListarPorSerie
    Created on : 30/09/2017, 07:11:10 PM
    Author     : Sergio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<div>
    <h2 align="center"> Listar por serie </h2>
    <form class="form-horizontal" method="post" action="jsp/Logica/ListarPorSerie.jsp" >
        <div id="tab1" >
                   
            <div class="form-group">
                <label class="col-md-2 control-label">Serie</label>
                <div class="col-md-10">
                    <input type="Text" class="form-control" name="serie" placeholder=""   required> 
                </div>
            </div>           
        </div>              
                  
        <center>
            <button type="submit" class="btn btn-default">Listar</button>
        </center>
            
    </form>

</div>
