/*************************************************************************
*  File: unit3-4Prog.cpp
*  Willie Conway
*  CS352 Data Structures
*
*  This program will store in miniVector v a list of 15 random integers from 0 to 99, 
*  then it will output the vector, sort the vector, then output it again sorted.
*
************************************************************************/


#include <iostream>
#include <vector>
#include <algorithm>
#include <string>
#include "d_random.h"
#include "d_vector.h"

using namespace std;

template<typename T>
void writeMiniVector(const miniVector<T>& v);



template<typename T>
void sortMiniVector(miniVector<T>& v);

template<typename T>
void writeMiniVector(const miniVector<T>&v) {
	for (int i = 0; i < v.size();i++) {
		cout << v[i] << ' ';
}
}

template<typename T>
void sortMiniVector(miniVector<T>& v) {
	int i, j, key;
	int vectorSize = v.size();
	for (j = 1; j < vectorSize; j++) {
		key = v[j];
		for (i = j - 1; (i >= 0) && (v[i] < key); i--) {
			v[i + 1] = v[i];
		}
		v[i + 1] = key;
	}
	return;

}

int main() {


	// declaring miniVector Integer
	miniVector<int> v;

	// declaring random number generator
	randomNumber rnd;


	int i, number;
	for (i = 0; i < 15; i++) {
		number = rnd.random(100);
		v.push_back(number);
	}

	// Display statement for original
	cout << "\n Original:";
	writeMiniVector(v);

	// sort the vector elements
	sortMiniVector(v);
	cout << endl;

	// Display statement for after sort
	cout << "\n Sorted:";
	writeMiniVector(v);
	cout << endl;


	system("PAUSE");
	return 0;
}

