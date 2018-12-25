package com.assignment.weatherservice.repo;

import com.assignment.weatherservice.model.Location;

public interface LocationRepo {
    Location getLocation(Object zip);
}
