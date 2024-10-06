import java.util.ArrayList;

/**
 * A class to hold details of audio files.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2016.02.29
 */
public class MusicOrganizer {
	// An ArrayList for storing the music file
	private ArrayList<MusicFile> files;

	/**
	 * Create a MusicOrganizer
	 */
	public MusicOrganizer() {
		files = new ArrayList<>();
	}

	/**
	 * Add a file to the collection.
	 * 
	 * @param music is the file to be added.
	 */
	public void addFile(MusicFile music) {
		files.add(music);
	}

	/**
	 * Return the number of files in the collection.
	 * 
	 * @return The number of files in the collection.
	 */
	public int getNumberOfFiles() {
		return files.size();
	}

	/**
	 * List a file from the collection.
	 * 
	 * @param filename, The name of the music to be listed.
	 */
	public void listFile(String filename) {
		// 1.check every music file in this Organizer
		for (MusicFile music : files) {
			// 2.see if the filename is same as any music's filename
			if (music.getFilename().equals(filename)) {
				music.printInfo();
				return;// stop the rest program
			}
		}
		System.out.println("the music you want to search is not exist");
	}

	/**
	 * Remove a file from the collection.
	 * 
	 * @param filename, The name of the file to be removed.
	 */
	public void removeFile(String filename) {
		//not a good idea to remove values inside of foreach loop
		//so use a normal loop
		for (int i = 0; i < files.size(); i++) {
			MusicFile music = files.get(i);
			if (music.getFilename().equals(filename)) {
				files.remove(music);
				System.out.println(filename + " is removed");
				return;// stop the rest program
			}
		}
		System.out.println("the music you want to remove is not exist");
	}
}
















