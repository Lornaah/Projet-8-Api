package TourGuideAPI.service;

import java.util.List;

import org.springframework.stereotype.Service;

import TourGuideAPI.dto.User;
import gpsUtil.GpsUtil;
import gpsUtil.location.Attraction;
import gpsUtil.location.VisitedLocation;

@Service
public class TourGuideServiceImpl implements TourGuideService {

	private final GpsUtil gpsUtil = new GpsUtil();

	@Override
	public VisitedLocation getUserLocation(User user) {
		return gpsUtil.getUserLocation(user.getUserId());
	}

	@Override
	public List<Attraction> getAttraction() {
		return gpsUtil.getAttractions();
	}

}
