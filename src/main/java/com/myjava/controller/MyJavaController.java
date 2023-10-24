package com.myjava.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyJavaController {
@GetMapping(path="/getAll")
public String get() {
	return "am single santhosh";
}
}
