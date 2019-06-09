package fr.lewon.bot.manager.entities;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserInfosDTO {

	@JsonProperty
	private String login;

	@JsonProperty
	private String password;

	@JsonProperty
	private Map<String, Object> params;

	public UserInfosDTO() {
	}

	public UserInfosDTO(String login, String password, Map<String, Object> params) {
		this.login = login;
		this.password = password;
		this.params = params;
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

	public Map<String, Object> getParams() {
		return params;
	}

	public void setParams(Map<String, Object> params) {
		this.params = params;
	}

}
