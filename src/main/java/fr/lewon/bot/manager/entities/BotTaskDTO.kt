package fr.lewon.bot.manager.entities

import com.fasterxml.jackson.annotation.JsonProperty

data class BotTaskDTO(
        @JsonProperty var id: Long,
        @JsonProperty var name: String,
        @JsonProperty var description: String,
        @JsonProperty("next_execution_time") var nextExecutionTime: Long,
        @JsonProperty("last_execution_time") var lastExecutionTime: Long,
        @JsonProperty("server_time") var serverTime: Long
) {
    constructor() : this(-1, "", "", 0, 0, 0)
}