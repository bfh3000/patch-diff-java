package com.diff.core.cmd;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.StandardCopyOption;
import java.util.List;

import com.diff.factory.GitDiffPath;

public class CreatePatchFile {

	public CreatePatchFile() {
		// TODO Auto-generated constructor stub
	}

	public void createPatchFile(List<String> gitDiffResult) {
		String origin_file_path = "";
		
		for (String str : gitDiffResult) {
			str = str.trim();
			str = str.replace("/", "\\");
			origin_file_path = GitDiffPath.HOME_PATH + str;

			// file name
			String[] tmp_str = str.split("\\\\");
			String fileName = tmp_str[tmp_str.length - 1];
			fileName = fileName.replace("java", "class");

			// srcSource To copySource(class)
			str = str.replace("java", "class");
			str = str.replace("src", "classes");
			str = GitDiffPath.DESKTOP_PATH + str;

			String final_DirPlusFile = str;
			String final_Dir = final_DirPlusFile.substring(0, final_DirPlusFile.indexOf(fileName));
			File destDir = new File(final_Dir);

			// 폴더가 없다면 생성 Multi Ver.
			if (!destDir.exists()) {
				try {
					destDir.mkdirs();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

			File srcDir = new File(origin_file_path);
			File cpDir = new File(final_DirPlusFile);
			try {
				Files.copy(srcDir.toPath(), cpDir.toPath(), StandardCopyOption.REPLACE_EXISTING);
			} 
			catch (NoSuchFileException e) {
				e.printStackTrace();
				System.out.println("패치로 삭제된 파일임.");
			}
			catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	}

}
