package com.example.netapp.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {
    
    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {
        // Enable simple memory-based message broker
        registry.enableSimpleBroker("/topic", "/queue");

        // Set a prefix for messages bound for @MessageMapping methods
        registry.setApplicationDestinationPrefixes("/app");

        // Set prefix for user-specific destinations
        registry.setUserDestinationPrefix("/user");
    }

    /**
     * Register STOMP endpoints
     * Clients will connect to this endpoint to establish websocket connection
     */
    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        // Register the endpoint that the client will use to connect to the server
        registry.addEndpoint("/ws").setAllowedOrigins("*").withSockJS();
    }
}
