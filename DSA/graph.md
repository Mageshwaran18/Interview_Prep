## Theory 

- What is Graph?
  - A graph is a non-linear data structure consisting of vertices/nodes and edges that connect these vertices
  - It is used to represent relationships between different objects

- What are vertices and edges?
  - Vertices (or nodes) are the fundamental units of a graph that represent objects or points
  - Edges are the lines/connections that join two vertices and represent the relationship between them

- What are the types of graphs available?
  - Undirected Graph: Edges have no direction
  - Directed Graph (Digraph): Edges have direction
  - Weighted Graph: Edges have weights/costs associated with them
  - Unweighted Graph: Edges have no weights
  - Connected Graph: All vertices have at least one path to reach other vertices
  - Disconnected Graph: Some vertices cannot be reached from other vertices
  - Complete Graph: Every vertex is connected to every other vertex

- What is a cyclic and acyclic graph?
  - Cyclic Graph: Contains at least one cycle (a path that starts and ends at the same vertex)
  - Acyclic Graph: Contains no cycles
  - DAG (Directed Acyclic Graph): A directed graph with no cycles

- When to use DFS and BFS?
    - Finding all the possible paths -> go for DFS
    - Finding the shortest path between two vertices -> go for BFS
    - Finding the possible path which appears first -> go for BFS
    - Memory usage: DFS uses less memory than BFS
    - When solution is far from root -> use DFS
    - When solution is closer to root -> use BFS

- What is spanning tree?
    - A tree in which we have all the N nodes and N-1 edges and all nodes are reachable from each other
    - Properties:
        - Must contain all vertices
        - Must have exactly N-1 edges
        - Must be connected
        - Must not contain cycles
    - Types:
        - Minimum Spanning Tree (MST): Spanning tree with minimum total edge weight
        - Maximum Spanning Tree: Spanning tree with maximum total edge weight

## If the V (number of vertices) in a graph is given then 

| **Graph Type**          | **Formula for Maximum Edges** |
| ----------------------- | ----------------------------- |
| Directed without loop   | `n × (n - 1)`                |
| Directed with loop      | `n × n`                      |
| Undirected without loop | `n × (n - 1) / 2`            |
| Undirected with loop    | `n × (n + 1) / 2`            |

## Order of the Graph problems

Si.No, Problem Name, Link to the problem, (Approach/Method), [Time Complexity, Space Complexity]  
NOTE: Space Complexity for the return type is not considered.

Tips:- 
| Algorithm | Undirected Graph | Directed Graph |
| --------- | ---------------- | -------------- |
| **BFS**   | O(V + E)         | O(V + E)       |
| **DFS**   | O(V + E)         | O(V + E)       |

| **Algorithm**      | **Time Complexity** | **Space Complexity** |
| ------------------ | ------------------- | -------------------- |
| Dijkstra (with PQ) | `O(E log V)`        | `O(V)`               |
| Dijkstra (naive)   | `O(V²)`             | `O(V)`               |
| Bellman-Ford       | `O(V × E)`          | `O(V)`               |
| Floyd-Warshall     | `O(V³)`             | `O(V²)`              |

-- Graph Basics --

1. Graph Creation  

-- DFS Problems --

1. DFS [https://www.geeksforgeeks.org/problems/depth-first-traversal-for-a-graph/1]  
2. Find all path source target [https://leetcode.com/problems/all-paths-from-source-to-target/description/] (DFS)  
3. Number of Islands [https://leetcode.com/problems/number-of-islands/] (DFS)  
4. Number of Islands in GG [https://www.geeksforgeeks.org/problems/find-the-number-of-islands/1] (DFS)  
5. Flood Fill [https://leetcode.com/problems/flood-fill/submissions/] (DFS)  
6. Bipartite Graph [https://leetcode.com/problems/is-graph-bipartite/submissions/] (DFS) [O(V+E),O(V)]  
7. Word Search [https://leetcode.com/problems/word-search/description/] (DFS) [O(N*M*4^L),O(L)]  
8. Connected Components [https://www.geeksforgeeks.org/problems/connected-components-in-an-undirected-graph/1] (DFS) [O(E+V),O(E+V)]  
9. No. of Complete Components [https://leetcode.com/problems/count-the-number-of-complete-components/description/] (DFS) [O(E+V),O(E+V)]  
10. Number of Provinces [https://leetcode.com/problems/number-of-provinces/submissions/] (DFS) [O(E+V),O(E+V)]  
11. Surrounded Regions [https://leetcode.com/problems/surrounded-regions/description/] (DFS) [O(N*M),O(N*M)]
12. Number of Enclaves [https://leetcode.com/problems/number-of-enclaves/description/] (DFS) [O(N*M),O(N*M)]
13. Cycle Detection in Undirected Graph [https://www.geeksforgeeks.org/problems/detect-cycle-in-an-undirected-graph/1] (DFS) [O(V+E),O(V+E)]

-- BFS Problems --

1. BFS [https://www.geeksforgeeks.org/problems/bfs-traversal-of-graph/1]  
2. Word Ladder - I [https://leetcode.com/problems/word-ladder/description/] (BFS) [O(N*L*26),O(N)]
3. Rotten Oranges [https://leetcode.com/problems/rotting-oranges/description/] (BFS) [O(N*M),O(N*M)]
4. Cycle Detection in Undirected Graph [https://www.geeksforgeeks.org/problems/detect-cycle-in-an-undirected-graph/1] (BFS) [O(V+E),O(V+E)]

-- Topological Sort --

1. Topological Sort & Kahn's Algo [https://takeuforward.org/data-structure/kahns-algorithm-topological-sort-algorithm-bfs-g-22/] (BFS) [O(V+E),O(N)]
2. Course Schedule I [https://leetcode.com/problems/course-schedule/description/] (Topological Sort)  [O(V+E),O(V+E)]
3. Course Schedule II [https://leetcode.com/problems/course-schedule-ii/description/] (Topological Sort) [O(V+E),O(V+E)]
4. Find Eventual Safe States [https://leetcode.com/problems/find-eventual-safe-states/description/] (Topological Sort/DP)  [O(V+E),O(V+E)]
5. Alien Dictionary [https://www.geeksforgeeks.org/problems/alien-dictionary/1] (Topological Sort)  [O(L*N),O(C+E)]
6. Dijkstra's Algorithm  [https://www.geeksforgeeks.org/problems/implementing-dijkstra-set-1-adjacency-matrix/1] (BFS) [O(E*log*V),O(V)]

-- Dijikstra --

1. Shortest Path in Directed Graph [https://www.geeksforgeeks.org/problems/shortest-path-in-undirected-graph/1] (Dijkstra) [O(E*log*V),O(V)]
2. Shortest Path in Binary Maze [https://leetcode.com/problems/shortest-path-in-binary-matrix/description/] (Dijkstra) [O(N^2*log*N),O(N^2)]
3. Path with Minimum Effort [https://leetcode.com/problems/path-with-minimum-effort/description/] (Dijkstra) [O(n*mlog(n*m)),O(n*m)]
4. Cheapest Flights within K Stops [https://leetcode.com/problems/cheapest-flights-within-k-stops/] (Dijkstra without visited array and PriorityQueue) [O(E*logV),O(V)]
5. Network Delay Time [https://leetcode.com/problems/network-delay-time/description/] (Dijkstra) [O(E*logV),O(V)]
6. Number of Ways to Arrive at Destination [https://leetcode.com/problems/number-of-ways-to-arrive-at-destination/description/] (Dijkstra) [O(E*logV),O(V)]
7. Minimum Multiplications to Reach End [https://www.geeksforgeeks.org/problems/minimum-multiplications-to-reach-end/1] (Dijkstra) [O(MOD*N*logMOD),O(MOD)]


-- Minimum Spanning Tree --

1. Prims Algo [https://www.geeksforgeeks.org/problems/minimum-spanning-tree/1] [O(E*logE),O(V)]
2. Disjoint Set Union using Rank [https://www.geeksforgeeks.org/problems/disjoint-set-union-find/1] [O(alpha(N)),O(N)] -> Amortized time, alpha(N) -> ackermann function.
3. Kruskal Algo [https://www.geeksforgeeks.org/problems/minimum-spanning-tree/1] [O(M*alpha(M)),O(M)]
4. Number of operations to make network Connect [https://leetcode.com/problems/number-of-operations-to-make-network-connected/description/] [O(E*alpha(N)),O(N)]
5. Most stones removed with same row and col [https://leetcode.com/problems/most-stones-removed-with-same-row-or-column/description/] [O(N*alpha(N)),O(max_row+max_col)]
6. Accounts Merge [https://leetcode.com/problems/accounts-merge/description/] [O(n + m * α(n) + m log m),O(n+m)]
7. Number of Islands II [https://www.naukri.com/code360/problems/largest-island_840701] [O(Q*alpha(n*m)),O(n*m)]
8. Making a Large Island [https://leetcode.com/problems/making-a-large-island/] [O(N^2*α(N^2)),O(N^2)]

-- Specific and Other Algo --

1. Bellman Ford Algo [https://www.geeksforgeeks.org/problems/distance-from-the-source-bellman-ford-algorithm/1] [O(V*E),O(V)]
2. Floyd Warshal Algo [https://www.geeksforgeeks.org/problems/implementing-floyd-warshall2042/1] [O(V^3),O(V^2)]
3. Find the City With the Smallest Number of Neighbors at a Threshold Distance [https://leetcode.com/problems/find-the-city-with-the-smallest-number-of-neighbors-at-a-threshold-distance/] (Floyd Warshall) [O(N^3),O(N^2)]
4. Tarjan's Algo / Bridges in a Graph [https://leetcode.com/problems/critical-connections-in-a-network/] (Tarjan's Algo) [O(V+E),O(V+E)]
5. Articulation Point [https://www.geeksforgeeks.org/problems/articulation-point-1/1] (Modified Tarjan's Algo) [O(V+E+V+LogV),O(V)]
6. Strongly Connected Components [https://www.geeksforgeeks.org/problems/strongly-connected-components-kosarajus-algo/1] (Kosarajus Algo) [O(V+E),O(V+E)]
# Tips and Tricks 

- When ever it's about finding total path / all possible path go with the DFS 
- When ever it's about finding the minimum path go with the BFS
- During the BFS if ( remove -> work -> add ) lead to TLE then operate work during the add itself.