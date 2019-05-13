/**
 * 
 */
package com.leo.eventapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.leo.eventapp.model.Event;

/**
 * @author leonardo
 *
 */
public interface EventRepository extends CrudRepository<Event, String> {

}
