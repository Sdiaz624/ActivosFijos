<%-- 
    Document   : ListarProFecha
    Created on : 30/09/2017, 07:11:19 PM
    Author     : Sergio
--%>
<div>
    <h2 align="center"> Listar por fechas </h2>
    <form class="form-horizontal" method="post" action="jsp/Logica/ListarPorFecha.jsp" >
        <div id="tab1" >

            <div class="form-group">
                <label class="col-md-2 control-label">Fecha Inicio</label>
                <input type="date" name="FechaIni" step="1">
                          
            </div>           
            <div class="form-group">
                
                <label class="col-md-2 control-label">Fecha Fin</label>
                <input type="date" name="FechaFin" step="1">
            </div>           
        </div>              

        <center>
            <button type="submit" class="btn btn-default">Listar</button>
        </center>

    </form>

</div>

