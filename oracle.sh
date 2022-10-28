docker network create comex-netowrk
docker run -d --network comex-network --name Oracle -p 1522:1521 -e ORACLE_PASSWORD=admin -v oracle-volume:/opt/oracle/oradata gvenzl/oracle-xe

