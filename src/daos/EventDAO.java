package daos;

import model.Event;

import java.util.Date;

/**
 * @author Jakhongir Rasulov on 11/7/21
 * @project Spring Intro
 */
public class EventDAO implements Event {
    @Override
    public long getId() {
        return 0;
    }

    @Override
    public void setId(long id) {

    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public void setTitle(String title) {

    }

    @Override
    public Date getDate() {
        return null;
    }

    @Override
    public void setDate(Date date) {

    }
}
