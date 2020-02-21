package supermarket;

import eventsim.Event;
import eventsim.EventSim;

/**
 * a customer enters the checkout queue
 *
 * Daniel
 */

public class BeginCheckoutEvent extends Event {
    Customer customer;

    public BeginCheckoutEvent(Customer customer) {
        super(EventSim.getClock() + customer.beginCheckoutTime);
        this.customer = customer;
    }



    @Override
    public String toString() {
        return "BeginCheckoutEvent {" + customer.name +
                " | Products " +customer.numProducts +'}';
    }

    @Override
    public Event happen() {
        return new EndCheckoutEvent(customer);
    }
}
