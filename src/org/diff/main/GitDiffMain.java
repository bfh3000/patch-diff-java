package org.diff.main;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class GitDiffMain {
	private static final Logger log = LogManager.getLogger(GitDiffMain.class);
	
	public static void main(String[] args) {
		log.debug("Start Git-Diff");
		
		log.debug("show final String");
		GitDiffPath gitDiffPath = new GitDiffPath();

		GitDiff gitDiff = new GitDiff();
		List<String> gitDiffResult = new ArrayList<String>();
		try {
			gitDiffResult = gitDiff.excuteDiff();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		log.debug("Start Create PatchFile");
		//Create patchFile
		CreatePatchFile createPatchFile = new CreatePatchFile();

		log.debug("count : "+ gitDiffResult.size());
		for(String tmp : gitDiffResult) {
			log.debug(tmp);
		}
		
		try {
			createPatchFile.createPatchFile(gitDiffResult);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
