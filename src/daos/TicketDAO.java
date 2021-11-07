package daos;

import model.Ticket;

/**
 * @author Jakhongir Rasulov on 11/7/21
 * @project Spring Intro
 */
public class TicketDAO implements Ticket {
    @Override
    public long getId() {
        return 0;
    }

    @Override
    public void setId(long id) {

    }

    @Override
    public long getEventId() {
        return 0;
    }

    @Override
    public void setEventId(long eventId) {

    }

    @Override
    public long getUserId() {
        return 0;
    }

    @Override
    public void setUserId(long userId) {

    }

    @Override
    public Category getCategory() {
        return null;
    }

    @Override
    public void setCategory(Category category) {

    }

    @Override
    public int getPlace() {
        return 0;
    }

    @Override
    public void setPlace(int place) {

    }
}
