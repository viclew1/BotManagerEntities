package fr.lewon.bot.manager.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BotMethodsDTO {

	@JsonProperty
	private List<BotMethodDTO> methods;

	public BotMethodsDTO() {

	}

	public BotMethodsDTO(List<BotMethodDTO> methods) {
		super();
		this.methods = methods;
	}

	public List<BotMethodDTO> getMethods() {
		return methods;
	}

	public void setMethods(List<BotMethodDTO> methods) {
		this.methods = methods;
	}

}
