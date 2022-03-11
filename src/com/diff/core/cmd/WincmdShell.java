package com.diff.core.cmd;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.logging.Logger;

public class WincmdShell {
	private final static Logger log = Logger.getGlobal();

	public String excuteCmd(String cmd) {
		
		Process process = null;
        String[] command_arr = new String[]{"cmd.exe","/K","start"};
        ProcessBuilder pBuilder = new ProcessBuilder("C:/Windows/System32/cmd.exe");
        try{
            process = pBuilder.start();
        }
        catch(IOException e){
            e.printStackTrace();
            System.out.println("Process failed");
        }
        if(null != process){
            OutputStream out = process.getOutputStream();
            OutputStreamWriter outWriter = new OutputStreamWriter(out);
            BufferedWriter bWriter = new BufferedWriter(outWriter);
            try{
                bWriter.write("dir");
                bWriter.newLine();
                bWriter.write("ipconfig");
                bWriter.flush();
                bWriter.close();
            }
            catch(IOException e){
                e.printStackTrace();
                System.out.println("bWriter Failed");
            }
        }	
		
		
		return "";
	}

	public static void main(String[] args) {
		new WincmdShell().excuteCmd("");
	}
}
