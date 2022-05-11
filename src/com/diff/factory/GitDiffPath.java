package com.diff.factory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class GitDiffPath {
	
	private static final Logger log = LogManager.getLogger(GitDiffPath.class);
	
	public GitDiffPath() {
		log.debug("GIT_IGNORE : "+INIT_COMMIT_ID);
		log.debug("END_COMMIT_ID : "+END_COMMIT_ID);
		log.debug("COMMAND_GIT_DIFF : "+COMMAND_GIT_DIFF);
		log.debug("HOME_PATH : "+HOME_PATH);
		log.debug("DESKTOP_PATH : "+DESKTOP_PATH);
		log.debug("GIT_IGNORE : "+GIT_IGNORE);
	}
	
	// Commit
	public static final String INIT_COMMIT_ID = "253eb1a438e2f4f818a1b8f4b472b5991d311296 ".trim(); /* CommitId (Old) */
	public static final String END_COMMIT_ID = "7cb9c3d86651979966e12cb52b7b313de7a48a8a ".trim(); /* CommitId (current) */
	// command
	public static final String COMMAND_GIT_DIFF = "git diff --name-only " + INIT_COMMIT_ID + " " + END_COMMIT_ID;
	
	// 원본 소스 위치 (.git) 
	public static final String HOME_PATH = "E:\\003-Git\\101-diff-java\\patch-diff-java" + "\\";
	// 복사될 최종 위치 (.class) 
	public static final String DESKTOP_PATH = "C:\\Users\\dsm3000\\Desktop\\patchSAC" + "\\";
	
	//git ignore 읽어서 처리하도록.
	public static final String GIT_IGNORE = "";
}
