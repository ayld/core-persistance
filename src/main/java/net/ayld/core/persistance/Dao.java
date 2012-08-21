package net.ayld.core.persistance;

import java.io.Serializable;

import net.ayld.core.domain.Entity;

public interface Dao<E extends Entity<I>, I extends Serializable> extends Serializable {
	
	public E create(E entity);
	
	public E read(I id);
	
	public E find(I id);
	
	public E update(E entity);
	
	public E delete(I id);
}
