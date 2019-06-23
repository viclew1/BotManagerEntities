package fr.lewon.bot.manager.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BotPropertiesDescriptorsDTO {

	@JsonProperty
	private List<BotPropertyDescriptorDTO> botProperties;

	
	public BotPropertiesDescriptorsDTO() {
	}

	public BotPropertiesDescriptorsDTO(List<BotPropertyDescriptorDTO> botProperties) {
		this.botProperties = botProperties;
	}

	
	public List<BotPropertyDescriptorDTO> getBotProperties() {
		return botProperties;
	}

	public void setBotProperties(List<BotPropertyDescriptorDTO> botProperties) {
		this.botProperties = botProperties;
	}
	
}
