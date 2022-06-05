package org.metable.hex.ch02.domain.entity;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.util.InternalEList;

public class ListAdapter<T> implements InternalEList<T> {

    private final InternalEList<T> list;

    public ListAdapter(InternalEList<T> list) {
        this.list = list;
    }

    @Override
    public void move(int newPosition, T object) {
        list.move(newPosition, object);
    }

    @Override
    public T move(int newPosition, int oldPosition) {
        return list.move(newPosition, oldPosition);
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return list.contains(o);
    }

    @Override
    public Iterator<T> iterator() {
        return list.iterator();
    }

    @Override
    public Object[] toArray() {
        return list.toArray();
    }

    @SuppressWarnings("hiding")
    @Override
    public <T> T[] toArray(T[] a) {
        return list.toArray(a);
    }

    @Override
    public boolean add(T e) {
        return list.add(e);
    }

    @Override
    public boolean remove(Object o) {
        return list.remove(o);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return list.containsAll(c);
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return list.addAll(c);
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        return list.addAll(index, c);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return list.removeAll(c);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return list.retainAll(c);
    }

    @Override
    public void clear() {
        list.clear();
    }

    @Override
    public T get(int index) {
        return list.get(index);
    }

    @Override
    public T set(int index, T element) {
        return list.set(index, element);
    }

    @Override
    public void add(int index, T element) {
        list.add(index, element);
    }

    @Override
    public T remove(int index) {
        return list.remove(index);
    }

    @Override
    public int indexOf(Object o) {
        return list.indexOf(o);
    }

    @Override
    public int lastIndexOf(Object o) {
        return list.lastIndexOf(o);
    }

    @Override
    public ListIterator<T> listIterator() {
        return list.listIterator();
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return list.listIterator(index);
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return list.subList(fromIndex, toIndex);
    }

    @Override
    public T basicGet(int index) {
        return list.basicGet(index);
    }

    @Override
    public List<T> basicList() {
        return list.basicList();
    }

    @Override
    public Iterator<T> basicIterator() {
        return list.basicIterator();
    }

    @Override
    public ListIterator<T> basicListIterator() {
        return list.basicListIterator();
    }

    @Override
    public ListIterator<T> basicListIterator(int index) {
        return list.basicListIterator(index);
    }

    @Override
    public Object[] basicToArray() {
        return list.basicToArray();
    }

    @SuppressWarnings("hiding")
    @Override
    public <T> T[] basicToArray(T[] array) {
        return list.basicToArray(array);
    }

    @Override
    public int basicIndexOf(Object object) {
        return list.basicIndexOf(object);
    }

    @Override
    public int basicLastIndexOf(Object object) {
        return list.basicLastIndexOf(object);
    }

    @Override
    public boolean basicContains(Object object) {
        return list.basicContains(object);
    }

    @Override
    public boolean basicContainsAll(Collection<?> collection) {
        return list.basicContainsAll(collection);
    }

    @Override
    public NotificationChain basicRemove(Object object, NotificationChain notifications) {
        return list.basicRemove(object, notifications);
    }

    @Override
    public NotificationChain basicAdd(T object, NotificationChain notifications) {
        return list.basicAdd(object, notifications);
    }

    @Override
    public void addUnique(T object) {
        list.addUnique(object);
    }

    @Override
    public void addUnique(int index, T object) {
        list.addUnique(index, object);
    }

    @Override
    public boolean addAllUnique(Collection<? extends T> collection) {
        return list.addAllUnique(collection);
    }

    @Override
    public boolean addAllUnique(int index, Collection<? extends T> collection) {
        return list.addAllUnique(index, collection);
    }

    @Override
    public T setUnique(int index, T object) {
        return list.setUnique(index, object);
    }
}
