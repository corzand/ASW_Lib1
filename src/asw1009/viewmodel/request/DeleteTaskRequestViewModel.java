/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asw1009.viewmodel.request;

import java.util.Date;

/**
 *
 * @author Andrea
 */
public class DeleteTaskRequestViewModel {

	private int id;
	private long timeStamp;

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public long getTimeStamp(){
        return this.timeStamp;
    }
    
    public void setTimeStamp(long timeStamp){
        this.timeStamp = timeStamp;
    } 
}
