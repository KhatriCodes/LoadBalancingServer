# LoadBalancingServer

Load Balancing = So when a particular website/application have multiple servers running behind and we send a request to that website then with the help of load balancers our request will route to one of the running server, similarly other request will route to other instance of server. Request can be from same or different user.

To Implement Load Balancing we need below things:

Load Balancing client:
 To create client application, we need 3 Dependencies Web, Ribbon, DevTools.
 We have to create Rest Template bean and need to annotate it by
@LoadBalancer
 In main class we have to use @RibbonClient(name=”application name which
we are going to call”, RibbonConfiguration.class)
 In RibbonConfiguration.class we have to define 2 beans IPing and IRule which
will take care of routing the request to desired instance of application. And need
to autowired Iclient config
 After this we have to provide YAML file properties in which add list of servers
and application name which is running on that multiple server
 While rest call we have to give application name which have multiple instance
instead of host and port name

Here we are hitting same request of LoadBalancingServer and getting routed on differnt instance of Application
![]()
Below is the Block Diagram
![]()
