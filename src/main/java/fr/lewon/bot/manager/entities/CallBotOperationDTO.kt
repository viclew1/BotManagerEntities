package fr.lewon.bot.manager.entities

import com.fasterxml.jackson.annotation.JsonProperty

data class CallBotOperationDTO(
        @JsonProperty("operation_id") var operationId: Long,
        @JsonProperty var params: Map<String, String?> = emptyMap()
) {
    constructor() : this(-1)
}