package org.helloworldmvc.model;

import java.io.BufferedReader;
import java.io.FileReader;

public class DAOHelloWorld {
	private static String FileName = "HelloWorld.txt";
	private static DAOHelloWorld instance = null;
	public static DAOHelloWorld getInstance() {
		if(instance == null){
			setInstance(new DAOHelloWorld());
		}
		return instance;
	}

	public static void setInstance(DAOHelloWorld instance) {
		DAOHelloWorld.instance = instance;
	}

	private String helloWorldMessage = null;

	private DAOHelloWorld() {
		this.readFile();
	}

	public String getHelloWorldMessage() {
		return this.helloWorldMessage;
	}

	private void readFile() {
		BufferedReader bufferstock = null;
		try
		{
			bufferstock = new BufferedReader(new FileReader(DAOHelloWorld.FileName));
			this.helloWorldMessage = bufferstock.readLine();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	public void setHelloWorldMessage(final String helloWorldMessage) {
		this.helloWorldMessage = helloWorldMessage;
	}

}

