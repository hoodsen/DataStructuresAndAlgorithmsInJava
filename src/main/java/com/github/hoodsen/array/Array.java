package com.github.hoodsen.array;

public interface Array<T> {
	int insert(T element);
	
	void remove(T element);
	
	int find(T element);
}
