
/**************************************************************************  
*  File: unit5-6Prog.cpp
*  Willie Conway
*  CS352 Data Structures
*
* 
*************************************************************************/




#include <iostream>

#include <string>

#include <cstdlib>

using namespace std;

// Structure called AddressNode; contains string for next list item.

struct AddressNode

{

	string name; // String for the names insterted to ABook Object

	AddressNode* next; // Pointer to next name in list

};

// ABook Class. Public Default Constructor, public destructor, private pointer top of list

class ABook {

private:

	AddressNode* topPtr;

public:ABook() {

	topPtr = NULL;

}

	   ~ABook();

	   void Insert(string NewItem); // Add item

	   void SortedInsert(string NewItem); // Insert and sort

	   void Remove(string& item); // Remove element from top of the stack and return the item

	   void print(); // Print all items

};

// Insert method to add a new item to the linked list.

void ABook::Insert(string NewItem) {

	AddressNode* newNode = new AddressNode(); // Instantiate new node for the string

	newNode->name = NewItem; // Give node data

	newNode->next = topPtr; // Point new node data to the next link

	topPtr = newNode; // Beginning now points to newly inserted



}

// Sorted insert method

void ABook::SortedInsert(string NewItem) {

	AddressNode* newNode = new AddressNode(); // Instantiate new node

	newNode->name = NewItem; // Point it to string data

	newNode->next = NULL; // Pointer to next name in list

	AddressNode* thisOne = topPtr; // Reference section to first spot

	if (topPtr == NULL) { // If only item in list, the node is now the top

		topPtr = newNode;

		return;

	}

	if (NewItem.compare(topPtr->name) <= 0) { // If not only item in list, add to space

		newNode->next = topPtr;

		topPtr = newNode;

	}

	else {

		AddressNode *ptr = topPtr;

		if (ptr->next == NULL) { // Otherwise insert at end

			ptr->next = newNode;

			newNode->next = NULL;

			return;

		}

		do {



			if (NewItem.compare(ptr->next->name) <= 0) {

				newNode->next = ptr->next; // Compare and move down list

				ptr->next = newNode;

				break;

			}

			ptr = ptr->next;

			if (ptr->next == NULL) { // Still, if you got to last spot and didn't insert, insert

				ptr->next = newNode;

				newNode->next = NULL;

				break;

			}

		} while (ptr->next != NULL);



	}

}

// Remove method. Removes element from the top of the stack.

void ABook::Remove(string& item) {

	AddressNode* thisOne = topPtr; // Go through list and compare item, deref while matching

	if (item.compare(topPtr->name) == 0) {

		topPtr = topPtr->next;

		return;

	}

	while (thisOne->next != NULL)

	{

		if (item.compare(thisOne->next->name) != 0)thisOne = thisOne->next;

		else thisOne->next = thisOne->next->next;

	}

}

// Deconstructor. Removes all elmemnts from the list while it isn't empty.

ABook::~ABook() {

	AddressNode* thisOne = topPtr;

	while (topPtr != NULL)

	{

		thisOne = topPtr->next;

		delete topPtr;

		topPtr = thisOne;

	}

}

// Print method. Shows what is on the list.

void ABook::print() {

	AddressNode* thisOne = topPtr;

	if (topPtr == NULL) {

		cout << "List contains no nodes\n";

		return;

	}

	cout << "Sorted List: " << endl;

	while (thisOne != NULL)

	{

		cout << thisOne->name << endl; // Print node, then move along to next item.

		thisOne = thisOne->next;

	}

	cout << endl;

}

int main() {

	ABook Book;

	string newName; // Not sure why this is needed as the instructions call for you to insert directly, but hey, I'm following the instructions.

	string nameToRemove;

	string nameToRemove1("Precious");

	string nameToRemove2("Ken");

	string nameToRemove3("Eileen");

	string nameToRemove4("Frank");

	Book.Insert("Precious");

	Book.SortedInsert("Ken");

	Book.SortedInsert("Eileen");

	Book.SortedInsert("Frank");

	Book.print();

	Book.Remove(nameToRemove1);

	Book.print();

	Book.Remove(nameToRemove2);

	Book.print();

	Book.Remove(nameToRemove3);

	Book.print();

	Book.Remove(nameToRemove4);

	Book.print();

	system("PAUSE");

}