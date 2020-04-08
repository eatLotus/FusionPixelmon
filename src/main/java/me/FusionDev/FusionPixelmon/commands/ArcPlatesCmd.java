package me.FusionDev.FusionPixelmon.commands;

import com.pixelmonmod.pixelmon.enums.EnumSpecies;
import me.FusionDev.FusionPixelmon.guis.ArcPlates;
import me.FusionDev.FusionPixelmon.guis.PokeSelectorUI;
import org.spongepowered.api.command.CommandResult;
import org.spongepowered.api.command.CommandSource;
import org.spongepowered.api.command.args.CommandContext;
import org.spongepowered.api.command.spec.CommandExecutor;
import org.spongepowered.api.entity.living.player.Player;
import org.spongepowered.api.text.Text;
import org.spongepowered.api.text.format.TextColors;
import org.spongepowered.plugin.meta.util.NonnullByDefault;

@NonnullByDefault
public class ArcPlatesCmd implements CommandExecutor {

    @Override
    public CommandResult execute(CommandSource src, CommandContext args) {
        if (src instanceof Player) {
            Player player = (Player) src;
            new PokeSelectorUI(player, "Arceus Selector", "arceusselector", pokemon -> {
                if (pokemon.getSpecies() == EnumSpecies.Arceus) new ArcPlates().launch(player, pokemon);
                else player.sendMessage(Text.of(TextColors.RED, "Please only select an Arceus!"));
            });
        }
        return CommandResult.success();
    }
}
