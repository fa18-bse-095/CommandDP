/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commanddp;

/**
 *
 * @author fa18-bse-078
 */
public class FileInvoker {
	// implement stack
	Command cmd;
	public FileInvoker(Command cmd) {
		this.cmd = cmd;
	}
	void execute(){
		cmd.execute();
	}
	void undo(){
		cmd.undo();
	}
	
}
