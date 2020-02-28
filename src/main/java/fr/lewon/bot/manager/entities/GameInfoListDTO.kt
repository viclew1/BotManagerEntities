package fr.lewon.bot.manager.entities

import com.fasterxml.jackson.annotation.JsonProperty

class GameInfoListDTO {

    @JsonProperty("game_info_list")
    var gameInfoList: List<GameInfoDTO> = emptyList()

}