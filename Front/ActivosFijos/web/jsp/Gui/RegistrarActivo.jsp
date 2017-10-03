<%-- 
    Document   : RegistrarActivo
    Created on : 30/09/2017, 07:10:21 PM
    Author     : Sergio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<div>
    <h2 align="center"> Registrar Activo </h2>
    <form class="form-horizontal" method="post" action="jsp/Logica/RegistrarArea.jsp" >
        <div id="tab1" >
                   
            <div class="form-group">
                <label class="col-md-2 control-label">Nombre</label>
                <div class="col-md-10">
                    <input type="Text" class="form-control" name="Nombre" placeholder=""   required> 
                </div>
            </div>
            <div class="form-group">
                <label class="col-md-2 control-label">Numero interno</label>
                <div class="col-md-10">
                    <input type="number" class="form-control"  name="Numero" placeholder=""   required>
                </div>
            </div>
            <div class="form-group">
                <label class="col-md-2 control-label">Descripción</label>
                <div class="col-md-10">
                    <input type="Text" class="form-control" name="Descripcion" placeholder=""  >
                </div>
            </div>
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
            <div class="form-group">
                <label class="col-md-2 control-label">Serial</label>
                <div class="col-md-10">
                    <input type="Text" class="form-control"  name="Serial" placeholder="" required>
                </div>
            </div>
            <div class="form-group">
                <label class="col-md-2 control-label">Peso</label>
                <div class="col-md-10">
                    <input type="int" class="form-control"  name="Peso" placeholder="" required>
                </div>
            </div>
            <div class="form-group">
                <label class="col-md-2 control-label">Alto</label>
                <div class="col-md-10">
                    <input type="int" class="form-control"  name="Alto" placeholder="" required>
                </div>
            </div>
            <div class="form-group">
                <label class="col-md-2 control-label">Largo</label>
                <div class="col-md-10">
                    <input type="int" class="form-control"  name="Largo" placeholder="" required>
                </div>
            </div>
            <div class="form-group">
                <label class="col-md-2 control-label">Valor</label>
                <div class="col-md-10">
                    <input type="int" class="form-control"  name="Valor" placeholder="" required>
                </div>
            </div>
            <<div class="form-group">
                <label class="col-md-2 control-label">Fecha Compra</label>
                <input type="date" name="FechaComp" step="1">
            </div>           
            <div class="form-group">
                <label class="col-md-2 control-label">Fecha Baja</label>
                <input type="date" name="FechaBaj" step="1">
            </div>           
            <div class="form-group">
                <label class="col-md-2 control-label">Estado</label>
                <div class="col-md-10">
                    <input type="int" class="form-control"  name="Estado" placeholder="" required>
                </div>
            </div>
            <div class="form-group">
                <label class="col-md-2 control-label">Color</label>
                <div class="col-md-10">
                    <input type="int" class="form-control"  name="Color" placeholder="" required>
                </div>
            </div>
            <div class="form-group">
                <label class="col-md-2 control-label">Persona</label>
                <div class="col-md-10">
                    <input type="int" class="form-control"  namePersonaPeso" placeholder="" required>
                </div>
            </div>
            <div class="form-group">
                <label class="col-md-2 control-label">Area</label>
                <div class="col-md-10">
                    <input type="int" class="form-control"  name="Area" placeholder="" required>
                </div>
            </div>
            
        </div>
            
            <center>
            <button type="submit" class="btn btn-default"  >Actualizar</button>
            </center>
            
    </form>
</div>

