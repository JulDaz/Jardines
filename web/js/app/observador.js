

//$('#SelectCurso').on('submit', function () {
//    var valor = $('#curso').val();
//    consultarEstudiantes(valor);
//    var casilla = $('#SelectEstudiante');
//    casilla.removeClass('hidden-sm-up');
//    var casilla2 = $('#estudiante');
//    casilla2.attr('required', false);
//    return false;
//});




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
            selectForm.append('<option selected  value="" disabled>Seleccion un estudiante</option>');
            var json = $.parseJSON(data);
            console.log(json);
            for (var i = 0; i < json.length; ++i)
            {
                var opcion = "<option value=\"" + json[i].idEstudiante + "\">" + json[i].nombre + "</option>";
                selectForm.append(opcion);
            }
            var casilla = $('#SelectEstudiante');
            casilla.removeClass('hidden-sm-up');
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
            var selectForm = $('#parrafo');
            var json = $.parseJSON(data);
            selectForm.empty();
            for (var i = 0; i < json.length; ++i)
            {
                var opcion = json[i].detalles + "," + json[i].calificacion;
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