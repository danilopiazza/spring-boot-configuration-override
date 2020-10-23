package io.github.danilopiazza.spring.boot.configuration.override.beans;

public class MyBean {
    private final String name;

    public MyBean(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "MyBean [name=" + name + "]";
    }
}
