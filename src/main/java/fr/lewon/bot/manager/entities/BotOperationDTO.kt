package fr.lewon.bot.manager.entities

import com.fasterxml.jackson.annotation.JsonProperty

data class BotOperationDTO(
        @JsonProperty var id: Long,
        @JsonProperty var label: String,
        @JsonProperty var params: List<BotPropertyDescriptorDTO> = emptyList()
) {
    constructor() : this(-1, "")
}