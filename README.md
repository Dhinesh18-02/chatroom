# chatroom
Simple chatroom app using Akka cluster:
---------------------------------------

Cluster States Flow Diagram:


![github-small](https://github.com/Dhinesh18-02/chatroom/blob/main/member-states.png)

Here Alice Bob Charlie are the node Clusters.
Alice acts as the Leader and Seed node.
Alice establishes the connection between the clusters.
Bob send the request to the seed node i.e) Alice via Gossiping.
Alice Accepts the request and establishes the connection.
same thing happens to the Charlie.
3 nodes are connected in the cluster they can share messeges between them.

![github-small](https://github.com/Dhinesh18-02/chatroom/blob/main/Chatroom%20Cluster.png)
