$(document).ready(function () {
             document.addEventListener("deviceready", onDeviceReady, false); 


        });

        function onDeviceReady() {

            StatusBar.overlaysWebView(false);
            StatusBar.backgroundColorByHexString("#107dac"); // => #333333

            StatusBar.styleDefaultt();
			
			screen.orientation.lock('potrait');
        }