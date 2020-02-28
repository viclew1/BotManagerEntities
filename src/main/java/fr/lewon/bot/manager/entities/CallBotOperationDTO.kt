package fr.lewon.bot.manager.entities

import com.fasterxml.jackson.annotation.JsonProperty

class CallBotOperationDTO {

    @JsonProperty
    var id: Long? = null
    @JsonProperty
    var params: Map<String, String?> = emptyMap()

}