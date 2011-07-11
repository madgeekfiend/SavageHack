package com.generic.location;

import java.util.Map;
import java.util.Set;

import com.generic.entities.Entity;

/**
 * 
 * @author codedragon76
 * 
 */
public interface Area {

	/**
	 * 
	 * @return
	 */
	public Map<Entity, Position> getEntities();

	/**
	 * 
	 * @param entity
	 * @return
	 */
	public Position getEntityLocation(Entity entity);

	/**
	 * This returns all Tiles in a given Area.
	 * 
	 * @return
	 */
	public Set<Tile> getTiles();

	/**
	 * Returns the location of the Tile within the area
	 * 
	 * @return
	 */
	public Position getTileLocation(Tile tile);

}
