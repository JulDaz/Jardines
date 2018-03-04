$('#login').on('submit', function () {
    $.ajax({
        type: 'GET',
        url: "Login",        
        data: {
            'usuario': $('#usuario'),
            'password': $('#password')
        },
        dataType: "text",
        success: function (data) {
            
        },
        async: false
    });
});
        
    

 