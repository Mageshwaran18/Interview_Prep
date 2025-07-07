# Operating System

## Basics 

- What is OS ?

    - An Operating System (OS) is a software that acts as a bridge between the user and the hardware.

- What are the responsibilities of the OS ?

    - Process Management – Schedules processes and handles multitasking.

    - Memory Management – Allocates and deallocates RAM efficiently.

    - Device Management – Acts as an interface between software and hardware.

    - File System Management – Manages how data is stored and retrieved.

    - Network Management – Handles communication between systems.

    - Security and User interface - Access privileges 

- What is the difference between the program and a process ?

    - Program :-    
        - A program is an executable file which contains a certain set of instructions written to complete the specific job or operation on your computer 
        - It's a compiled code. Ready to be executed and stored in the disk

    - Process :- 
        - A program which is under the execution .
        - Stored in the RAM ( Computer's primary memory ).

- What is Thread ?

    - A lightweight unit of a process.
    - Shares memory and code with in the same process.
    - Dependent on the parent process.

- Difference between the program , process and threads ?

| **Aspect**     | **Program**                        | **Process**                           | **Thread**                                 |
| -------------- | ---------------------------------- | ------------------------------------- | ------------------------------------------ |
| **Definition** | Passive set of instructions (code) | Active execution of a program         | Lightweight unit of a process              |
| **State**      | Stored on disk                     | Loaded in memory, has state (PC, PCB) | Shares memory with threads in same process |
| **Dependency** | Independent                        | Independent                           | Dependent on parent process                |
| **Memory**     | Not in memory                      | Separate memory space                 | Shares memory with other threads           |
| **Examples**   | `.exe` file                        | A running browser                     | Tabs inside the browser                    |

- What is single and multi threaded process ?
    
    - Single threaded process will have only one thread.

    - Multiple threaded process a single process which has multiple thread running inside it.

- Difference between the single and multi threaded process !

| **Feature**          | **Single-threaded Process** | **Multithreaded Process**                |
| -------------------- | --------------------------- | ---------------------------------------- |
| **Execution Units**  | One execution path only     | Multiple execution paths (threads)       |
| **Responsiveness**   | Slower, sequential          | Faster, handles tasks in parallel        |
| **Resource Sharing** | Not applicable              | Threads share code, data, and resources  |
| **Examples**         | Command line utility        | Web browser, IDE (e.g., VSCode)          |
| **Use Case**         | Simpler tasks               | UI + background tasks (I/O + processing) |

- Difference between the Multiprogramming , Multi tasking , Multi processing , Multi threading 

| **Aspect**            | **Multiprogramming**                   | **Multitasking**                             | **Multiprocessing**                      | **Multithreading**                                  |
| --------------------- | -------------------------------------- | -------------------------------------------- | ---------------------------------------- | --------------------------------------------------- |
| **No. of CPUs**       | One                                    | One                                          | Two or more CPUs                         | One (usually)                                       |
| **Context Switching** | Between processes                      | Fast switch between user tasks               | Between processes on different CPUs      | Between threads in same process                     |
| **Goal**              | Keep CPU busy while one waits          | Improve user experience (do many tasks)      | Increase performance using multiple CPUs | Efficient use of CPU within one process             |
| **Concurrency**       | Yes, but limited (no true parallelism) | Yes, user sees multiple tasks running        | Yes, real parallelism                    | Yes, multiple threads run in parallel/logically     |
| **Example Use Case**  | Batch systems (e.g., job queues)       | Using a text editor while listening to music | Scientific computing, servers            | Text editor , typing + spell-check + autosave |

    
- What is context switching ? 
    
    - Context switching is the process of storing and retriving the state of CPU . So that the execution can be resumed from the same point at a later time.

    - It occurs when the CPU switches between the one process to another process.

    - It enables multi tasking by  providing illusion that multiple tasks are run simultaneously.


- What is PCB ?

    - It's a data structure used by the OS to store information about the process.

    - It contains process ID , process state , memory , registers , I/O status 

What is the difference between the Process context switching and Thread context switching ?

| **Feature**          | **Process Context Switch**              | **Thread Context Switch**                     |
| -------------------- | --------------------------------------- | --------------------------------------------- |
| **Overhead**         | High (complete memory map, PCB, etc.)   | Low (only registers and stack; shares memory) |
| **Memory Space**     | Different memory space                  | Same memory space (code, data)                |
| **Speed**            | Slower                                  | Faster                                        |
| **Resource Sharing** | No (each process has its own resources) | Yes (threads share resources of the process)  |
| **Examples**         | Switching between Chrome and Spotify    | Switching between browser tabs (threads)      |
| **Switch Trigger**   | Timer, I/O, OS scheduling               | OS scheduling or user-level thread library    |

- What is race condition ?
    
    - When two or more processes / thread access the shared data at the same time and the result is depends on who runs first. 

    - Ex :- Two threads increasing a counter → both read 10 → both write 11 → expected 12, but got 11.

- What is Process synchronization ?

    - Process synchronization means co-ordinating the process such that they don't interfere with each other when accessing the shared resources.

    - It avoids issues like 
        - Data inconsistency 
        - Race condition 

    - Common tools are 
        - Locks 
        - Semaphores 
        - Mutexes 

- What is Thread scheduling ?

    - A process in which the OS decided which thread is need to be executed when multiple threads are in the ready state.
    
    - This can be done by 
        - Thread scheduler 
        - Based on priority , time slic , state etc..

    - Like as PCB , TCB ( thread control block ) stores all the information about the thread.

    - The goal is to utilise the CPU effeciently and make the system responsive.

    - Ex :- In a browser, UI thread gets priority over a background download thread.

- What is the benefits of multithreading ?
    
    - Less work overhead as they share the code and memory among themselves with the threads which are in the same process.

    - Better CPU utilization , Faster , Responsive when compared to the multiprocessing.

- Why synchronization is needed ?
    
    - Multiple threads may access the same data and may lead to data inconsistency. 
    
    - Need Synchronization to maintain the data integrity 

- What is critical section ?

    - A critical section is a part of code where a shared resource is accessed or modified.

    - Only one thread or process can enter into the critical section at a time to avoid errors.

- What are the requirements of the synchronization ?

    - Mutual Exclusion 
        - Only one process / thread can enter into the critical section at a time.
    
    - Progress 
        - If no process / thread inside the critical section then the next one should enter into it without delay.
    
    - Bounded waiting 
        - No process should wait forever for entering into the critical section.

- What are the solutions to the Race Conditions ?
    
    - Atomic operations 
        - Ensure read-modify-write happens as one unbreakable step.
        - Atomic operations are the steps that are completed entirely or not at all - no other threads can interrupt them.

    - Semaphores 
        - A semaphore is a variable used to control access to a shared resource.

    - Locks / Mutex 
        - A mutex (short for mutual exclusion) is a lock that allows only one thread to access a critical section at a time.
        - Ex:- If one thread locks the mutex, others must wait until it’s unlocked.

- What is semaphore in depth ?
    
    -  A semaphore is a variable used to control the access to a shared resource

    - Counting Semaphore – Allows access to a resource up to a certain limit (e.g., 3 printers).

    - Binary Semaphore (like a mutex) – Only 0 or 1; used for mutual exclusion

    - It involves of 4 operations 
        - wait() Decrease the value / Block the process if < 0
        - signal() Increase the valu / unblock the process
        - block() Used when a process can't proceed further ( if value if < 0). It moves the process into the waiting queue.
        - wakeup() It resumes the blocked process , moves the process from waiting queue to the ready state.

- Dining philosophers problem in depth !

    The **Dining Philosophers Problem** is a classic synchronization problem in Operating Systems. It models how to **share limited resources** (like CPU, memory, or files) **safely** between multiple processes without causing **deadlocks or starvation**.

    ---

    ### 🧠 **Problem Setup**

    * Imagine **5 philosophers** sitting at a round table.
    * They do two things: **think** and **eat**.
    * There are **5 chopsticks**, one between each pair.
    * A philosopher needs **2 chopsticks to eat** (left and right).

    ✅ Philosophers:

    * **Think → Try to pick left chopstick → Try to pick right chopstick → Eat → Release both**

    ---

    ### ❌ **Problems That Can Occur**

    1. **Deadlock** – If all philosophers pick the left chopstick at the same time, they will all wait forever for the right one.
    2. **Starvation** – Some philosophers might never get to eat if others keep eating.

    ---

    ### 💡 **Solutions to Avoid Issues**

    1. **Allow only 4 philosophers to sit at once**
    → At least one will always eat, avoiding deadlock.

    2. **Pick both chopsticks at once (atomic action)**
    → If both aren’t available, don’t pick any.

    3. **Use a waiter (monitor/semaphore)**
    → A central controller gives permission to eat if both chopsticks are available.

    4. **Numbering and Order**
    → Let odd philosophers pick left then right, and even ones pick right then left.

    ---

    ### 🧵 **Relation to OS**

    * Models **resource allocation** in OS
    * Philosophers = **Processes**,
    Chopsticks = **Resources (like printers, files, memory)**
    * OS must avoid **deadlocks, race conditions, and starvation** when managing resources.

    ---
