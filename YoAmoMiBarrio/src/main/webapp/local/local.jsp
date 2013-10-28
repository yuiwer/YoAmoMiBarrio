<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Yo amo mi barrio</title>
	<link rel="stylesheet" type="text/css" href="css/bootstrap.css">
	<link rel="stylesheet" type="text/css" href="css/estilo.css">
	<script src="js/jquery.js"></script>
	<script src="js/bootstrap.js"></script>       
	<link rel="stylesheet" href="css/bootstrap-glyphicons.css" media="screen">
        <script type="text/javascript">
	$(document).ready(function(){
        $(".carousel-inner .item:first").addClass("active");
        $('.carousel').carousel({interval: 2500, wrap: true});        
    });
        </script>
        
</head>
<body>
	<div class="container">
		
		<header>
		<div class="row" >

			<div class=" col-xs-5 col-lg-3" id="logo">
				
				<a  href="index.html"> <img src="img/logo.png" alt="ponealgo"> </a>
				
			</div>
			<div class="col-xs-2 col-lg-1">
      </div>
      <div class="col-xs-2 col-lg-4" id="logo2">

        <img src="<c:url value="/img/locales/"/>${local.idLocal}/${local.foto}" alt="ponealgo"> </a>


      </div>
      <div class="col-xs-2 col-lg-1">
      </div>
			
      <div class="col-xs-5 col-lg-3">
					<!--<section id="social">
  					<p>
					<a href="#"><img src="img/social/fb.png" width="55" alt="some_text"></a>
					<a href="#"><img src="img/social/tw3.jpg" width="43" alt="some_text"></a>
					<a href="#"><img src="img/social/g.png" width="55" alt="some_text"></a>
					<a href="#"><img src="img/social/s.png" width="53" alt="some_text"></a>
					</p>
					</section>-->
        
          <form  class="form-inline" role="form" id="buscar">
            <div class="form-group">
              <label class="sr-only" for="exampleInputEmail2">Email address</label>
              <input type="text" class="form-control" id="exampleInputEmail2" placeholder="Que necesitas?">
            </div>
 
  
          </form>
			</div>
			
		</div>
		</header>
		

		<div class="row" id="he2">
			<!--<div class="col-lg-4"></div>-->
			<div class="col-lg-2" >
				
				
        <a class="dropdown-toggle btn btn-primary" data-toggle="dropdown" href="#">
          Volver <span class="caret"></span>
        </a>
          <ul class="dropdown-menu">
            <li><a href="index.html"> Home </a></li>
            
            <li><a href="#">Buscar locales</a></li>

            <li><a href="#">Salidas</a></li>

            <li><a href="#">Contactenos</a></li>
      
          </ul>

		
			</div>
    </div>  

    <div class="row" id="datos">
      
      <div class="col-lg-8" >
          
          <div class="panel panel-info" id="he2">
              <div class="panel-heading">${local.razonSocial}</div>
                <div class="panel-body">
                  
                  <div id="nos"> <p>${local.descripcion}</p></div>
                  <p> <span>Direccion:</span>${local.direccion}</p> <br> 
                  <!-- aca podria poner los iconos en vez de los titulos -->

                  <p> <span>Telefono:</span> ${local.telefono}</p> <br>
                  <p> <span>Mail:</span> ${local.mail}</p> <br>
                  <a href="#">  <p>${local.paginaweb}</p> </a> <br>
                  <p> <span>algo mas:</span> ????????</p> <br>
                  <section id="social">
                    <p>  
                        <a href="https://www.facebook.com/${local.redesocialesFb}" target="_blank"><img src="img/social/fb.png" width="45" alt="some_text"></a>
                      <a href="https://twitter.com/${local.redesocialesTw}" target="_blank"><img src="img/social/tw2.png" width="35" alt="some_text"></a>
                      <a href="https://plus.google.com/${local.redesocialesGm}" target="_blank"><img src="img/social/g.png" width="43" alt="some_text"></a>
                      <a href="#"><img src="img/social/s.png" width="43" alt="some_text"></a>
                      <a href="#"><img src="img/social/ml.png" width="47" alt="some_text"></a>
                    </p>
          
                  </section>
                  

                  <div id="slider3">

                    <div id="carousel-example-generic" class="carousel slide">
  <!-- Indicators -->
                    <ol class="carousel-indicators">
                      <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
                      <li data-target="#carousel-example-generic" data-slide-to="1"></li>
                      <li data-target="#carousel-example-generic" data-slide-to="2"></li>
                    </ol>

  <!-- Wrapper for slides -->
                    <div class="carousel-inner">
                        <c:forEach items="${listaFotos}" var="foto">
                            <div class="item">           
        
                                <img src="<c:url value="/img/locales/"/>${local.idLocal}/${foto}" alt="ponealgo">                          
                      </div>
                        </c:forEach>                                             
                    </div>

  <!-- Controls -->
                    <a class="left carousel-control" href="#carousel-example-generic" data-slide="prev">
                      <span class="icon-prev"></span>
                    </a>
                    <a class="right carousel-control" href="#carousel-example-generic" data-slide="next">
                      <span class="icon-next"></span>
                    </a>
                    </div>
                    
                  </div>

                  <p> <span>Horarios:</span> lunes a viernes de 9hs a 20hs</p> <br>
                  <p> sabados de 9hs a 12hs</p>


                
           
                </div>
          </div>



      </div>



      <div class="col-lg-4" id="he2">

          <div id="mapa">
          
              <iframe src="<c:url value="/mapa/mapa.jsp"/>?lat=${local.latitud}&long=${local.longitud}&dir=${local.direccion}" width="350" height="350"></iframe>
          
      
      </div>

      </div>


		</div>

		



		

		<div class="row" id="he2">
			
			<div class="col-lg-8">
			
      </div>
    





			<div class="col-lg-4">
					<form role="form" id="he3">
  							
  							<div class="form-group">
    							<label for="exampleInputEmail1">Nombre</label>
    							<input type="text" class="form-control" id="exampleInputEmail1">
  							</div>

  							<div class="form-group">
    							<label for="exampleInputEmail1">E-mail</label>
    							<input type="email" class="form-control" id="exampleInputEmail1">
  							</div>
  							
  							
  							<label for="exampleInputEmail1">Mensaje</label>
  							<textarea class="form-control" rows="4"></textarea>
  
  							<button type="submit" class="btn btn-primary">Enviar</button>
						</form>






			</div>
		</div>




</div>















</body>
</html>