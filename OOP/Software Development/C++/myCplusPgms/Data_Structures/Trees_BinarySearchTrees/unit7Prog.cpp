
/**************************************************************************
*  File: unit7Prog.cpp
*  Willie Conway
*  CS352 Data Structures
*  
**************************************************************************/
// C++ program to demonstrate insert operation in binary search tree 
#include <iostream>

#include <stdlib.h>

using namespace std;

/* So we have a node that when chained together forms a 
binary search tree*/


struct node

{

	int val;

	node *left, *right;

};



node * insert(node *tree, int key)

{
	// function to create a  new BST node
	node * n = new node;

	n->val = key;

	n->left = NULL;

	n->right = NULL;

	if (tree == NULL)

		return n;



	int flag;

	node *curr = tree;

	while (1)

	{

		if (key < curr->val)

		{

			if (curr->left != NULL)

				curr = curr->left;

			else

			{

				flag = 1;

				break;

			}

		}

		else

		{

			if (curr->right != NULL)

				curr = curr->right;

			else

			{

				flag = 2;

				break;

			}

		}

	}

	if (flag == 1)

	{

		curr->left = n;

	}

	else

	{

		curr->right = n;

	}

	return tree;

}


// C ++ function to search a given key in a given BST 
bool search(node * tree, int key)

{
	 // while loop for binary search tree
	while (tree != NULL)

	{

		if (tree->val == key)

			return true;

		else if (tree->val > key)

			tree = tree->left;

		else

			tree = tree->right;

	}

	return false;

}


// main function
int main()

{

	// create a binary search tree and insert 35, 18, 48, 72, 60, 25

	node *tree = NULL;

	tree = insert(tree, 35);

	tree = insert(tree, 18);

	tree = insert(tree, 48);

	tree = insert(tree, 72);

	tree = insert(tree, 60);

	tree = insert(tree, 25);

	// Perform a search
	cout << "Enter -1 to quit." << endl;

	while (true)
	{
		// Asks user to enter a interger to search for intergers in the binary search tree 
		cout << "Enter Integer to search for : ";
		int num;
		cin >> num;

		if (num == -1)
		{
			break;

		}

		if (search(tree, num))
			
			// determines if interger is True
			cout << "True" << endl;

		else
			// determines if interger is False
			cout << "False" << endl;



		cout << "Enter Integer to search for : ";

		cin >> num;

		if (search(tree, num))

			cout << "True" << endl;

		else

			cout << "False" << endl;
		
		// pauses the screen
		system("pause");
	}
}

