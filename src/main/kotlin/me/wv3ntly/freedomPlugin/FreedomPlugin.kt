package me.wv3ntly.freedomPlugin

import org.bukkit.plugin.java.JavaPlugin

class FreedomPlugin : JavaPlugin() {

    override fun onEnable() {
        logger.info("Freedom Plugin activated!")

        // Save the default configuration if not present
        saveDefaultConfig()

        val freedomManager = FreedomManager(this)

        // Initialize the world border from configuration
        freedomManager.initializeWorldBorder()
        logger.info("World border initialized successfully.")

        // Schedule automatic updates
        freedomManager.scheduleSmoothBorderUpdates()
        logger.info("Scheduled smooth border updates.")

        // Register commands
        registerCommands(freedomManager)
        logger.info("Commands registered successfully.")
    }

    override fun onDisable() {
        saveConfig() // Ensure all changes to the config are saved
        logger.info("Freedom Plugin deactivated!")
    }

    private fun registerCommands(freedomManager: FreedomManager) {
        val commands = mapOf(
            "freedom" to FreedomCommands(freedomManager)
        )

        commands.forEach { (name, executor) ->
            val command = getCommand(name)
            if (command != null) {
                command.setExecutor(executor)
                command.tabCompleter = FreedomTabCompleter()
            } else {
                logger.warning("Command '$name' is not defined in plugin.yml!")
            }
        }
    }
}