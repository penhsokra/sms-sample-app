$(window).scroll(function() {
		var scrollPos = $(this).scrollLeft();
		$('.header').css('left',-scrollPos);
	});
