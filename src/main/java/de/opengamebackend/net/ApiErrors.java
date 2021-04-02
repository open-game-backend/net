package de.opengamebackend.net;

public class ApiErrors {
    public static final int INVALID_CREDENTIALS_CODE = 100;
    public static final String INVALID_CREDENTIALS_MESSAGE = "Invalid credentials.";

    public static final int UNKNOWN_AUTH_PROVIDER_CODE = 101;
    public static final String UNKNOWN_AUTH_PROVIDER_MESSAGE = "Unknown auth provider.";

    public static final int INVALID_ROLE_CODE = 102;
    public static final String INVALID_ROLE_MESSAGE = "Invalid role.";

    public static final int MISSING_GAME_MODE_CODE = 200;
    public static final String MISSING_GAME_MODE_MESSAGE = "Missing game mode.";

    public static final int MISSING_IPV4_ADDRESS_CODE = 201;
    public static final String MISSING_IPV4_ADDRESS_MESSAGE = "Missing IPv4 address.";

    public static final int MISSING_REGION_CODE = 202;
    public static final String MISSING_REGION_MESSAGE = "Missing region.";

    public static final int MISSING_VERSION_CODE = 203;
    public static final String MISSING_VERSION_MESSAGE = "Missing version.";

    public static final int MISSING_GAME_SERVER_ID_CODE = 204;
    public static final String MISSING_GAME_SERVER_ID_MESSAGE = "Missing game server id.";

    public static final int GAME_SERVER_NOT_FOUND_CODE = 205;
    public static final String GAME_SERVER_NOT_FOUND_MESSAGE = "Game server not found.";

    public static final int MISSING_PLAYER_ID_CODE = 206;
    public static final String MISSING_PLAYER_ID_MESSAGE = "Missing player id.";

    public static final int PLAYER_NOT_FOUND_CODE = 207;
    public static final String PLAYER_NOT_FOUND_MESSAGE = "Player not found.";

    public static final int PLAYER_NOT_FOUND_FOR_SERVER_CODE = 208;
    public static final String PLAYER_NOT_FOUND_FOR_SERVER_MESSAGE = "Player not found for server.";

    public static final int MISSING_ITEM_DEFINITION_CODE = 302;
    public static final String MISSING_ITEM_DEFINITION_MESSAGE = "Missing item definition.";

    public static final int UNKNOWN_ITEM_DEFINITION_CODE = 303;
    public static final String UNKNOWN_ITEM_DEFINITION_MESSAGE = "Unknown item definition.";

    public static final int INVALID_ITEM_COUNT_CODE = 304;
    public static final String INVALID_ITEM_COUNT_MESSAGE = "Invalid item count.";

    public static final int PLAYER_DOES_NOT_OWN_ITEM_CODE = 305;
    public static final String PLAYER_DOES_NOT_OWN_ITEM_MESSAGE = "Player does not own that item.";

    public static final int UNKNOWN_LOADOUT_TYPE_CODE = 306;
    public static final String UNKNOWN_LOADOUT_TYPE_MESSAGE = "Unknown loadout type.";

    public static final int UNKNOWN_LOADOUT_CODE = 307;
    public static final String UNKNOWN_LOADOUT_MESSAGE = "Unknown loadout.";

    public static final int UNKNOWN_ITEMTAG_CODE = 308;
    public static final String UNKNOWN_ITEMTAG_MESSAGE = "Unknown item tag: ";

    public static final int INVALID_LOADOUT_CODE = 309;
    public static final String INVALID_LOADOUT_MESSAGE = "Invalid loadout: ";

    public static final int ITEM_NOT_A_CONTAINER_CODE = 310;
    public static final String ITEM_NOT_A_CONTAINER_MESSAGE = "Item not a container.";

    public static final int UNKNOWN_QUEST_CATEGORY_CODE = 400;
    public static final String UNKNOWN_QUEST_CATEGORY_MESSAGE = "Unknown quest category: ";

    public static final int UNKNOWN_QUEST_DEFINITION_CODE = 401;
    public static final String UNKNOWN_QUEST_DEFINITION_MESSAGE = "Unknown quest definition: ";

    public static final int QUEST_NOT_FOUND_CODE = 402;
    public static final String QUEST_NOT_FOUND_MESSAGE = "Quest not found.";

    public static final int INSUFFICIENT_QUEST_PROGRESS_CODE = 403;
    public static final String INSUFFICIENT_QUEST_PROGRESS_MESSAGE = "Insufficient quest progress.";

    public static final int COLLECTION_SERVICE_UNAVAILABLE_CODE = 404;
    public static final String COLLECTION_SERVICE_UNAVAILABLE_MESSAGE = "Collection service unavailable.";
}
