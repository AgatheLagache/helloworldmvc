package org.helloworldmvc.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DAOHelloWorld {
	private static String FileName = "helloworld.txt";
	private static DAOHelloWorld instance = null;
	public static DAOHelloWorld getInstance() {
		return instance;
	}

	public static void setInstance(DAOHelloWorld instance) {
		DAOHelloWorld.instance = instance;
	}

	private String helloWorldMessage = null;

	private DAOHelloWorld() {

	}

	public String getHelloWorldMessage() {
		return this.helloWorldMessage;
	}

	private void readFile() {
		try {
			final File file = new File(FileName);
			FileReader fileReader = null;
			fileReader = new FileReader(file);
			this.helloWorldMessage = fileReader.toString();
			fileReader.close();
		} catch (final FileNotFoundException e) {
			e.printStackTrace();
		} catch (final IOException f) {
			f.printStackTrace();
		}
	}

	public void setHelloWorldMessage(final String helloWorldMessage) {
		this.helloWorldMessage = helloWorldMessage;
	}

}

