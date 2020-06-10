#!/bin/bash

function get_user_pass() {
    read -r -p "Enter a password " password
    if test "$password" = "codex123"
    then
         echo "Password verified."
#         check if github sever reachable than execute.
         timeout 5 ping github.com
         echo "Git hub sever working..."
         git status
         git add .
         git commit -m "Automated commit"

    else
         echo "Access denied."
    fi
}

get_user_pass