package com.templateEx2;

import com.templateEx2.abst.Game;

public class Soccer extends Game {

	@Override
	protected void initialize() {
		System.out.println("축구 Game initalize 게임시작");
	}

	@Override
	protected void start() {
		System.out.println("게임시작 : 축구 게임에 오신 걸 환영합니다.");
	}

	@Override
	protected void end() {
		System.out.println("축구게임을 종료합니다.");
	}

}
