package com.diff.core.cmd;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.logging.Logger;

public class WincmdShell {
	private final static Logger log = Logger.getGlobal();

	public String excuteCmd(String cmd) {

		// shell
		ProcessBuilder builder = new ProcessBuilder("C:/Windows/System32/cmd.exe");
		Process p = null;

		try {
			p = builder.start();
		} catch (IOException e) {
			e.printStackTrace();
			log.info(e.toString());
		}
		
		BufferedWriter p_stdin = new BufferedWriter(new OutputStreamWriter(p.getOutputStream()));
		
		
		
		int n=10;
        for (int i=0; i<n; i++) {
            try {
                //single execution
            p_stdin.write("dir");
            p_stdin.newLine();
            p_stdin.flush();
            }
            catch (IOException e) {
            System.out.println(e);
            }
        
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(p_stdin.getInputStream()));
    		String line = null;
    		StringBuffer readBuffer = null;
    		
            try {
    			while((line = bufferedReader.readLine()) != null) {
    				readBuffer.append(line);
    				readBuffer.append("\n");
    			}
    		} catch (IOException e1) {
    			e1.printStackTrace();
    		}
            String result = readBuffer.toString();
			System.out.println("command result : "+result);
        }
		
        try {
            p_stdin.write("exit");
            p_stdin.newLine();
            p_stdin.flush();
        }
        catch (IOException e) {
            System.out.println(e);
        }
        
		
		return cmd;
	}

	public static void main(String[] args) {
		new WincmdShell().excuteCmd("");
	}
}
