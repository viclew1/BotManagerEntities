package fr.lewon.bot.manager.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GameInfosDTO {

	@JsonProperty
	private String id;

	@JsonProperty
	private String name;

	private List<BotInfosDTO> botInfos;

	public GameInfosDTO() {
	}

	public GameInfosDTO(String id, String name, List<BotInfosDTO> botInfos) {
		super();
		this.id = id;
		this.name = name;
		this.botInfos = botInfos;
	}


	public List<BotInfosDTO> getBotInfos() {
		return botInfos;
	}

	public void setBotInfos(List<BotInfosDTO> botInfos) {
		this.botInfos = botInfos;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
