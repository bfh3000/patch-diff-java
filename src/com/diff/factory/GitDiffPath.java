package com.diff.factory;

public final class GitDiffPath {
	
	// Commit
	public static final String INIT_COMMIT_ID = "acb449624b03f6b1280d2731964f9666f6ef83b0"; /* CommitId (Old) */
	public static final String END_COMMIT_ID = "9c006e4b9048b54d279ca03ee0ccc7ad662c3daf"; /* CommitId (current) */
	// command
	public static final String COMMAND_GIT_DIFF = "git diff --name-only " + INIT_COMMIT_ID + " " + END_COMMIT_ID;
	
	// 원본 소스 위치 (.git)
	public static final String HOME_PATH = "E:\\003-Git\\001-SAC330\\web\\";
	// 복사될 최종 위치 (.class)
	public static final String DESKTOP_PATH = "C:\\Users\\dsm3000\\Desktop\\sac\\";
}
