package fr.lewon.bot.manager.entities

import com.fasterxml.jackson.annotation.JsonProperty

data class BotTasksDTO(
        @field:JsonProperty("server_time") var serverTime: Long = -1,
        @field:JsonProperty("bot_tasks") var botTasks: List<BotTaskDTO> = emptyList()
)