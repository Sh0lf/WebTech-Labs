function f1() {
	$(document).ready(function() {
		$('#myTitle').html('<i>New Title</i>');
	});
}

function f2() {
	$(function() { // shortcut for $(document).ready(function() {
		$('#div1').html('<b>Some new text</b>');
	});
}

function f3() {
	$(function() { 
		$('#div1').after('<font color=red>Some texte added after</font>');
	});
}

function f4() {
	$(function() { 
		$('title').text('New Title');
	});
}

function f5() {
	$(function() { 
		$('#div1').toggle();
	});
}