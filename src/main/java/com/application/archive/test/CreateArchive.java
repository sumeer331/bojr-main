package com.application.archive.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

import com.application.archive.Archiver;
import com.application.archive.ArchiverFactory;

public class CreateArchive {

	public static void main(String[] args) {
		
		// Hardcoded for candidate testing purposes
		String archiveName = "test2";
		File destination = new File("destination");		
		File source = new File("sampleFolder");

		Archiver archiver = ArchiverFactory.createArchiver("zip");
		try {
			 if(destination.canWrite()) {
				File archive = archiver.create(archiveName, destination, source);
				System.out.println("Done.");
			}
			 else
				 throw new IllegalArgumentException("Destination folder is read only");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
