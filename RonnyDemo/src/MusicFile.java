
	
public class MusicFile {
	/*filename,singer,publisher,year,style*/
	private String filename;
	private String singer;
	private String publisher;
	private int year;
	private String style;
	
	public String getFilename() {
		return filename;
	}
	
	public MusicFile(String filename,String singer,String publisher,int year,String style) {
		this.filename = filename;
		this.singer = singer;
		this.publisher = publisher;
		this.year = year;
		this.style = style;
	}
	
	public void printInfo() {
		System.out.println("filename:"+filename);
		System.out.println("singer:"+singer);
		System.out.println("publisher:"+publisher);
		System.out.println("year:"+year);
		System.out.println("style:"+style);
	}
}
