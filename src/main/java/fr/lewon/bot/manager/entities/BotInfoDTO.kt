package fr.lewon.bot.manager.entities

import com.fasterxml.jackson.annotation.JsonProperty

class BotInfoDTO {

    @JsonProperty
    var id: Long? = null
    @JsonProperty
    var login: String? = null
    @JsonProperty("bot_state")
    var botState: String? = null

}