package fr.lewon.bot.manager.entities;

import java.util.Map;

public class CallMethodDTO {

	private String methodId;
	private Map<String, Object> params;
	
	
	public CallMethodDTO() {
	}

	public CallMethodDTO(String methodId, Map<String, Object> params) {
		this.methodId = methodId;
		this.params = params;
	}
	
	
	public String getMethodId() {
		return methodId;
	}
	public void setMethodId(String methodId) {
		this.methodId = methodId;
	}
	public Map<String, Object> getParams() {
		return params;
	}
	public void setParams(Map<String, Object> params) {
		this.params = params;
	}
	
}
