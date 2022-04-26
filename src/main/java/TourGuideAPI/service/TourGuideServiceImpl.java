package TourGuideAPI.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import TourGuideAPI.dto.User;
import gpsUtil.GpsUtil;
import gpsUtil.location.Attraction;
import gpsUtil.location.VisitedLocation;

@Service
public class TourGuideServiceImpl implements TourGuideService {

	@Autowired
	GpsUtil gpsUtil;

	@Override
	public VisitedLocation getUserLocation(User user) {
		return gpsUtil.getUserLocation(user.getUserId());
	}

	@Override
	public List<Attraction> getAttraction() {
		return gpsUtil.getAttractions();
	}

}
