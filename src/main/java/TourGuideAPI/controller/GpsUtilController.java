package TourGuideAPI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jsoniter.output.JsonStream;

import TourGuideAPI.dto.User;
import TourGuideAPI.service.TourGuideService;

@RestController
public class GpsUtilController {

	@Autowired
	TourGuideService tourGuideService;

	@PostMapping("/getUserLocation")
	public String getUserLocation(@RequestParam User user) {
		return JsonStream.serialize(tourGuideService.getUserLocation(user));
	}

	@GetMapping("/getAttraction")
	public String getAttraction() {
		return JsonStream.serialize(tourGuideService.getAttraction());
	}

	@RequestMapping("/")
	public String home() {
		return "home";
	}
}
