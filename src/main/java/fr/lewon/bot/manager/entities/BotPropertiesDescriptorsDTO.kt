package fr.lewon.bot.manager.entities

import com.fasterxml.jackson.annotation.JsonProperty

data class BotPropertiesDescriptorsDTO(
        @field:JsonProperty("bot_properties") var botPropertiesDTO: List<BotPropertyDescriptorDTO> = emptyList()
)