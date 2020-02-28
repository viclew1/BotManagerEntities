package fr.lewon.bot.manager.entities

import com.fasterxml.jackson.annotation.JsonProperty

class BotLogsDTO(logs: List<String> = emptyList()) {

    @JsonProperty
    var logs: List<String> = logs

}