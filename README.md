## This repository taken from [here](https://github.com/springframeworkguru/mssc-beer-service.git) 

* Exists here for testing purposes!

# 
##### ActiveMQ Docker Image

```bash
docker pull vromero/activemq-artemis

docker run -it --rm \
  -p 8161:8161 \
  -p 61616:61616 \
  vromero/activemq-artemis
```

#

# MSSC Beer Service


# Default Port Mappings - For Single Host
| Service Name | Port | 
| --------| -----|
| Brewery Beer Service | 8080 |
| [Brewery Beer Order Service](https://github.com/springframeworkguru/mssc-beer-order-service) | 8081 |
| [Brewery Beer Inventory Service](https://github.com/springframeworkguru/mssc-beer-inventory-service) | 8082 |