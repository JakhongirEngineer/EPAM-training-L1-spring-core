package services;

import model.Event;
import model.Ticket;
import model.User;

import java.util.List;

/**
 * @author Jakhongir Rasulov on 11/7/21
 * @project Spring Intro
 */
public class TicketService {

    public Ticket bookTicket(long userId, long eventId, int place, Ticket.Category category) {
    }

    public List<Ticket> getBookedTickets(User user, int pageSize, int pageNum) {
    }
    public List<Ticket> getBookedTickets(Event event, int pageSize, int pageNum) {
    }

    public boolean cancelTicket(long ticketId) {
    }
}
