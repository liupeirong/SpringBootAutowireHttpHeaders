This example creates a CustomHeader object based on each incoming Http request, and autowire the CustomHeader object in two services.

Things to note:
* CustomHeaderProvider ```get``` method returns a request scoped CustomHeader based on the passed in HttpServletRequest. 
* Not demonstrated here, but request scoped component can't be used in async calls because the request context doesn't exist in async threads. 

To verify, make sure  
* The controller, HelloService, and ByeService return the same CustomHeader instance in a single request. The instance count is only incremented by 1 in a single request.
* When issuing two different requests, you get different CustomHeader instance per request, with header values properly populated, and instance count incremented by 1.
