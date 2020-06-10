#!/bin/bash

function get_user_pass() {
  read -r -p "Enter a password " password
    if test "$password" = "codex123"
      then
         echo "Password verified now starting automated github push.........."
#         check if github sever reachable than execute.
         timeout 5 ping github.com
         echo "Git hub sever working..."
         git status
         git add .
         git commit -m "Automated commit"
         git push origin master
         echo "Success....."
      else
         echo "Access denied."
    fi
}
#invoking method.
get_user_pass