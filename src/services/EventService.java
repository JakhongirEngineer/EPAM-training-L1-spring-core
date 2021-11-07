package services;

import daos.EventDAO;
import model.Event;

import java.util.Date;
import java.util.List;

/**
 * @author Jakhongir Rasulov on 11/7/21
 * @project Spring Intro
 */
public class EventService  {



    public Event getEventById(long eventId) {
    }

    public List<Event> getEventsByTitle(String title, int pageSize, int pageNum) {
    }

    public List<Event> getEventsForDay(Date day, int pageSize, int pageNum) {
    }

    public Event createEvent(Event event) {
    }

    public Event updateEvent(Event event) {
    }

    public boolean deleteEvent(long eventId) {
    }
}
