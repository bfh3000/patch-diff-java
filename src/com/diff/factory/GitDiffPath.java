package com.diff.factory;

public final class GitDiffPath {
	
	// Commit
	public static final String INIT_COMMIT_ID = "a630528bfd3f9af676df39c3f4dcde593eb71ade"; /* CommitId (Old) */
	public static final String END_COMMIT_ID = "c4f80b8bb517e011d46d6af1e17d2102d5bf820e"; /* CommitId (current) */
	// command
	public static final String COMMAND_GIT_DIFF = "git diff --name-only " + INIT_COMMIT_ID + " " + END_COMMIT_ID;
	
	// ���� �ҽ� ��ġ (.git) �׻� �ڿ� \\�� �پ�� ��.
	public static final String HOME_PATH = "E:\\003-Git\\001-SAC330\\proxy\\";
	// ����� ���� ��ġ (.class)
	public static final String DESKTOP_PATH = "C:\\Users\\dsm3000\\Desktop\\patchSAC\\";
	
	
	//git ignore �о ó���ϵ���.
	public static final String GIT_IGNORE = "";
}
