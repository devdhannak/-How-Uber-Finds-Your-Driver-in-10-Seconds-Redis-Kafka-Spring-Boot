package com.rideshare.locationservice.service;


import com.rideshare.locationservice.dto.DriverLocationRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.geo.Point;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class LocationService {

    // Redis key for all driver locations
    private static final String DRIVERS_GEO_KEY = "drivers:locations";

    /**
     * Update driver location in redis
     * Called every 3 seconds by driver's phone
     * Maps to Redis GEOADD command
     */

    public void updateDriverLocation(DriverLocationRequest request){

        log.info("Updating location for driver: {}",request.getDriverId());

        // IMPORTANT: longitude FIRST , latitude SECOND - GeoSpatial Standard
        Point driverPoint = new Point(
                request.getLongitude(),
                request.getLatitude()
        );

    }


}
