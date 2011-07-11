package com.generic.location;

import java.util.Map;

public interface Location {
	/**
	 * This returns all areas in a given map.
	 * 
	 * @return
	 */
	public Map<Area, Position> getAreas();

	/**
	 * This returns the origin location of the Area within the map.
	 * 
	 * @param area
	 * @return
	 */
	public Position getAreaLocation(Area area);
}
