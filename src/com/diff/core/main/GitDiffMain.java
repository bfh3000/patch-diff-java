package com.diff.core.main;

import java.util.ArrayList;
import java.util.List;

import com.diff.core.cmd.CreatePatchFile;
import com.diff.core.cmd.GitDiff;

public class GitDiffMain {
	public static void main(String[] args) {
		
		//GitDiff excute
		GitDiff gitDiff = new GitDiff();
		List<String> gitDiffResult = new ArrayList<String>();
		try {
			gitDiffResult = gitDiff.excuteDiff();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//Create patchFile
		CreatePatchFile createPatchFile = new CreatePatchFile();
		try {
			createPatchFile.createPatchFile(gitDiffResult);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
