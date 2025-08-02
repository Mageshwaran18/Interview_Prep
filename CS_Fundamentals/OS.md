# Operating System

A comprehensive guide to Operating System concepts and fundamentals.

## Table of Contents
- [Basics](#basics)
- [Processes and Threads](#processes-and-threads)
- [Synchronization](#synchronization)
- [Deadlocks](#deadlocks)
- [Memory Management](#memory-management)

## Basics 

- **What is OS?**
    - An Operating System (OS) is a software that acts as a bridge between the user and the hardware.

- **What are the responsibilities of the OS?**
    - Process Management – Schedules processes and handles multitasking.
    - Memory Management – Allocates and deallocates RAM efficiently.
    - Device Management – Acts as an interface between software and hardware.
    - File System Management – Manages how data is stored and retrieved.
    - Network Management – Handles communication between systems.
    - Security and User interface - Access privileges 

## Processes and Threads

- **What is the difference between the program and a process?**
    - **Program:**    
        - A program is an executable file which contains a certain set of instructions written to complete the specific job or operation on your computer 
        - It's a compiled code. Ready to be executed and stored in the disk

    - **Process:** 
        - A program which is under the execution.
        - Stored in the RAM (Computer's primary memory).

- **What is Thread?**
    - A lightweight unit of a process.
    - Shares memory and code with in the same process.
    - Dependent on the parent process.

- **Difference between the program, process and threads?**

| **Aspect**     | **Program**                        | **Process**                           | **Thread**                                 |
| -------------- | ---------------------------------- | ------------------------------------- | ------------------------------------------ |
| **Definition** | Passive set of instructions (code) | Active execution of a program         | Lightweight unit of a process              |
| **State**      | Stored on disk                     | Loaded in memory, has state (PC, PCB) | Shares memory with threads in same process |
| **Dependency** | Independent                        | Independent                           | Dependent on parent process                |
| **Memory**     | Not in memory                      | Separate memory space                 | Shares memory with other threads           |
| **Examples**   | `.exe` file                        | A running browser                     | Tabs inside the browser                    |

- **What is single and multi threaded process?**
    - Single threaded process will have only one thread.
    - Multiple threaded process a single process which has multiple thread running inside it.

- **Difference between the single and multi threaded process!**

| **Feature**          | **Single-threaded Process** | **Multithreaded Process**                |
| -------------------- | --------------------------- | ---------------------------------------- |
| **Execution Units**  | One execution path only     | Multiple execution paths (threads)       |
| **Responsiveness**   | Slower, sequential          | Faster, handles tasks in parallel        |
| **Resource Sharing** | Not applicable              | Threads share code, data, and resources  |
| **Examples**         | Command line utility        | Web browser, IDE (e.g., VSCode)          |
| **Use Case**         | Simpler tasks               | UI + background tasks (I/O + processing) |

- **Difference between the Multiprogramming, Multi tasking, Multi processing, Multi threading**

| **Aspect**            | **Multiprogramming**                   | **Multitasking**                             | **Multiprocessing**                      | **Multithreading**                                  |
| --------------------- | -------------------------------------- | -------------------------------------------- | ---------------------------------------- | --------------------------------------------------- |
| **No. of CPUs**       | One                                    | One                                          | Two or more CPUs                         | One (usually)                                       |
| **Context Switching** | Between processes                      | Fast switch between user tasks               | Between processes on different CPUs      | Between threads in same process                     |
| **Goal**              | Keep CPU busy while one waits          | Improve user experience (do many tasks)      | Increase performance using multiple CPUs | Efficient use of CPU within one process             |
| **Concurrency**       | Yes, but limited (no true parallelism) | Yes, user sees multiple tasks running        | Yes, real parallelism                    | Yes, multiple threads run in parallel/logically     |
| **Example Use Case**  | Batch systems (e.g., job queues)       | Using a text editor while listening to music | Scientific computing, servers            | Text editor, typing + spell-check + autosave |

- **What is context switching?**
    - Context switching is the process of storing and retriving the state of CPU. So that the execution can be resumed from the same point at a later time.
    - It occurs when the CPU switches between the one process to another process.
    - It enables multi tasking by providing illusion that multiple tasks are run simultaneously.

- **What is PCB?**
    - It's a data structure used by the OS to store information about the process.
    - It contains process ID, process state, memory, registers, I/O status 

- **What is the difference between the Process context switching and Thread context switching?**

| **Feature**          | **Process Context Switch**              | **Thread Context Switch**                     |
| -------------------- | --------------------------------------- | --------------------------------------------- |
| **Overhead**         | High (complete memory map, PCB, etc.)   | Low (only registers and stack; shares memory) |
| **Memory Space**     | Different memory space                  | Same memory space (code, data)                |
| **Speed**            | Slower                                  | Faster                                        |
| **Resource Sharing** | No (each process has its own resources) | Yes (threads share resources of the process)  |
| **Examples**         | Switching between Chrome and Spotify    | Switching between browser tabs (threads)      |
| **Switch Trigger**   | Timer, I/O, OS scheduling               | OS scheduling or user-level thread library    |

- **Benefits of multithreading**
    - Less work overhead as they share the code and memory among themselves with the threads which are in the same process.
    - Better CPU utilization, Faster, Responsive when compared to the multiprocessing.

## Synchronization

- **What is race condition?**
    - When two or more processes/thread access the shared data at the same time and the result depends on who runs first. 
    - Ex: Two threads increasing a counter → both read 10 → both write 11 → expected 12, but got 11.

- **What is Process synchronization?**
    - Process synchronization means co-ordinating the process such that they don't interfere with each other when accessing the shared resources.
    - It avoids issues like:
        - Data inconsistency 
        - Race condition 
    - Common tools are: 
        - Locks 
        - Semaphores 
        - Mutexes 

- **What is Thread scheduling?**
    - A process in which the OS decided which thread is need to be executed when multiple threads are in the ready state.
    - This can be done by:
        - Thread scheduler 
        - Based on priority, time slice, state etc.
    - Like as PCB, TCB (thread control block) stores all the information about the thread.
    - The goal is to utilise the CPU efficiently and make the system responsive.
    - Ex: In a browser, UI thread gets priority over a background download thread.

- **Why synchronization is needed?**
    - Multiple threads may access the same data and may lead to data inconsistency. 
    - Need Synchronization to maintain the data integrity 

- **What is critical section?**
    - A critical section is a part of code where a shared resource is accessed or modified.
    - Only one thread or process can enter into the critical section at a time to avoid errors.

- **What are the requirements of the synchronization?**
    - **Mutual Exclusion**
        - Only one process/thread can enter into the critical section at a time.
    - **Progress**
        - If no process/thread inside the critical section then the next one should enter into it without delay.
    - **Bounded waiting** 
        - No process should wait forever for entering into the critical section.

- **What are the solutions to the Race Conditions?**
    - **Atomic operations**
        - Ensure read-modify-write happens as one unbreakable step.
        - Atomic operations are the steps that are completed entirely or not at all - no other threads can interrupt them.
    - **Semaphores**
        - A semaphore is a variable used to control access to a shared resource.
    - **Locks / Mutex**
        - A mutex (short for mutual exclusion) is a lock that allows only one thread to access a critical section at a time.
        - Ex: If one thread locks the mutex, others must wait until it's unlocked.

- **What is semaphore in depth?**
    - A semaphore is a variable used to control the access to a shared resource
    - **Counting Semaphore** – Allows access to a resource up to a certain limit (e.g., 3 printers).
    - **Binary Semaphore** (like a mutex) – Only 0 or 1; used for mutual exclusion
    - It involves of 4 operations:
        - **wait()** Decrease the value / Block the process if < 0
        - **signal()** Increase the value / unblock the process
        - **block()** Used when a process can't proceed further (if value if < 0). It moves the process into the waiting queue.
        - **wakeup()** It resumes the blocked process, moves the process from waiting queue to the ready state.

- **Dining philosophers problem in depth!**

    The **Dining Philosophers Problem** is a classic synchronization problem in Operating Systems. It models how to **share limited resources** (like CPU, memory, or files) **safely** between multiple processes without causing **deadlocks or starvation**.

    ### 🧠 **Problem Setup**

    * Imagine **5 philosophers** sitting at a round table.
    * They do two things: **think** and **eat**.
    * There are **5 chopsticks**, one between each pair.
    * A philosopher needs **2 chopsticks to eat** (left and right).

    ✅ Philosophers:

    * **Think → Try to pick left chopstick → Try to pick right chopstick → Eat → Release both**

    ### ❌ **Problems That Can Occur**

    1. **Deadlock** – If all philosophers pick the left chopstick at the same time, they will all wait forever for the right one.
    2. **Starvation** – Some philosophers might never get to eat if others keep eating.

    ### 💡 **Solutions to Avoid Issues**

    1. **Allow only 4 philosophers to sit at once**
    → At least one will always eat, avoiding deadlock.

    2. **Pick both chopsticks at once (atomic action)**
    → If both aren't available, don't pick any.

    3. **Use a waiter (monitor/semaphore)**
    → A central controller gives permission to eat if both chopsticks are available.

    4. **Numbering and Order**
    → Let odd philosophers pick left then right, and even ones pick right then left.

    ### 🧵 **Relation to OS**

    * Models **resource allocation** in OS
    * Philosophers = **Processes**,
    Chopsticks = **Resources (like printers, files, memory)**
    * OS must avoid **deadlocks, race conditions, and starvation** when managing resources.

## Deadlocks

- **What is deadlock?**
    - Deadlock is a situation where one or more process wait for eachother to release the resource but none can proceed 
    - All are stuck forever 

- **What are the condition required for the deadlock?**
    - **Mutual Exclusion** - Only one process can handle the resource at a time.
    - **Hold and Wait** - One process holds the resources and wait for the other resource 
    - **No preemption** - A resource can't be taken forcefully 
    - **Circular wait** - A circular chain of waiting processes.

- **What are the deadlock handling strategies?**
    - **Deadlock prevention** - Make sure you at least fail one of the 4 conditions of deadlock.
    - **Deadlock avoidance** - Make sure that resource allocation is safe. Use deadlock avoidance algorithms like Bankers Algorithm etc.
    - **Detection and recovery** - Let the deadlock happen and provide recovery strategy like killing a process/releasing some of the resources 
    - **Ignore deadlock** - Assume deadlock happens very rarely. Used in UNIX and Windows 

- **Bankers algorithm in short!**
    - It's a dead lock avoidance algorithm, where the system checks if granting resource will not affect the safe state of the system.
    - If not, then the resource allocation will be denied to avoid deadlock.
    - Bankers algorithm makes sure that each process must declare max resource that they needed.

## Memory Management

- **What is Memory management?**
    - Memory management enables sharing of memory between the multiple processes 
    - Which ensures efficient allocation, deallocation and protection of memory spaces 

- **What is overlays?**
    - It's memory management technique used when a program is too big to fit into the memory 
    - So, it loads only the needed part of the program and rest of the part stays in the disk and it's reloaded when it's required.

- **What is swapping?**
    - It's a memory management technique where the OS removes a process from the RAM to the Disk, to free up some memory.
    - Helps in the multiprogramming environment.

- **What is Fragmentation?**
    - Fragmentation occurs when the memory is wasted because of not utilising it properly.
    - Types of Fragmentation: 
        - **Internal fragmentation**
            - Unused memory inside the allocated space.
        - **External fragmentation**
            - Unused memory outside the allocated space.

- **What are the types of memory allocation?**
    - **Contiguous memory allocation**
        - Memories are given in a contiguous blocks 
    - **Non Contiguous memory allocation**
        - Memories are given in a scattered chunks 

- **What is Address Translation?**
    - The process of converting a logical memory address generated by the CPU into a physical address in RAM 

- **What are the types of Contiguous memory allocation?**
    - **Fixed Size partitioning**
        - Memory is divided into the equal fixed size blocks
        - Simple but may cause the internal fragmentation 
    - **Variable size partitioning**
        - Memory is divided based on the process size
        - May lead to the external fragmentation

- **What are the types of non-contiguous memory allocation?**
    - **Pagging**
        - The memory is divided into two components
            - Pages - Logical division of the memory (virtual)
            - Frames - Physical division of the memory (RAM)
        - Page tables are used to map the pages with frames [address translation]
        - May cause internal fragmentation.
        - Logical address = page number + offset

    - **Segmentation**
        - Dividing the memory into variable sized segments based on the logical divisions such as code, stack, data, registers etc.
        - Each segments has a base and the limit.
        - Eliminates internal fragmentation but external fragmentation may occur.
        - Uses segment table for address translation.
        - Logical address = segment number + offset 

- **What are the memory allocation strategies?**
    - **First Fit**
        - Allocate the first free block that fits the request 
    - **Best Fit**
        - Allocate the smallest free block that fits the request 
    - **Worst Fit**
        - Allocate the largest free block.
    - These were used in the contiguous memory allocation.

- **What is virtual memory?**
    - It's a memory management technique that gives an illusion of more memory than the physically available one by using the disk space.
    - It used in large programs and multiprogramming 
    - It internally uses pagging and segmentations to implement.
    - Advantages: 
        - Runs larger programms efficiently without using the huge physical memory 
        - Improved CPU utilisation 
        - Better Isolation and security 
        - Efficient memory handling using the pagging and segmentation

- **What is page fault?**
    - A page fault occurs when a program tries to access a page that is not in memory.
    - Steps:
        1. CPU checks page table → not present.
        2. Traps to OS → OS loads the page from disk.
        3. Updates page table → resumes program.
    - It's normal in demand paging.

- **What is demand pagging?**
    - Demand pagging is a technique when pages are loaded into the memory only when needed not in advanced.
    - Reduces memory usage.
    - Uses page fault to handle the missing pages.
    - Missing pages are loaded from the disk to the RAM 

- **What is Thrashing?**
    - Thrashing happens when the CPU spends most of it's time in swapping the pages in and out from the RAM, then executing the actual program
    - Leads to low CPU utilization
    - Reason: 
        - Too many page faults
        - Not enough RAM 
    - Solutions: 
        - Increase the RAM 
        - Reduce the number of programs 
        - Use page replacement algorithms

- **A graph between the CPU utilization and the Degree of multiprogramming**

```
CPU utilization
    ^
    |         _________
    |        /         \
    |       /           \
    |      /             \    --> Thrashing 
    |     /               \
    |    /                 \ 
    |___/___________________\_>
    Degree of Multiprogramming
```
Explanation:
- At first, increasing multiprogramming improves CPU utilization (more processes → less idle CPU).
- After a point, adding more processes causes too much paging (thrashing).
- CPU utilization drops due to overhead.

- **What are the page replacement algorithms?**
    - **FIFO (First-In, First-Out)** – Removes the oldest page.
    - **LRU (Least Recently Used)** – Removes the page not used for the longest time.
    - **Optimal** – Removes the page that won't be used for the longest time (theoretical).
    - **Clock** – Like FIFO, but gives pages a second chance using a circular list.
    - **LFU (Least Frequently Used)** – Removes the page used the least number of times.
