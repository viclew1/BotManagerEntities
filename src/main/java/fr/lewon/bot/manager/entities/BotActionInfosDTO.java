package fr.lewon.bot.manager.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BotActionInfosDTO {

	@JsonProperty
	private String login;
	
	@JsonProperty
	private String password;
	
	@JsonProperty("game_name")
	private String gameName;

	public BotActionInfosDTO() {
	}
	
	public BotActionInfosDTO(String login, String password, String gameName) {
		this.login = login;
		this.password = password;
		this.gameName = gameName;
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

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	
}
