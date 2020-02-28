package fr.lewon.bot.manager.entities

import com.fasterxml.jackson.annotation.JsonProperty

class GameInfoDTO {

    @JsonProperty
    var id: Long? = null
    @JsonProperty
    var name: String? = null
    @JsonProperty("bot_info")
    var botInfo: List<BotInfoDTO> = emptyList()

}