## REST Springboot server to manage customer EKS clusters in a multi-tenant setup

```
# To build the image
docker build . -t eks-control-plane:1.0.0

# To run locally
docker run -p 8080:8080 eks-control-plane:1.0.0
```
