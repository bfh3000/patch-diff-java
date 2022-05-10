package com.diff.factory;

public final class GitDiffPath {
	
	// Commit
	public static final String INIT_COMMIT_ID = "HEAD"; /* CommitId (Old) */
	public static final String END_COMMIT_ID = ""; /* CommitId (current) */
	// command
	public static final String COMMAND_GIT_DIFF = "git diff --name-only " + INIT_COMMIT_ID + " " + END_COMMIT_ID;
	
	// ���� �ҽ� ��ġ (.git) 
	public static final String HOME_PATH = "E:\\003-Git\\101-diff-java\\patch-diff-java" + "\\";
	// ����� ���� ��ġ (.class) 
	public static final String DESKTOP_PATH = "C:\\Users\\dsm3000\\Desktop\\patchSAC" + "\\";
	
	//git ignore �о ó���ϵ���.
	public static final String GIT_IGNORE = "";
}
