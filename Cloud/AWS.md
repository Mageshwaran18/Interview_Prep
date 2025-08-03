# AWS Fundamentals Reference Guide

This guide covers essential AWS concepts for cloud practitioners.

## AWS Services and Use Cases

| Service | Use Case |
|---------|----------|
| EC2 | Virtual server |
| S3 | Stores files as objects and folders are considered as buckets, supports cross account replications, you can also force the data to be encrypted while uploading, suspending the version will not remove the previous versions |
| CloudFront | Replicates part of your application to AWS edge locations, decreases latency. Frequently accessed requests are cached at the edge locations. It can also access resources from EC2 and S3. It uses global network and also works based on the time to live concepts |
| AWS Trusted Advisor | Best recommendation inside the cloud (cost and security) |
| AWS Storage Gateway | Helps to connect on-premise database with the cloud database (hybrid cloud storage) |
| NAT Gateway | Allows private EC2 instances to connect with the Internet |
| Internet Gateway | Provides direct internet access to the resources in a public subnet |
| AWS Direct Connect | A dedicated private network between your on-premise data center and AWS |
| SQS (Simple Queue Service) | Serverless, scales from 1 to 1000 easily, follows FIFO |
| SNS | Simple Notification Service for low cost mass message delivery, uses publisher and subscriber model to transfer messages |
| AWS GuardDuty | Monitors unauthorized access to resources, provides threat detection and real-time alerts |
| AWS WAF | Prevents web-based attacks like SQL injections, provides country-based blocking |
| AWS Shield | Prevents resources from DDoS attack |
| IAM | Provides users the least privileges |
| CloudTrail | Monitors API usage and user's activity |
| CloudWatch | Monitors AWS resources and their performance |
| AWS SMS (Server Migration Service) | Helps in moving on-premise servers to the cloud |
| AWS QuickSight | Used to create visualizations and generate reports |
| AWS Route 53 | Domain Name Service provided by AWS to route users to multiple resources based on latency. Used along with CloudFront for region-specific service providing. Provides simple routing policy, weighted routing policy, latency routing policy, failover routing policy |
| AWS Elastic Beanstalk | A platform as a service that allows users to deploy and manage web applications easily without worrying about the underlying architecture. Takes care of load balancing and scaling |
| AWS KMS (Key Management Service) | Handles and stores encryption keys |
| AWS Secrets Manager | Stores, manages credentials and other sensitive materials like database credentials, API keys, passwords |
| AWS CM (Certificate Manager) | Handles the TLS certificates |
| AWS Config | Keeps track of instance or resource configuration changes in AWS |
| AWS Artifacts | Used to retrieve compliance documentation, ISO certification, other regulatory and policy principles followed by the resource |
| AWS Global Network | A private network, high-speed and secure that connects AWS data centers worldwide |
| AWS Outposts | AWS in your data centers, AWS sends physical racks to your on-premise location so that you can run AWS services locally without latency issues |
| AWS Organizations | Manages multiple accounts easily, can share reserved instances, saving plans, discounts etc. accounts among themselves, main account is the master account |
| AWS Kinesis | Real-time data streaming and data analysis |
| AWS Rekognition | AI-powered video analysis and object detection and face recognition service |
| AWS CloudFormation | Helps you create and automate the task of building cloud architecture with predefined templates and configurations. It's declarative programming which also defines the order of resources to be created. The template creation can also be done using JSON or YAML files |
| AWS CodePipeline | Used for building CI/CD pipelines |
| AWS SageMaker | Fully managed service specifically built for data scientists to build ML models |
| VPC Flow Logs | Captures information about IP traffic going in and out from an instance. Helps you resolve connectivity issues |
| VPC Endpoints | Connect two AWS services using private network instead of public network |
| VPC Peering | Directly connect two VPCs for private communication. Not transitive, requires each peering for each pair of VPCs |
| VPC Transit Gateway | Highly scalable network hub that allows multiple VPCs and on-premise networks to communicate with each other through a centralized single gateway |
| AWS Systems Manager Session Manager | Instead of bastion server, you can use this to securely login to private EC2 instances |
| Consolidated Billing | Comes under AWS organization, provides cost allocation tags, helps you track cost for each account department-wise |
| EFS & FSx | File storage in AWS, EFS is for Linux and FSx for Windows |
| AWS App Runner | Automatically builds and deploys containerized applications |
| AWS DynamoDB | Document DB service provided by AWS, fully managed service |
| AWS Redshift | Fully managed service, used for data warehousing and handling large datasets |
| AWS NTP | Network Time Protocol used to synchronize timestamps between resources like EC2, databases, and containers |
| AWS Fargate | Serverless compute service used to run containers without need of managing servers |
| AWS ECS | Elastic Container Service - A fully managed container orchestration service, takes care of starting and stopping containers. You can launch containers in EC2 or Fargate |
| AWS ECR | Elastic Container Registry - A fully managed service for storing and managing container images, integrated with EC2 and Fargate |
| AWS Tape Gateway | A service that allows businesses to extend their on-premise tape backups infrastructure to AWS cloud |

## AWS Global Infrastructure

AWS Global Infrastructure is designed for high availability, fault tolerance, and low latency through a worldwide network of data centers.

### Regions
- Geographic areas containing multiple isolated data centers
- Currently 30+ regions globally
- Each region is completely independent
- Choose regions based on:
    - Compliance requirements
    - Latency to end users
    - Service availability
    - Pricing

### Availability Zones (AZs)
- Isolated locations within a region
- Each region has multiple AZs (typically 3-6)
- Connected by low-latency links
- Physically separated to isolate failures
- Resources deployed across AZs provide high availability

### Edge Locations
- Content delivery points (200+ globally)
- Part of Amazon CloudFront CDN
- More numerous than regions or AZs
- Cache content closer to users
- Reduce latency for content delivery

### Local Zones
- Extensions of AWS regions closer to population centers
- Provide select services with very low latency
- Used for latency-sensitive applications

### AWS Outposts
- Fully managed AWS infrastructure deployed on-premises
- Extends AWS environment to customer data centers
- Consistent hybrid experience

## Core Services

### EC2 (Elastic Compute Cloud)

#### Overview
- Infrastructure as a Service 
- Virtual servers in the AWS cloud
- Provides resizable compute capacity
- Pay only for what you use
- Complete control over your computing resources

#### Instance Types
- **General Purpose (T3, M5)**: Balanced compute, memory, and network resources
- **Compute Optimized (C5)**: High-performance processors for compute-bound applications
- **Memory Optimized (R5)**: Fast performance for memory-intensive workloads
- **Storage Optimized (D2, I3)**: High, sequential read/write access to large datasets
- **Accelerated Computing (P3, G4)**: Hardware accelerators or co-processors

#### Purchasing Options
- **On-Demand**: Pay by the hour with no long-term commitments, short-time unpredictable workloads 
- **Reserved Instances**: 1 or 3-year term commitment for significant discount, used for steady workloads up to 70% discounts
- **Spot Instances**: Bid for unused EC2 capacity at up to 90% discount, best for batch jobs
- **Dedicated Hosts**: Physical servers dedicated for your use, best for licensing heavy applications, 70-80% discounts

#### Storage Options
- **Instance Store**: Temporary block-level storage directly attached to the host
- **EBS (Elastic Block Store)**: Persistent block storage volumes
    - Point-in-time snapshots stored in S3
    - Snapshots are incremental - only changed blocks are saved
    - Can create new volumes from snapshots
    - Snapshots can be copied across regions for disaster recovery
    - Can be used to migrate data between AZs
- **EFS (Elastic File System)**: Fully managed file system for EC2

#### Networking Features
- **Security Groups**: Virtual firewall for controlling traffic. By default, all incoming traffic is denied, all outgoing traffic is allowed 
- **Elastic IP**: Static IPv4 address for dynamic cloud computing

#### Additional Features
- EC2 userdata: Used during instance creation, runs setup scripts during creation, runs only once
- For AWS RDS, AWS manages the OS patching and database patching. For databases running in EC2 instances, OS patching and updating database software should be handled by the user

#### Monitoring
- Basic monitoring with CloudWatch (5-minute intervals)
- Detailed monitoring (1-minute intervals) available
- Status checks for instance and system health

### S3

- Life cycle policy: Automatically moves or deletes objects in S3 after a period
- Object versioning: Keeps multiple versions of objects to prevent accidental deletion
- Bucket ACL: Determines who can access the S3 bucket or objects inside it at a granular level

## Networking Basics

### VPC (Virtual Private Cloud)
- **Purpose**: Isolated virtual network environment in AWS
- A VPC can span across all AZs in a region
- **Key Components**:
    - **Subnet**: Network segment within a VPC
    - **Route Table**: Rules determining network traffic direction
    - **Internet Gateway (IGW)**: Connects VPC to the internet
    - **NAT Gateway**: Allows instances in private subnets to initiate outbound traffic to the internet (for OS updates, security patching, etc.)
    - You can also use an EC2 instance to act as NAT gateway (using an AMI) but it's fully managed by the user and not highly scalable, whereas NAT gateway provides high scalability

### Subnets
- Subnets allow you to partition your network within the VPC
- Route tables in a VPC control how traffic moves within the VPC (set of rules)
- By default, all subnets in the same VPC can communicate with each other regardless of whether they're public/private
- Subnets are limited to one Availability Zone
- **Public Subnets**: Have route to internet via IGW
- **Private Subnets**: No direct internet access, use NAT for outbound traffic
- **Use Cases**: Public for web servers, private for databases

### CIDR Blocks
- **IP Range Notation**: e.g., 10.0.0.0/16
- **Subnet Sizing**: /24 provides 256 IPs, /28 provides 16 IPs

### Security Controls
- **Security Groups**: Stateful, instance-level firewall
- **NACLs**: Stateless, subnet-level access control lists

### Network Interfaces
- **Elastic IPs**: Static public IP addresses
- **ENIs**: Virtual network cards for EC2 instances

## Identity & Access Management (IAM)

- **IAM Users**: Individual identities for AWS access
- **Groups**: Collections of users with shared permissions
- **Roles**: Temporary identities assumed by services or users
- **Policies**: JSON documents defining permissions

### Best Practices
- Implement least privilege access
- Enable MFA for all users
- Use roles for service access instead of access keys

## Core AWS Services

### Compute
- **EC2**: Virtual servers (t2.micro, m5.large, etc.)
- **Lambda**: Serverless functions triggered by events

### Storage
- **S3**: Object storage with various classes (Standard, IA, Glacier)
- **EBS**: Block storage volumes for EC2

### Database
- **RDS**: Managed relational databases (MySQL, PostgreSQL, etc.)
- **DynamoDB**: Managed NoSQL database service

### Monitoring
- **CloudWatch**: Metrics, logs, and alarms
- **CloudTrail**: API activity logging and auditing

## Pricing & Billing

- **Shared Responsibility Model**: AWS (security of the cloud), Customer (security in the cloud)
- **Free Tier**: Services available at no cost with limitations
- **Management Tools**: Cost Explorer, Budgets, Trusted Advisor

## High Availability & Fault Tolerance

- **Regions**: Geographic areas with multiple data centers
- **Availability Zones**: Isolated locations within a region
- **Load Balancers**: Distribute traffic (ALB for HTTP/HTTPS, NLB for TCP)
- **Auto Scaling**: Automatically adjust capacity based on demand

## Monitoring, Logging & Compliance

- **CloudWatch**: Performance monitoring and alerting
- **CloudTrail**: API activity tracking for governance
- **Compliance Programs**: Support for various regulatory requirements (HIPAA, GDPR, SOC)

## Migration Services
- **Snow Cone**: 8TB capacity
- **Snowball Edge**: TB and PB capacity, pay per data transfer, large migration
- **Snow Mobile**: More than 1000 PB, larger capacity
- Snow Cone and Snow Mobile support edge computing
- Snow Cone supports both online and offline transfer

## Common AWS Interview Questions

**Q: What are the different ways to access AWS?**
- **AWS Management Console**: Web-based interface for visual management of resources
- **AWS CLI (Command Line Interface)**: Terminal-based access for scripting and automation
- **AWS SDKs (Software Development Kits)**: Programming interfaces for various languages (e.g., Boto3 for Python)
- **AWS CloudFormation**: Infrastructure as Code using JSON/YAML templates
- **AWS Mobile Console**: Mobile application for monitoring and basic operations
- **AWS APIs**: Direct programmatic access to AWS services

### Networking & VPC

**Q: What is a DNS record?**
- A DNS (Domain Name System) record is an entry in a DNS database that maps domain names to IP addresses
- In AWS, DNS records are primarily managed through Route 53
- DNS records enable users to access resources using human-readable names instead of IP addresses

**Q: What is stateful and stateless?**
- **Stateful**: You only write allow rules and don't need to explicitly write the outbound rule. Once an inbound connection is allowed, the corresponding outbound traffic is automatically permitted.
- **Stateless**: Even if you write the inbound rule, you must explicitly write the outbound rule. Inbound and outbound traffic are treated as separate connections.

**Q: What is the difference between a security group and a NACL?**
- Security groups are stateful, instance-level firewalls that allow rules only, known as virtual firewall
- NACLs are stateless, subnet-level controls that allow both allow and deny rules

**Q: Can you explain the concept of a VPC and why it's important?**
- VPC provides an isolated network environment in AWS for your resources
- Important for security, network segmentation, and maintaining control over resource communication

**Q: Provide some example services for SaaS, PaaS, and IaaS in AWS?**
- **SaaS (Software as a Service)**: Amazon WorkMail, Amazon Connect, Amazon Chime
- **PaaS (Platform as a Service)**: AWS Elastic Beanstalk, AWS Lambda, Amazon Lightsail
- **IaaS (Infrastructure as a Service)**: Amazon EC2, Amazon VPC, Amazon S3, Amazon EBS

**Q: What's the difference between a public subnet and a private subnet?**
- Public subnets have a route to the internet via an Internet Gateway
- Private subnets have no direct internet access, protecting backend resources

**Q: What is a NAT Gateway? Why is it used?**
- Allows instances in private subnets to access the internet while remaining private
- Used for software updates, API calls, or downloading packages while maintaining security

**Q: How does Route Table work in a VPC?**
- Contains rules (routes) that determine where network traffic is directed
- Associates with subnets to control their traffic flow

**Q: What are the fully managed AWS database services?**
- RDS, DynamoDB, Keyspace, Redshift, ElastiCache, Aurora

### IAM & Security

**Q: What are the root user privileges in AWS?**

Root user has exclusive access to certain critical functions:
- Access and edit tax invoices and billing information
- Edit or delete bucket policies
- Change AWS support plans
- Register as a seller in the Reserved Instance Marketplace
- Access to all AWS services and resources without restriction
- Modify account settings that regular IAM users cannot change
- Close the AWS account

**Q: How do IAM roles help in cross-service access?**
- Provide temporary credentials for services/applications
- Eliminate need for storing access keys in application code

**Q: What's the difference between Identity-based and Resource-based policies?**
- Identity-based: Attached to IAM users/groups/roles
- Resource-based: Attached directly to resources (e.g., S3 buckets)

**Q: How would you restrict access to an S3 bucket?**
- Use bucket policies, IAM policies, ACLs, or VPC endpoints
- Implement encryption and versioning for additional security

**Q: What are IAM roles and how are they different from IAM users?**
- IAM roles are identities with specific permissions that can be assumed by AWS services, applications, or users
- Unlike IAM users, roles don't have long-term credentials (passwords or access keys)
- Roles provide temporary security credentials for sessions
- Commonly used for: 
    - Granting permissions to AWS services
    - Cross-account access
    - Federation with external identity providers
    - Applications running on EC2 instances

**Q: What is a bastion server?**
- It's a jump server used to securely access instances in private subnets
- You SSH into the bastion server (which is in a public subnet)
- From the bastion server, you SSH into private EC2 instances
- Only the bastion server can reach those private EC2 instances
- Acts as a secure gateway for accessing protected resources
- Reduces attack surface by limiting direct external access to private resources

### Encryption & Security

**Q: Encrypting the data at rest in RDS comes under whose responsibility?**
- This falls under the customer's responsibility according to the AWS Shared Responsibility Model
- AWS provides the encryption capability, but customers must:
    - Enable encryption when creating the RDS instance
    - Manage encryption keys (AWS KMS)
    - Configure encryption settings
- AWS is responsible for the underlying infrastructure security
- Customers are responsible for data security, including encryption decisions

### Compute & Storage

**Q: What are the storage classes available in S3 buckets and their availability and durability?**

- **S3 Standard**: 
    - Designed for frequently accessed data
    - Low latency and high throughput

- **S3 Intelligent-Tiering**:
    - Automatically moves objects between access tiers
    - Optimizes costs for data with unknown or changing access patterns

- **S3 Standard-IA (Infrequent Access)**:
    - Lower cost for infrequently accessed data
    - Rapid access when needed

- **S3 One Zone-IA**:
    - Lower cost than Standard-IA
    - Data stored in a single Availability Zone

- **S3 Glacier**:
    - Low-cost archival storage
    - Retrieval times from minutes to hours

- **S3 Glacier Deep Archive**:
    - Lowest cost storage class
    - Retrieval time of 12 hours
    - Designed for long-term retention (7-10+ years)

**Q: What are the different EC2 instance types?**
- General Purpose (T2, M5): Balanced compute/memory
- Compute Optimized (C5): High compute needs
- Memory Optimized (R5): Memory-intensive applications
- Storage Optimized (D2, I3): High storage throughput

**Q: Explain the difference between EBS and S3.**
- EBS: Block storage for EC2 instances, like a virtual hard drive
- S3: Object storage for files/documents, accessed via HTTP/HTTPS

### High Availability & Architecture

**Q: How is high availability achieved in AWS?**
- Deploy across multiple Availability Zones
- Use load balancers with auto-scaling groups
- Implement multi-region architectures for critical systems

**Q: What is the difference between vertical and horizontal scaling?**
- Vertical: Increasing instance size/power (t2.micro → t2.large)
- Horizontal: Adding more instances of the same size

**Q: What does the shared responsibility model mean?**
- AWS: Responsible for security OF the cloud (infrastructure, services)
- Customer: Responsible for security IN the cloud (data, configurations, access)

**Q: What about disaster recovery?**
- Use region replication to avoid natural disasters. AZ replication will only help you provide availability and reduce latency, but if the region goes down, everything goes down.

**Q: What is Multi-AZ architecture?**
- High recovery and availability. Critical applications and databases are replicated across multiple AZs to minimize data loss and downtime. Provides a failover mechanism.

**Q: What is Active-Active architecture?**
- High availability and load balancing architecture where multiple instances of an application or service run in parallel across different regions & locations.

**Q: What is Active-Passive architecture?**
- One active instance handles all the traffic while the other instance stays on standby, ready to take over if a failure occurs.

### Monitoring & Cost Optimization

**Q: What's the difference between CDK and SDK?**
- CDK: Used to deploy AWS infrastructure using programming languages like Python, C#, Java
  Example: Create an S3 bucket using CDK/code
- SDK: Used to interact with AWS services, like Python's boto3
  Example: Download file from an S3 bucket

**Q: What's the difference between CloudWatch and CloudTrail?**
- CloudWatch: Performance monitoring, metrics, alarms
- CloudTrail: API activity logging for audit and compliance

**Q: What costs money in AWS?**
- AWS will charge you for outbound data transfer but not for inbound data transfer, not for invoked Lambda functions, and not for empty S3 buckets.

**Q: What is IP spoofing?**
- The attacker modifies its IP to make it appear it's coming from an authorized place. It can be prevented using AWS WAF and AWS Shield.

**Q: What tools can you use to monitor usage and optimize costs?**
- AWS Cost Explorer
- AWS Budgets
- Trusted Advisor
- AWS Cost and Usage Reports

**Q: What are the pricing models in AWS?**
- **Pay as you Go**: Only pay for the resources you use, with no upfront costs
- **Save when you Reserve**: Commit to a term (1 or 3 years) for significant discounts
- **Pay Less by Using More**: Volume-based discounts as your usage increases (in S3 the more storage you buy, the lower the cost will be)
- **Pay Less as AWS Grows**: AWS passes on savings from economies of scale to customers

**Q: What is an Amazon Machine Image (AMI)?**
- An AMI is a pre-configured template that contains the operating system, application server, and applications
- AMIs provide the information required to launch an EC2 instance
- Key aspects of AMIs:
    - Region-specific and can be copied between regions
    - Can be shared with other AWS accounts or made public
    - Available as AWS-provided, marketplace, or custom (user-created) AMIs
    - Enables rapid deployment of consistent environments
    - Supports instance backups by creating AMIs from running instances
    - Helps implement immutable infrastructure patterns

**Note**: No AWS service guarantees 100% uptime.
