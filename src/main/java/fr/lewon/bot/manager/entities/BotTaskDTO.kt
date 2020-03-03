package fr.lewon.bot.manager.entities

import com.fasterxml.jackson.annotation.JsonProperty

data class BotTaskDTO(
        @JsonProperty var id: Long = -1,
        @JsonProperty var name: String = "",
        @JsonProperty var state: String = "",
        @JsonProperty("next_execution_delay") var nextExecutionDelay: Long = -1
)