package fr.lewon.bot.manager.entities

import com.fasterxml.jackson.annotation.JsonProperty

class BotTasksDTO {

    @JsonProperty("bot_tasks")
    var botTasks: List<BotTaskDTO> = emptyList()

}