package TourGuideAPI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import TourGuideAPI.dto.PriceDTO;
import TourGuideAPI.service.TourGuideService;

@RestController
public class TripPricerController {
	@Autowired
	TourGuideService tourGuideService;

	@Autowired
	ObjectMapper mapper;

	@PostMapping("/getPrice")
	public String getPrice(@RequestBody PriceDTO priceDTO) throws JsonProcessingException {
		return mapper.writeValueAsString(tourGuideService.getPrice(priceDTO));
	}
}
