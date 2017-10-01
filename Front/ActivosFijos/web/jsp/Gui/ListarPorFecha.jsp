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
                <label class="col-md-2 control-label">Serie</label>
                <div class="container">
                    <div class="row">
                        <div class='col-sm-6'>
                            <div class="form-group">
                                <div class='input-group date' id='datetimepicker1'>
                                    <input type='text' class="form-control" />
                                    <span class="input-group-addon">
                                        <span class="glyphicon glyphicon-calendar"></span>
                                    </span>
                                </div>
                            </div>
                        </div>
                        <script type="text/javascript">
                            $(function () {
                                $('#datetimepicker1').datetimepicker();
                            });
                        </script>
                    </div>
                </div>
                <label class="col-md-2 control-label">Serie</label>
                <div class="container">
                    <div class="row">
                        <div class='col-sm-6'>
                            <div class="form-group">
                                <div class='input-group date' id='datetimepicker1'>
                                    <input type='text' class="form-control" />
                                    <span class="input-group-addon">
                                        <span class="glyphicon glyphicon-calendar"></span>
                                    </span>
                                </div>
                            </div>
                        </div>
                        <script type="text/javascript">
                            $(function () {
                                $('#datetimepicker1').datetimepicker();
                            });
                        </script>
                    </div>
                </div>
            </div>           
        </div>              

        <center>
            <button type="submit" class="btn btn-default">Listar</button>
        </center>

    </form>

</div>

