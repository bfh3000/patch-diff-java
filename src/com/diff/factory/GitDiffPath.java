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
	public static final String INIT_COMMIT_ID = "4ecf647b3811e6ff71a6ba56d09ba622e59398c7    "; /* CommitId (Old) */
	public static final String END_COMMIT_ID = "a0112d803644f00e1641146fcfb34d303181c67e    "; /* CommitId (current) */
	// command
	public static final String COMMAND_GIT_DIFF = "git diff --name-only " + INIT_COMMIT_ID + " " + END_COMMIT_ID;
	
	
	//Web은 src 위치가 다름.
	//option : 1(web), 2(proxy, scheduler)	
	public static final String PROJECT_CATEGORY = "2";
	// 원본 소스 위치 ('.git'가 있는 폴더 경로) 
	public static final String HOME_PATH = "E:\\003-Git\\011-SAC320_KPO_v2\\proxy" 							+"\\";
	// 복사될 최종 위치 (.class) 
	public static final String DESKTOP_PATH = "C:\\Users\\dsm3000\\Desktop\\patchSAC-dr" 								+"\\";
	
	//git ignore 읽어서 처리하도록.
	public static final String GIT_IGNORE = "";
}
