package fr.lewon.bot.manager.entities

import com.fasterxml.jackson.annotation.JsonProperty

data class BotPropertyDescriptorDTO(
        @field:JsonProperty var key: String = "",
        @field:JsonProperty var type: String = "",
        @field:JsonProperty var description: String = "",
        @field:JsonProperty var needed: Boolean = false,
        @field:JsonProperty var nullable: Boolean = false,
        @field:JsonProperty("default_value") var defaultValue: Any? = null,
        @field:JsonProperty("accepted_values") var acceptedValues: List<Any?> = emptyList()
)