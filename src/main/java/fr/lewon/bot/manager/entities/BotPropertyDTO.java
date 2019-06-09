package fr.lewon.bot.manager.entities;

public class BotPropertyDTO {

	private String key;
	private String description;
	private Boolean needed;
	private Boolean nullable;
	private Object defaultValue;
	
	
	public BotPropertyDTO() {
	}
	
	public BotPropertyDTO(String key, String description, Boolean needed, Boolean nullable, Object defaultValue) {
		this.key = key;
		this.description = description;
		this.needed = needed;
		this.nullable = nullable;
		this.defaultValue = defaultValue;
	}
	
	
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Boolean getNeeded() {
		return needed;
	}
	public void setNeeded(Boolean needed) {
		this.needed = needed;
	}
	public Object getDefaultValue() {
		return defaultValue;
	}
	public void setDefaultValue(Object defaultValue) {
		this.defaultValue = defaultValue;
	}
	public Boolean getNullable() {
		return nullable;
	}
	public void setNullable(Boolean nullable) {
		this.nullable = nullable;
	}
	
}
