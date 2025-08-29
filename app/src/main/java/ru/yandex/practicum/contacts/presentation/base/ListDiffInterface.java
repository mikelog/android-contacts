package ru.yandex.practicum.contacts.presentation.base;

public interface ListDiffInterface<T> {
    public boolean  theSameAs(T someObject);
    public boolean  equals(Object o);
}
