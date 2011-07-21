startKeyNav = function() {
	$('#ul').append($('<li/>').append('Init'));
	$(document).keydown(function(e) {
		var key = 0;
		if (e == null) {
			key = event.keyCode;
		} else { // mozilla
			key = e.which;
		}
		switch (key) {
		case 37:
			$('#ul').append($('<li/>').append('Left'));
			break;
		case 38:
			$('#ul').append($('<li/>').append('Up'));
			break;
		case 39:
			$('#ul').append($('<li/>').append('Right'));
			break;
		case 40:
			$('#ul').append($('<li/>').append('Down'));
			break;
		case 13:
			$('#ul').append($('<li/>').append('Return'));
			break;
		}
	});
}
