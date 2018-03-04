

//$('#SelectCurso').on('submit', function () {
//    var valor = $('#curso').val();
//    consultarEstudiantes(valor);
//    var casilla = $('#SelectEstudiante');
//    casilla.removeClass('hidden-sm-up');
//    var casilla2 = $('#estudiante');
//    casilla2.attr('required', false);
//    return false;
//});
$(document).ready(function () {
    $('#botonVisualizar').click(function () {
        $.ajax({
            type: 'GET',
            url: "ObservadorS",
            //force to handle it as text
            data: {
                'opcion': "0"
            },
            dataType: "text",
            success: function (data) {
                $('#tablaObs').removeAttr('style');
                $('#SelectCurso').removeAttr('style');
                $('#AddObs').attr('style', 'display: none;');
                var selectForm = $('#curso');
                selectForm.empty();
                selectForm.append('<option selected  value="" disabled>Seleccione un curso</option>');
                var json = $.parseJSON(data);
                console.log(json);
                for (var i = 0; i < json.length; ++i)
                {
                    var opcion = "<option value=\"" + json[i].idCurso + "\">" + json[i].nombre + "</option>";
                    selectForm.append(opcion);
                }
            },
            async: false
        });
    });
    
    $('#botonRealizar').click(function () {
        $.ajax({
            type: 'GET',
            url: "ObservadorS",
            //force to handle it as text
            data: {
                'opcion': "0"
            },
            dataType: "text",
            success: function (data) {
                $('#AddObs').removeAttr('style');
                $('#tablaObs').attr('style', 'display: none;');
                $('#SelectCurso').removeAttr('style');
                var selectForm = $('#curso');
                selectForm.empty();
                selectForm.append('<option selected  value="" disabled>Seleccione un curso</option>');
                var json = $.parseJSON(data);
                console.log(json);
                for (var i = 0; i < json.length; ++i)
                {
                    var opcion = "<option value=\"" + json[i].idCurso + "\">" + json[i].nombre + "</option>";
                    selectForm.append(opcion);
                }                          
            },
            async: false
        });
    });
});



$('#AddObs').on('submit', function () {
    $.ajax({
        type: 'POST',
        url: "ObservadorS",        
        data: {
            'detalles': $('#detalles').val(),
            'calificacion': $('#calificacion').val(),
            'idEstudiante': $('#estudiante').val()
        },
        dataType: "text",
        success: function (data) {
            
        },
        async: false
    });
});


$('#curso').on('change', function () {
    $.ajax({
        type: 'GET',
        url: "ObservadorS",
        //force to handle it as text
        data: {
            'opcion': "1",
            'curso': $('#curso').val()
        },
        dataType: "text",
        success: function (data) {

            var selectForm = $('#estudiante');
            selectForm.empty();
            selectForm.append('<option selected  value="" disabled>Seleccione un estudiante</option>');
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

$('#estudiante').on('change', function () {
    $.ajax({
        type: 'GET',
        url: "ObservadorS",
        //force to handle it as text
        
        data: {
            'opcion': "2",
            'estudiante': $('#estudiante').val()
        },
        dataType: "text",
        success: function (data) {
            var selectForm = $('#tablaObs');
            selectForm.empty();
            selectForm.append('<tr><td style="color:white" >Detalles</td><td style="color:white" >Calificacion</td> </tr>');
            var json = $.parseJSON(data);
            for (var i = 0; i < json.length; ++i)
            {
                var opcion = "<tr><td style=\"color:white\" >" + json[i].detalles + "</td><td style=\"color:white\" >" + json[i].calificacion + "</td> </tr>";
                selectForm.append(opcion);
            }
        },
        async: false
    });
});



//function consultarEstudiantes(curso) {
//    $.ajax({
//        type: 'GET',
//        url: "ObservadorS",
//        //force to handle it as text
//        data: {
//            'opcion': "1",
//            'curso': curso
//        },
//        dataType: "text",
//        success: function (data) {
//            var selectForm = $('#estudiante');
//            selectForm.empty();
//            selectForm.append('<option selected  value="" disabled>Seleccion un estudiante</option>');
//            var json = $.parseJSON(data);
//            console.log(json);
//            for (var i = 0; i < json.length; ++i)
//            {
//                var opcion = "<option value=\"" + json[i].idEstudiante + "\">" + json[i].nombre + "</option>";
//                selectForm.append(opcion);
//            }
//        },
//        async: false
//    });
//
//}