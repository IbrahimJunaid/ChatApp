package com.dodo.chatapp.utilities;

import java.util.HashMap;

public class Constants {
    public static final String KEY_COLLECTION_USERS = "user";
    public static final String KEY_NAME = "name";
    public static final String KEY_EMAIL = "email";
    public static final String KEY_PASSWORD = "password";
    public static final String KEY_PREFERENCE_NAME = "chatAppPreference";
    public static final String KEY_IS_SIGNED_IN = "isSignedIn";
    public static final String KEY_USER_ID = "userId";
    public static final String KEY_IMAGE = "image";
    public static final String KEY_FCM_TOKEN = "fcmToken";
    public static final String KEY_USER= "user";
    public static final String KEY_COLLECTION_CHAT= "chat";
    public static final String KEY_SENDER_ID="senderId";
    public static final String KEY_RECEIVER_ID="receivedId";
    public static final String KEY_MESSAGE="message";
    public static final String KEY_TIMESTAMP="timestamp";
    public static final String KEY_COLLECTION_CONVERSATIONS="conversations";
    public static final String KEY_SENDER_NAME="senderName";
    public static final String KEY_RECEIVER_NAME="receiverName";
    public static final String KEY_SENDER_IMAGE="senderImage";
    public static final String KEY_RECEIVER_IMAGE="receiverImage";
    public static final String KEY_LAST_MESSAGE="lastMessage";
    public static final String KEY_AVAILABILITY="availability";
    public static final String REMOTE_MESSAGE_AUTHORIZATION="Authorization";
    public static final String REMOTE_MESSAGE_CONTENT_TYPE="Content-Type";
    public static final String REMOTE_MSG_DATA="data";
    public static final String REMOTE_MSG_REGISTRATION_IDS="registration_ids";


    public static HashMap<String, String> remoteMsgHeaders=null;
    public static HashMap<String, String>getRemoteMsgHeaders(){
        if (remoteMsgHeaders==null){
            remoteMsgHeaders= new HashMap<>();
            remoteMsgHeaders.put(
                    REMOTE_MESSAGE_AUTHORIZATION,
                    "key=AAAAhocsxQA:APA91bFzJtgK3o-X7FmlAIskNBVaVEahlx2gl936qe45lG0JhyenEMv_M8hQMuSxAtclP-3EtCK_tM8BaaDv9kv0k__oyy-vOhWz2VN0A3cqRqZ5jh_qWdNjEtsf8Z0Y9IjgnJcNLg0w"
            );
            remoteMsgHeaders.put(
                    REMOTE_MESSAGE_CONTENT_TYPE,
                    "application/json"
            );
        }
        return remoteMsgHeaders;
    }

}
