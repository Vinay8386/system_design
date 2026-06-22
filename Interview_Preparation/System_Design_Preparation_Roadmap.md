# SDE2 System Design Interview Roadmap (Question Driven)

## How To Practice Each Question

For every question follow this sequence:

### Phase 1 - Requirement Gathering

Ask:

* Functional Requirements
* Non Functional Requirements

---

### Phase 2 - LLD

Derive:

* Entities
* Relationships
* Class Diagram
* SOLID Principles
* Design Patterns

---

### Phase 3 - Database Design

Derive:

* Tables
* Indexes
* Relationships

---

### Phase 4 - HLD

Design:

* APIs
* Services
* Database
* Cache
* Messaging

---

### Phase 5 - Deep Dive

Discuss:

* Concurrency
* Consistency
* Scalability
* Failure Handling

---

# Week 1

## Day 1

### Question 1

Design a Parking Lot System.

#### Follow-Up Questions

1. How would you support multiple floors?
2. How would you support multiple vehicle types?
3. How would you add Electric Vehicles?
4. How would you find nearest available spot?
5. How would you prevent two cars from taking the same spot?
6. How would you support multiple cities?
7. What happens if payment succeeds but spot release fails?

---

## Day 2

### Question 2

Design BookMyShow.

#### Follow-Up Questions

1. How would you model seats?
2. How would you lock seats?
3. Two users select same seat simultaneously. What happens?
4. Seat locked but payment failed. What happens?
5. How would you scale to millions of bookings?
6. How would you use Redis?
7. How would you use Kafka?

---

## Day 3

### Question 3

Design an Elevator System.

#### Follow-Up Questions

1. How would you assign elevators?
2. What scheduling algorithm would you use?
3. How would you support 100 elevators?
4. How would you handle elevator failure?
5. How would you optimize wait time?

---

## Day 4

### Question 4

Design Splitwise.

#### Follow-Up Questions

1. Equal split?
2. Percentage split?
3. Exact amount split?
4. How would you settle debts efficiently?
5. How would you handle millions of users?

---

## Day 5

### Question 5

Implement an LRU Cache.

#### Follow-Up Questions

1. Why HashMap + Doubly Linked List?
2. Time Complexity?
3. Thread Safety?
4. Distributed Cache Design?
5. Cache Stampede?
6. Cache Avalanche?

---

# Week 2

## Day 6

### Question 6

Design a URL Shortener.

#### Follow-Up Questions

1. How would you generate unique IDs?
2. How would you avoid collisions?
3. Base62 encoding?
4. How would you scale writes?
5. How would you handle billions of URLs?

---

## Day 7

### Question 7

Design a Rate Limiter.

#### Follow-Up Questions

1. Token Bucket?
2. Leaky Bucket?
3. Fixed Window?
4. Sliding Window?
5. Distributed Rate Limiter?
6. Redis implementation?

---

## Day 8

### Question 8

Design a Notification System.

#### Follow-Up Questions

1. SMS support?
2. Email support?
3. Push notification support?
4. Retry mechanism?
5. DLQ?
6. Kafka integration?
7. How would you guarantee delivery?

---

## Day 9

### Question 9

Design WhatsApp.

#### Follow-Up Questions

1. Message delivery?
2. Read receipts?
3. Group chats?
4. Message ordering?
5. Offline users?
6. WebSocket scaling?
7. Presence service?

---

## Day 10

### Question 10

Design Swiggy/Zomato.

#### Follow-Up Questions

1. Driver assignment?
2. Real-time tracking?
3. ETA calculation?
4. Surge pricing?
5. Location indexing?
6. How would you find nearest driver?

---

# Week 3

## Day 11

### Question 11

Design a Distributed Scheduler.

#### Follow-Up Questions

1. How would you avoid duplicate execution?
2. Leader election?
3. Node failure?
4. Retry strategy?

---

## Day 12

### Question 12

Design a Payment System.

#### Follow-Up Questions

1. Idempotency?
2. Duplicate payments?
3. Payment retry?
4. Exactly-once processing?
5. Saga Pattern?
6. Compensation transaction?

---

## Day 13

### Question 13

Design Amazon Shopping Cart.

#### Follow-Up Questions

1. Inventory reservation?
2. Overselling prevention?
3. Cart expiration?
4. Checkout flow?
5. Distributed transactions?

---

## Day 14

### Question 14

Design Uber.

#### Follow-Up Questions

1. Nearest driver lookup?
2. Real-time location updates?
3. GeoHash?
4. Redis?
5. Kafka?
6. ETA calculation?

---

## Day 15

### Question 15

Design an Online Ticket Booking System.

#### Follow-Up Questions

1. Seat reservation?
2. Distributed locking?
3. Payment integration?
4. Notification flow?
5. Saga Pattern?
6. Event-driven architecture?
7. CQRS?
8. Event Sourcing?

---

# Finance Company Special Questions

These are extremely common in JPMorgan, Goldman Sachs, Morgan Stanley, American Express, Visa, Mastercard interviews.

### Design a Trading Order Management System

Follow-Ups:

* Order matching
* Exactly-once processing
* Event sourcing
* Kafka
* Low latency

---

### Design a Real-Time Fraud Detection System

Follow-Ups:

* Streaming data
* Kafka
* Redis
* ML scoring
* Alerting

---

### Design a Payment Gateway

Follow-Ups:

* Idempotency
* Retry
* Duplicate prevention
* Settlement

---

### Design a Banking Ledger System

Follow-Ups:

* Double-entry bookkeeping
* Consistency
* Audit trail
* Event sourcing

---

### Design a Stock Market Price Feed System

Follow-Ups:

* WebSockets
* Kafka
* Fan-out
* Millions of subscribers
