package com.diff.factory;

public final class GitDiffFactory {
	
	//경로 관련
	public static final String TARGET_SOURCE_PATH = "C:\\Users\\dsm3000\\Desktop\\sac\\"; /* 대상 소스 위치 */
	public static final String PATCH_SOURCE_PATH = "C:\\Users\\dsm3000\\Desktop\\sac\\"; /* 패치파일 생성 경로 */
	
	//Commit
	public static final String INIT_COMMIT_ID = "a630528b"; /* CommitId (Old) */
	public static final String END_COMMIT_ID = "082c66d7"; /* CommitId (current) */
	
	//command
	public static final String COMMAND_GIT_DIFF = "git diff --name-only "+INIT_COMMIT_ID+" "+END_COMMIT_ID;
}
