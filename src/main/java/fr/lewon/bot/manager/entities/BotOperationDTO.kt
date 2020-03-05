package fr.lewon.bot.manager.entities

import com.fasterxml.jackson.annotation.JsonProperty

data class BotOperationDTO(
        @field:JsonProperty var id: Long = -1,
        @field:JsonProperty var label: String = "",
        @field:JsonProperty var params: List<BotPropertyDescriptorDTO> = emptyList()
)