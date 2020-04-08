package me.FusionDev.FusionPixelmon.commands;

import me.FusionDev.FusionPixelmon.guis.PokeSelectorUI;
import me.FusionDev.FusionPixelmon.guis.shops.Shops;
import org.spongepowered.api.command.CommandResult;
import org.spongepowered.api.command.CommandSource;
import org.spongepowered.api.command.args.CommandContext;
import org.spongepowered.api.command.spec.CommandExecutor;
import org.spongepowered.api.entity.living.player.Player;
import org.spongepowered.plugin.meta.util.NonnullByDefault;

@NonnullByDefault
public class PokeDesignerCmd implements CommandExecutor {

    @Override
    public CommandResult execute(CommandSource src, CommandContext args) {
        if (src instanceof Player) {
            Player player = (Player) src;
            Shops shops = new Shops(player);
            new PokeSelectorUI(player, "Pokemon Selector", "pokeselector", shops::launch);
        }
        return CommandResult.success();
    }
}
