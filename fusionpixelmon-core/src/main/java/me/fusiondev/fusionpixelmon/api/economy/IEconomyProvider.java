package me.fusiondev.fusionpixelmon.api.economy;

import me.fusiondev.fusionpixelmon.api.AbstractPlayer;

import java.math.BigDecimal;
import java.util.Optional;

/**
 * An interface that handles
 * @param <S>
 * @param <C>
 */
public interface IEconomyProvider<S, C> {

    Optional<S> getService();

    default boolean serviceExists() {
        return getService().isPresent();
    }

    C getCurrency();

    default C getCurrency(String name) {
        return getCurrency();
    }

    String getCurrencyName(double amount);

    default String getCurrencySymbol(double amount) {
        return getCurrencySymbol() + amount;
    }

    default String getCurrencySymbol() {
        return "$";
    }

    BigDecimal balance(AbstractPlayer player);

    boolean canAfford(AbstractPlayer player, double amount);

    default boolean deposit(AbstractPlayer player, double amount){
        return deposit(player, amount, false);
    }

    boolean deposit(AbstractPlayer player, double amount, boolean message);

    default boolean withdraw(AbstractPlayer player, double amount) {
        return withdraw(player, amount, false);
    }

    boolean withdraw(AbstractPlayer player, double amount, boolean message);
}
