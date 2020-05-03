package com.vadimtynchenko.bootman;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

/**
 *
 * @author vadimtynchenko
 */
public class Bot extends TelegramLongPollingBot {

    /**
     * Method for receiving messages.
     *
     * @param update Contains a messgae from the user.
     */
    @Override
    public void onUpdateReceived(Update update) {
        String message = update.getMessage().getText();
        if (message.equals("a")) {
            sendMsg(update.getMessage().getChatId().toString(), "В очко себе поори, пёс!");
        }
        else {
            sendMsg(update.getMessage().getChatId().toString(), message);
        }
    }

    /**
     * Method for setting up a message and sending it.
     *
     * @param chatId  Id of chat.
     * @param message The String to be sent as a message.
     */
    public synchronized void sendMsg(String chatId, String message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.enableMarkdown(true);
        sendMessage.setChatId(chatId);
        sendMessage.setText(message);
        try {
            execute(sendMessage);
            System.out.println();
        } catch (TelegramApiException e) {
            System.out.println(e.toString());
        }
    }

    /**
     * Method return the bot name specified during registration.
     *
     * @return The name of the Bot.
     */
    @Override
    public String getBotUsername() {
        return "BootMan_java_bot";
    }

    /**
     * Method returns a token Bot for communication with the Telegram server.
     *
     * @return The token of the Bot.
     */
    @Override
    public String getBotToken() {
        return "1133032134:AAECM0Zza6xhi3AkxAcADJUjUqhB4vIRr-A";
    }
}
