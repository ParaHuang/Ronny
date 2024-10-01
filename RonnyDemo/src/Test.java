import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("how much is a ticket?");
		int cost = scanner.nextInt();
		
		TicketMachine machine = new TicketMachine(cost);
		
		System.out.println("For a ticket from this machine, it cost $"+machine.getPrice());
		System.out.println("Now your balance is "+machine.getBalance());
		System.out.println();
		
		
		
		
		System.out.println("Start to insert money:");
		//insert money for balance
		machine.insertMoney(80);
		System.out.println("Now your balance is "+machine.getBalance());
		//buy a ticket
		machine.printTicket();
		//refund
		machine.refund();
	}

}
