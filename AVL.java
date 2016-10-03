public class AVL {

	public int calculaBalanco(BSTNode<T> node) {
		
		int heightLeft = height((BSTNode<T>) node.getLeft());
		int heightRight = height((BSTNode<T>) node.getRight());
		
		int balance = Math.abs(heightLeft - heightRight);
		
		return balance;
	
	}
	
	public void rebalanco(BSTNode<T> node) {
		
		if (node == null || node.isEmpty()) {
			return;
		}
		
		int balance = this.calculaBalanco(node);
		
		if (Math.abs(balance) <= 1) {
			return;
		}
		
		if (balance > 0) {
			int balanceLeft = this.calculaBalanco((BSTNode<T>) node.getLeft());
			
			if (balanceLeft > 0) {
				this.rightRotation(node);
			}else {
				this.leftRotation((BSTNode<T>) node.getLeft());
				this.rightRotation(node);
			} 
			
		}else {
			int balanceRight = this.calculaBalanco((BSTNode<T>) node.getRight());
			
			if (balanceRight < 0) {
				this.leftRotation(node)
			}else {
				this.rightRotation((BSTNode<T>) node.getRight());
				this.leftRotation(node)
	}
	
	public void rebalancoUp(BSTNode<T> node) {
		if (node == null || node.isEmpty()) {
			return;
		}
		int balance = this.calculaBalanco(node);
		
		if (balance > 1) {
			this.rebalanco(node);
		}
		
		this.rebalancoUp((BSTNode<T>) node.getParent());
	}

}
