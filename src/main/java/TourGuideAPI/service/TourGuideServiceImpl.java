package TourGuideAPI.service;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import gpsUtil.GpsUtil;
import gpsUtil.location.Attraction;
import gpsUtil.location.VisitedLocation;

@Service
public class TourGuideServiceImpl implements TourGuideService {

	private final GpsUtil gpsUtil = new GpsUtil();

	@Override
	public VisitedLocation getUserLocation(UUID id) {
		return gpsUtil.getUserLocation(id);
	}

	@Override
	public List<Attraction> getAttraction() {
		return gpsUtil.getAttractions();
	}

}
