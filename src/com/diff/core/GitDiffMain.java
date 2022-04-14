package com.diff.core;

import com.diff.core.cmd.GitDiff;
import com.diff.factory.GitDiffFactory;

public class GitDiffMain {
	public static void main(String[] args) {
		GitDiff gitDiff = new GitDiff();
		gitDiff.excuteDiff(GitDiffFactory.INIT_COMMIT_ID, GitDiffFactory.END_COMMIT_ID);
	}
}
