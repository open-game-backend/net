package de.opengamebackend.net;

public class ApiErrors {
    public static final int INVALID_CREDENTIALS_CODE = 100;
    public static final String INVALID_CREDENTIALS_MESSAGE = "Invalid credentials.";

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
}
