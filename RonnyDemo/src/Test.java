import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		/*
		
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
		*/
		MusicOrganizer organizer = new MusicOrganizer();
		organizer.addFile(new MusicFile("Song A", "singer A", "publisher A", 2000, "rock"));
		organizer.addFile(new MusicFile("Song B", "singer A", "publisher A", 2000, "rock"));
		organizer.addFile(new MusicFile("Song C", "singer A", "publisher A", 2000, "rock"));
		organizer.addFile(new MusicFile("Song D", "singer A", "publisher A", 2010, "rock"));
		organizer.addFile(new MusicFile("Song E", "singer A", "publisher A", 2000, "rock"));
		organizer.addFile(new MusicFile("Song F", "singer A", "publisher A", 2020, "rock"));
		
		organizer.listFile("Song A");
		organizer.removeFile("Song A");
		organizer.listFile("Song A");
		
		
		
		
		
	}

}
