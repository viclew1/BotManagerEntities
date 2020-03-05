package fr.lewon.bot.manager.entities

import com.fasterxml.jackson.annotation.JsonProperty

data class BotTaskDTO(
        @field:JsonProperty var id: Long = -1,
        @field:JsonProperty var name: String = "",
        @field:JsonProperty var state: String = "",
        @field:JsonProperty("next_execution_delay") var nextExecutionDelay: Long = -1
)