package com.diff.core.cmd;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.List;

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
		File path = new File("C:\\Users\\dsm3000\\Desktop\\proxy");
		
		List<String> resultList = new ArrayList<String>();
		try {
			
//			경로 설정 안되는 옵션
//			process = Runtime.getRuntime().exec(cmd);
			
			//경로 설정 
			process = Runtime.getRuntime().exec(cmd, ex, path);
			bufferedReader = new BufferedReader(new InputStreamReader(process.getInputStream()));
			
			String line = null;
			readBuffer = new StringBuffer();
			
			while((line = bufferedReader.readLine()) != null) {
				readBuffer.append(line);
				readBuffer.append("\n");
				resultList.add(line);
			}
			
			String result = readBuffer.toString();
			System.out.println();
			System.out.println("command result : ");
			System.out.println(result);
		} 
		catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
			System.exit(1);
		}
		String sourceFolder = "C:\\Users\\dsm3000\\Desktop\\proxy\\Proxy\\lib";
		File srcDir = new File(sourceFolder);
		
		String desktopPath = "C:\\Users\\" + System.getProperty("user.name") + "\\Desktop";
		File destDir = new File(desktopPath);
		
		try {
			Files.copy(srcDir.toPath(), destDir.toPath(), StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
			
		/*https://stackoverflow.com/questions/6214703/copy-entire-directory-contents-to-another-directory
		 * String File destDir = new File()
		 */
		
		
		
		return buffer.toString();
	}
}
