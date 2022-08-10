package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.server.ResponseStatusException;

import com.example.demo.dto.DataListDTO;
import com.example.demo.service.ProjectService;

@CrossOrigin(origins = "http://localhost:4200")
@Controller
@RequestMapping("/api")
public class ProjectController {
	
	@Autowired
	private ProjectService projectService;
	
	
	@ResponseBody
	@PostMapping("/getMaxValue")
	public ResponseEntity<Integer> getMaxValue(@RequestBody DataListDTO dataObject) {
		Integer maxValue = null;
		if (dataObject == null || dataObject.getData() == null || dataObject.getData().isEmpty()) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Empty Data List");
		}
		maxValue = projectService.getMaxValue(dataObject);

		return ResponseEntity.ok(maxValue);
	}

}
