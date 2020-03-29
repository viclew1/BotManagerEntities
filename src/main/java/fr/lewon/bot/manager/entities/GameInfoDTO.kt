package fr.lewon.bot.manager.entities

import com.fasterxml.jackson.annotation.JsonProperty

data class GameInfoDTO(
        @field:JsonProperty var id: Long = -1,
        @field:JsonProperty var name: String = "",
        @field:JsonProperty("bot_info_list") var botInfoList: List<BotInfoDTO> = emptyList()
)