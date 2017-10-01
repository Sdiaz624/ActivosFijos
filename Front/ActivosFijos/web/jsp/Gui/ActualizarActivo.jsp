<%-- 
    Document   : ActualizarActivo
    Created on : 30/09/2017, 07:10:29 PM
    Author     : Sergio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
    %>
<div>
    <h2 align="center"> ACTUALIZACION DE DATOS </h2>
   
<form class="form-horizontal" method="post" action="Egresado/procesarActualizacion.jsp" >
        <div id="tab1" >
                   
            <div class="form-group">
                <label class="col-md-2 control-label">Direccion</label>
                <div class="col-md-10">
                    <input type="Text" class="form-control" name="direccion" placeholder=""   required> 
                </div>
            </div>
            <div class="form-group">
                <label class="col-md-2 control-label">Celular</label>
                <div class="col-md-10">
                    <input type="number" class="form-control"  name="celular" placeholder=""   required>
                </div>
            </div>
            <div class="form-group">
                <label class="col-md-2 control-label">Telefono Fijo</label>
                <div class="col-md-10">
                    <input type="number" class="form-control" name="fijo" placeholder=""  >
                </div>
            </div>
            <div class="form-group">
                <label class="col-md-2 control-label">Correo Electronico</label>
                <div class="col-md-10">
                    <input type="email" class="form-control"  name="correo" placeholder="" required>
                </div>
            </div>
            
        </div>

        <div id="tab2" style="display:none">

            <div class="form-group">
                <label class="col-md-2 control-label">Nombre de la Empresa</label>
                <div class="col-md-10">
                    <input type="text" class="form-control" name="empresa"  >
                </div>
            </div>
            <div class="form-group">
                <label class="col-md-2 control-label">Actividad de la Empresa</label>
                <div class="col-md-10">
                    <input type="text" class="form-control" name="actividad">
                </div>
            </div>
            <div class="form-group">
                <label class="col-md-2 control-label">Cargo </label>
                <div class="col-md-10">
                    <input type="text" class="form-control" name="cargo"  >
                </div>
            </div>
            <div class="form-group">
                <label class="col-md-2 control-label">Fecha de Ingreso</label>
                <div class="col-md-10">
                    <input type="date" class="form-control" name="ingreso" >
                </div>
            </div>
            <div class="form-group">
                <label class="col-md-2 control-label">Direccion</label>
                <div class="col-md-10">
                    <input type="text" class="form-control" name="dirempresa" >
                </div>
            </div>
            <div class="form-group">
                <label class="col-md-2 control-label">Ciudad</label>
                <div class="col-md-10">
                    <input type="Text" class="form-control" name="ciuempresa" >
                </div>
            </div>
            <div class="form-group">
                <label class="col-md-2 control-label">Telefono</label>
                <div class="col-md-10">
                    <input type="number" class="form-control" name="telempresa" >
                </div>
            </div>
            <div class="form-group">
                <label class="col-md-2 control-label">Experiencia Laboral</label>
                <textarea class="col-md-10" rows="5" name="explaboral" ></textarea>
            </div>

            
        </div>

        <div id="tab3" style="display:none">
            <div class="form-group">
                <label class="col-md-2 control-form">Tipo de Estudio</label>
                <div class="col-md-10">
                    <select name="estudio" >
                        <option ></option>
                        <option value="Pregado">Pregrado</option>
                        <option value="Especializacion">Especializacion</option>
                        <option value="Maestria">Maestria</option>
                        <option value="Doctorado">Doctorado</option>
                        <option value="PostDoctorado">PostDoctorado</option>
                    </select>
                </div> 
            </div>
            <div class="form-group">
                <label class="col-md-2 control-label">Titulo</label>
                <div class="col-md-10">
                    <input type="Text" class="form-control" name="investigacion" >
                </div>
            </div>
            <div class="form-group">
                <label class="col-md-2 control-label">Experiencia Academica</label>
                <textarea class="col-md-10" rows="5" name="eacademica" ></textarea>
            </div>
            <input type="hidden" name="cc" value="">
            
        </div>
            
          
            
    </form>



</div>

