package com.diff.core.cmd;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class WinCmd {

	private StringBuffer readBuffer;
	private StringBuffer buffer;
	private Process process;
	private BufferedReader bufferedReader;
	
	public static void main(String[] args) {
		WinCmd cmd = new WinCmd();
		
		String command = cmd.inputCommand("ipconfig");
		String result = cmd.execCommand(command);
		
		System.out.println(result);
	}
	
	public String inputCommand(String cmd) {
		buffer =  new StringBuffer();
		
		buffer.append("cmd.exe ");
		buffer.append("/c ");
		buffer.append(cmd);
		
		return buffer.toString();
	}
	
	
	public String execCommand(String cmd) {
		try {
			process = Runtime.getRuntime().exec(cmd);
			bufferedReader = new BufferedReader(new InputStreamReader(process.getInputStream()));
			
			String line = null;
			readBuffer = new StringBuffer();
			
			while((line = bufferedReader.readLine()) != null) {
				readBuffer.append(line);
				readBuffer.append("\n");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(1);
		}
		
		return readBuffer.toString();
	}

}
