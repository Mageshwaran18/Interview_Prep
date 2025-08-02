# Computer Networks

## Introduction

A network is when two or more devices (like computers, phones, etc.) are connected so they can share data with each other.

## Types of Networks

- **PAN (Personal Area Network)** – Very small, around one person.  
    👉 Example: Bluetooth between phone and earbuds.

- **LAN (Local Area Network)** – Covers a small area like a home, school, or office.  
    👉 Example: Computers in a school connected together.

- **MAN (Metropolitan Area Network)** – Covers a city or big campus.  
    👉 Example: City-wide Wi-Fi.

- **WAN (Wide Area Network)** – Covers large areas like countries.  
    👉 Example: The Internet!

## Network Devices

### 🔸 HUB (Dumbest)
- Works at Layer 1 (Physical Layer) of OSI Model.
- Just copies data and sends it to every device connected.
- No idea who should get the data.
- 👉 No memory, no filtering.
- **Use Case**: Old or simple setups. Rare now.

### 🔸 SWITCH (Smarter)
- Works at Layer 2 (Data Link Layer).
- Uses MAC addresses to send data only to the right device.
- Learns which device is on which port (stores in a small table).
- 👉 More efficient than hub, less traffic.
- **Use Case**: Used in most LANs (offices, schools, etc.)

### 🔸 ROUTER (Smartest)
- Works at Layer 3 (Network Layer).
- Uses IP addresses to connect different networks (e.g., LAN to Internet).
- Can give IP addresses (via DHCP), block traffic (firewall), and choose best paths (routing).
- 👉 It's like a post office + police + GPS.
- **Use Case**: Your home Wi-Fi router, Internet backbone.

## Network Topologies

### 🔹 1. Bus Topology
- Single central cable (called backbone) connects all devices.
- Data travels in both directions.
- ❌ If the cable fails, whole network goes down.
- ✅ Cheap and simple.
- 🧠 **Used in**: Small or temporary networks, now outdated.

### 🔹 2. Star Topology
- All devices connect to a central hub or switch.
- If one device fails, others keep working.
- ❌ But if the central hub fails, network stops.
- 🧠 **Used in**: Homes and offices (very common today).

### 🔹 3. Ring Topology
- Devices form a circle — each connected to two neighbors.
- Data moves in one direction (or both in advanced versions).
- ❌ If one connection breaks, network may fail (unless it's a dual ring).
- 🧠 **Used in**: Some older network systems.

### 🔹 4. Mesh Topology
- Every device is connected to every other device.
- ✅ Very reliable — if one path fails, there are others.
- ❌ Expensive and complex to set up.
- 🧠 **Used in**: Military, critical networks, or Wi-Fi mesh systems.

### 🔹 5. Tree Topology
- A combination of star and bus.
- Has a root node (main cable), with branches of star topologies.
- ✅ Good for scalability.
- 🧠 **Used in**: Large networks, like schools or enterprises.

## Network Fundamentals

### Node and Link
- A **node** is any device that can send, receive, or forward data in a network.
- A **link** is the connection between two nodes.

### OSI Model
The OSI (Open Systems Interconnection) model is a conceptual framework that explains how data travels from one device to another over a network — in 7 layers.

A conceptual framework is an idea-based model (not physical), that helps us understand a complex system.

Each layer has a specific job, and they work together like a team, from sender to receiver.

#### The 7 Layers (Top to Bottom)
- **Application Layer** – what the user interacts with
- **Presentation Layer** – formats and encrypts data
- **Session Layer** – manages connections
- **Transport Layer** – breaks data into chunks, ensures delivery
- **Network Layer** – picks the best path (IP addressing, routing)
- **Data Link Layer** – handles MAC address, frames, error check
- **Physical Layer** – cables, signals, electrical transmission

### TCP/IP Model
- **TCP** = Transmission Control Protocol
- **IP** = Internet Protocol

The TCP/IP model is a real-world networking model used in the Internet today. It shows how data is sent and received across a network.

Unlike the OSI model (which is a conceptual framework), TCP/IP is practical and implemented in real systems.

#### Layers in TCP/IP Model (4 Layers):
- **Application Layer** – Handles user apps (like browsers, email, etc.)
- **Transport Layer** – Manages reliable data transfer (TCP/UDP)
- **Internet Layer** – Handles routing and IP addressing
- **Network Access Layer** (or Link Layer) – Deals with physical hardware and MAC addresses

### Comparison of OSI and TCP/IP Models

| Feature                    | **OSI Model**                                                               | **TCP/IP Model**                                  |
| -------------------------- | --------------------------------------------------------------------------- | ------------------------------------------------- |
| **Full Form**              | Open Systems Interconnection                                                | Transmission Control Protocol / Internet Protocol |
| **Developed By**           | ISO (International Standards Organization)                                  | U.S. Department of Defense                        |
| **Purpose**                | Conceptual model for understanding networks                                 | Practical model used in real networks             |
| **Number of Layers**       | 7                                                                           | 4                                                 |
| **Layers (Top to Bottom)** | Application, Presentation, Session, Transport, Network, Data Link, Physical | Application, Transport, Internet, Network Access  |
| **Use Case**               | Reference/teaching tool                                                     | Real-world communication (e.g., Internet)         |
| **Protocol Support**       | Protocols not defined                                                       | Uses standard protocols (TCP, IP, etc.)           |
| **Approach**               | Theoretical model                                                           | Protocol-oriented model                           |
| **Layer Separation**       | Clearly separates functions in 7 layers                                     | Some functions merged into 4 layers               |

