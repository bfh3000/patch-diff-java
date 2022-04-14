package com.diff.core.cmd.exe;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class GitDiff {
	
	public GitDiff() {
		// TODO Auto-generated constructor stub
	}
	
	public List<String> excuteDiff(String init, String end) {
		//버퍼, 프로세서
		StringBuffer readBuffer;
		StringBuffer buffer;
		Process process;
		BufferedReader bufferedReader;

		// git diff 명령어.
//		String cmd = "git diff --name-only a630528b 082c66d7";
		String cmd = "git diff --name-only "+init + " "+ end;

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
		} catch (Exception e1) {
			e1.printStackTrace();
			System.exit(1);
		}
		
		return resultList;
	}
	
}
