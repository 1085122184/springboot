package com.domain;

import java.io.Serializable;

public class Mq implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int type;

	public int getType() {
		return type;
	}

	public Mq(int type) {
		super();
		this.type = type;
	}

	public void setType(int type) {
		this.type = type;
	}
	


}
