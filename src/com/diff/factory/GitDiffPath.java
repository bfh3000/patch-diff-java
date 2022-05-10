package com.diff.factory;

public final class GitDiffPath {
	
	// Commit
	public static final String INIT_COMMIT_ID = "HEAD"; /* CommitId (Old) */
	public static final String END_COMMIT_ID = ""; /* CommitId (current) */
	// command
	public static final String COMMAND_GIT_DIFF = "git diff --name-only " + INIT_COMMIT_ID + " " + END_COMMIT_ID;
	
	// 원본 소스 위치 (.git) 
	public static final String HOME_PATH = "E:\\003-Git\\101-diff-java\\patch-diff-java" + "\\";
	// 복사될 최종 위치 (.class) 
	public static final String DESKTOP_PATH = "C:\\Users\\dsm3000\\Desktop\\patchSAC" + "\\";
	
	//git ignore 읽어서 처리하도록.
	public static final String GIT_IGNORE = "";
}
