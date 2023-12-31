package com.evozon.steps;

import net.thucydides.core.annotations.Step;

import java.util.List;

public class ProductDetailsSteps extends BaseSteps {
    @Step
    public void selectColour(String colour) {
        productDetailsPage.selectColourOption(colour);
    }

    @Step
    public void selectSize(String size) {
        productDetailsPage.selectSizeOption(size);
    }

    @Step
    public void clickAddToCart() {
        productDetailsPage.clickAddToCartButton();
    }

    @Step
    public void addToCartCustomisableClothing(String colour, String size) {
        selectColour(colour);
        selectSize(size);
        clickAddToCart();
    }

    @Step
    public void selectLinksByTitle(List<String> titleList) {
        titleList
                .forEach(productDetailsPage::selectLinkByTitle);
    }

    @Step
    public void selectLinkByTitle(String title) {
        productDetailsPage.selectLinkByTitle(title);
    }

}