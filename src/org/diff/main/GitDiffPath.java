package org.diff.main;

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
	
	public static final String GIT_IGNORE = ""; //git ignore �о ó���ϵ���.
	
	/* input!! CommitId (Old) */
	public static final String INIT_COMMIT_ID = "7ba10548a3b02d997d823258a797286f975cb290 ";
	
	/* input!! CommitId (current) */
	public static final String END_COMMIT_ID = "82fee1d6f241d66139386a1f8a35815f4eeab70b "; 
	
	/* input!! option : 1(web), 2(proxy, scheduler)*/	
	public static final String PROJECT_CATEGORY = "1";
	 
	/* input!! ���� �ҽ� ��ġ ('.git'�� �ִ� ���� ���)*/
	public static final String HOME_PATH = "" 							+"\\";
	
	/* input!! ����� ���� ��ġ (.class)*/
	public static final String DESKTOP_PATH = "" 								+"\\";
	
	public static final String COMMAND_GIT_DIFF = "git diff --name-only " + INIT_COMMIT_ID + " " + END_COMMIT_ID; // command	
}
