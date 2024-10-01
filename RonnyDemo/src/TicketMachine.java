/**
 * TicketMachine models a naive ticket machine that issues
 * flat-fare tickets.
 * The price of a ticket is specified via the constructor.
 * It is a naive machine in the sense that it trusts its users
 * to insert enough money before trying to print a ticket.
 *It also assumes that users enter sensible amounts.
 *
 * @author David J. Barnes and Michael Kölling
 * @version 2016.02.29
 */
public class TicketMachine
{
    // The price of a ticket from this machine.
    private int price;
    // The amount of money entered by a customer so far.
    private int balance;
    // The total amount of money collected by this machine.
    private int total;
    

    /**
     * Create a machine that issues tickets of the given price.
     * Note that the price must be greater than zero, and there
     * are no checks to ensure this.
     */
    public TicketMachine(int cost)
    {
        price = cost;
        balance = 0;
        total = 0;
    }

    /**
     * Return the price of a ticket.
     */
    public int getPrice()
    {
        return price;
    }

    /**
     * Return the amount of money already inserted for the
     * next ticket.
     */
    public int getBalance()
    {
        return balance;
    }

    public void refund(){
    	//raise balance 
    	balance += price;
    	//machine lose money
    	total -= price;
    	System.out.println("customer just refund, got "+price+" back, now the balance is "+balance);
    }
    
    /**
     * Receive an amount of money from a customer.
     */
    public void insertMoney(int amount)
    {
    	if(amount > 0)
    		balance = balance + amount;
    	else
    		System.out.println("invalid amount of money");
    }

    /**
     * Print a ticket.
     * Update the total collected and
     * reduce the balance to zero.
     */
    public void printTicket()
    {
        // Simulate the printing of a ticket.
        System.out.println("##################");
        System.out.println("# The BlueJ Line");
        System.out.println("# Ticket");
        System.out.println("# " + price + " dollars.");
        System.out.println("##################");
        System.out.println();

        if(balance>=price) {
	        // Update the total collected with the balance.
	        total = total + price;
	        // Clear the balance.
	        balance = balance - price;
	        System.out.println("purchase a ticket successfully, it costs you "+price +" dollars");
	        System.out.println("now your balance is "+balance);
        }else {
        	System.out.println("Balance is not enough for this ticket");
        }
    }
}










