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

		// 버퍼, 프로세서
		StringBuffer readBuffer;
		StringBuffer buffer;
		Process process;
		BufferedReader bufferedReader;

		// git diff 명령어.
		String cmd = "git diff --name-only a630528b 082c66d7";

		buffer = new StringBuffer();

		// windir 윈도우 환경변수
		buffer.append("%windir%\\system32\\cmd.exe ");
		buffer.append("/k ");
		buffer.append(cmd);
		String[] ex = { "", "" };
		File path = new File("C:\\Users\\dsm3000\\Desktop\\proxy");

		List<String> resultList = new ArrayList<String>();
		try {

//			경로 설정 안되는 옵션
//			process = RunDtime.getRuntime().exec(cmd);

			// 경로 설정
			process = Runtime.getRuntime().exec(cmd, ex, path);
			bufferedReader = new BufferedReader(new InputStreamReader(process.getInputStream()));

			String line = null;
			readBuffer = new StringBuffer();
			while ((line = bufferedReader.readLine()) != null) {
				readBuffer.append(line);
				readBuffer.append("\n");
				resultList.add(line);
			}

		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(1);
		}

		String homePath = "C:\\Users\\dsm3000\\Desktop\\proxy\\";
		String desktopPath = "C:\\Users\\dsm3000\\Desktop\\sac\\";
		
		//파일명과 파일폴더 나누기
		String file_name = "";
		String file_path = "";

//		Proxy/src/com/dsmentoring/dsmim/systemGateway/sam/worker/WAgentWorker.java
//		Proxy/conf/sac.properties

		
		for (String str : resultList) {
			str.trim();
			
			//file name
			String[] tmp_str = str.split("/");
			String fileName = tmp_str[tmp_str.length-1];
			fileName = fileName.replace("java", "class"); 
			//srcSource Path
			str = str.replace("java", "class");
			str = str.replace("/", "\\");
			str = str.replace("src", "classes");
			
			
			
			String deskDirPlusFile = desktopPath+str;
			String deskDir = deskDirPlusFile.substring(0, deskDirPlusFile.indexOf(fileName));
			Path pathFolder = Paths.get(deskDir);
			File destDir = new File(deskDir);
			
			
			str = homePath + str;
			File srcDir = new File(str);

			
			//폴더가 없다면 생성 Multi Ver.
			if(!destDir.exists()) {
				try {
					destDir.mkdirs();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
			try {
				Files.copy(srcDir.toPath(), destDir.toPath(), StandardCopyOption.REPLACE_EXISTING);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		return buffer.toString();
	}
}
