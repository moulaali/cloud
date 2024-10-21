## REST Springboot server to manage customer EKS clusters in a multi-tenant setup

```
# To build the image
docker build . -t eks-control-plane:1.0.0

# To run locally
docker run -p 8080:8080 eks-control-plane:1.0.0

# Test the server locally
 curl -X POST "http://localhost:8080/api/eks/create"      -d "clusterName=my-cluster"      -d "roleArn=arn:aws:iam::123456789012:role/EKS-ClusterRole"      -d "subnetIds=subnet-xxxxxx,subnet-yyyyyy"      -d "securityGroupIds=sg-xxxxxxx"
```
