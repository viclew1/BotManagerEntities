package fr.lewon.bot.manager.entities

import com.fasterxml.jackson.annotation.JsonProperty

data class BotTasksDTO(
        @field:JsonProperty("bot_tasks") var botTasks: List<BotTaskDTO> = emptyList()
)