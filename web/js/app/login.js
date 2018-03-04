$('#ingreso').on('submit', function () {
    $.ajax({
        type: 'GET',
        url: "Login",        
        data: {
            'usuario': $('#usuario').val(),
            'password': $('#contra').val()
        },
        dataType: "text",
        success: function (data) {
            $('#mensaje').empty();
            $('#mensaje').attr('style','color:red');
            $('#mensaje').append("Usuario o contraseña incorrecta");
        },
        async: false
    });
});
        
    

 