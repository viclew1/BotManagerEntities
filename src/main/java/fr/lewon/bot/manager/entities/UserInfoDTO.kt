package fr.lewon.bot.manager.entities

import com.fasterxml.jackson.annotation.JsonProperty

data class UserInfoDTO(
        @JsonProperty var login: String = "",
        @JsonProperty var password: String = "",
        @JsonProperty var params: Map<String, String?> = emptyMap()
)