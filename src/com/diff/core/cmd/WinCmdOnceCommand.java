package com.diff.core.cmd;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WinCmdOnceCommand {

	public static void main(String[] args) {
		new WinCmdOnceCommand().excuteCommand();
	}
	
	public String excuteCommand() {
		
		StringBuffer readBuffer;
		StringBuffer buffer;
		Process process;
		BufferedReader bufferedReader;
		
//		M       Proxy/conf/sac.properties
//		M       Proxy/src/com/systemGateway/dao/DataAccessService.java
//		M       Proxy/src/com/systemGateway/dao/serveraccount/map/ServerAccountSQL.xml
//		M       Proxy/src/com/systemGateway/entity/DBServerAccountE.java
//		M       Proxy/src/com/systemGateway/sam/worker/ProtocolWorker.java
//		M       Proxy/src/com/systemGateway/sam/worker/SSHWorker.java
//		M       Proxy/src/com/systemGateway/sam/worker/TelnetWorker.java
//		M       Proxy/src/com/systemGateway/sam/worker/WAgentWorker.java
		
		
		String cmd = "git diff --name-status a630528b 082c66d7"; 
		 
		buffer = new StringBuffer();
		
		buffer.append("%windir%\\system32\\cmd.exe ");
		buffer.append("/k ");
		buffer.append(cmd);
		String[] ex = {"", ""};
		Path dir = Paths.get("C:\\\\Users\\\\dsm3000\\\\Desktop\\\\proxy");
		File path = new File("C:\\Users\\dsm3000\\Desktop\\proxy");
		
		try {
			
			process = Runtime.getRuntime().exec(cmd, ex, path);
//			process = Runtime.getRuntime().exec(cmd);
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
