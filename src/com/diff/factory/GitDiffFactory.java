package com.diff.factory;

public final class GitDiffFactory {
	
	//��� ����
	public static final String TARGET_SOURCE_PATH = "C:\\Users\\dsm3000\\Desktop\\sac\\"; /* ��� �ҽ� ��ġ */
	public static final String PATCH_SOURCE_PATH = "C:\\Users\\dsm3000\\Desktop\\sac\\"; /* ��ġ���� ���� ��� */
	
	//Commit
	public static final String INIT_COMMIT_ID = "a630528b"; /* CommitId (Old) */
	public static final String END_COMMIT_ID = "082c66d7"; /* CommitId (current) */
	
	//command
	public static final String COMMAND_GIT_DIFF = "git diff --name-only "+INIT_COMMIT_ID+" "+END_COMMIT_ID;
}
