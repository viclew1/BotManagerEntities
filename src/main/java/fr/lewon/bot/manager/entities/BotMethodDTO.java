package fr.lewon.bot.manager.entities;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BotMethodDTO {

	@JsonProperty
	private Long id;

	@JsonProperty
	private String label;

	@JsonProperty
	private Map<String, Object> params;

	public BotMethodDTO() {

	}

	public BotMethodDTO(Long id, String label, Map<String, Object> params) {
		this.id = id;
		this.label = label;
		this.params = params;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public Map<String, Object> getParams() {
		return params;
	}

	public void setParams(Map<String, Object> params) {
		this.params = params;
	}

}
