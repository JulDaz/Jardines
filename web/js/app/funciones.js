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



 