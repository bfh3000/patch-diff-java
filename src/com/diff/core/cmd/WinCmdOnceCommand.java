package com.diff.core.cmd;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class WinCmdOnceCommand {

	public static void main(String[] args) {
		new WinCmdOnceCommand().excuteCommand();
	}
	
	public String excuteCommand() {
		
		StringBuffer readBuffer;
		StringBuffer buffer;
		Process process;
		BufferedReader bufferedReader;
		
//		System.out.println("'.git'�� �����ϴ� ��� ���� ��θ� �Է����ּ���.");
//		Scanner sc = new Scanner(System.in);
//		String inputCommand = sc.next();
//		
//		WinCmd cmd = new WinCmd();
//		String command = cmd.excuteCommand(inputCommand);
		
		String cmd = "ipconfig";
		
		buffer =  new StringBuffer();
		
		buffer.append("cmd.exe ");
		buffer.append("/k ");
		buffer.append(cmd);
		
		try {
			process = Runtime.getRuntime().exec(cmd);
			bufferedReader = new BufferedReader(new InputStreamReader(process.getInputStream()));
			
			String line = null;
			readBuffer = new StringBuffer();
			
			while((line = bufferedReader.readLine()) != null) {
				readBuffer.append(line);
				readBuffer.append("\n");
			}
			
			String result = readBuffer.toString();
			System.out.println("command result : "+result);
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(1);
		}
		
		
		
		return buffer.toString();
	}
}