package ch.boogaga.crystals.util;

import ch.boogaga.crystals.ConfigData;
import ch.boogaga.crystals.model.MessageStatus;
import ch.boogaga.crystals.model.persist.ChatMessagePrivate;
import ch.boogaga.crystals.model.persist.ChatMessagePublic;
import ch.boogaga.crystals.to.ChatMessageTo;

import java.time.LocalDateTime;

public class ChatMessageUtils {
    public static ChatMessagePrivate privateMessageFromTo(ChatMessageTo to, Integer recipientId) {
        return new ChatMessagePrivate(null, to.getSenderId(), to.getSenderName(), to.getMessage(),
                LocalDateTime.now(), LocalDateTime.now().plusDays(ConfigData.EXPIRE_TIME_PRIVATE_MESSAGE), recipientId,
                MessageStatus.RECEIVED);
    }

    public static ChatMessagePublic publicMessageFromTo(ChatMessageTo to, String localeId) {
        return new ChatMessagePublic(null, to.getSenderId(), to.getSenderName(), to.getMessage(),
                LocalDateTime.now(), LocalDateTime.now().plusDays(ConfigData.EXPIRE_TIME_PUBLIC_MESSAGE), localeId);
    }
}