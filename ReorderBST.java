// Problem Statement
// Given an array nums that represents a permutation of integers from 1 to n. We are going to construct a binary search tree (BST) by inserting the elements of nums in order into an initially empty BST. Find the number of different ways to reorder nums so that the constructed BST is identical to that formed from the original array nums.
// Return the number of ways to reorder nums such that the BST formed is identical to the original BST formed from nums.
// Since the answer may be very large, return it modulo 1e9+7.
// Input
// The first line contains a single space separated integer N.
// The second line contains N space-separated integers a[i].

// Constraints
// 1 <= n <= 1000
// 1 <= a[i] <= n
// Output
// Print the number of all possible permutations.

// Example
// Sample Input 1:
// 3
// 2 1 3
// Sample Output 1:
// 1
// Explanations:
// Only single permutations of nums can produce similar BST.

// Sample Input 2:
// 5
// 3 4 5 1 2
// Sample Output 2:
// 5
// Explanation:
// 3 1 2 4 5
// 3 1 4 2 5
// 3 1 4 5 2
// 3 4 1 2 5
// 3 4 1 5 2
// There are 5 possible permutations of nums that can generate the same binary search tree.


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Main {

	static long pascalTriangle[][];
	static long mod = 1000000007;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> tree = new ArrayList<>();
		for(int i=0;i<n;i++){
			tree.add(sc.nextInt());
		}
		buildPascal(n+1);
		System.out.println(permutations(tree)-1);

		
	}

	public static void buildPascal(int n){
		pascalTriangle = new long[n][n];
		for(int i=0;i<n;i++){
			pascalTriangle[i][i] = 1;
			pascalTriangle[i][0] = 1;
		}
		for(int i=2;i<n;i++){
			for(int j=1;j<i;j++){
				pascalTriangle[i][j] = (pascalTriangle[i-1][j-1] + pascalTriangle[i-1][j])%mod;
			}
		}
	}

	public static long permutations(List<Integer> tree){
		if(tree.size()<=2)
			return 1;
		
		int root = tree.get(0);
		List<Integer> leftTree = new ArrayList<>();
		List<Integer> rightTree = new ArrayList<>();

		for(int i=1;i<tree.size();i++){
			int node = tree.get(i);

			if(node<root){
				leftTree.add(node);
			}
			else
			rightTree.add(node);
		}

			int n = leftTree.size()+rightTree.size();
			int r = leftTree.size();

			long result = (pascalTriangle[n][r] * (permutations(leftTree)%mod)%mod)*permutations(rightTree)%mod;
			return result;
	}
}
