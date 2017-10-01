
function ajax2(url, datos, rta) {
    var ajax = $.get(url, datos, function (respuesta) {
        $(rta).html(respuesta);
    });
    return ajax;
}
function ajax(url, datos, rta) {
    var ajax = $.get(url, datos, function (respuesta) {
        $(rta).html(respuesta);
    });
    return ajax;
}

/* Principal -----------------------------------------------------------------*/



function registrarArea() {

    var url = "jsp/Gui/RegistrarArea.jsp";
    var datos = {};
    var rta = "#ajax";
    ajax2(url, datos, rta);

}

function listarArea() {

    var url = "jsp/Gui/ListarArea.jsp";
    var datos = {};
    var rta = "#ajax";
    ajax2(url, datos, rta);

}

function registrarPersona() {

    var url = "jsp/Gui/RegistrarPersona.jsp";
    var datos = {};
    var rta = "#ajax";
    ajax2(url, datos, rta);

}

function listarPersona() {

    var url = "jsp/Gui/ListarPersona.jsp";
    var datos = {};
    var rta = "#ajax";
    ajax2(url, datos, rta);

}

function registrarActivo() {
         
    var url = "jsp/Gui/RegistrarActivo.jsp";
    var datos = {};
    var rta = "#ajax";
    ajax2(url, datos, rta);

}

function actualizarActivo() {

    var url = "jsp/Gui/ActualizarActivo.jsp";
    var datos = {};
    var rta = "#ajax";
    ajax2(url, datos, rta);

}

function listarActivo() {

    var url = "jsp/Gui/ListarActivo.jsp";
    var datos = {};
    var rta = "#ajax";
    ajax2(url, datos, rta);

}

function listarPorSerie() {

    var url = "jsp/Gui/ListarPorSerie.jsp";
    var datos = {};
    var rta = "#ajax";
    ajax2(url, datos, rta);

}

function listarPorTipo() {

    var url = "jsp/Gui/ListarPorTipo.jsp";
    var datos = {};
    var rta = "#ajax";
    ajax2(url, datos, rta);

}

function listarPorFecha() {

    var url = "jsp/Gui/ListarPorFecha.jsp";
    var datos = {};
    var rta = "#ajax";
    ajax2(url, datos, rta);

}

function mioferta() {

    var url = "Egresado/Gui/verOferta.jsp";
    var id = document.getElementById("nombre").value;
    var nombre = document.getElementById("nombre").value;
    var nit = document.getElementById("nit").value;
    var cargo = document.getElementById("cargo").value;
    var salario = document.getElementById("salario").value;
    var descripcion = document.getElementById("descripcion").value;
    var fecha = document.getElementById("fecha").value;
    var correo = document.getElementById("correo").value;
    var telefono = document.getElementById("telefono").value;
    var datos = {nombre: nombre, nit: nit, cargo: cargo, salario: salario, descripcion: descripcion, fecha: fecha, correo: correo, telefono: telefono};
    var rta = "#ajax";
    loading(rta);
    ajax2(url, datos, rta);

}

function mioferta1() {

    var url = "Egresado/verOferta.jsp";

    var nombre = document.getElementById("nombre1").value;
    var nit = document.getElementById("nit1").value;
    var cargo = document.getElementById("cargo1").value;
    var salario = document.getElementById("salario1").value;
    var descripcion = document.getElementById("descripcion1").value;
    var fecha = document.getElementById("fecha1").value;
    var correo = document.getElementById("correo1").value;
    var telefono = document.getElementById("telefono1").value;
    var datos = {nombre: nombre, nit: nit, cargo: cargo, salario: salario, descripcion: descripcion, fecha: fecha, correo: correo, telefono: telefono};
    var rta = "#ajax";
    loading(rta);
    ajax2(url, datos, rta);

}

function mioferta2() {

    var url = "Egresado/verOferta.jsp";

    var nombre = document.getElementById("nombre2").value;
    var nit = document.getElementById("nit2").value;
    var cargo = document.getElementById("cargo2").value;
    var salario = document.getElementById("salario2").value;
    var descripcion = document.getElementById("descripcion2").value;
    var fecha = document.getElementById("fecha2").value;
    var correo = document.getElementById("correo2").value;
    var telefono = document.getElementById("telefono2").value;
    var datos = {nombre: nombre, nit: nit, cargo: cargo, salario: salario, descripcion: descripcion, fecha: fecha, correo: correo, telefono: telefono};
    var rta = "#ajax";
    loading(rta);
    ajax2(url, datos, rta);

}

function prorer() {

    var url = "Administrador/generardorResporte.jsp";
    var tipo = document.getElementById("tipo").value;
    var datos = {tipo: tipo};

    var rta = "#ajax";
    loading(rta);
    ajax2(url, datos, rta);

}

