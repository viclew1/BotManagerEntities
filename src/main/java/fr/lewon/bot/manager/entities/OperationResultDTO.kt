package fr.lewon.bot.manager.entities

import com.fasterxml.jackson.annotation.JsonProperty

data class OperationResultDTO(
        @field:JsonProperty("is_success") var isSuccess: Boolean = false,
        @field:JsonProperty var message: String = "",
        @field:JsonProperty var content: Any? = null,
        @field:JsonProperty("result_type") var resultType: String = ""
)