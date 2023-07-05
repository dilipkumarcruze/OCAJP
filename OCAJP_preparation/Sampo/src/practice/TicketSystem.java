package practice;

import java.util.LinkedList;
import java.util.Queue;

public class TicketSystem {
    private Queue<String> ticketQueue;

    public TicketSystem() {
        ticketQueue = new LinkedList<>();
    }

    public void addTicket(String ticket) {
        ticketQueue.add(ticket);
    }

    public String getNextTicket() {
        return ticketQueue.poll();
    }

    public void displayQueue() {
        System.out.println("Ticket Queue:");
        for (String ticket : ticketQueue) {
            System.out.println("- " + ticket);
        }
    }

    public static void main(String[] args) {
        TicketSystem system = new TicketSystem();
        system.addTicket("Ticket 1");
        system.addTicket("Ticket 2");
        system.addTicket("Ticket 3");
        system.getNextTicket();
        system.displayQueue();
    }
}
