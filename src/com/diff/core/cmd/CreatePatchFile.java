package com.diff.core.cmd;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.diff.core.main.GitDiffMain;
import com.diff.factory.GitDiffPath;

public class CreatePatchFile {
	private static final Logger log = LogManager.getLogger(CreatePatchFile.class);
	public CreatePatchFile() {
		// TODO Auto-generated constructor stub
	}

	public void createPatchFile(List<String> gitDiffResult) {
		
		log.debug("gitDiffResult : "+gitDiffResult.toString());
		String origin_file_path = "";
		
		
		//subClass
//		for(String str : gitDiffResult) {
//			if(str.contains("$")) {
//				String[] tmp = str.split("$");
//				for(String str1 : tmp) {
//					str1.concat(".java");
//				}
//			}
//		}
		
		for (String str : gitDiffResult) {
			str = str.trim();
			str = str.replace("/", "\\");

			// file name
			String[] tmp_str = str.split("\\\\");
			String fileName = tmp_str[tmp_str.length - 1];
			fileName = fileName.replace("java", "class");
			
			// srcSource To copySource(class)
			str = str.replace("java", "class");
			str = str.replace("src", "classes");
			
			origin_file_path = GitDiffPath.HOME_PATH + str;
			String final_DirPlusFile = GitDiffPath.DESKTOP_PATH + str;
			
			String final_Dir = final_DirPlusFile.substring(0, final_DirPlusFile.indexOf(fileName));
			File destDir = new File(final_Dir);

			if(destDir != null) {
				destDir.list( );
			}
			
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
			
			
			String cp_path = origin_file_path.substring(0, origin_file_path.indexOf(fileName));
			File cp_pathFile = new File(cp_path);
			String[] subClass = cp_pathFile.list();
			
			List<String> searchSubClass = Arrays.asList(subClass);
			
			String tmp = searchSubClass.stream()
			.filter(keyword -> keyword.contains("$"))
			.findAny()
			.orElse(null);
			
//			for(String check : subClass) {
//				if(check.contains(fileName)){
//				}
//			}
			
			try {
				//복사 대상파일, 복사될 위치, 복사옵션
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
