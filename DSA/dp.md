We can use dynamic programming in two types of problems:

1. Overlapping Subproblems
    * When a problem can be broken down into smaller subproblems that are reused multiple times
    * Example: Fibonacci Series --> Too many recursive calls with same values
        We can solve this using DP by implementing:
            * Memoization -> Top-down approach (storing results of subproblems)
                we try to solve problems in form of recursion and we keep on storing the recursive results into the table.
            * Tabulation -> Bottom-up approach (building solution iteratively)
                we follow bottom - up approach by solving problems iteratively and store results from smaller problems to larger problems

2. Optimal Substructure
    * When optimal solution of a problem can be constructed from optimal solutions of its subproblems
    * Example: Shortest Path Problems, Knapsack Problem
        We can solve these by:
            * Breaking into smaller subproblems
            * Finding optimal solutions for subproblems
            * Combining solutions to solve original problem


-- 1D -- 
1. 