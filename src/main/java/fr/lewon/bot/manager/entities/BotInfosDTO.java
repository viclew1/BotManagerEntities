package fr.lewon.bot.manager.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BotInfosDTO {

	@JsonProperty
	private String login;
	@JsonProperty("game_name")
	private String gameName;
	@JsonProperty
	private String botState;

	public BotInfosDTO() {
	}
	
	public BotInfosDTO(String login, String gameName, String botState) {
		super();
		this.login = login;
		this.gameName = gameName;
		this.botState = botState;
	}

	
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public String getBotState() {
		return botState;
	}

	public void setBotState(String botState) {
		this.botState = botState;
	}

}
