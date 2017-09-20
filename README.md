# ExploreAssignment

This is a repository for coding Java and Selenium Assignments

Best way to swith on multiple githu account using terminal:

First clone the repository on local 

git clone  https://github.com/choice-explorer/ExploreAssignment.git

Then move to that directory using

cd ExploreAssignment

Now add any file or make any changes to file within ExploreAssignment repository(folder)

Then check the status of repository ExploreAssignment

git status 

Then add all the changes 

git add --all

Then commit all the changes

git commit -a "intially commited"

Now push it back to github

git push 

While trying to push we will get error since we were login through our personal user and password 

remote: Permission to choice-explorer/ExploreAssignment.git denied to rsharma96.
fatal: unable to access 'https://github.com/choice-explorer/ExploreAssignment.git/': 
The requested URL returned error: 403

To solve this issue first we need to switch to github account where we want to push using below command

git remote set-url origin https://choice-explorer@github.com/choice-explorer/ExploreAssignment.git

Now it will ask password to login to another github account 

and now we are good to push




