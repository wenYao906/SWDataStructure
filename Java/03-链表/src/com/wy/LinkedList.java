package com.wy;

public class LinkedList {

	// 链表里面最少有两个东西，一个size 一个 first
	// size 代表 将来存储多少个元素（节点、Node）
	// first  指向你的第一个元素（节点）
	
	// 每一个元素内部，要有两个属性，一个 element 一个 next
	// element 存放真正的元素，如 11，22，33，44，55等
	// next 指向下一个节点。 下一个节点中也有自己的 element 和 next
	// 如果到了最后一个节点。那么 next 中存储的就是 null
	
	/*
	 * 节点也设计成一个类，节点对象是使用在链表LinkedList内部,不提供给外界使用的，
	 * 可以定义成内部类。直接在 LinkedList 的内部定义即可。
	 * 在 Java 里面，内部类最好写成静态的。
	 * */
}
