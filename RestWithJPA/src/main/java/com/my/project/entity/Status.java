package com.my.project.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Status_Table")
public class Status {
	
	@Id
	private int Status_Id;
	private String State;
	
	public int getStatus_Id() {
		return Status_Id;
	}
	public void setStatus_Id(int status_Id) {
		Status_Id = status_Id;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	
	@Override
	public String toString() {
		return "Status [Status_Id=" + Status_Id + ", State=" + State + "]";
	}

}
