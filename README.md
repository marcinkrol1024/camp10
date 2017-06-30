TASK 1
======
Create schema for the following requirements.

We want to have following entities:
* project
  * name
  * creation time
* user
  * login
  * password
* task
  * title
  * creation time
  * assignee
  * status
    * open
    * in-progress
    * qa
    * done
  * sub tasks*
    
Assumptions:
* a user can be assigned to multiple projects
* a project can have multiple users assigned
* a task can have an assignee
* every task is assigned to a project
* every task can consist of multiple sub tasks*
