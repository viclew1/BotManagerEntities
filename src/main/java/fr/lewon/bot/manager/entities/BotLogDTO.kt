package fr.lewon.bot.manager.entities

import com.fasterxml.jackson.annotation.JsonProperty

data class BotLogDTO(
        @field:JsonProperty var message: String = "",
        @field:JsonProperty var time: Long = -1,
        @field:JsonProperty var level: String = ""
)