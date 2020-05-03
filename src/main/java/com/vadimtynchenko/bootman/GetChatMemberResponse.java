package com.vadimtynchenko.bootman;

import org.telegram.telegrambots.meta.api.objects.ChatMember;

/**
 *
 * @author vadimtynchenko
 */
public class GetChatMemberResponse extends BaseResponse {

    private ChatMember result;
    
    public ChatMember chatMember() {
        return result;
    }

    @Override
    public String toString() {
        return "GetChatMemberResponse{" +
                "result=" + result +
                '}';
    }
    
    
}
