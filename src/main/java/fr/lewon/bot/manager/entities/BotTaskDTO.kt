package fr.lewon.bot.manager.entities

import com.fasterxml.jackson.annotation.JsonProperty

class BotTaskDTO {

    @JsonProperty
    val id: Long? = null
    @JsonProperty
    val name: String? = null
    @JsonProperty
    val description: String? = null
    @JsonProperty("next_execution_time")
    val nextExecutionTime: Long? = null
    @JsonProperty("last_execution_time")
    val lastExecutionTime: Long? = null
    @JsonProperty("server_time")
    val serverTime: Long? = null

}