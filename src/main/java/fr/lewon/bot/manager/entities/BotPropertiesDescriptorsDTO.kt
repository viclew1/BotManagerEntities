package fr.lewon.bot.manager.entities

import com.fasterxml.jackson.annotation.JsonProperty

class BotPropertiesDescriptorsDTO {

    @JsonProperty("bot_properties")
    var botProperties: List<BotPropertyDescriptorDTO> = emptyList()

}