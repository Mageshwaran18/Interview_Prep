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

## The Physical Layer

It's Layer 1 of the OSI model and deals with the actual hardware and physical connection between devices.

### Main Job: Data Transmission
This layer is all about sending raw bits (0s and 1s) over a physical medium like:
- Cables (Ethernet, fiber optics)
- Wireless signals (Wi-Fi, radio)
- Electrical pulses, light, or radio waves

### What It Does:
- **Bit Transmission** – sends and receives bits as signals
- **Defines Medium** – what type of wire or wireless is used
- **Defines Connector Types** – like RJ-45, USB, etc.
- **Signal Types** – electrical, optical, or radio
- **Data Rate** – how fast bits are sent (in bps)

### What It Does NOT:
- Understand meaning of data
- Handle error checking or routing
- 👉 It just moves the bits physically

## Transmission Media

It's the physical path used to carry data signals from one device to another.

### 1. Wired (or Guided) Media
Signals travel through a solid medium like cables.

🧵 **Types**:

| Type | Description | Example Use |
|------|-------------|-------------|
| Twisted Pair | Two wires twisted together to reduce noise | LAN, telephone lines |
| Coaxial Cable | Single copper wire with insulation | Cable TV, early networks |
| Fiber Optic | Uses light to send data (very fast) | Long-distance Internet |

### 2. Wireless (or Unguided) Media
Data is transmitted through air or space, no cables.

📡 **Types**:

| Type | Description | Example Use |
|------|-------------|-------------|
| Radio Waves | Wide range, low cost | Wi-Fi, FM radio |
| Microwaves | Line-of-sight, used for longer distances | Mobile networks, satellites |
| Infrared | Short-range, line-of-sight only | TV remotes |

### What is Line of Sight?
Line of sight means there must be a clear, direct path between the transmitter and the receiver, with no obstacles (like walls, buildings, or trees) in between.

### Wireless Transmission – Key Points:
- Uses electromagnetic waves (not wires)
- More flexible and mobile, but may face:
    - Interference (from other devices)
    - Security issues (easier to intercept)

## The Data Link Layer

It handles direct communication between two devices on the same network (like two computers connected to the same switch).

### Key Responsibilities:

#### Framing
- Breaks data into chunks called frames for easy transmission.

#### Addressing (MAC Address)
- Adds the MAC address of the sender and receiver so the data reaches the correct device.

#### Error Detection and Correction
- Ensures the data sent is correct and complete.

#### Flow Control
- Prevents fast senders from overwhelming slow receivers.

### Error Detection
- Adds extra bits to the frame (like parity bits, checksums, or CRC)
- At the receiver's side, it checks these bits to detect if something went wrong

**Popular Methods**:
- **Simple parity Check** -> Count no.of 1's in the data. Add that to the original data 
- **Two dimensional parity check** -> Parity bits are calculated for each row, which is equivalent to a simple parity check bit
- **CheckSum** -> The process involves dividing the data into equally sized segments and using a 1's complement to calculate the sum of these segments. The calculated sum is then sent along with the data to the receiver. At the receiver's end, the same process is repeated and if all zeroes are obtained in the sum, it means that the data is correct.

👉 Example: If 1010 is sent but 1110 is received, it detects that an error happened.

### Error Correction
- Not only detects errors but can also fix them
- Methods like Hamming Code can identify the wrong bit and correct it
- 👉 Think of it like spell-check — it spots the error and fixes it too

### Data Link Protocols
These are rules that control how data is framed, sent, and checked for errors between two directly connected devices.

**Common Data Link Layer Protocols**:

| Protocol | Use Case | Key Feature |
|----------|----------|-------------|
| Ethernet | LAN (wired) | Uses MAC address, framing |
| Wi-Fi (IEEE 802.11) | Wireless LAN | Includes access control + error detection |

These protocols define how frames are structured, how errors are detected, and how devices share the medium.

### Multiple Access Protocols
These are used when multiple devices share the same communication medium (like in Wi-Fi or Ethernet).
They define how devices take turns to avoid collisions (two devices talking at the same time).

**Categories**:
- **Random Access protocols** - Devices try to send data at any time by using collision avoidance and detection techniques.
- **Controlled Access protocols** - Devices take turns in an organized way. (token based)
- **Channelization Protocols** - Divide the channel so multiple users can use it at once.

### MAC Address (Media Access Control Address)
- A unique identifier assigned to every network device (like your phone, laptop, printer).
- It's permanent and set by the device manufacturer.
- It's used at the Data Link Layer for identifying devices in the same local network.
- 👉 Format: 6 pairs of hexadecimal numbers
- Example: 34:AF:3C:11:9B:E0

### Channel Allocation Problem
This refers to the challenge of how to assign and share a single communication channel among multiple devices without collisions or confusion. Use Multiple Access Protocols.

### Data Link Layer Switching (a.k.a. Layer 2 Switching)
- It's when switches forward data using MAC addresses.
- The switch learns which device is on which port by watching MAC addresses in frames.
- It then sends frames only to the correct port, not to all devices (unlike a hub).

### Ethernet LANs
Ethernet is the most common technology for wired LANs.
- Follows the IEEE 802.3 standard
- Works at the Data Link + Physical layers
- Uses:
    - MAC addresses
    - CSMA/CD for collision handling
    - Frames for data transfer
