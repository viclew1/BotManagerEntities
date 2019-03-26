package fr.lewon.bot.manager.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AvailableBots {

	@JsonProperty("bot_names")
	private List<String> botNames;

	public List<String> getBotNames() {
		return botNames;
	}

	public void setBotNames(List<String> botNames) {
		this.botNames = botNames;
	}
	
}
