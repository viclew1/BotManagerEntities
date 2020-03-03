package fr.lewon.bot.manager.entities

import com.fasterxml.jackson.annotation.JsonProperty

data class CallBotOperationDTO(
        @JsonProperty("operation_id") var operationId: Long = -1,
        @JsonProperty var params: Map<String, String?> = emptyMap()
)