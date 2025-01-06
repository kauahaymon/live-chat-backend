package haymon.world.livechatsb.domain;

/**
 * Represents the input structure for a chat message.
 *
 * @param user The username of the sender.
 * @param message The message content.
 */
public record ChatInput(String user, String message) {
}
