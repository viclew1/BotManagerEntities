package fr.lewon.bot.manager.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserInfosDTO {

	@JsonProperty
	private String login;

	@JsonProperty
	private String password;

	public UserInfosDTO() {
	}

	public UserInfosDTO(String login, String password) {
		this.login = login;
		this.password = password;
	}


	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
