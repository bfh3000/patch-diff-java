package com.diff.core.cmd;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class WinCmd {

	private StringBuffer readBuffer;
	private StringBuffer buffer;
	private Process process;
	private BufferedReader bufferedReader;
	private BufferedReader bufferedReader2;
	
	public static void main(String[] args) {
		System.out.println("'.git'이 존재하는 대상 폴더 경로를 입력해주세요.");
		Scanner sc = new Scanner(System.in);
		String inputCommand = sc.next();
		
		WinCmd cmd = new WinCmd();
		String command = cmd.excuteCommand(inputCommand);
		
	}
	
	public String excuteCommand(String cmd) {
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
			
			cmd = "dir";
			bufferedReader2 = new BufferedReader(new InputStreamReader(process.getInputStream()));
			
			String line2 = null;
			readBuffer = new StringBuffer();
			
			while((line2 = bufferedReader2.readLine()) != null) {
				readBuffer.append(line2);
				readBuffer.append("\n");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(1);
		}
		
		
		
		return buffer.toString();
	}
}
