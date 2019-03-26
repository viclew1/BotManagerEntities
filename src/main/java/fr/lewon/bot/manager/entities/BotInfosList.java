package fr.lewon.bot.manager.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BotInfosList {

	@JsonProperty("bot_infos")
	private List<BotInfos> botInfosList;

	public List<BotInfos> getBotInfosList() {
		return botInfosList;
	}

	public void setBotInfosList(List<BotInfos> botInfosList) {
		this.botInfosList = botInfosList;
	}
	
}
