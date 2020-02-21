package supermarket;

import eventsim.Event;
import eventsim.EventSim;

/**
 * a customer finish checkout and leaves the store
 *
 * Daniel
 */

public class EndCheckoutEvent extends Event {
    Customer customer;

    public EndCheckoutEvent(Customer customer) {
        super(EventSim.getClock() + customer.checkoutDuration);
        this.customer = customer;
    }

    @Override
    public Event happen() {
        return null;
    }
}
