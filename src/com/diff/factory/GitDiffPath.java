package com.diff.factory;

public final class GitDiffPath {
	
	// Commit
	public static final String INIT_COMMIT_ID = "a630528bfd3f9af676df39c3f4dcde593eb71ade"; /* CommitId (Old) */
	public static final String END_COMMIT_ID = "c4f80b8bb517e011d46d6af1e17d2102d5bf820e"; /* CommitId (current) */
	// command
	public static final String COMMAND_GIT_DIFF = "git diff --name-only " + INIT_COMMIT_ID + " " + END_COMMIT_ID;
	
	// 원본 소스 위치 (.git) 항상 뒤에 \\가 붙어야 함.
	public static final String HOME_PATH = "E:\\003-Git\\001-SAC330\\proxy\\";
	// 복사될 최종 위치 (.class)
	public static final String DESKTOP_PATH = "C:\\Users\\dsm3000\\Desktop\\patchSAC\\";
	
	
	//git ignore 읽어서 처리하도록.
	public static final String GIT_IGNORE = "";
}
