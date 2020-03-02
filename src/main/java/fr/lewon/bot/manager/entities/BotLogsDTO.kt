package fr.lewon.bot.manager.entities

import com.fasterxml.jackson.annotation.JsonProperty

class BotLogsDTO(
        @JsonProperty var logs: List<String> = emptyList()
)