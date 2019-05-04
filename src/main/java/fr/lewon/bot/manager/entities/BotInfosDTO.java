package fr.lewon.bot.manager.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BotInfosDTO {

	@JsonProperty
	private Long id;
	@JsonProperty
	private String login;
	@JsonProperty
	private String botState;

	public BotInfosDTO() {
	}

	public BotInfosDTO(Long id, String login, String botState) {
		super();
		this.id = id;
		this.login = login;
		this.botState = botState;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getBotState() {
		return botState;
	}

	public void setBotState(String botState) {
		this.botState = botState;
	}

}
