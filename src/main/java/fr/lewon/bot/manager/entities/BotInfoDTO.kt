package fr.lewon.bot.manager.entities

import com.fasterxml.jackson.annotation.JsonProperty

data class BotInfoDTO(
        @field:JsonProperty var id: Long = -1,
        @field:JsonProperty var login: String = "",
        @field:JsonProperty var state: String = "",
        @field:JsonProperty("available_transitions") var availableTransitions: List<String> = emptyList()

)