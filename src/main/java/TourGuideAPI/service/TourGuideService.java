package TourGuideAPI.service;

import java.util.List;
import java.util.UUID;

import TourGuideAPI.dto.PriceDTO;
import gpsUtil.location.Attraction;
import gpsUtil.location.VisitedLocation;
import tripPricer.Provider;

public interface TourGuideService {

	VisitedLocation getUserLocation(UUID id);

	List<Attraction> getAttraction();

	int getAttractionRewardPoints(UUID attractionID, UUID userID);

	List<Provider> getPrice(PriceDTO priceDTO);

}
