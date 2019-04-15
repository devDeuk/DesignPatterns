package com.singleton.singletonEx1;

public class SystemSpeaker {
	
	static private SystemSpeaker instance;
	
	private int volumn;
	
	
	private SystemSpeaker() {
		volumn = 5;
	}
	
	public static SystemSpeaker getInstance() {
		
		if(instance == null) {
			instance = new SystemSpeaker();
			System.out.println("새로 생성");
		}else {
			System.out.println("이미 생성");
		}
		
		return instance;
	}

	public int getVolumn() {
		return volumn;
	}

	public void setVolumn(int volumn) {
		this.volumn = volumn;
	}
	
}
