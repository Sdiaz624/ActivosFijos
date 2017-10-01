<%-- 
    Document   : ListarPorTipo
    Created on : 30/09/2017, 07:11:35 PM
    Author     : Sergio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<div>
    <h2 align="center"> Listar por tipo </h2>
    <form class="form-horizontal" method="post" action="jsp/Logica/ListarPorTipo.jsp" >
        <div id="tab1" >
                   
            <div class="form-group">
                <label class="col-md-2 control-label">Tipo</label>
                <div class="col-md-10">
                    <select name="tipo" required class="control-label">
                        <option ></option>
                        <option value="bienes">Bienes</option>
                        <option value="Maquinaria">Maquinaria</option>
                        <option value="Material">Material</option>
                        <option value="Otro">Otro</option>
                    </select>
                </div> 
            </div>           
        </div>              
                  
        <center>
            <button type="submit" class="btn btn-default">Listar</button>
        </center>
            
    </form>

</div>

