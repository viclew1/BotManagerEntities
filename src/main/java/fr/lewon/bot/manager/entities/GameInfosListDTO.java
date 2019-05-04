package fr.lewon.bot.manager.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GameInfosListDTO {

	@JsonProperty
	private List<GameInfosDTO> gameInfosList;


	public GameInfosListDTO() {
	}

	public GameInfosListDTO(List<GameInfosDTO> gameInfosList) {
		this.gameInfosList = gameInfosList;
	}

	public List<GameInfosDTO> getGameInfosList() {
		return gameInfosList;
	}

	public void setGameInfosList(List<GameInfosDTO> gameInfosList) {
		this.gameInfosList = gameInfosList;
	}

}
