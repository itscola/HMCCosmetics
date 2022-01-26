package io.github.fisher2911.hmccosmetics.message;

import io.github.fisher2911.hmccosmetics.gui.ArmorItem;
import org.bukkit.ChatColor;

public class Messages {

    public static final Message NO_PERMISSION =
            new Message("no-permission", "You do not have permission for this!");
    public static final Message NO_COSMETIC_PERMISSION =
            new Message("no-cosmetic-permission", "You do not have permission for this cosmetic!");
    public static final Message SET_HAT =
            new Message("set-hat", "Set hat");
    public static final Message REMOVED_HAT =
            new Message("removed-hat", "Removed hat");
    public static final Message SET_BACKPACK =
            new Message("set-backpack", "Set backpack");
    public static final Message REMOVED_BACKPACK =
            new Message("removed-backpack", "Removed backpack");
    public static final Message SET_OFF_HAND =
            new Message("set-off-hand", "Set off hand");
    public static final Message REMOVED_OFF_HAND =
            new Message("removed-off-hand", "Removed off hand");
    public static final Message SET_DYE_COLOR =
            new Message("set-dye-color", "Set dye color of " + Placeholder.ITEM);
    public static final Message MUST_BE_PLAYER =
            new Message("must-be-player", "You must be a player to do this!");
    public static final Message RELOADED =
            new Message("reloaded", "Config reloaded");
    public static final Message INVALID_TYPE =
            new Message("invalid-type", "Invalid type");
    public static final Message INVALID_USER =
            new Message("invalid-user", ChatColor.RED + "That user's data cannot be found!");
    public static final Message ITEM_NOT_FOUND =
            new Message("item-not-found", ChatColor.RED + "That item could not be found!");
    public static final Message HELP_COMMAND =
            new Message("help-command", "<#6D9DC5><st>                    </st> <gradient:#40B7D6:#6D9DC5>HMCCosmetics - Help</gradient><#6D9DC5> <st>                    </st>\n" +
                    "\n" +
                    "\n" +
                    "<#5AE4B5>• <#40B7D6>/cosmetics - <#6D9DC5>Opens cosmetics GUI.\n" +
                    "\n" +
                    "<#5AE4B5>• <#40B7D6>/cosmetics dye <gray><BACKPACK/HAT></gray> - <#6D9DC5>Opens dye menu for specified cosmetic.\n" +
                    "\n" +
                    "<#5AE4B5>• <#40B7D6>/cosmetics help - <#6D9DC5>Opens this menu.\n" +
                    "\n" +
                    "\n" +
                    "<st>                                                                   </st>");

    public static final Message SET_OTHER_BACKPACK = new Message(
            "set-other-backpack", ChatColor.GREEN + "You have set the backpack of " +
            Placeholder.PLAYER + " to " + Placeholder.TYPE + "."
    );
    public static final Message SET_OTHER_HAT = new Message(
            "set-other-backpack", ChatColor.GREEN + "You have set the helmet of " +
            Placeholder.PLAYER + " to " + Placeholder.TYPE + "."
    );
    public static final Message SET_OTHER_OFF_HAND = new Message(
            "set-other-off-hand", ChatColor.GREEN + "You have set the off hand of " +
            Placeholder.PLAYER + " to " + Placeholder.TYPE + "."
    );

    public static Message getSetMessage(final ArmorItem.Type type) {
        return switch (type) {
            case HAT -> Messages.SET_HAT;
            case BACKPACK -> Messages.SET_BACKPACK;
            case OFF_HAND -> Messages.SET_OFF_HAND;
        };
    }

    public static Message getRemovedMessage(final ArmorItem.Type type) {
        return switch (type) {
            case HAT -> Messages.REMOVED_HAT;
            case BACKPACK -> Messages.REMOVED_BACKPACK;
            case OFF_HAND -> Messages.REMOVED_OFF_HAND;
        };
    }

    public static Message getSetOtherMessage(final ArmorItem.Type type) {
        return switch (type) {
            case HAT -> Messages.SET_OTHER_HAT;
            case BACKPACK -> Messages.SET_OTHER_BACKPACK;
            case OFF_HAND -> Messages.SET_OTHER_OFF_HAND;
        };
    }

}
