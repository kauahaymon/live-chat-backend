package haymon.world.livechatsb.controller;

import haymon.world.livechatsb.domain.ChatInput;
import haymon.world.livechatsb.domain.ChatOutput;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

/**
 * Controller responsible for managing live chat messages.
 */
@Controller
public class LiveChatController {

    /**
     * Receives a new message from a client and broadcasts it to subscribers.
     *
     * @param input the incoming message from the client.
     * @return the processed message to be sent to all subscribers.
     */

    @MessageMapping("/new-message") // Endpoint to receive messages
    @SendTo("/topics/livechat") // Destination for broadcasting messages
    public ChatOutput newMessage(ChatInput input) {
        // Escape HTML content for security
        return new ChatOutput(HtmlUtils.htmlEscape(input.user() + ": " + input.message()));
    }
}
