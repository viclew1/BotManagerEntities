package fr.lewon.bot.manager.entities

import com.fasterxml.jackson.annotation.JsonProperty

data class GameInfoListDTO(
        @field:JsonProperty("game_info_list") var gameInfoList: List<GameInfoDTO> = emptyList()
)