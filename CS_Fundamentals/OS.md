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
| **Example Use Case**  | Batch systems (e.g., job queues)       | Using a text editor while listening to music | Scientific computing, servers            | Text editor , typing + 
spell-check + autosave |

    
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
