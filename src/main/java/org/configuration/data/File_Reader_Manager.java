package org.configuration.data;

import java.io.IOException;

public class File_Reader_Manager {
	
	//SDP
	
	public Configuration_Reader get_instance_CR() throws IOException {
		// TODO Auto-generated method stub
		
		Configuration_Reader reader = new Configuration_Reader();
		return reader;

	}
	
	public static File_Reader_Manager get_instance_FRM() {
		// TODO Auto-generated method stub
		
		File_Reader_Manager helper = new File_Reader_Manager();
		return helper;

	}
	private File_Reader_Manager() {
		// TODO Auto-generated constructor stub
	}
	
	
	

}
