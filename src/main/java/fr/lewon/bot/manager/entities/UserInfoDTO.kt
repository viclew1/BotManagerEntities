package fr.lewon.bot.manager.entities

import com.fasterxml.jackson.annotation.JsonProperty

class UserInfoDTO {

    @JsonProperty
    var login: String? = null
    @JsonProperty
    var password: String? = null
    @JsonProperty
    var params: Map<String, String?> = emptyMap()
}