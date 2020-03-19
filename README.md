## README

This is the code base for my master's thesis titled "Fault tolerant distributed window aggregations for IOT"
## CRDT Cases
Windowing optimization techniques : Partial Aggregates(using Lift, Lower & Combine) . Slices(Scotty) 

Windows : Tumbling, Sliding, Session
Semantics : Time, Count based
Aggregations : SUM, AVERAGE, MEDIAN

So far the vision is : 
Build a CRDT whose replication unit is a partial aggregate for the following cases
1. Time based Tumbling Window for SUM
2. Time based Sliding Window for SUM
3. Time based Session Window for SUM
4. Time based Tumbling Window for AVG
5. Time based Sliding Window for AVG
6. Time based Session Window for AVG
7. Count based Tumbling Window for SUM
8. Count based Sliding Window for SUM
9. Count based Session Window for SUM
10. Count based Tumbling Window for AVG
11. Count based Sliding Window for AVG
12. Count based Session Window for AVG

Build a CRDT whose replication unit is a slice for the following cases
1. Time based Session Window for MEDIAN
2. Time based Sliding Window for MEDIAN
3. Time based Tumbling Window for MEDIAN
4. Count based Session Window for MEDIAN
5. Count based Sliding Window for MEDIAN
6. Count based Tumbling Window for MEDIAN



## API-Driven Development

The user would register sources and queries

```scala
val props = Properties() //Some System level properties go here, this would be optional and come with a set of defaults
val env = Env.create(props)
val serviceDiscovery = env.sensors
val sources = 
env.register(
```
