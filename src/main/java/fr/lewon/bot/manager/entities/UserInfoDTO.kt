package fr.lewon.bot.manager.entities

import com.fasterxml.jackson.annotation.JsonProperty

data class UserInfoDTO(
        @field:JsonProperty var login: String = "",
        @field:JsonProperty var password: String = "",
        @field:JsonProperty var params: Map<String, String?> = emptyMap()
)