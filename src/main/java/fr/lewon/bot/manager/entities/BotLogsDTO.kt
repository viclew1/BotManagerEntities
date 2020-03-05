package fr.lewon.bot.manager.entities

import com.fasterxml.jackson.annotation.JsonProperty

class BotLogsDTO(
        @field:JsonProperty var logs: List<String> = emptyList()
)