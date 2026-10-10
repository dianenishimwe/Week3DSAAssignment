
# Week 3 Assignment: Data Structures & Algorithms I

## Overview

This project implements basic data structures and algorithms in Java.

## Implemented Data Structures

- MyLinkedList: A custom singly linked list.
- MyStack: A stack implemented using MyLinkedList.
- MyQueue: A queue implemented using two stacks.
- BalancedBrackets: Checks whether brackets are balanced.
- ArrayStringAlgorithms: Implements array rotation, anagram checking, and two-sum.
- LRUCache: A cache using a HashMap and a custom doubly linked list.

## Time Complexity

| Operation | Time Complexity |
|---|---|
| Linked list addFirst | O(1) |
| Linked list addLast | O(n) |
| Linked list get | O(n) |
| Linked list removeFirst | O(1) |
| Linked list reverse | O(n) |
| Linked list findMiddle | O(n) |
| Stack push | O(1) |
| Stack pop | O(1) |
| Queue enqueue | O(1) |
| Queue dequeue | O(1) amortized |
| Balanced brackets | O(n) |
| Rotate array | O(n) |
| Check anagram | O(n) |
| Two sum on sorted array | O(n) |
| LRUCache get | O(1) average |
| LRUCache put | O(1) average |

## Real-World Backend Use Case

An LRU cache can improve the speed of a backend application. For example, a student portal can temporarily store frequently requested student information. When the cache becomes full, it removes the least recently used item to make room for new information.

## How to Run

1. Open the project in IntelliJ IDEA.
2. Ensure JDK 25 is configured.
3. Run Main.java.
4. Check the console output to see the demonstrations.
