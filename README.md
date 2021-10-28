# Kafka
## Kafka Fundamental

###1. Topic, Partition, Offset
**Topic: a particular stream of data**  
-  Similar to a table in a database (without all constraints)  
-  A topic is identified by its name  

**Topic: Split in partitions**  
-  Each partition is ordered  
-  Each message within a partition gets an incremental id, called *offset*  
-  Offset only have a meaning for a specific partition  
-  Order is guaranteed only within a partition  
-  Data is kept only for a limited time  
-  Once the data is written to a partition, it can't be changed  
-  Data is assigned randomly to a partition  