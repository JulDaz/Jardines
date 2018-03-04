$(document).ready(function () {
    $('#botonCargar').click(function () {
        $.ajax({
            type: 'GET',
            url: "VerListaAsistenciaS",
            //force to handle it as text
            data: {
                'op':"0"

            },
            dataType: "text",
            success: function (data) {
                var selectForm = $('#cursosProfesor');
                selectForm.empty();
                selectForm.append('<option selected  value="" disabled>Seleccione un Curso</option>');
                var json = $.parseJSON(data);
                console.log(json);
                for (var i = 0; i < json.length; ++i)
                {
                    var opcion = "<option value=\"" + json[i].idCurso + "\">" + json[i].nombre + "</option>";
                    selectForm.append(opcion);
                }
                selectForm.attr('required', false);
            },
            async: false
        });
    });
    
     $('#botonCargar').click(function () {
        $.ajax({
            type: 'GET',
            url: "VerListaAsistenciaS",
            //force to handle it as text
            data: {
                'op':"1"

            },
            dataType: "text",
            success: function (data) {
                var selectForm = $('#fechas');
                selectForm.empty();
                selectForm.append('<option selected  value="" disabled>Seleccione una fecha</option>');
                var json = $.parseJSON(data);
                console.log(json);
                for (var i = 0; i < json.length; ++i)
                {
                    var opcion = "<option value=\"" +  json[i].idFecha + "\">" + json[i].fecha + "</option>";
                    selectForm.append(opcion);
                }
                selectForm.attr('required', false);
            },
            async: false
        });
    });
    
    
});



 $('#cursosProfesor').on('change' , function () {
        $.ajax({
            type: 'GET',
            url: "VerListaAsistenciaS",
            //force to handle it as text
            data: {
                'op':"2"

            },
            dataType: "text",
            success: function (data) {
                var selectForm = $('#tabla');
                selectForm.empty();
                selectForm.append('<option selected  value="" disabled></option>');
                var json = $.parseJSON(data);
                console.log(json);
                for (var i = 0; i < json.length; ++i)
                {
                    var opcion = "<tr><td >" + json[i].nombre + "</td> <td>" + json[i].vino + " </td> </tr>";
                    selectForm.append(opcion);
                }
                selectForm.attr('required', false);
            },
            async: false
        });
    });

  
  
  
  
  

$('#cursosProfesor').on('change', function () {
    $.ajax({
        type: 'POST',
        url: "S",
        //force to handle it as text
        data: {
         
        },
        dataType: "text",
        success: function (data) {

            var selectForm = $('#estudiante');
            selectForm.empty();
            selectForm.append('<option selected  value="" disabled>Seleccion un estudiante</option>');
            var json = $.parseJSON(data);
            for (var i = 0; i < json.length; ++i)
            {
                var opcion = "<option value=\"" + json[i].idEstudiante + "\">" + json[i].nombre + "</option>";
                selectForm.append(opcion);
            }
            selectForm.attr('required', false);
        },
        async: false
    });
});


