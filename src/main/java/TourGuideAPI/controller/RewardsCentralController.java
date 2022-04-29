package TourGuideAPI.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import TourGuideAPI.service.TourGuideService;

@RestController
public class RewardsCentralController {

	@Autowired
	TourGuideService tourGuideService;

	@Autowired
	ObjectMapper mapper;

	@PostMapping("/getAttractionRewardPoints")
	public String getAttractionRewardPoints(@RequestParam UUID attractionId, @RequestParam UUID userId)
			throws JsonProcessingException {
		return mapper.writeValueAsString(tourGuideService.getAttractionRewardPoints(attractionId, userId));
	}
}
