package fr.lewon.bot.manager.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BotLogsDTO {

	@JsonProperty
	private List<String> logs;

	public BotLogsDTO() {
		
	}
	
	public BotLogsDTO(List<String> logs) {
		this.logs = logs;
	}

	public List<String> getLogs() {
		return logs;
	}
	public void setLogs(List<String> logs) {
		this.logs = logs;
	}

}
