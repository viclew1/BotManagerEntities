package fr.lewon.bot.manager.entities

import com.fasterxml.jackson.annotation.JsonProperty

data class UserInfoDTO(
        @field:JsonProperty var login: String = "",
        @field:JsonProperty("login_properties") var loginProperties: Map<String, String> = emptyMap(),
        @field:JsonProperty var params: Map<String, String?> = emptyMap()
)