package fr.lewon.bot.manager.entities

import com.fasterxml.jackson.annotation.JsonProperty

data class BotInfoDTO(
        @JsonProperty var id: Long = -1,
        @JsonProperty var login: String = "",
        @JsonProperty var state: String = "",
        @JsonProperty("available_transitions") var availableTransitions: List<String> = emptyList()

)