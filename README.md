# NLW SETUP

The main goal of this project is to set up daily habits to be accomplished everyday,
or almost every day (we need to try).
At the end of this project we must have and API that:

* Register habits (CRUD)
* Register the days of the week that this habit must be done
* Mark habit as checked for a specific day
* Scores how many habits were completed in each day

Some acceptances criterias:

1 - We must only score habits created after that specific day.
        <br>Ex: If Today (wednesday) I create a habit for every tuesday it cant be
take in consideration for yesterdays score.

2 - To delete a habit we must show confirmation because it will delete previous related scores

3 - That's it for now :)

## Execute the project

I added a docker-compose with a configured MARIADB data is configured for local development, 
so just run it and be happy:

>
> ```docker compose up -d```
> 

 
