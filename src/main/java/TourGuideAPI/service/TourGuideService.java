package TourGuideAPI.service;

import java.util.List;
import java.util.UUID;

import gpsUtil.location.Attraction;
import gpsUtil.location.VisitedLocation;

public interface TourGuideService {

	VisitedLocation getUserLocation(UUID id);

	List<Attraction> getAttraction();

}
