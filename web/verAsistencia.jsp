<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html lang="en">
    <head>
        <title>Buscar lista de Asistencia</title>
    <meta charset="utf-8" />
        <link rel="icon" type="image/png" href="assets/img/colegio.ico">
        <link rel="apple-touch-icon" sizes="76x76" href="assets/img/apple-icon.png">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
        
    </head>
    
  
    <body>

        <div class="container-fluid text-center">    
            <div class="row content">
                <div class="col-sm-2 sidenav">

                </div>
                <div class="col-sm-8 text-left"> 
                    <h1>Buscar lista Asistencia</h1>
                    <p></p>
                    <a href="listaAsistencia.jsp"  class="nav-link"  ><i class=" nc-icon nc-badge"></i>Volver</a>
                    <input type="button" name="guardar" id="botonCargar" > Cargar Cursos 
                    <hr>
                    

                    <form id="formulario" class="form-inline" >
                      <SELECT  id="cursosProfesor">
                              <OPTION></OPTION>
                              
                      </SELECT>
                        
                        <SELECT  id="fechas">
                              <OPTION></OPTION>
                              
                      </SELECT>
                        
                        <table class="table table-striped" id="tabla" >
                            <thead>
                                <tr>
                                    <th>ID Estudiante</th>
                                    <th>Nombre Estudiante</th>

                                </tr>
                            </thead>

                            <tbody>
                            
                                <tr>

                                    <td id="id_estudiante" ></td>
                                    <td id="nombre_estudiante"></td>


                                    <td>
                                        <SELECT id="opciones">
                                            <OPTION value="0"></OPTION>
                                            
                                        </SELECT>
                                    </td>
                                </tr>
                              

                            </tbody>
                        </table>
                        <button type="button" id="guardarAsistencia">Guardar</button> 

                       
                    </form>
                                
                    


                </div>

            </div>
        </div>

        <script src="js/jquery-1.7.1.min.js"></script>
        <script src="js/app/verasistencia.js"></script>
    </body>
</html>