package TourGuideAPI.service;

import java.util.List;

import TourGuideAPI.dto.User;
import gpsUtil.location.Attraction;
import gpsUtil.location.VisitedLocation;

public interface TourGuideService {

	VisitedLocation getUserLocation(User user);

	List<Attraction> getAttraction();

}
