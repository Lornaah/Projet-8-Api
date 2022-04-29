package TourGuideAPI.service;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import TourGuideAPI.dto.PriceDTO;
import gpsUtil.GpsUtil;
import gpsUtil.location.Attraction;
import gpsUtil.location.VisitedLocation;
import rewardCentral.RewardCentral;
import tripPricer.Provider;
import tripPricer.TripPricer;

@Service
public class TourGuideServiceImpl implements TourGuideService {

	private final GpsUtil gpsUtil = new GpsUtil();
	private final RewardCentral rewardCentral = new RewardCentral();
	private final TripPricer tripPricer = new TripPricer();

	@Override
	public VisitedLocation getUserLocation(UUID id) {
		return gpsUtil.getUserLocation(id);
	}

	@Override
	public List<Attraction> getAttraction() {
		return gpsUtil.getAttractions();
	}

	@Override
	public int getAttractionRewardPoints(UUID attractionID, UUID userID) {
		return rewardCentral.getAttractionRewardPoints(attractionID, userID);
	}

	@Override
	public List<Provider> getPrice(PriceDTO priceDTO) {
		return tripPricer.getPrice(priceDTO.getTrippricerapikey(), priceDTO.getUserId(), priceDTO.getNumberOfAdults(),
				priceDTO.getNumberOfChildren(), priceDTO.getTripDuration(), priceDTO.getCumulatativeRewardPoints());
	}

}
