---

![Plugin Logo](https://github.com/user-attachments/assets/434bc45e-55c6-477a-b39b-3f25d53113b6)

---

# **Freedom Plugin - Dynamic World Border Management 1.21.X**

**Freedom Plugin** introduces dynamic world border functionality for Minecraft *1.21.X* servers, enhancing the gameplay experience by promoting fairness and balance among players. This plugin allows server administrators to customize the world border's behavior, including features like periodic expansion, smooth transitions, and player notifications.

Perfect for servers using datapacks or custom world generation mechanics, the plugin ensures a balanced game field, limiting the advantage of looting distant structures while encouraging local mining and exploration.

⚠️ **Note**: This project is currently in **Beta**. Features and functionality may change, and bugs might occur. Please report any issues via [GitHub Issues](https://github.com/wv3ntlyk/FreedomPlugin/issues).

---

## **Key Features**
- 🎛️ **Fully Configurable**: Manage the plugin easily via `config.yml`.
- ⏳ **Automatic Expansion**: Expand the border automatically based on in-game server days.
- 🔧 **Customizable Settings**:
  - Configure wait time between expansions.
  - Adjust border size increments and maximum size.
- 🌐 **Smooth Transitions**: Seamless animations for border changes with visual effects.
- 🔔 **Player Notifications**: Notify players about border updates for transparency.
- ⚙️ **Administrative Commands**:
  - Debug or restore default settings.
  - Manually trigger border updates.
- 🛠️ **Simple Commands**: Use `/freedom` to manage and configure the plugin.

---

## **Why Use Freedom Plugin?**
This plugin is designed for servers with custom or enhanced gameplay mechanics, such as:
- **Datapacks with Custom World Generation**: Expanding borders ensure equal access to structures and resources for all players.
- **Balanced Multiplayer Gameplay**: Prevent players from gaining an unfair advantage by reaching far-off structures early.
- **Dynamic Exploration**: Keep the gameplay fresh and exciting with periodic border expansions.

---

## **Usage Instructions**
1. **Install the Plugin**:
   - Download the latest version of the plugin from the [Releases](#) page.
   - Place the JAR file in your server's `plugins` folder.
2. **Configure Settings**:
   - Open the `config.yml` file generated in the `FreedomPlugin` folder.
   - Adjust settings like initial border size, increment values, expansion frequency, and transition effects.
3. **Start Your Server**:
   - The plugin will automatically apply the world border configuration upon startup.
4. **Manage with Commands**:
   - `/freedom`: Access the main command for managing the plugin.
   - Additional administrative commands are available for debugging and manual updates.

---

## **Commands and Permissions**
| Command                   | Description                                | Permission             |
|---------------------------|--------------------------------------------|------------------------|
| `/freedom`                | Opens the main management menu.            | `freedom.manage`       |
| `/freedom debug`          | Sends debug message in chat.               | `freedom.admin`        |
| `/freedom restore`        | Restores default settings.                 | `freedom.admin`        |

---

## **Configuration Example**
Here's a sample `config.yml` file:

```yaml
# Freedom Plugin Configuration
world: "world"
border:
  initialSize: 128        # Initial size of the world border
  increment: 128          # Size increment per cycle
  maxDays: 300            # Maximum number of days during which the border will expand
  maxSize: 29999984       # Maximum size of the world border(server default: 29999984)
  transitionTime: 120     # Animation time for border expansion (in seconds)
  waitTime: 10            # Days to wait between border expansions
  centerX: 0.0            # X-coordinate of the border center
  centerZ: 0.0            # Z-coordinate of the border center
  autoExpand: true        # Should the borders expand automatically (Turns On/Off the plugin)
  notifyPlayers: true     # Should players be notified about border updates
  logUpdates: true        # Should changes to the border be logged to the console
```

---

## **Benefits for Server Gameplay**
- **Equal Opportunity**: All players gain fair access to resources and structures as the border expands.
- **Enhanced Experience**: Dynamic borders keep the game engaging, even in long-term server setups.
- **Balanced Progression**: Ensures a level playing field in competitive or cooperative multiplayer scenarios.

---

## **Contribute**
Feel free to contribute to this project! Open an issue or submit a pull request if you have ideas or bug reports.

---

## **License**
This plugin is licensed under the [MIT License](LICENSE). Use it freely in your projects!

---
