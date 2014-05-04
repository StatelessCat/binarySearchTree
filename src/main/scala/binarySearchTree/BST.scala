package binarySearchTree

import scala.util.Failure

abstract sealed class BST {
	def value: Int
	def left: BST
	def right: BST
	
	def add(x: Int): BST = this match {
		case Leaf => Node(x, Leaf, Leaf)
		case Node(v, l, r) => {
			if(x <= v) Node(v, l.add(x), r)
			else Node(v, l, r.add(x))
		}
	}
	
	def height: Int = this match {
		case Leaf => 0
		case Node(v, l, r) => {
			val lheight = l.height
			val rheight = r.height
			if(lheight >= rheight) lheight + 1
			else rheight + 1
		}
	}
	
	def contains(x: Int): Boolean = this match {
	  	case Leaf => false
		case Node(v, l, r) => {
			if(x == v) true
			else l.contains(x) || r.contains(x)
		}
	}
}

case object Leaf extends BST {
	def value: Int = error("Leaf")
	def left = error("Leaf")
	def right: BST = error("Leaf")
}

case class Node(value: Int, left: BST, right: BST) extends BST
