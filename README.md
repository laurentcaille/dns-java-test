
install coredns:
see https://github.com/coredns/deployment/tree/master/kubernetes

create service:
- kubectl apply -f service.yaml

apply coredns configuration
- kubectl apply -f coredns-cm.yaml

run the container :
1. kubectl run -it --rm --restart=Never --image=openjdk:8-jdk-alpine dns-java-test
2. kubectl run -it --rm --restart=Never --image=openjdk:8-jdk dns-java-test



inside the container :
wget -qO -  https://raw.githubusercontent.com/lcaille/dns-java-test/master/runtest | sh

1. result : OK
2. result : FAIL
