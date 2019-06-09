package fr.lewon.bot.manager.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BotPropertiesDTO {

	@JsonProperty
	private List<BotPropertyDTO> botProperties;

	
	public BotPropertiesDTO() {
	}

	public BotPropertiesDTO(List<BotPropertyDTO> botProperties) {
		this.botProperties = botProperties;
	}

	
	public List<BotPropertyDTO> getBotProperties() {
		return botProperties;
	}

	public void setBotProperties(List<BotPropertyDTO> botProperties) {
		this.botProperties = botProperties;
	}
	
}
