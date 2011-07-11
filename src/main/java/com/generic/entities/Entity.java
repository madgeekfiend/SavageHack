package com.generic.entities;

import java.util.Set;

public interface Entity {

	public interface Condition {
	}

	public Set<Condition> getConditions();

}
