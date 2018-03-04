$('#verPerfil').click(function () {
    $.ajax({
        type: 'GET',
        url: "ProfesorS",
        //force to handle it as text
        data: {
            'cedula': "26587452"
        },
        dataType: "text",
        success: function (data) {
            var json = $.parseJSON(data);
            $('#nombre').attr('value', json.nombre);
            $('#usuario').attr('value', json.usuario);
            $('#fechanacimiento').attr('value', json.fechaNacimiento);
            $('#tiposangre').attr('value', json.tipoSangre);
            $('#rh').attr('value', json.rh);
            $('#correo').attr('value', json.correo);
            $('#celular').attr('value', json.celular);
            $('#direccion').attr('value', json.direccion);
            $('#estudios').attr('value', json.estudios);
            $('#experiencia').attr('value', json.experiencia);

        },
        async: false
    });
});
$(document).ready(function () {
    
    $('#enviarE').on('submit', function () {
    $.ajax({
        type: 'POST',
        url: "EstudianteS",        
        data: {
            'documento': $('#documento').val(),
            'nombre': $('#nombre').val(),
            'idcurso': $('#idcurso').val(),
            'fechanacimiento': $('#fechanacimiento').val(),
            'direccion': $('#direccion').val(),
            'celularcontacto': $('#celularcontacto').val(),
            'tiposangre': $('#tiposangre').val(),
            'rh': $('#rh').val()
        },
        dataType: "text",
        success: function (data) {
            
        },
        async: false
    });
});

$('#botonEditar').click(function () {
        $.ajax({
            type: 'GET',
            url: "ObservadorS",
            //force to handle it as text
            data: {
                
            },
            dataType: "text",
            success: function (data) {              
                $('.EditarE').removeAttr('style');
                $('#CrearE').attr('style', 'display: none;');
                $('.VerE').attr('style', 'display: none;');
                $('#EliminarE').attr('style', 'display: none;');

             
            },
            async: false
        });
    });
  });