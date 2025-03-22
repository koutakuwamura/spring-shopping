package com.example.demo.model;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Component
@SessionScope
public class Account {
	//フィールド
	private String name;

	//コンストラクタ
	public Account() {

	}

	public Account(String name) {
		this.name = name;
	}

	//ゲッター
	public String getName() {
		return name;
	}

	//セッター
	public void setName(String name) {
		this.name = name;
	}

}
/*modelはitemsように初期データが入っているテーブルではなく
 初期が空のテーブルやテーブルがないデータの文クラス的な役割を果たしている
 */