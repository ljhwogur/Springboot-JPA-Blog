package com.cos.blog.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/blog")
public class TempController {
	@GetMapping("/temp/jsp")
	public String tempJsp( ) {
		return "/test";
	}
}
