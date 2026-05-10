package com.demo.exception.toll;

public class BlackListed extends RuntimeException{
	public BlackListed(String msg) {
		super(msg);
	}

}
