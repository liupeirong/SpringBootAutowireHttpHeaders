This example creates a CustomHeader object based on each incoming Http request, and autowire the CustomHeader object in two services.

There are two key things to achieve this:
* CustomHeaderProvider ```get``` method returns a request scoped CustomHeader based on the passed in HttpServletRequest. 
* The services are request scoped as well. 

To verify, make sure  
* both HelloService and ByeService return the same CustomObject instance.
* when issuing two different requests, you get different CustomObject instance per request, with header values properly populated.
