package fr.lewon.bot.manager.entities

import com.fasterxml.jackson.annotation.JsonProperty

data class GameInfoDTO(
        @JsonProperty var id: Long,
        @JsonProperty var name: String,
        @JsonProperty("bot_info_list") var botInfoList: List<BotInfoDTO> = emptyList()
) {
    constructor() : this(-1, "")
}