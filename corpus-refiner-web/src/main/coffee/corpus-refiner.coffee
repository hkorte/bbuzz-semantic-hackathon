class NerPanel
	constructor: (@id) ->

	add: (lines) ->
    	console.log lines

nerPanel = new NerPanel "nerPanel"

$(document).ready ->
	$('#logPanel').click -> show_message "you"