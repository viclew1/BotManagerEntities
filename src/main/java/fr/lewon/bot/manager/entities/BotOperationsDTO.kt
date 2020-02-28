package fr.lewon.bot.manager.entities

import com.fasterxml.jackson.annotation.JsonProperty

class BotOperationsDTO(botOperations: List<BotOperationDTO> = emptyList()) {

    @JsonProperty("bot_operations")
    var botOperations: List<BotOperationDTO> = botOperations

}