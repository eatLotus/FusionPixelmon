package me.fusiondev.fusionpixelmon.config;

import com.google.common.reflect.TypeToken;
import info.pixelmon.repack.ninja.leaping.configurate.objectmapping.Setting;
import info.pixelmon.repack.ninja.leaping.configurate.objectmapping.serialize.ConfigSerializable;
import me.fusiondev.fusionpixelmon.modules.arcplates.config.ArcPlatesConfig;
import me.fusiondev.fusionpixelmon.modules.pokedesigner.config.PokeDesignerConfig;

import java.util.HashMap;

@ConfigSerializable
public class Config extends AbstractConfig {
    @SuppressWarnings("UnstableApiUsage")
    public final static TypeToken<Config> type = TypeToken.of(Config.class);

    @Setting("anti-fall-damage")
    private boolean antiFallDamage;
    @Setting("craft-masterballs")
    private boolean craftMasterBalls;
    @Setting("modifiers")
    private boolean modifiers;
    @Setting("pokeshrine")
    private HashMap<String, String> shrinePickup;
    @Setting("arcplates")
    private ArcPlatesConfig arcPlates;
    @Setting("pokedesigner")
    private PokeDesignerConfig pokeDesigner = new PokeDesignerConfig();

    @Override
    public boolean isAntiFallDamageEnabled() {
        return antiFallDamage;
    }

    @Override
    public boolean isMasterballCraftingEnabled() {
        return craftMasterBalls;
    }

    @Override
    public boolean hasModifiers() {
        return modifiers;
    }

    @Override
    public HashMap<String, String> getPickableShrines() {
        return shrinePickup;
    }

    @Override
    public ArcPlatesConfig getArcPlates() {
        return arcPlates;
    }

    @Override
    public PokeDesignerConfig getPokeDesignerConfig() {
        return pokeDesigner;
    }
}
