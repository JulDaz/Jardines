$(document).ready(function () {
    $('#botonCargar').click(function () {
        $.ajax({
            type: 'GET',
            url: "AsistenciaS",
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
                    var opcion = "<option class='idCursos' value=\"" + json[i].idCurso + "\">" + json[i].nombre + "</option>";
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
            url: "AsistenciaS",
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
                    var opcion = "<option class='idFechas' value=\"" +  json[i].idFecha + "\">" + json[i].fecha + "</option>";
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
            url: "AsistenciaS",
            //force to handle it as text
            data: {
                'op':"2",
                'curso':$('#cursosProfesor').val()
            },
            dataType: "text",
            success: function (data) {
                var selectForm = $('#tabla');
               
                selectForm.empty();
                selectForm.append('<option selected  value="" disabled></option>');
                var json = $.parseJSON(data);
                var ok = 'ok';
                var NO = 'no';
                console.log(json);
                for (var i = 0; i < json.length; ++i)
                {
                    var opcion = "<tr><td class='idEstudiantes' values="+ json[i].idEstudiante + ">" + json[i].idEstudiante + "</td> <td>" + json[i].nombre + " </td> <td>  <select class='vino'> <option value='1'> Presente </option><option value='0' > Ausente </option> </select> </tr>";
                    selectForm.append(opcion);
                }
                selectForm.attr('required', false);
            },
            async: false
        });
    });

  
  
  
$('#guardarAsistencia').on('click', function () {
    var idCurso = parseInt($('#cursosProfesor').children("option:selected").val());
    var idEstudiante = Array();
    var idFecha = parseInt($('#fechas').children("option:selected").val());
    var vino = Array();
      $('#tabla tbody tr:not(:eq(0))').each(function(i, x) {
       
        idEstudiante[i]=parseInt($(this).children('td').eq(0).attr('values'));
        
        vino[i]=parseInt($(this).children('td').eq(2).children("select").children("option:selected").val());
    });      
      console.log(idCurso);
      console.log(idEstudiante);
      console.log(idFecha);
      console.log(vino);
      


    $.ajax({
        type: 'POST',
        url: "AsistenciaS",
        data: {
            'idCurso': idCurso,
            'idEstudiante': idEstudiante,
            'idFecha': idFecha,
            'vino': vino
        },
        dataType: "text",
        success: function (data) {

        },
        async: false
    });
});
  
  
  
//
//$('#cursosProfesor').on('change', function () {
//    $.ajax({
//        type: 'POST',
//        url: "S",
//        //force to handle it as text
//        data: {
//         
//        },
//        dataType: "text",
//        success: function (data) {
//
//            var selectForm = $('#estudiante');
//            selectForm.empty();
//            selectForm.append('<option selected  value="" disabled>Seleccion un estudiante</option>');
//            var json = $.parseJSON(data);
//            for (var i = 0; i < json.length; ++i)
//            {
//                var opcion = "<option value=\"" + json[i].idEstudiante + "\">" + json[i].nombre + "</option>";
//                selectForm.append(opcion);
//            }
//            selectForm.attr('required', false);
//        },
//        async: false
//    });
//});


