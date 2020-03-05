package fr.lewon.bot.manager.entities

import com.fasterxml.jackson.annotation.JsonProperty

data class BotOperationsDTO(
        @field:JsonProperty("bot_operations") var botOperations: List<BotOperationDTO> = emptyList()
)