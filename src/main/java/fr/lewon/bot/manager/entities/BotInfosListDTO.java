package fr.lewon.bot.manager.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BotInfosListDTO {

	@JsonProperty("bot_infos")
	private List<BotInfosDTO> botInfosList;

	public List<BotInfosDTO> getBotInfosList() {
		return botInfosList;
	}

	public void setBotInfosList(List<BotInfosDTO> botInfosList) {
		this.botInfosList = botInfosList;
	}
	
}
