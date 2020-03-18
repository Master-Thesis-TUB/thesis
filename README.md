## README

This is the code base for my master's thesis titled "Fault tolerant distributed window aggregations for IOT"

## API-Driven Development

The user would register sources and queries

```scala
val props = Properties() //Some System level properties go here, this would be optional and come with a set of defaults
val env = Env.create(props)
val serviceDiscovery = env.sensors
val sources = 
env.register(
```
