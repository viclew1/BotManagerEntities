package fr.lewon.bot.manager.entities

import com.fasterxml.jackson.annotation.JsonProperty

data class GameInfoDTO(
        @JsonProperty var id: Long = -1,
        @JsonProperty var name: String = "",
        @JsonProperty("bot_info_list") var botInfoList: List<BotInfoDTO> = emptyList()
)