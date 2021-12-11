# tasklogger
Task Logger

Endpoints:

GET:    /tasklogger/task/get/{id}

GET:    /tasklogger/task/list

POST:   /tasklogger/task/add

    Body: 
    
    {
        "name": "name",
        "timeSpentInMin": 10,
        "taskGroup": 1,
        "assignee": "name",
        "subTaskIds": [
            1, 3
        ],
        "isTaskFinished": "N"
    }


DELETE: /tasklogger/task/delete/{id}