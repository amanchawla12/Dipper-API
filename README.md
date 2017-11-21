# Project Title:
The API handles requests from different clients and offers status of the ongoing requests on server with their timeleft, 
and to cancel the others requests.

# Getting Started:
Open the Project folder in your native IDE and deploy on your local server with the installation of different libraries and
frameworks needed to run the project.

# Installing:
The system must be installed with Maven(from their website), as the Jersey is added in the project via Maven. 
click on run project in the IDE, it will download all the dependencies needed to run the project.

# Running the Tests:

#### GET request
* [localhost:8084/dipper/api/request?connId=20&timeOut=5]

It will create the thread of this request with its Id and return status in JSON format like:
```
	{"status": "ok"}
```


#### GET request
* [localhost:8084/dipper/api/serverStatus]

it will give the status in JSON format of all the on going requests running on server
eg.	
```
	[
		{
			"connId": "19",
			"timeLeft": "78.98"
		},
		{
			"connId": "21",
			"timeLeft": "91.788"
		}
	]
```
	
	
#### PUT request
(with payload as JSON object containing a connId.)
* [localhost:8084/dipper/api/kill]

It will give the response to the processing thread "ok" and the killed thread with "killed".



# Built With
1. JavaEE
2. NetBeans IDE
3. Jersey
4. Maven
5. Apache Tomcat


# Author
Aman Chawla


