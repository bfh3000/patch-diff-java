package com.diff.core.cmd;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import com.diff.factory.GitDiffFactory;

public class GitDiff {
	
	public GitDiff() {
		// TODO Auto-generated constructor stub
	}
	
	public List<String> excuteDiff(String init, String end) {
		//����, ���μ���
		StringBuffer readBuffer;
		StringBuffer buffer;
		Process process;
		BufferedReader bufferedReader;

		// git diff ��ɾ�.
		String cmd = GitDiffFactory.COMMAND_GIT_DIFF;

		buffer = new StringBuffer();

		// windir ������ ȯ�溯��
		buffer.append("%windir%\\system32\\cmd.exe ");
		buffer.append("/k ");
		buffer.append(cmd);
		String[] ex = { "", "" };
		File path = new File("C:\\Users\\dsm3000\\Desktop\\proxy");
		
		List<String> resultList = new ArrayList<String>();
		try {

//			��� ���� �ȵǴ� �ɼ�
//			process = RunDtime.getRuntime().exec(cmd);

			// ��� ����
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
