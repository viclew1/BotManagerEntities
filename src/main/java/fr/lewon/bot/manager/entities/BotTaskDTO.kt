package fr.lewon.bot.manager.entities

import com.fasterxml.jackson.annotation.JsonProperty

data class BotTaskDTO(
        @field:JsonProperty var name: String = "",
        @field:JsonProperty var state: String = "",
        @field:JsonProperty("execution_time") var executionTime: Long = -1
)