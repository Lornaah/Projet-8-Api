package TourGuideAPI;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.Locale;
import java.util.UUID;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import TourGuideAPI.dto.PriceDTO;
import TourGuideAPI.dto.User;
import TourGuideAPI.service.TourGuideService;
import gpsUtil.location.Attraction;
import gpsUtil.location.VisitedLocation;
import tripPricer.Provider;

@SpringBootTest
class TourGuideApiApplicationTests {

	@Autowired
	TourGuideService tourGuideService;

	@BeforeEach
	public void beforeEach() {
		Locale.setDefault(Locale.US);
	}

	@Test
	public void getUserLocation() {

		User user = new User(UUID.randomUUID(), "jon", "000", "jon@tourGuide.com");

		VisitedLocation visitedLocation = tourGuideService.getUserLocation(user.getUserId());

		assertTrue(visitedLocation.userId.equals(user.getUserId()));
	}

	@Test
	public void getAttraction() {

		List<Attraction> attractionList = tourGuideService.getAttraction();

		assertFalse(attractionList == null);
		assertFalse(attractionList.isEmpty());

	}

	@Test
	public void getAttractionRewardPoints() {
		UUID attractionID = UUID.randomUUID();
		UUID userID = UUID.randomUUID();

		int rewardPoints = tourGuideService.getAttractionRewardPoints(attractionID, userID);

		assertTrue(rewardPoints >= 0);
	}

	@Test
	public void getPrice() {
		PriceDTO priceDTO = new PriceDTO();

		List<Provider> providerList = tourGuideService.getPrice(priceDTO);

		assertFalse(providerList == null);
		assertFalse(providerList.isEmpty());
	}
}
