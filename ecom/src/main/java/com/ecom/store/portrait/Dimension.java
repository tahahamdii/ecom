package com.ecom.store.portrait;

public enum Dimension {
    SMALL("Small"),
    MEDIUM("Medium"),
    LARGE("Large"),
    EXTRA_LARGE("Extra Large");

    private final String label;

    Dimension(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
