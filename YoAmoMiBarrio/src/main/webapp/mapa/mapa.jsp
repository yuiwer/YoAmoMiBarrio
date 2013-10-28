<html>    
    <head>
         <script src="https://maps.googleapis.com/maps/api/js?v=3.exp&sensor=false&language=sp"></script>
    <script type="text/javascript">
    var myLatlng = new google.maps.LatLng(${param.lat}, ${param.long});
function initialize() {
  var mapOptions = {
    zoom: 15,
    center: myLatlng,
    mapTypeId: google.maps.MapTypeId.ROADMAP
  };
  var map = new google.maps.Map(document.getElementById('map-canvas'),
      mapOptions);


var marker = new google.maps.Marker({
      position: myLatlng,
      map: map,
      title: '${param.dir}'
  });

}
google.maps.event.addDomListener(window, 'load', initialize);
        </script>
        <style>
html, body, #map-canvas {
        height: 100%;
         margin: 0px;
        padding: 0px;
      }
    </style>
    </head>
    <body>
        <div id="map-canvas"></div>
    </body>
</html>