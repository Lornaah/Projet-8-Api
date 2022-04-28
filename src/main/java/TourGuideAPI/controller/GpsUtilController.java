package TourGuideAPI.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import TourGuideAPI.service.TourGuideService;

@RestController
public class GpsUtilController {

	@Autowired
	TourGuideService tourGuideService;

	@Autowired
	ObjectMapper mapper;

	@PostMapping("/getUserLocation")
	public String getUserLocation(@RequestParam UUID id) throws JsonProcessingException {
		return mapper.writeValueAsString(tourGuideService.getUserLocation(id));
	}

	@GetMapping("/getAttraction")
	public String getAttraction() throws JsonProcessingException {
		return mapper.writeValueAsString(tourGuideService.getAttraction());
	}

	@RequestMapping("/")
	public String home() {
		return "home";
	}
}
