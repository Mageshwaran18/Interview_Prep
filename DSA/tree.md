# Trees by Striver [ https://youtu.be/_ANrF3FJm7I?feature=shared ]

## Order of the Tree problems

N -> No.of nodes in the tree.
H -> Height of the tree.
W -> Maximum width of the tree.

-- Basic -- 

1. DFS [ Preorder , Inorder , Postorder ]
2. BFS / Level Order [https://leetcode.com/problems/binary-tree-level-order-traversal/description/]
3. PreOrder [https://leetcode.com/problems/binary-tree-preorder-traversal/submissions/] (Iterative approach, Single Stack)
4. InOrder [https://leetcode.com/problems/binary-tree-inorder-traversal/description/] (Iterative approach, Single Stack)
5. PostOrder [https://leetcode.com/problems/binary-tree-postorder-traversal/description/] (Iterative approach, Single Stack)
6. Pre,In,Post Order traversal in single shot [NULL] (Stack) [O(3N),O(H)]
7. Same Tree [https://leetcode.com/problems/same-tree/description/] (~Recursive approach) [O(N),O(H)]
8. Symmetric Tree (recursive and iterative) [https://leetcode.com/problems/symmetric-tree/description/] (DFS/BFS) [O(N),O(H)]
9. Root to Node path [https://www.naukri.com/code360/problems/path-in-a-tree_3843990?leftPanelTabValue=PROBLEM] (DFS) [O(N),O(N)]
10. Construct Tree using Inorder and Postorder [https://leetcode.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/description/] [O(N),O(N)]
11. Construct Tree using Inorder and Preorder [https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/description/] [O(N),O(N)]

-- Height Based --

1. Height of a Tree recursion [https://leetcode.com/problems/maximum-depth-of-binary-tree/description/] (Recursion) [O(N),O(H)]
2. Height of a Tree iterative [https://leetcode.com/problems/maximum-depth-of-binary-tree/description/] (Stack,PreOrder/PostOrder) [O(N),O(H)]
3. Balanced Binary Tree [https://leetcode.com/problems/balanced-binary-tree/description/] (Height of a Tree) [O(N),O(H)]
4. Diameter of Binary Tree [https://leetcode.com/problems/diameter-of-binary-tree/description/] (Height of a Tree) [O(N),O(H)]
5. Binary Tree maximum path sum [https://leetcode.com/problems/binary-tree-maximum-path-sum/] (~ Height of a Tree) [O(N),O(H)] 

-- BFS / Level Order --

1. Zig Zag Traversal of the Tree [https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/description/] (Level Order) [O(N),O(W)] 
2. Vertical Order Traversal of a Tree [https://leetcode.com/problems/vertical-order-traversal-of-a-binary-tree/description/] (Level Order) [O(N*logN),O(N1)]
3. Top view of a Binary Tree [https://www.geeksforgeeks.org/problems/top-view-of-binary-tree/1] (BFS) [O(N*logN),O(N)]
4. Bottom view of the Binary Tree [https://www.geeksforgeeks.org/problems/bottom-view-of-binary-tree/1] (BFS) [O(N*logN),O(N)]
5. Right/Left side view of the Binary Tree [https://leetcode.com/problems/binary-tree-right-side-view/description/] (BFS) [O(N),O(N)]
6. Maximum width of the Tree [https://leetcode.com/problems/maximum-width-of-binary-tree/description/] (BFS+Indexing) [O(N),O(W)]
7. Children Sum parent [https://www.geeksforgeeks.org/problems/children-sum-parent/1] (BFS) [O(N),O(N)]

-- Parent Mapping --

1. Print all the nodes at K distance [https://leetcode.com/problems/all-nodes-distance-k-in-binary-tree/] (BFS) [O(N),O(N)]
2. Amount of time for Binary Tree [https://leetcode.com/problems/amount-of-time-for-binary-tree-to-be-infected/description/] (BFS) [O(N),O(N)]

-- Left Most and Right Most --

1. Find the path from root to the leftmost and right most leaf node[NULL] [O(H),O(H)]
2. Boundary Traversal of a Tree [https://www.geeksforgeeks.org/problems/boundary-traversal-of-binary-tree/1] [O(N),O(N)]

-- Threaded Concept --

1. Morris Traversal (Inorder -> PreOrder -> PostOrder) [https://leetcode.com/problems/binary-tree-inorder-traversal/description/] [O(N),O(1)]
2. Flatten the Binary Tree [https://leetcode.com/problems/flatten-binary-tree-to-linked-list/description/] [O(N),O(1)]

-- Other Important --

1. LCA in a Binary Tree [https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/description/] (DFS) [O(N),O(H)]
2. Count Complete Tree Nodes [https://leetcode.com/problems/count-complete-tree-nodes/description/] (BFS) [O(logN)^2,O(logN)]
3. Serialize and Deserialize Binary Tree [https://leetcode.com/problems/serialize-and-deserialize-binary-tree/description/] [O(N),O(N)]


-- Binary Search Tree --

33. Find the Ceil in Binary Search Tree [https://www.geeksforgeeks.org/problems/implementing-ceil-in-bst/1] [O(logN),O(1)]
34. Find the Floor in Binary Search Tree [https://www.geeksforgeeks.org/problems/floor-in-bst/1] [O(logN),O(1)]
35. Insertion in BST (Iterative approach) [https://leetcode.com/problems/insert-into-a-binary-search-tree/] [O(N),O(1)]
36. Insertion in BST (Recursive approach) [https://leetcode.com/problems/insert-into-a-binary-search-tree/] [O(N),O(N)]
37. Deletion in BST (Recursive approach) [https://leetcode.com/problems/delete-node-in-a-bst/] [O(N),O(N)]
38. Find the K_th smallest in BST [https://leetcode.com/problems/kth-smallest-element-in-a-bst/description/] [O(N),O(H)]
39. Valid Binary Search Tree [https://leetcode.com/problems/validate-binary-search-tree/description/] [O(N),O(H)]
40. LCA of BST [https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/description/] [O(H),O(H)]
41. Construct a Binary Search Tree using preorder [https://leetcode.com/problems/construct-binary-search-tree-from-preorder-traversal/description/] [O(N),O(H)]
42. Predecessor and Successor [https://www.geeksforgeeks.org/problems/predecessor-and-successor/1] [O(N),O(1)]
43. Inorder iterator [https://leetcode.com/problems/binary-search-tree-iterator/submissions/] [O(1),O(H)]
44. Two sum in BST [https://leetcode.com/problems/two-sum-iv-input-is-a-bst/description/] [O(N),O(H)]
45. Recovery Binary Search Tree [https://leetcode.com/problems/recover-binary-search-tree/description/] [O(N),O(1)]


# Binary Trees Overview

This README provides an overview of binary trees, their components, and their types, based on the concepts outlined in Striver's video on Trees (YouTube Link).

## What is a Binary Tree?

A binary tree is a hierarchical data structure in which each node has at most two children.

## Key Components of a Binary Tree

- **Root**: The topmost node of a binary tree, from which all other nodes descend. It has no parent.
- **Children**: Nodes directly connected to a parent node. In a binary tree, a node can have up to two children (left and right).
- **Leaf Node**: A node with no children (i.e., both left and right child pointers are null).

## What is a Subtree?

A subtree is a portion of a binary tree consisting of a node and all its descendants (including the node itself).

## What are Ancestors?

The ancestors of a node are all the nodes along the path from the root to that node, excluding the node itself.

## What is a Left-Skewed and Right-Skewed Tree?

- **Left-Skewed Tree**: A binary tree where every node has only a left child (or no children), resembling a linked list slanting to the left.
- **Right-Skewed Tree**: A binary tree where every node has only a right child (or no children), resembling a linked list slanting to the right.

## Types of Binary Trees

### Full Binary Tree

- **Definition**: Every node has either 0 or 2 children.
- **Valid Example**:

  ```
      A
     / \
    B   C
   / \
  D   E
  ```
- **Invalid Example**:

  ```
      A
     /
    B
  ```

### Complete Binary Tree

- **Definition**: All levels are completely filled except the last level. 
                  The last level has all nodes as far left as possible.
- **Valid Example**:

  ```
      A
     / \
    B   C
   /
  D
  ```
- **Invalid Example**:

  ```
      A
     / \
    B   C
     \
      D
  ```
  - **Explanation**: Node D is on the right side of the last level, not as far left as possible.

### Perfect Binary Tree

- **Definition**: A binary tree where all internal nodes have two children and all leaf nodes are at the same level.
- **Valid Example**:

  ```
      A
     / \
    B   C
   / \ / \
  D  E F  G
  ```
- **Invalid Example**:

  ```
      A
     / \
    B   C
   /
  D
  ```
  - **Explanation**: Leaf nodes (D, C) are at different levels (D at level 2, C at level 1).

### Balanced Binary Tree

- **Definition**: The height of a tree at max should be O(log n), where n is the number of nodes in the tree.
- **Invalid Example**:

  ```
      A
     /
    B
   /
  C
  ```
  - **Explanation**: The height is 2 for 3 nodes, which is not O(log n), resembling a linear structure.

### Degenerate Tree

- **Definition**: A binary tree where each node has at most one child, effectively resembling a linked list (either left-skewed or right-skewed).
- **Valid Example**:

  ```
      A
       \
        B
         \
          C
  ```

### Traversal 

- **DFS** : DFS of a tree can be done by Inorder (Left,Root,Right), PreOrder , PostOrder. 
- **BFS** : In trees BFS can be done by Level order traversal.

### Leftmost Rightmost Leaf node in a tree 

🍃 What is a Leftmost Leaf Node?

    It is the first leaf node encountered if you traverse the tree starting from the root and always choosing the left child first, going as deep as possible.

    If a node does not have a left child, you go to the right.

    The goal is to go as "left" as possible until you hit a leaf.

    ✅ Example Tree:

    ```markdown
            1
          /   \
        2       3
        / \    / \
      4   5   6    7
            \
            9
    ```

    The leftmost leaf here is: 4
    (Because going left from root 1 to 2, then 2 to 4 leads to a leaf)

- 🍃 What is a Rightmost Leaf Node?

    It is the first leaf node encountered if you traverse the tree starting from the root and always choosing the right child first, going as deep as possible.

    If a node does not have a right child, you go to the left.

    The goal is to go as "right" as possible until you hit a leaf.

    ✅ In the same tree:

    ```markdown
            1
          /   \
         2      3
        / \    / \
       4   5  6    7
                    \
                    10
    ```
    The rightmost leaf here is: 10
    (Because we go from 1 → 3 → 7 → 10)