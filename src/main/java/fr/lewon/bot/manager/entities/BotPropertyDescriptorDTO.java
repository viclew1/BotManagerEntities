package fr.lewon.bot.manager.entities;

public class BotPropertyDescriptorDTO {

	private String key;
	private String type;
	private String description;
	private Boolean needed;
	private Boolean nullable;
	private Object defaultValue;
	private Object[] acceptedValues;
	
	
	public BotPropertyDescriptorDTO() {
	}
	
	public BotPropertyDescriptorDTO(String key, String type, String description, Boolean needed, Boolean nullable, Object defaultValue, Object[] acceptedValues) {
		this.key = key;
		this.type = type;
		this.description = description;
		this.needed = needed;
		this.nullable = nullable;
		this.defaultValue = defaultValue;
		this.acceptedValues = acceptedValues;
	}
	
	
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
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
	public Object[] getAcceptedValues() {
		return acceptedValues;
	}
	public void setAcceptedValues(Object[] acceptedValues) {
		this.acceptedValues = acceptedValues;
	}
	
}
