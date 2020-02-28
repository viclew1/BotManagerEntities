package fr.lewon.bot.manager.entities

import com.fasterxml.jackson.annotation.JsonProperty

class BotPropertyDescriptorDTO {
    
    @JsonProperty
    var key: String? = null
    @JsonProperty
    var type: String? = null
    @JsonProperty
    var description: String? = null
    @JsonProperty
    var needed: Boolean = false
    @JsonProperty
    var nullable: Boolean = false
    @JsonProperty("default_value")
    var defaultValue: Any? = null
    @JsonProperty("accepted_values")
    var acceptedValues: List<Any?> = emptyList()

}