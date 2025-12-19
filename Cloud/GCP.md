Google Cloud Platform 

BigQuery :- 

Serverless Highly scalable Data Ware house system 

Serverless :- 

    Group of machines - cluster ( client node , master node etc.. )
    
    No need to manage the infrastructure as in backside Google will handle these stuffs instead of you.

    Hive , Red Shift ,  is more similar to BigQuery 

    It has inbuilt query engine.
    
    Can able to perform SQL operations on TB ( terra byte ) of data withing Seconds.

    Provides Scale out solutions.
    
    Available in all regions. 
    
    Supports both the batch and streaming data ingestion.

    Federated Queries --> Compute and Storage will be separated from each other ( You don't want to copy the data from the google drive to Big Query to operate , you can directly perform query on the data without the need of copy )

    Auto Backup --> Internally doees the duplication ( To handle the failure of clusters and it's data )

    Programmatic Integration -> Supports API's in Python , Java etc.. 


BigQuery Architecture :- 

        Compute and Storage were decoupled. 
        Uses Colossus for storage ( in back side )



        Dremel for compute
        LeafNode -> Reads the data from the colossus 
        Mixers -> Perform aggregation on the data 
        Rootservers -> Co-ordinate both the Mixers and Leaf Node

        Jupiter acts as a middler layer for connecting the colossus and Dremel 


