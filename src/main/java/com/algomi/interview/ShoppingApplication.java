package com.algomi.interview;

import java.io.IOException;

import static java.lang.String.format;
import static java.lang.System.out;
import static com.algomi.interview.Catalogue.*;
import static com.algomi.interview.StringUtils.rightPad;

public class ShoppingApplication
{
    public static void main(String[] args) throws IOException {
        // Simple cases
        checkPrice("Just food", 0.7f, new Basket(
                APPLE,
                MILK));
        checkPrice("One dvd", 9.99f, new Basket(
                AVENGERS_ASSEMBLE));
        checkPrice("Just clothes", 36.54f, new Basket(
                TROUSERS,
                SHIRT));

        // Book 2-for-1 offer
        checkPrice("Two dvds", 9.99f, new Basket(
                AVENGERS_ASSEMBLE,
                AVENGERS_ASSEMBLE));
        checkPrice("Two different dvds", 20.0f, new Basket(
                AVENGERS_ASSEMBLE,
                BLUE_PLANET));
        checkPrice("Three dvds, two expensive", 40.0f, new Basket(
                AVENGERS_ASSEMBLE,
                BLUE_PLANET,
                BLUE_PLANET));
        checkPrice("Four dvds", 34.95f, new Basket(
                AVENGERS_ASSEMBLE,
                BOND_COLLECTION,
                BOND_COLLECTION,
                BLUE_PLANET));
        checkPrice("Three dvds, two cheap", 29.99f, new Basket(
                AVENGERS_ASSEMBLE,
                AVENGERS_ASSEMBLE,
                BLUE_PLANET));
        checkPrice("Three dvds, one cheap", 34.95f, new Basket(
                AVENGERS_ASSEMBLE,
                BOND_COLLECTION,
                BLUE_PLANET));

        // Mixed baskets
        checkPrice("Mixed basket #1", 49.6f, new Basket(
                AVENGERS_ASSEMBLE,
                APPLE,
                TROUSERS,
                BLUE_PLANET));
        checkPrice("Mixed basket #2", 55.28f, new Basket(
                MILK,
                MILK,
                SHIRT,
                SHIRT,
                BLUE_PLANET,
                BLUE_PLANET,
                BLUE_PLANET,
                BLUE_PLANET));
        checkPrice("Mixed basket #3", 72.19f, new Basket(
                APPLE,
                MILK,
                TROUSERS,
                SHIRT,
                AVENGERS_ASSEMBLE,
                BOND_COLLECTION,
                BLUE_PLANET));
    }

    private static void checkPrice(String name, float expectedPrice, Basket basket)
    {
        float price = pricer().price(basket);

        boolean passed = price == expectedPrice;
        String passOrFail = passed ? "    " : "FAIL";
        String feedback = passed
                ? format("%.2f", expectedPrice)
                : format("%.2f != %.2f", price, expectedPrice);

        out.println(format("%s %s %s",
                passOrFail,
                rightPad(name, ' ', 30),
                feedback));
    }

    private static Pricer pricer()
    {
        // Replace this with your class
        return new DummyPricer();
    }
}