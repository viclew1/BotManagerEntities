package fr.lewon.bot.manager.entities

import com.fasterxml.jackson.annotation.JsonProperty

data class BotPropertyDescriptorDTO(
        @JsonProperty var key: String = "",
        @JsonProperty var type: String = "",
        @JsonProperty var description: String = "",
        @JsonProperty var needed: Boolean = false,
        @JsonProperty var nullable: Boolean = false,
        @JsonProperty("default_value") var defaultValue: Any? = null,
        @JsonProperty("accepted_values") var acceptedValues: List<Any?> = emptyList()
)