package fr.lewon.bot.manager.entities

import com.fasterxml.jackson.annotation.JsonProperty

data class BotInfoDTO(
        @JsonProperty var id: Long,
        @JsonProperty var login: String,
        @JsonProperty var state: String
) {
    constructor() : this(-1, "", "")
}