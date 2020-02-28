package fr.lewon.bot.manager.entities

import com.fasterxml.jackson.annotation.JsonProperty

class BotOperationDTO {

    @JsonProperty
    var id: Long? = null
    @JsonProperty
    var label: String? = null
    @JsonProperty
    var params: List<BotPropertyDescriptorDTO> = emptyList()


}