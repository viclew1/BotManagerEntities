package fr.lewon.bot.manager.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BotMethodDTO {

	@JsonProperty
	private String id;

	@JsonProperty
	private String label;

	@JsonProperty
	private List<BotPropertyDescriptorDTO> params;

	public BotMethodDTO() {

	}

	public BotMethodDTO(String id, String label, List<BotPropertyDescriptorDTO> params) {
		this.id = id;
		this.label = label;
		this.params = params;
	}


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public List<BotPropertyDescriptorDTO> getParams() {
		return params;
	}

	public void setParams(List<BotPropertyDescriptorDTO> params) {
		this.params = params;
	}

}
